public class Coffeebeans extends Addondecorator{
    Coffeebeans(Beverage beverage)
    {
        this.beverage=beverage;
    }
    public String get_desc()
    {
        return beverage.get_desc() + "Grinded Coffee Beans : 30 Taka\n";
    }
    public double get_cost()
    {
        return beverage.get_cost()+30;
    }
}
