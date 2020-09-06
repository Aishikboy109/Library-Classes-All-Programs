import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters : ");
        String res = "";
        char c;
        for (int i = 1; i <= 10 ; i++) {
            c = sc.next().charAt(0);
            if (Character.isLetter(c)){
                if (Character.isUpperCase(c)){
                    c = Character.toLowerCase(c);
                }else {
                    c = Character.toUpperCase(c);
                }
            }
            res += c;
        }
        System.out.println("Reslutant string : "+res);
    }
}
