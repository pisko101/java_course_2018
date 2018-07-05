package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {
    public static void main(String[] args) {
        MainSorting p = new MainSorting();
        p.start();
    }

    private void start() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Somkiat",200));
        employees.add(new Employee(2,"A",100));
        employees.add(new Employee(3,"B",300));
        employees.forEach(System.out::println);

        //Sorting with Comparator
        Comparator<Employee> withLambda =
                (Employee o1, Employee o2) ->
                    (int)(o1.getSalary() - o2.getSalary());
        Collections.sort(employees, withLambda);
        employees.forEach(System.out::println);
        
        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // TODO Auto-generated method stub
                //return o1.getName().compareTo(o2.getName());
                return (int)(o1.getSalary() - (o2.getSalary()));
            }
        });*/
        
        //employees.forEach(System.out::println);
    }
}