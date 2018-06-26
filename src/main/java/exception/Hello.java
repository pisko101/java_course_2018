package exception;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.start();
    }

    private void start() {
        // TODO Auto-generated method stub
        UserDatabase userDatabase = new UserDatabase();
        
        try {
            userDatabase.getName(1);
        } catch (UserNotFoundException | InternalInException | DatabaseProblemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        div(1,0);
    }
    
    private double div(int a, int b) {
        if(b != 0) {
            return a/b;
        }
        
       return 0.0;
        
    }
}

class UserDatabase {
    public String getName(int id) throws UserNotFoundException, InternalInException, DatabaseProblemException {
        // TODO Auto-generated method stub
        try {
            Class.forName("Mysql.xxxx");
            Connection conneciton = DriverManager.getConnection("url", "user", "password");
            PreparedStatement preparedStatement
            = conneciton.prepareStatement("SELECT * FROM TABLE");
            ResultSet resultset = preparedStatement.executeQuery();
            if(resultset.next()) {
                return resultset.getString("NAME");
            }         
            throw new UserNotFoundException();
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            throw new InternalInException();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new DatabaseProblemException();
        }
        //return null;
    }
}