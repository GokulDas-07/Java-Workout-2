public class Main {
    public static void main(String[] args)
    {
        Class obj1=new Class();
        Class obj2=new Class();
        Runtime.getRuntime().gc();
        System.out.println("Objects created:"+Class.count);
        System.out.println("Objects Destroyed:"+Class.destroyed);
        System.out.println("Live objects:"+(Class.count-Class.destroyed));

    }
    protected void finalize(){
        Class.destroyed++;
    }
}