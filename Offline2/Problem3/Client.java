
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException{
        vendingmachine vm = new vendingmachine(5, 10);
        while(vm.getquantity()!=0)
        {
            vm.start();
        }

    }
    
}
