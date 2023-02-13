public class EnglishTranslator implements ETbase{
    Speech speech;
    String str;
    EnglishTranslator(String str)
    {
        this.str=str;
        speech = new Speech();
    }
    public void translate()
    {
         speech.set_s(str);
    }
    public Speech get_speech()
    {
        return speech;
      }
    
}
