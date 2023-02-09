import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Client {
    public static void main(String[] args)throws IOException{
        System.out.println("Started Taking Order.....");
        System.out.println("Please Input the Number of Orders: ");
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            int orders = Integer.parseInt(br.readLine());
            List<Beverage> orderlist = new ArrayList<Beverage>();
            List<String> ordernamelist = new ArrayList<String>();
            double totalprice=0;
            for(int i=0;i<orders;i++)
            {
            System.out.println("Please Input Choice of Base Cup(1/2/3/4): ");
            System.out.println("1.Americano");
            System.out.println("2.Espresso");
            System.out.println("3.Cappuccino");
            System.out.println("4.Moccha");
            br =new BufferedReader(new InputStreamReader(System.in));
            int choice = Integer.parseInt(br.readLine());
            Beverage temp;
            if(choice==1)
            {
                ordernamelist.add("Americano");
                temp = new RegularCoffee();
                temp =  new Coffeebeans(temp);
            }
            else if(choice == 2)
            {
                ordernamelist.add("Espresso");
                temp = new RegularCoffee();
                temp = new Cream(temp);
            }
            else if(choice == 3)
            {
                ordernamelist.add("Cappuccino");
                temp = new Milkcoffee();
                temp = new Cinnamon(temp);    
            }
            else if(choice == 4)
            {
                ordernamelist.add("Mocha");
                temp = new Milkcoffee();
                temp = new Chocolate(temp);
            }
            else 
            {
                System.out.println("Invalid Order Request Exiting....");
                break;
            }
            int addchoice;
            while(0==0)
            {
            System.out.println("Input Add-On Choice (0 to exit):");
            System.out.println("1.Grinded Coffee Beans");
            System.out.println("2.Milk");
            System.out.println("3.Dairy Cream");
            System.out.println("4.Cinnamon Powder");
            System.out.println("5.Chocolate Sauce");
            addchoice = Integer.parseInt(br.readLine());
            if(addchoice==0)
            {
                break;
            }
            else if(addchoice == 1)
            {
                temp = new Coffeebeans(temp);
            }
            else if(addchoice == 2)
            {
                temp = new Milk(temp);
            }
            else if (addchoice == 3)
            {
                temp =  new Cream(temp);
            }
            else if (addchoice == 4)
            {
                temp =  new Cinnamon(temp);
            }
            else if (addchoice == 5)
            {
                temp = new Chocolate(temp);
            }
            else
            {
                System.out.println("Invalid Add-on Choice Exiting....");
                break;
            }
            }
            orderlist.add(temp);
            totalprice+=temp.get_cost();
            }

            System.out.println("Order Taking Finished.Now Printing Order....");
            System.out.println("Total Number of Cups Ordered : "+orders);
            System.out.println("Total Price of the Order: "+totalprice);
            for(int i=0;i<orders;i++)
            {   System.out.println("Cup Number: "+ (i+1));
                System.out.println("Coffee Type: " + ordernamelist.get(i));
                System.out.println("Price : "+ orderlist.get(i).get_cost() + " Taka");
                System.out.println("Ingredient Lists :");
                System.out.println(orderlist.get(i).get_desc());
            }
          
            


        }
    }
    

