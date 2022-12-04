public class Motherboard implements Product{
    protected String name;
    protected String Specification;
    protected int price=0;

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
       
     }  

    Motherboard()
    {
        name="Motherboard";
        Specification="Motherboard";
        price=0;
    }
    
}
