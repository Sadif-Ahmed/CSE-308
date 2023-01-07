import java.io.IOException;
import java.io.BufferedReader;   
import java.io.InputStreamReader;
public class premuser extends observer{
    public premuser(ABCserver abCserver,String name)
    {
        super(abCserver, name);
    }
    @Override
    public void update() throws IOException {
        if(getAbcserver()==null)
        {
            return;
        }
        int prev_state= getAbcserver().getPrev_state();
        int curr_state= getAbcserver().getCurr_state();
        BufferedReader br;
        int choice;
        
        System.out.println(this+" notified.");
        if(prev_state==1 && curr_state==2)
        {
            System.out.println("Choice of Options(Enter 1/2 for Selection):");
            System.out.println("1.Use service from two servers");
            System.out.println("2.Use service from one server.");
            br =new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            if(choice==1)
            {
                setState(2);
            }
            else if(choice==2)
            {
                setState(3);
            }
            else 
            {
                System.out.println("Invalid Selection.");
                setState(3);
            }
        }
        else if(prev_state==1 && curr_state==3)
        {
            setState(3);
        }
        else if(prev_state == 2 && curr_state==3)
        {
            if(getState()==2)
            {
                setState(3);
            }
        }
        else if((prev_state==2||prev_state==1)&&curr_state==1)
        {
            setState(1);
        }
        else 
        {

        }

        if(getState()==1)
        {
            System.out.println("USing ABC Servers.");
        }
        else if(getState()==2)
        {
            System.out.println("Using both ABC and DEF Servers.");
        }
        else if(getState()==3)
        {
            System.out.println("Using DEF Server.");
        }
        else 
        {

        }
        
    }
    @Override
    public String toString() {
        return "Premium User "+getName(); 
    }
}
