import java.io.IOException;
import java.io.BufferedReader;   
import java.io.InputStreamReader;

public class client {
    private static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        Car car1 = new Premcar();
        Car car2 = new Regcar();
        Car car3 = new Premcar();
        int menuchoice;
        System.out.println("This is the list of Cars:");
        while(1==1)
        {  
            car1.print();
            car2.print();
            car3.print();
            System.out.println("Choose 1/2/3:");
           
            System.out.println("Press 0 to exit.");
            menuchoice=Integer.parseInt(br.readLine());
            int p;
            if(menuchoice==1)
            {
                System.out.println("Give Preiod:");
            p=Integer.parseInt(br.readLine());
                System.out.println("The rent is:"+car1.calculate_rent(p));
            }
            else if(menuchoice==2)
            {
                System.out.println("Give Preiod:");
            p=Integer.parseInt(br.readLine());
                System.out.println("The rent is:"+car2.calculate_rent(p));
            }
            else if(menuchoice==3)
            {
                System.out.println("Give Preiod:");
            p=Integer.parseInt(br.readLine());
                System.out.println("The rent is:"+car3.calculate_rent(p));
            }
            else if(menuchoice==0)
            {
                break;
            }
        }


    }

    
}
