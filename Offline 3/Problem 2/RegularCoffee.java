public class RegularCoffee extends Beverage {
    RegularCoffee()
    {
        desc= "Mug : 100 Taka\nGrinded Coffee Beans : 30 Taka \nWater : N/A\n";
    }
    public double  get_cost()
    {
        return 100+30;
    }
}
