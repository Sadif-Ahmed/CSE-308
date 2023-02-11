public class Milk extends Addondecorator{
    Milk(Beverage beverage)
    {
        this.beverage=beverage;
    }
    public String get_desc()
    {
        return beverage.get_desc()+"Milk : 50 Taka\n";
    }
    public double get_cost()
    {
        return beverage.get_cost()+ 50;
    }
}
