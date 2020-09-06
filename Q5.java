import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters :");
        char c;
        int count = 0,n = 5;
        String s = "";
        boolean flag = false;
        for (int i = 1; i <= n ; i++) {
            c = sc.next().charAt(0);

            if (Character.isLetter(c) || Character.isDigit(c)){
                s += c;
            }
            else{
                count++;
            }
        }

        if (count == n){
            System.out.println("No alphabets are found !");
        }else {
            System.out.println("The resultant string is : "+ s);
        }
    }
}
