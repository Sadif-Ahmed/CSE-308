public abstract class Car {
    cartype type;
    int totalvisit;
    void change_type(cartype type)
    {
        this.type=type;
    }
    void print()
    {
        System.out.println("This is a "+ type.get_type());
    }
    double calculate_rent(int period)
    {
        double rent;
        rent= type.getrate()*period;
        if(period>30)
        {
            rent=rent-rent*0.1;
        }
        double l_disc=(totalvisit/5)*0.05;
        rent=rent-rent*l_disc;
        totalvisit++;
        return rent;
    }
}