public class Client {
    public static void ShipWork(Crewmatebase passenger)
    {
        if(passenger instanceof Crewmatebase)
        {
            System.out.println("Crewmate Detected.Let him Work\n");
            passenger.work();
        }
        else if(passenger instanceof Impostorbase)
        {
            System.out.println("Impostor Detected\n");
        }
    }
    public static void ShipWork(Impostorbase passenger)
    {
        if(passenger instanceof Crewmatebase)
        {
            System.out.println("Crewmate Detected.Let him Work\n");
            passenger.work();
        }
        else if(passenger instanceof Impostorbase)
        {
            System.out.println("Impostor Detected\n");
        }
    }
    public static void main(String[] args) {
        Crewmatebase crew1 = new Crewmate();
        Crewmatebase crew2 = new Crewmate();
        Crewmatebase crew3 = new Crewmate();

        Impostorbase imp1 = new Impostor();
        Impostorbase imp2 = new Impostor();
        Impostorbase imp3 = new Impostor();

        Crewmatebase impadap1 = new Impostoradapter(imp1);
        Crewmatebase impadap2 = new Impostoradapter(imp2);
        Crewmatebase impadap3 = new Impostoradapter(imp3);

        ShipWork(crew1);
        ShipWork(imp1);
        ShipWork(impadap1);
        ShipWork(crew2);
        ShipWork(imp2);
        ShipWork(impadap2);
        ShipWork(crew3);
        ShipWork(imp3);
        ShipWork(impadap3);

        
    }
}
