import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader; 
import java.util.List;

import java.util.ArrayList;
public class PcBuilder {
    public List<OrderedProducts> buildpc() throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
        List<OrderedProducts> orders = new ArrayList<OrderedProducts>();
        int programflag=0;
        while(programflag==0)
        { 
            System.out.println("Press E to Start Order");
            System.out.println("Press Z to finish your Shopping.");
            String input = br.readLine();
            if(input.equalsIgnoreCase("E"))
            {   
                    
                    System.out.println("Please Give Choice of PC Type: ");
                    System.out.println("1.Ryzen 5700X Gaming PC");
                    System.out.println("2.Intel i5 Regular PC");
                    System.out.println("3.Intel i7 Regular PC");
                    System.out.println("4.Intel i9 Regular PC");
                    System.out.println("Press Q to leave order after ordering at least one product");
                    String inp2=br.readLine();
                    if(inp2.equalsIgnoreCase("E"))
                    {
                        System.out.println("You are currently in an order and can not start a new one.");
                    }
                    else if(inp2.equalsIgnoreCase("Q"))
                        {
                            System.out.println("You can not exit now.No order Placed");
                        }
                    else if(Integer.parseInt(inp2)==1 || Integer.parseInt(inp2)==2 || Integer.parseInt(inp2)==3||Integer.parseInt(inp2)==4)
                    {
                    int prebuildchoice=Integer.parseInt(inp2);
                    OrderedProducts pc =  new OrderedProducts(prebuildchoice);
                    int subprogramflag=0,minorderflag=0;
                    while(subprogramflag==0)
                    {
                        System.out.println("Please Give Choice of Order: ");
                        System.out.println("1.8 GB 3200 MHZ Ram");
                        System.out.println("2.8 GB 2666 MHZ Ram");
                        System.out.println("3.2 GB Graphics Card");
                        System.out.println("4.4 GB Graphics Card");
                        System.out.println("Press Q to leave order after ordering at least one product");
                        String inp1=br.readLine();
                        if(inp1.equalsIgnoreCase("Q") && minorderflag==0)
                        {
                            System.out.println("You can not exit now.No order Placed");
                        }
                        else if(inp1.equalsIgnoreCase("Q") && minorderflag!=0)
                        {
                            System.out.println("Order Placed waiting for new order.");
                            orders.add(pc);
                            subprogramflag=1;
                        }
                        else if(inp1.equalsIgnoreCase("E"))
                        {
                            System.out.println("You are currently in an order and can not start a new one.Finsh this one first.");
                        }
                        else
                        {   minorderflag=1;
                            switch(Integer.parseInt(inp1))
                            {
                                case 1:
                                {
                                    pc.addProduct(new HighRam());
                                    System.out.println("Product Successfully Added To Cart.");
                                    break;

                                }
                                case 2:
                                {
                                    pc.addProduct(new LowRam());
                                    System.out.println("Product Successfully Added To Cart.");
                                    break;
                                }
                                case 3:
                                {
                                    pc.addProduct(new LowGPU());
                                    System.out.println("Product Successfully Added To Cart.");
                                    break;
                                }
                                case 4:
                                {
                                    pc.addProduct(new HighGPU());
                                    System.out.println("Product Successfully Added To Cart.");
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Invalid Input");
                                    break;
                                }
                            }
                        }
                        }
                    } 
                    else 
                    {
                        System.out.println("Invalid Input.");
                    }  
            }
            else if(input.equalsIgnoreCase("Q"))
            {
               System.out.println("You do not have any current order.");
            }
            else if(input.equalsIgnoreCase("Z"))
            {
                System.out.println("You have finished your shopping.");
                programflag=1;
            }
            else
            {
                System.out.println("Invalid Input");
            }
            
        }
        
        


        return orders;
    }
    
}
