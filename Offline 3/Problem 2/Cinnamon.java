public class Cinnamon extends Addondecorator{
    Cinnamon(Beverage beverage)
    {
        this.beverage=beverage;
    }
    public String get_desc()
    {
        return beverage.get_desc()+"Cinnamon Powder :50 Taka\n"; 
    }
    public double get_cost()
    {
        return beverage.get_cost()+50;
    }
    
}
