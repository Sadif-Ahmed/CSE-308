import java.io.IOException;  
import java.util.List;
import java.io.BufferedReader;   
import java.io.InputStreamReader;
public class Client {
    public static void main(String[] args) throws IOException{
        PcBuilder builder = new PcBuilder();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Input The number of Clients: ");
        int number_of_clients=Integer.parseInt(br.readLine());
        int client_count=0;
        
        while(client_count<number_of_clients)
        {
            client_count++;
            System.out.println("Starting PC Build of Client Number : "+client_count);
        List<OrderedProducts> orders = builder.buildpc();
        int i=1;
        if(orders.size()!=0)
        System.out.println("Printing PC Build of Client Number : "+client_count);
        for(OrderedProducts temp:orders)
        {   System.out.println("Order No: "+ i);
            temp.Show_Order();
            i++;
        }
               }
            }
}
