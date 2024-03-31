
@FunctionalInterface
interface SquareFunction {
    int calculateSquare(int n);
}

public class Lab4_a2{
 
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        SquareFunction SF = Lab4_a2::square;
        int res = SF.calculateSquare(5);
        System.out.println("Square of 5: " + res);
    }
}
