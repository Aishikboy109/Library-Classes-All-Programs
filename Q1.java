import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);

        if(Character.isLetter(c)){
            if (Character.isUpperCase(c)){
                System.out.println(c + " is in uppercase !!");
            }
            else{
                System.out.println(c + " is in lowercase !!");
            }
        }
        else{
            System.out.println("Not an alphabet...don't repeat this shit again");
        }
    }
}
