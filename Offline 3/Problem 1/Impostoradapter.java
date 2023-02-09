public class Impostoradapter implements Crewmatebase{
    Impostorbase impostor;
    Impostoradapter(Impostorbase impostor)
    {
        this.impostor=impostor;
    }

    public void work()
    {
        System.out.println("This is an Impostor Working in Disguise.\n");
        impostor.work();
    }
    
}
