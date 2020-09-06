import java.util.Scanner;

public class Q9 {

    static void sum(int n){
        int sum = 0,d = 0;
        while(n > 0){
            d = n % 10;
            sum += d;
            n /= 10;
        }
        System.out.println("Sum of the digits : "+sum);
    }

    static void sum(Integer ob){
        int sum = 0,d = 0;
        while(ob > 0){
            d = ob % 10;
            sum += d;
            ob /= 10;
        }
        System.out.println("Sum of the digits : "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sum(n);
        sum(new Integer(n));
    }
}
