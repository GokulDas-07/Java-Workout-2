public class PartTimeFaculty extends faculty {
    int hour;
    float rate;
    float SalaryPT;
     PartTimeFaculty(int hour,float rate){
        this.hour=hour;
        this.rate=rate;
    }
    float SalaryPartTime(){
         SalaryPT = (hour*rate);
        return  SalaryPT;

    }
    void DisplayPartTime(){
         System.out.println("Hour:"+hour);
         System.out.println("Rate:"+rate);
         System.out.println("Salary for parttime:"+SalaryPartTime()+"\n");
    }
}
