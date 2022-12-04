public abstract class Engine {
    protected String type;

   
    
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
    
}
class Electric extends Engine
{
    Electric()
    {
        type="Electric";
    }

   
}
class DemoEngine {
    public static void main(String[] args) {
        Engine eng = new HydrogenCell();
        
        eng.print_type();
    }
}
