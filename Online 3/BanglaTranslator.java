public class BanglaTranslator implements BTbase{
    String str;
    Speech speech;
    BanglaTranslator(String str)
    {
        this.str=str;
        speech = new Speech();
    }
    public void translate()
    {
        String [] inputs = str.split(" ");
            for(int i=0;i<inputs.length;i++)
            {
                
                if(inputs[i].equalsIgnoreCase("Ami"))
        {
           speech.add_s("I "); 
        }
        else if(inputs[i].equalsIgnoreCase("Amra"))
        {
           
           speech.add_s("We "); 
        }
        else if(inputs[i].equalsIgnoreCase("Bhat"))
        {
            
           speech.add_s("Rice "); 
        }
        else if(inputs[i].equalsIgnoreCase("Roti"))
        {
            
           speech.add_s("Bread "); 
        }
        else if(inputs[i].equalsIgnoreCase("Khai"))
        {
           
           speech.add_s("Eat "); 
        }
        else if(inputs[i].equalsIgnoreCase("Banai"))
        {
            
           speech.add_s("Prepare "); 
        }
        else
        {
            speech.add_s(inputs[i]+" ");
        }
    }
    }
    public Speech get_speech()
    {
        return speech;
    }
}
