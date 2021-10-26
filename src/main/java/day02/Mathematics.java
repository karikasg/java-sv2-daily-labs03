package day02;

public class Mathematics {
    public boolean isPrime(int number){
        if ((number < 2) || ((number % 2) == 0)) {return false;}
        for (int i=3; i<Math.sqrt(number); i=i+2){
            if ((number % i) == 0) {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.isPrime(7));
    }
}
