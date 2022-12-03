public class CarFactory {
    Car getCar(String continent)
    {
        if(continent.equalsIgnoreCase("Asia"))
        {
            return new Toyota();
        }
        else if(continent.equalsIgnoreCase("Europe"))
        {
            return new BMW();
        }
        else if(continent.equalsIgnoreCase("United States"))
        {
            return new Tesla();
        }
        else
        {
            System.out.println("Invalid Continent or Country Location");
            return null;
        }
    }    
}
