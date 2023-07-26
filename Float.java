import java.util.Scanner;
class Float{
    public static void main(String args[]){
        float a,b,total;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = in.nextFloat();
        System.out.println("Enter the second number:");
        b = in.nextFloat();
        total = a+b;
        System.out.println("The value is: "+total);

    }
}