
import java.io.IOException;

public class deliverystate implements state {
    vendingmachine vm;
    public deliverystate(vendingmachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void work() throws IOException {
        
        System.out.println("You Product is delivered.");
        vm.reducestock();
        if(vm.getquantity()>0)
        {
            vm.setcurrstate(vm.getnomoneystate());
        }
        else
        {
            System.out.println("The Vending Machine has run out of Product.Please Wait For Refill And Try Later");
            vm.setcurrstate(vm.getstockoutstate());
        }
        
    }
}
