

import java.io.IOException;
public class stockoutstate implements state {
    vendingmachine vm;
    public stockoutstate(vendingmachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void work() throws IOException{
        // TODO Auto-generated method stub
        System.out.println("The Vending Machine has run out of Product.Please Wait for Refill And Try Later");
        
}
}
