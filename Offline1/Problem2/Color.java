public abstract class Color {
    protected String type;

    
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
   
}
class Black extends Color
{
    Black()
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
   
}
class DemoColor 
{
    public static void main(String[] args) {
        Color X = new Red();
        X.print_type();
    }
}
