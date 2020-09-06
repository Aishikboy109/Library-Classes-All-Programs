import java.util.Scanner;
public class Q7 {

    static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        if (n == sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int d = 0;
        String res = "";
        while (n > 0){
            d = n % 10;
            if (d % 2 != 0){
                res = d+res;
            }
            n /= 10;
        }
        int result = Integer.parseInt(res);
        System.out.println(result);

        if (isPerfect(result)){
            System.out.println("It is a perfect number !");
        }else{
            System.out.println("It is not a perfect number !");
        }
    }
}
