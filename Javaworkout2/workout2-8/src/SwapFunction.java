import java.util.Scanner;

public class SwapFunction {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Before swapping,a:"+a+" ,b:"+b);
        Swap(a,b);


    }
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping,a:"+a+" ,b:"+b);
    }
}
