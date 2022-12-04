import java.util.List;
import java.util.ArrayList;
public class OrderedProducts {
    String type;
    int baseprice=70000;
    List<Product> baseproducts = new ArrayList<Product>();
    List<Product> boughtproducts = new ArrayList<Product>();
    int total_price=baseprice;
    void Show_Order()
    {   
        System.out.println("This is the order of a "+type);
        print();
    }  
    void set_type(String temp)
    {
        type=temp;
    }
    String get_type()
    {
        return type;
    }
    void addProduct(Product temp)
    {      
            boughtproducts.add(temp);
            total_price+=temp.get_price();
    }
    void addbaseProduct(Product temp)
    {      
            baseproducts.add(temp);
    }
    void print()
    {
        System.out.println("The base-price is : "+baseprice + " taka");
        System.out.println("The total-price is : "+total_price + " taka");
        System.out.println("The Base Products Selected with their pricing are:");
        for(Product temp:baseproducts)
        {   
            temp.print();
        }
        System.out.println("The Ordered Products Selected with their pricing are:");
        for(Product temp:boughtproducts)
        {
            temp.print();
        }
    }
    OrderedProducts(int prebuildchoice)
    {
        switch(prebuildchoice)
        {
            case 1:{
                set_type("Ryzen 7 5700X Gaming PC"); 
                addbaseProduct(new Motherboard());;
                addbaseProduct(new HDDStorage());
                addProduct(new CpuCooler());
                addProduct(new Ryzen());
                break;
            }
            case 2:
            {
                set_type("Intel i5 Regular PC");
                addbaseProduct(new Motherboard());
                addbaseProduct(new HDDStorage());
                addProduct(new LowIntel());
                addProduct(new LiquidCooler());
                break;
            }
            case 3:
            {

                set_type("Intel i7 Regular PC");
                addbaseProduct(new Motherboard());
                addbaseProduct(new HDDStorage());
                addProduct(new MidIntel());
                addProduct(new LiquidCooler());         
                break;
            }
            case 4:
            {
                set_type("Intel i9 PC");
                addbaseProduct(new Motherboard());
                addbaseProduct(new HDDStorage());
                addProduct(new HighIntel());
                addProduct(new LiquidCooler());
            }
        }
    }

    
}
