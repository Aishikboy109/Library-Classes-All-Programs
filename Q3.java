import java.util.Scanner;

public class Q3 {

    static boolean isPalindrome(Integer ob){
        int sum = 0,d = 0, temp = ob;
        while (ob > 0){
            d = ob%10;
            sum = (10*sum) + d;
            ob /= 10;
        }
        if(temp == sum){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Integer ob = new Integer(n);
        boolean f = isPalindrome(ob);
        if (f==true)
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");

    }
}
