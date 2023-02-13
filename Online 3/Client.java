import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Client {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String [] inputs;
            inputs = line.split(" ");
            Speech speech = new Speech();
            for(int i=1;i<inputs.length-1;i++)
            {
                
                if(inputs[i].equalsIgnoreCase("Ami"))
        {
           speech = new Translator(speech);
           speech.add_s(inputs[i]); 
        }
        else if(inputs[i].equalsIgnoreCase("Amra"))
        {
            speech = new Translator(speech);
           speech.add_s(inputs[i]); 
        }
        else if(inputs[i].equalsIgnoreCase("Bhat"))
        {
            speech = new Translator(speech);
           speech.add_s(inputs[i]); 
        }
        else if(inputs[i].equalsIgnoreCase("Roti"))
        {
            speech = new Translator(speech);
           speech.add_s(inputs[i]); 
        }
        else if(inputs[i].equalsIgnoreCase("Khai"))
        {
            speech = new Translator(speech);
           speech.add_s(inputs[i]); 
        }
        else if(inputs[i].equalsIgnoreCase("Banai"))
        {
            speech = new Translator(speech);
           speech.add_s(inputs[i]); 
        }
        else
        {
            speech = new Notranslator(speech);
           speech.add_s(inputs[i]); 
        }

            } 
            System.out.println(speech.get_s());
    }

}
