

public class Planefactory {
    Plane getPlane(String company)
    {
        if(company.equalsIgnoreCase("Airbus"))
        {
            return new Airbus();
        }
        else if(company.equalsIgnoreCase("Boeing"))
        {
            return new Boeing();
        }
        else if(company.equalsIgnoreCase("Safran"))
        {
            return new Safran();
        }
        else
        {
            return null;
        }
    }
    
}
