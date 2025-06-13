public class IS147projectcode {
   public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
      
      System.out.print("Hello! Before we start, let's test your luck.\nPick a number between 1 and 3: ");
      int userNum = input.nextInt();      //One of many user input prompts
      input.nextLine();
      
      int randomNum = (int)(Math.random() * 3) + 1;      //Mathematical Function
      
      if (userNum == randomNum) {      //Selection statement
         System.out.println("It's your lucky day! Let's continue with the program.");
      }
      else {
         System.out.println("Aww, unlucky. The number was " + randomNum + ". Let's continue with the program.");
      }
      
      System.out.print("Enter your First Name: ");
      String firstName = input.nextLine();
      
      System.out.print("Enter your Last Name: ");
      String lastName = input.nextLine();
      System.out.println();
      
      System.out.println("Welcome, " + firstName + " " + lastName + "!");
       
      String[] subjects = {"History", "English", "Math"};      //Array
      
      FunFact history = new FunFact();    //Objects
      FunFact english = new FunFact();
      FunFact math = new FunFact();
      
      String userContinue;
      
      do {     //Loop
         System.out.print("What subject's fun fact would you like to learn about?\nThere is History, English, and Math available: ");
         String desiredSubject = input.nextLine();

         if (desiredSubject.equalsIgnoreCase("History")) {
            history.givenFact = "Napoleon was attacked by rabbits: During a hunt, a horde of rabbits nearly overwhelmed Napoleon's forces.";
            System.out.println(history.givenFact);
            System.out.println("The length characters of this quote is: " + history.calculateLength());
         }
         else if (desiredSubject.equalsIgnoreCase("English")) {
            english.givenFact = "Each year, around 4,000 words are added to the dictionary. For instance, the word \"lol\" was included in the Oxford English Dictionary back in 2011.";
            System.out.println(english.givenFact);
            System.out.println("The length characters of this quote is: " + english.calculateLength());   
         }
         else if (desiredSubject.equalsIgnoreCase("Math")) {
            math.givenFact = "While it seems unlikely that two people in a small group would have the same birthday, the probability actually increases surprisingly quickly." + 
            "In a room of 23 people, there's a 50% chance that two people share a birthday.";
            System.out.println(math.givenFact);
            System.out.println("The length characters of this quote is: " + math.calculateLength());            
         }
         else {
            System.out.println("Invalid subject.");
         }

         System.out.print("Would you like to learn about another subject? (Enter Yes or No): ");
         userContinue = input.nextLine().trim();
      
      } while (userContinue.equalsIgnoreCase("Yes"));
      
      System.out.println("Thanks for learning!");
     
   }
}

class FunFact {      //Class
   String givenFact;
   
   int calculateLength() {    //Method
      int lengthOfFact = 0;
      lengthOfFact = givenFact.length();
      
      return lengthOfFact;
   } 
}