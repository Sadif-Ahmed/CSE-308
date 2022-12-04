public abstract class DriveTrain {
    protected String type;

   
    
    void print_type()
    {
        System.out.println("The drive-train is: "+type);
    }
    String get_type()
    {
        return type;
    }   
}
class Rearwheel extends DriveTrain
{
    Rearwheel()
    {
        type="Rear-Wheel";
    }
   
}
class Allwheel extends DriveTrain
{
    Allwheel()
    {
        type="All-Wheel";
    }
    
}
class DemoDrivetrain
{
    public static void main(String[] args) {
        DriveTrain abc = new Rearwheel();
        abc.print_type();
    }
}
