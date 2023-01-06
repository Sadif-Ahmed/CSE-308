public abstract class Plane {
    String name;
    Engine engine;
    Wing wing;
    void print()
    {   
        System.out.println("The Company is: "+name);
        System.out.println("The engine is: "+ engine.get_Engine());
        System.out.println("the wing is : "+wing.get_Wing());
    }
}
class Airbus extends Plane
{
    Airbus()
    {   
        name="Airbus";
        engine= new AirbusE();
        wing = new AirbusW();
    }
}
class Boeing extends Plane
{
    Boeing()
    {
        name="Boeing";
        engine= new BoeingE();
        wing = new BoeingW();
    }
}
class Safran extends Plane
{
   
    Safran()
    {
        name="Safran";
        engine= new BoeingE();
        wing = new SafranW();
    }
}
