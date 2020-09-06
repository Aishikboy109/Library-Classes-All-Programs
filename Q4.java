import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        int u,l;
        u = l = 0;
        char c;
        for (int i = 0; i < 5; i++) {
            c = sc.next().charAt(0);

            if (Character.isUpperCase(c)){
                u++;
            }
            else{
                l++;
            }
        }
        System.out.println("Number of lowercase characters : "+l);
        System.out.println("Number of uppercase characters : "+u);
    }
}
