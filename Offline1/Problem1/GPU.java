package Offline1.Problem1;
public abstract class GPU implements Product{
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

class LowGPU extends GPU
{
    LowGPU()
    {
        Specification="2GB";
        name="GPU";
        price=6500;
    }
}
class HighGPU extends GPU
{
    HighGPU()
    {
        Specification="4GB";
        name="GPU";
        price=7200;
    }

}
