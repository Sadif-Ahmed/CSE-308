import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int t;
        int i=1;
        System.out.println("Input number of clients:");
        Scanner scn = new Scanner(System.in);
        t=scn.nextInt();
        scn.nextLine();
        while(t>=i)
        {
        System.out.println("Please Give the Continent Location of the client: ");
        String location = scn.nextLine();
        System.out.println("Client Number: "+i);
        CarFactory factory = new CarFactory();
        Car clientCar = factory.getCar(location);
        clientCar.print();
        i++;
        }
        scn.close();


    }
    
}
