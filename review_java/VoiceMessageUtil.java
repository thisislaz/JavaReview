import java.util.Date;
class VoiceMessageUtil{
  public String greeting(){
    return "Hi, annoymous!";
  }

  public String greeting(String name){
    return "Hi, " + name;
  }

  public String greeting(String name, int age){
    return "Hello, "+name+" you are "+age+" years old, you old fuck.";
  }

  public String getCurrentDate(){
    Date today = new Date();
    return "Today is: " +today;
  }

}