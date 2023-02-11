public class Cream extends Addondecorator {
    Cream(Beverage beverage)
    {
        this.beverage= beverage;
    }
    public String get_desc()
    {
        return beverage.get_desc()+"Dairy Cream : 40 Taka\n";
    }
    public double get_cost()
    {
        return beverage.get_cost()+40;
    }
}
