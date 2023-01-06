public abstract class Engine
{
    String type;
    String get_Engine()
    {
        return type;
    }
}
class BoeingE extends Engine
{
    BoeingE()
    {
        type="Boeing";
    }
}
class AirbusE extends Engine{
    AirbusE()
    {
        type="Airbus";
    }
}
class SafranE extends Engine
{
    SafranE()
    {
        type="Safran";
    }
} 