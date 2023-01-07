import java.io.IOException;
import java.io.BufferedReader;   
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Client {
    private static List<observer> removedobservers = new ArrayList<>();
    private static ABCserver abCserver = new ABCserver();
    private static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    public static String getserverstate(int curr_state)
    {
        if(curr_state==1)
        {
            return "operational";
        }
        else if(curr_state==2)
        {
            return "partially down";
        }
        else if(curr_state==3)
        {
            return "fully down";
        }
        else 
        {
            return "";
        }
    }
    public static void main(String[] args) throws IOException{
        String username;
        int menuchoice,typechoice,submenuchoice;

        while(true)
        {
            System.out.println("Menu");
            System.out.println("Previous State : "+getserverstate(abCserver.getPrev_state()));
            System.out.println("Current State : "+getserverstate(abCserver.getCurr_state()));

            System.out.println("Choice of Options(Enter 1/2/3/4 for Selection):");
            System.out.println("1.Add User");
            System.out.println("2.Remove User");
            System.out.println("3.Change Server State");
            System.out.println("4.Exit");
            menuchoice=Integer.parseInt(br.readLine());
            if(menuchoice==1)
            {
                if(abCserver.getCurr_state()!=1)
                {
                    System.out.println("The server is not Operational.Can not add new User.");
                    continue;
                }
            System.out.println("Choice of Options(Enter 1/2 for Selection):");
            System.out.println("1.Add New User");
            System.out.println("2.Re-enlist an Old User");
            submenuchoice=Integer.parseInt(br.readLine());

            if(submenuchoice==1)
            {
                System.out.println("Enter User Name:");
                username= br.readLine();
            System.out.println("Choice of Options(Enter 1/2 for Selection):");
            System.out.println("1.Premium User");
            System.out.println("2.Regular User");
            typechoice=Integer.parseInt(br.readLine());
            System.out.println(typechoice);
            if(typechoice==1)
            {
                System.out.println("xdd");
                new premuser(abCserver, username);
            }
            else if(typechoice==2)
            {
                new reguser(abCserver, username);
            }
            else 
            {
                System.out.println("Invalid Selection.");
            }
            }
            if(submenuchoice==2)
            {   
                if(removedobservers.size()==0)
                {
                    System.out.println("No Prevoius User.");
                    continue;
                }
                System.out.println("List of Previous Users: ");
                System.out.println("Choice of Options(Enter User Number for Selection):");
                for(int i=0;i<removedobservers.size();i++)
                {
                    System.out.println((i+1)+". "+removedobservers.get(i));
                }
                menuchoice=Integer.parseInt(br.readLine());
                if(menuchoice>0 && menuchoice<removedobservers.size())
                {
                    System.out.println("Invalid Selection.");
                    
                }
                else
                {
                    removedobservers.get(menuchoice-1).setAbcserver(abCserver);
                    abCserver.registerobserver(removedobservers.get(menuchoice-1));
                    removedobservers.remove(menuchoice-1);
                }

            }
           

            }
            if(menuchoice==2)
            {
                if(abCserver.getCurr_state()!=1)
                {
                    System.out.println("The server is not Operational.Can not remove User.");
                    continue;
                }
                if(abCserver.getObservers().size()==0)
                {
                    System.out.println("No Current User.");
                    continue;
                }
                System.out.println("List of Current Users: ");
                System.out.println("Choice of Options(Enter User Number for Selection):");
                for(int i=0;i<abCserver.getObservers().size();i++)
                {
                    System.out.println((i+1)+". "+abCserver.getObservers().get(i));
                }
                menuchoice=Integer.parseInt(br.readLine());
                if(menuchoice<0 && menuchoice>abCserver.getObservers().size())
                {   
                    System.out.println("Invalid Selection.");
                    
                }
                else
                {
                    abCserver.getObservers().get(menuchoice-1).setAbcserver(null);
                    removedobservers.add(abCserver.getObservers().get(menuchoice-1));
                    abCserver.removeobserver(abCserver.getObservers().get(menuchoice-1).getName());
                }


            }
            else if(menuchoice==3)
            {
            System.out.println("Choice of Options(Enter 1/2/3 for Selection):");
            System.out.println("1.Operational");
            System.out.println("2.Partially Down");
            System.out.println("3.Fully Down");
            menuchoice=Integer.parseInt(br.readLine());
            if(menuchoice==abCserver.getCurr_state())
            {
                System.out.println("No State Change Selected.");
            }
            else if(menuchoice==1||menuchoice==2||menuchoice==3)
            {
                abCserver.setCurr_state(menuchoice);
            }
            else 
            {
                System.out.println("Invalid Selection.");
            }
            }
            else if(menuchoice==4)
            {
                System.out.println("Exiting...");
                break;
            }
           
        }
            return;

    }
    
}
