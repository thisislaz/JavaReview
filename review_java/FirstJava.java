public class FirstJava{
  //attributes
  //methods
  public static void main(String[] args){
    System.out.println("Hello Java!!");

    String firstName = "Alex";
    String lastName = "Miller";
    int age = 28;
    boolean isStudent = true;
    double weight = 152.7;
    //single quotes, in java, are for letters
    char grade = 'A';

    System.out.println(firstName +" "+ lastName + " is " + age + " years old.");
    System.out.println("How old is he: "+age);
    System.out.println("Is student: " + isStudent);
    System.out.println("How how much does he weigh: "+weight); 
    System.out.println(Integer.MAX_VALUE);
    
    //the wrapper classes use up more data
    Integer someAge = 123;

    // condition has to be a boolean in java
    //you can not write it as follows
    //if(weight) because it is not a boolean
    if(weight < 100){
      System.out.println("You need to gain some weight!");
    }else{
      System.out.println("You are over 100 pounds");
    }

    System.out.println(weight<100 ? "Please gain some weight" : "This is the else statement");

    String name = "Alex Miller";
    String fullName = firstName.concat(lastName);
    System.out.println("The length of name is : "+name.length()+"\nThe fullName is: "+fullName);
    
    //this is how we can format it like f strings or backticks (` `)
      //the letters after the % are different depending on the type of the args
    String greeting = String.format("Hi %s, you are %d years old.",firstName,age);
    System.out.println(greeting);
    System.out.printf("Hello %s, you weigh %.2f \n", fullName,weight);

    //creating a string
    String firstNameOne="Martha";
    //we are instanciating a new string type class with the word " new "
    String firstNameTwo = new String("Martha");
    String firstNameThree = "Martha";

    //this one is not equal becasue it is comparing based off of the instance i guess
    System.out.println(firstNameOne == firstNameTwo);
    //this is equal becasue it is not a new instance of a string.
    System.out.println(firstNameOne == firstNameThree);
    //this is how can get an accurate comparison
    System.out.println(firstNameOne.equals(firstNameTwo)); //returns truee now

  }

}