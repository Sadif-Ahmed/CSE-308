public abstract class Car {
    protected DriveTrain dTrain;
    protected Engine engine;
    protected Color color;
    protected String maker;

    void print()
    {
        System.out.println("The Maker of the car is : " + maker);
        System.out.println("The Drive-Train of the car is : " + dTrain.get_type());
        System.out.println("The Engine of the car is : " + engine.get_type());
        System.out.println("The Color of the car is : " + color.get_type());
    }
}
class BMW extends Car
{
    BMW()
    {
        maker="BMW";
        color = new Black();
        dTrain = new Rearwheel();
        engine = new Electric();
    }
}
class Toyota extends Car
{
    Toyota()
    {
        maker="Toyota";
        color = new Red();
        dTrain = new Rearwheel();
        engine = new HydrogenCell();
    }
}
class Tesla extends Car
{
    Tesla()
    {
        maker="Tesla";
        color = new White();
        dTrain = new Allwheel();
        engine = new Electric();
    }
}

class DemoCar
{
    public static void main(String[] args) {
        Car myCar = new BMW();
        myCar.print();
    }
}
