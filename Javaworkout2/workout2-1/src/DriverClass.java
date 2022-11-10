import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Basic and allowance for Fulltime1:");
        FullTimeFaculty FT1 =new FullTimeFaculty(input.nextFloat(),input.nextFloat());
        FT1.DisplayFullTime();
        System.out.println("Enter Basic and allowance for Fulltime2:");
        FullTimeFaculty FT2 =new FullTimeFaculty(input.nextFloat(),input.nextFloat());
        FT2.DisplayFullTime();
        System.out.println("Enter hour and rate for part time1:");
        PartTimeFaculty PT1 = new PartTimeFaculty(input.nextInt(),input.nextFloat());
        PT1.DisplayPartTime();
        System.out.println("Enter hour and rate for part time2:");
        PartTimeFaculty PT2 = new PartTimeFaculty(input.nextInt(),input.nextFloat());
        PT2.DisplayPartTime();
    }
}