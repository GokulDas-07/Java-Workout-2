public class Employee {
    String name;
    int EmpID;
    String result;
    int ass1,ass2,ass3;
    Employee(String name,int empID,int ass1,int ass2,int ass3){
        this.name=name;
        this.EmpID=empID;
        this.ass1=ass1;
        this.ass2=ass2;
        this.ass3=ass3;
        if((ass1>70) && (ass2>70) && (ass3>70)){
             this.result="Promoted";
        }else{
             this.result="Demoted";
        }
    }
    public void Total(){
        int total=(ass1+ass2+ass3);
        System.out.println("Result:"+this.result);
        System.out.println("Total is:"+total);

    }
}
