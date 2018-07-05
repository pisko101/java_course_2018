package day4;

interface MyRandom {
    int nextInt();
}

public class Demo {
   // Random random;
    public int generateNumber(MyRandom random) {
        // TODO Auto-generated method stub
        return random.nextInt();
    }

}
