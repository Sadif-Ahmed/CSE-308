public abstract class Color {
    protected String type;

    abstract void set_type();
    
    void print_type()
    {
        System.out.println("The Color is: "+type);
    }
    String get_type()
    {
        return type;
    }
}
class Red extends Color
{
    Red()
    {
        type="Red";
    }
    void set_type()
    {
        type="Red";
    }
}
class Black extends Color
{
    Black()
    {
        type="Black";
    }
    void set_type()
    {
        type="Black";
    }

}
class White extends Color
{
    White()
    {
        type="White";
    }
    void set_type()
    {
        type="White";
    }
}
class DemoColor 
{
    public static void main(String[] args) {
        Color X = new Red();
        X.print_type();
    }
}
