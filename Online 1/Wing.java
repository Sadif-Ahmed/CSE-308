public abstract class Wing
{
    String type;
    String get_Wing()
    {
        return type;
    }
}
class BoeingW extends Wing
{
    BoeingW()
    {
        type="Boeing";
    }
}
class AirbusW extends Wing{
    AirbusW()
    {
        type="Airbus";
    }
}
class SafranW extends Wing
{
    SafranW()
    {
        type="Safran";
    }
} 