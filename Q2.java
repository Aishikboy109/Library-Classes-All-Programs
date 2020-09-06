import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Integer intob = new Integer(n);
        int sum = sum(intob);
        System.out.println("Sum of the digits : "+ sum);
    }

    static int sum(Integer a) {
        int n = a;
        int d = 0, sum = 0;

        while (n > 0){
            d = n % 10;
            sum += d;
            n /= 10;
        }
        return sum;
    }
}
