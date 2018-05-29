
//ZooMonitor.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ZooMonitor {
   //Creating scanner to scan file
    //Method to select a habitat
private static int Habitat() {
   System.out.println("Please choose which habitat you'd like to monitor.");
   System.out.println("1. Penguin");
   System.out.println("2. Bird");
   System.out.println("3. Aquarium");
   int choice = Integer.parseInt(scanner.nextLine());
   return choice;
}
//method to select an animal
private static int Animal() {
   System.out.println("Please choose which animal you'd like to monitor.");
   System.out.println("1. Lion");
   System.out.println("2. Tiger");
   System.out.println("3. Bear");
   System.out.println("4. Giraffe");
   int choice = Integer.parseInt(scanner.nextLine());
   return choice;
}
//method for main monitoring system menu
private static int Menu() {
   System.out.println("---Zoo Monitoring System Menu---");
   System.out.println("Do you want to monitor an animal or habitat, or exit the system?");
   System.out.println("1. Monitor animal");
   System.out.println("2. Monitor habitat");
   System.out.println("3. Exit");
   int choice = Integer.parseInt(scanner.nextLine());
   return choice;
}
   private static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
           //calling menu method
           int choice = Menu();
           Scanner filereader = null;
           //If user chose option 1, animals, in menu
           if(choice == 1)
           {
               //calling selectanimal method, store choice as animal variable
               int animal = Animal();
               String animalType="";
               String animalName="";
               try {
                   //opening animals.txt file
                   filereader = new Scanner(new File("D:\\Text Files\\animals.txt"));
                   //Switch statement to determine which animal's info to display
                   switch (animal)
                   {
                   case 1:
                       animalName = "Animal - Lion";
                       break;
                   case 2:
                       animalName = "Animal - Tiger";
                       break;
                   case 3:
                       animalName = "Animal - Bear";
                       break;
                   case 4:
                       animalName = "Animal - Giraffe";
                       break;              
                   }
                   boolean repeat=true;
                   while(filereader.hasNextLine() &&repeat)
                   {
                       animalType=filereader.nextLine();
                       if(animalType.equals(animalName))
                           repeat=false;
                   }
                   //reading lines of the file for each animal selected
                   String name = filereader.nextLine();
                   String age = filereader.nextLine();
                   String health = filereader.nextLine();
                   String feed = filereader.nextLine();
                   //checking if health or feed contains any concerns
                   if(health.contains("*****"))
                       JOptionPane.showMessageDialog(null, health, "Warning : "+animalType, JOptionPane.INFORMATION_MESSAGE);
                   else if(feed.contains("*****"))
                       JOptionPane.showMessageDialog(null, feed, "Warning : "+animalType, JOptionPane.INFORMATION_MESSAGE);
                   else
                       //displaying monitoring info
                       System.out.println(name);
                       System.out.println(age);
                       System.out.println(health);
                       System.out.println(feed);
               //catch error if file is not found
               } catch (FileNotFoundException e) {
                   System.out.println(e.getMessage());
               }          
           }
           //If user chooses option 2, habitats, in menu
           else if(choice == 2)
           {
               int habitat = Habitat();
               String animalType="";
               String animalName="";
               //Using try-catch statement to handle error if file isn't found
               try {
                   filereader = new Scanner(new File("D:\\Text Files\\habitats.txt"));
                   //switch statement to determine which habitat to display
                   switch (habitat)
                   {
                   case 1:
                       animalName = "Habitat - Penguin";
                       break;
                   case 2:
                       animalName = "Habitat - Bird";
                       break;
                   case 3:
                       animalName = "Habitat - Aquarium";
                       break;      
                   }
                    boolean repeat=true;
                   while(filereader.hasNextLine() &&repeat){
                       animalType=filereader.nextLine();
                       if(animalType.equals(animalName))
                           repeat=false;
                   }
                   String temperature = filereader.nextLine();
                   String food = filereader.nextLine();
                   String cleanliness = filereader.nextLine();

                   //checking if temperature,food or cleaniness contains any concerns
                   if(temperature.contains("*****"))
                       JOptionPane.showMessageDialog(null, temperature, "Warning : "+animalType, JOptionPane.INFORMATION_MESSAGE);
                   else if(food.contains("*****"))
                       JOptionPane.showMessageDialog(null, food, "Warning : "+animalType, JOptionPane.INFORMATION_MESSAGE);
                   else if(cleanliness.contains("*****"))
                       JOptionPane.showMessageDialog(null, cleanliness, "Warning : "+animalType, JOptionPane.INFORMATION_MESSAGE);
                   else
                       //Displaying monitoring info for habitat
                       System.out.println(temperature);
                       System.out.println(food);
                       System.out.println(cleanliness);
               } //catch error if file is not found
               catch (FileNotFoundException e) {
                   System.out.println(e.getMessage());
               }
           }
           else
           {
               //Exit the monitoring system doesn't choose animal or habitat option
               System.out.println("Exiting monitoring system.");
               System.exit(0);
           }
       }
   }
