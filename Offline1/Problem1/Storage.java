package Offline1.Problem1;

public abstract class Storage implements Product{
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
class HDD extends Storage
{
    HDD()
    {
        name="Storage";
        Specification="HDD";
        price=0;
    }
}
class SSD extends Storage
{
    SSD()
    {
        name="Storage";
        Specification="SSD";
        price=0;
    }
}
