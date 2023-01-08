
import java.io.IOException;  
import java.io.BufferedReader;   
import java.io.InputStreamReader;

public class shortmoneystate implements state{
    vendingmachine vm;
    
    public shortmoneystate(vendingmachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void work() throws IOException{

        
        System.out.println("You are Short of Money.Amount Short: "+ (vm.getprice()-vm.getstoremoney()));
        System.out.println("Please Insert Cash Amount: ");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int cashamount=0;
        cashamount=Integer.parseInt(br.readLine());
        vm.addmoney(cashamount);
        if(vm.getstoremoney()>vm.getprice())
        {
            vm.setcurrstate(vm.getexcessmoneystate());
        }
        else if(vm.getstoremoney()<vm.getprice())
        {
            vm.setcurrstate(vm.getshortmoneystate());
        }
        else if(vm.getstoremoney()==vm.getprice())
        {
            vm.setcurrstate(vm.getexactmoneystate());
        }
        else
        {
            System.out.println("Invalid Amount of Money.Please Try Again");
        }
        
        
    }
    
}
