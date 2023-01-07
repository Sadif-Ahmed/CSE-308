import java.io.IOException;
import java.io.BufferedReader;   
import java.io.InputStreamReader;
public class reguser extends observer {
    public reguser(ABCserver abCserver,String name)
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
        if(curr_state==1 && prev_state==2)
        {
            System.out.println("Choice of Options(Enter 1/2 for Selection):");
            System.out.println("1.Continue using partially down ABC server");
            System.out.println("2.Use service from DEF server with $20/hour payment");
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
                setState(2);
            }
        }
        else if(prev_state==1 && curr_state ==3)
        {
            System.out.println("Use service from DEF server at $20/hour rate?");
            System.out.println("Choice of Options(Enter 1/2 for Selection):");
            System.out.println("1.Yes");
            System.out.println("2.No");
            br =new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            if(choice==1)
            {
                setState(3);
            }
            else if(choice==2)
            {
                setState(4);
            }
            else 
            {
                System.out.println("Invalid Selection.");
                setState(4);
            }
        }
        else if(prev_state==2&& curr_state==3)
        {
            if(getState()==2)
            {
            System.out.println("Use service from DEF server at $20/hour rate?");
            System.out.println("Choice of Options(Enter 1/2 for Selection):");
            System.out.println("1.Yes");
            System.out.println("2.No");
            br =new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            if(choice==1)
            {
                setState(3);
            }
            else if(choice==2)
            {
                setState(4);
            }
            else 
            {
                System.out.println("Invalid Selection.");
                setState(4);
            }
            }
        }
        else if((prev_state==2 || prev_state==3)&& curr_state==1)
        {
            if(getState()==3)
            {
                System.out.println("Total Bill Using DEF Server Sent.");
            }
            setState(1);

        }
        else if(prev_state==3 && curr_state==2)
        {
            if(getState()==4)
            {
                System.out.println("Use limited service from ABC server?");
            System.out.println("Choice of Options(Enter 1/2 for Selection):");
            System.out.println("1.Yes");
            System.out.println("2.No");
            br =new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            if(choice==1)
            {
                setState(2);
            }
            else if(choice==2)
            {
                
            }
            else 
            {
                System.out.println("Invalid Selection.");
            }
            }
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
            System.out.println("Using Limited Functionality From ABC Server.");
        }
        else if(getState()==3)
        {
            System.out.println("Data Copied to DEF Server.Using DEF Server.");
        }
        else if(getState()==4)
        {
            System.out.println("No Service Currently.");
        }
        else 
        {

        }
    }
    @Override
    public String toString() {
        return "Regular User "+getName(); 
    }
}
