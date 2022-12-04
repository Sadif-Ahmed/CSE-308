package Offline1.Problem1;

public abstract class Ram implements Product {
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
class lowRam extends Ram
{
    lowRam()
    {
        name="Ram";
        Specification="8GB 2666 MHz";
        price=2620;
    }
}
class highRam extends Ram{
    highRam()
    {
        name="Ram";
        Specification="8GB 3200 MHz";
        price=2950;
    }
}
