
import java.io.IOException;  
public class exactmoneystate implements state {
    vendingmachine vm;
    public exactmoneystate(vendingmachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void work() throws IOException{
        // TODO Auto-generated method stub
        System.out.println("Your Submitted Cash is Adequate.Proceeding to delivery Phase");
        vm.resetstore();
        vm.setcurrstate(vm.getdeliverystate());
    }
    
}
