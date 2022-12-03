public abstract class Engine {
    protected String type;

    abstract void set_type();
    
    void print_type()
    {
        System.out.println("The Engine is: "+type);
    }
    String get_type()
    {
        return type;
    }
}
class HydrogenCell extends Engine{
    HydrogenCell()
    {
        type="Hydrogen Cell";
    }
    void set_type()
    {
        type="Hydrogen Cell";
    }
}
class Electric extends Engine
{
    Electric()
    {
        type="Electric";
    }

    void set_type()
    {
        type="Electric";
    }
}
class DemoEngine {
    public static void main(String[] args) {
        Engine eng = new HydrogenCell();
        eng.set_type();
        eng.print_type();
    }
}
