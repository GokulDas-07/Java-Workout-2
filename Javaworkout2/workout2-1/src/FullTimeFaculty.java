public class FullTimeFaculty extends faculty{
    float basic;
    float allowance;
    float SalaryFT;
    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;
    }
    float SalaryFullTime(){
        SalaryFT=(basic+allowance);
        return  SalaryFT;
    }
    void DisplayFullTime(){
        System.out.println("Bacic:"+basic);
        System.out.println("Allowance:"+allowance);
        System.out.println("Salary for fulltime:"+SalaryFullTime()+"\n");
    }
}
