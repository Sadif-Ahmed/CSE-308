import java.io.IOException;  
import java.io.BufferedReader;   
import java.io.InputStreamReader;
public class Client{
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Give the numer of clients : ");
        int clients=Integer.parseInt(br.readLine());
        int i=1;
        while(clients!=0)
        {
        System.out.println("Client no: "+i);
        System.out.println("Please input your preferred company name: ");
        String inp =br.readLine();
        Planefactory pln = new Planefactory();
        Plane result=pln.getPlane(inp);
        result.print();
        i++;
        clients--;
        }

    }

    
}
