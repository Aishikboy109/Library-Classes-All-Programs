import java.util.Scanner;

public class Q10 {
    int a,b;

    Number(int x,int y){
        a = x;
        b = y;
    }

    void swap(){
        int c = a;
        a = b;
        b = c;
    }

    void  display(){
        System.out.println("The interchanged values are : \n a = " + a + " , b = " + b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        Number num = new Number(sc.nextInt(), sc.nextInt());
        num.swap();
        num.display();
    }
}
