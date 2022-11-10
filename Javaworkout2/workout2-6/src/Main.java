import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String Name=input.next();
        System.out.println("Enter EmpID:");
        int EmpId= input.nextInt();
        System.out.println("Enter 3 Assessment values:");
        int ass1= input.nextInt();
        int ass2=input.nextInt();
        int ass3=input.nextInt();
        Employee emp1=new Employee(Name,EmpId,ass1,ass2,ass3);
        emp1.Total();
    }
}