public  class Translator extends Speech{
    Speech speech;
    Translator(Speech speech)
    {
        this.speech=speech;
    }
    void add_s(String str)
    {
        if(str.equalsIgnoreCase("Ami"))
        {
            s+="I";
        }
        else if(str.equalsIgnoreCase("Amra"))
        {
            s+="We";
        }
        else if(str.equalsIgnoreCase("Bhat"))
        {
            s+="Rice";
        }
        else if(str.equalsIgnoreCase("Roti"))
        {
            s+="Bread";
        }
        else if(str.equalsIgnoreCase("Khai"))
        {
            s+="Eat";
        }
        else if(str.equalsIgnoreCase("Banai"))
        {
            s+="Prepare";
        }

    }
    
}
