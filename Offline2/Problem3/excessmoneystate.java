
import java.io.IOException;

public class excessmoneystate implements state{
    vendingmachine vm;
    public excessmoneystate(vendingmachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void work() throws IOException {
        // TODO Auto-generated method stub
        System.out.println("Your Submitted Cash is More than Necessary.");
        System.out.println("Returning Extra amount : "+(vm.getstoremoney()-vm.getprice()));
        System.out.println("Proceeding to Delivery Phase.");
        vm.resetstore();
        vm.setcurrstate(vm.getdeliverystate());
    }


    
}
