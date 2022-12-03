public abstract class DriveTrain {
    protected String type;

    abstract void set_type();
    
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
    void set_type()
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
    void set_type()
    {
        type="All-Wheel";
    }
}
class DemoDrivetrain
{
    public static void main(String[] args) {
        DriveTrain abc = new Rearwheel();
      //  abc.set_type();
        abc.print_type();
    }
}
