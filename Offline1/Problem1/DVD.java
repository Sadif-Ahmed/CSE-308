package Offline1.Problem1;

public abstract class DVD implements Product {
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
class DVDplayer extends DVD
{
    DVDplayer()
    {
        name="DVD";
        Specification="DVD";
        price=6000;
    }
}
