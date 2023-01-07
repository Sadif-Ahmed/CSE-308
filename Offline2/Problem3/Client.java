
import java.io.IOException;
import java.io.BufferedReader;   
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException{
        System.out.println("Please Enter the Product Price: ");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int price=Integer.parseInt(br.readLine());
        System.out.println("Please Enter the Stock Quantity: ");
        br =new BufferedReader(new InputStreamReader(System.in));
        int stock=Integer.parseInt(br.readLine());
        vendingmachine vm = new vendingmachine(stock, price);
        while(vm.getcurrstate()==vm.getstockoutstate())
        {
            vm.start();
        }

    }
    
}
