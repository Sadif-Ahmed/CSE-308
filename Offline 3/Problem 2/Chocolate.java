public class Chocolate extends Addondecorator {
    Chocolate(Beverage beverage)
    {
        this.beverage = beverage;
    }
    public String get_desc()
    {
        return beverage.get_desc()+"Chocolate Sauce :60 Taka\n";
    }
    public double get_cost()
    {
        return beverage.get_cost()+60;
    }

    
}
