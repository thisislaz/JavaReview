class VoiceMessageTest{
  public static void main(String[] args){
    //new data type
                  //variable name
    VoiceMessageUtil alexMachine = new VoiceMessageUtil();
    System.out.println(alexMachine.greeting());
    System.out.println(alexMachine.greeting("Alex"));
    System.out.println(alexMachine.greeting("Lazaro", 31));
    System.out.println(alexMachine.getCurrentDate());
  }
}