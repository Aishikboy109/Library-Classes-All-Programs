import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int d = 0;
        String res = "";
        while (n > 0){
            d = n % 10;
            if (d % 2 == 0){
                res = d+res;
            }
            n /= 10;
        }
        int result = Integer.parseInt(res);
        System.out.println(result);
    }
}
