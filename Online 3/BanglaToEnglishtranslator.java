public class BanglaToEnglishtranslator implements ETbase {
    BTbase banglaTranslator;
    Speech speech;
   BanglaToEnglishtranslator(BTbase banglaTranslator)
   {
    this.banglaTranslator=banglaTranslator;
    this.speech = banglaTranslator.get_speech();
   }
   @Override
   public void translate() {
      banglaTranslator.translate();
   }
   @Override
   public Speech get_speech() {
       return speech;
   }
    
}
