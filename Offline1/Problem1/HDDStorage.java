public class HDDStorage implements Product{
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
     }  
    

     HDDStorage()
    {
        name="1 TB HDD Storage";
        Specification="HDD";
        price=0;
    }
    
}
