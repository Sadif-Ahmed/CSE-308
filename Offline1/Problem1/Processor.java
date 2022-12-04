package Offline1.Problem1;

public abstract class Processor implements Product {
    protected String name;
    protected String Specification;
    protected int price;

    public int get_price()
    {
        return price;
    }
    public String get_Specification()
    {
        return Specification;
    }
    public String get_name()
     {
        return name;
     } 
     public void print()
     {
        System.out.println("The product is a "+name);
        System.out.println("Its Specification is : "+Specification);
        System.out.println("Its price is : "+ price );
     }  
    
    
}
class Ryzen extends Processor{
   Ryzen()
   {
    name="Processor";
    Specification="Ryzen7 5700X";
    price=28000;
   }
}
class lowIntel extends Processor{
    lowIntel()
    {
        name="Processor";
        Specification="Intel i5";
        price=20000;
    }
}
class midIntel extends Processor{
    midIntel()
    {
        name="Processor";
        Specification="Intel i7";
        price=37000;
    }
}
class highIntel extends Processor{
    highIntel()
    {
        name="Processor";
        Specification="Intel i9";
        price=65000;
    }
}
