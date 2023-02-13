
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Client {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            input = input.substring(1, input.length()-1);
            String [] inputs = input.split(" ");
            boolean flag=false;
            for(int i=0;i<inputs.length;i++)
            {
                
                if(inputs[i].equalsIgnoreCase("Ami"))
        {
           flag=true;
           break;
        }
        else if(inputs[i].equalsIgnoreCase("Amra"))
        {
            flag=true;
            break;
        }
        else if(inputs[i].equalsIgnoreCase("Bhat"))
        {
            flag=true;
            break;
        }
        else if(inputs[i].equalsIgnoreCase("Roti"))
        {
            flag=true;
            break;
        }
        else if(inputs[i].equalsIgnoreCase("Khai"))
        {
            flag=true;
            break;
        }
        else if(inputs[i].equalsIgnoreCase("Banai"))
        {
            flag=true;
            break;
        }
            } 
            ETbase englishspeech = new EnglishTranslator(input);
            BTbase banglaspeech = new BanglaTranslator(input);
            ETbase translatedspeech;
           if(flag == true)
           {
             translatedspeech = new BanglaToEnglishtranslator(banglaspeech);
           }
           else
           {
            translatedspeech = englishspeech;
           }
           translatedspeech.translate();
           System.out.println(translatedspeech.get_speech().get_s());
    }

}
