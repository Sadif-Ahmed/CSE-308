public class MidIntel implements Product {
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
    
    
    MidIntel()
    {
        name="Processor";
        Specification="Intel i7";
        price=37000;
    }
    
}