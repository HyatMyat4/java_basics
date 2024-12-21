
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
   public static void main(String[] args) {

   Random random = new Random();
 
   System.out.print("\n");
   int randomNum = random.nextInt(6)+1;
   boolean randomBol = random.nextBoolean();


    System.out.println("---------------------");
    System.out.println("The random boolean is : " + randomBol);
    System.out.println("---------------------");

    System.out.print("\n");
    System.out.println("---------------------");
    System.out.println("The random number is : " + randomNum);
    System.out.println("---------------------");

   double x;
   double y;
   double z;

   Scanner scanner = new Scanner(System.in);

    System.out.print("\n");
    System.out.println("******************");
    System.out.println("Enter side x: ");
    System.out.println("******************");
    x = scanner.nextInt();
   scanner.nextLine();

    System.out.print("\n");
    System.out.println("******************");
    System.out.println("Enter side y: ");
    System.out.println("******************");
    y = scanner.nextInt();

    z = Math.sqrt((x*x)+(y*y));

    System.out.print("\n");
    System.out.println("---------------------");
    System.out.println("The hypotenuse is : " + z);
    System.out.println("---------------------");

   double friends = 10;

   friends = (double)friends / 3;

   System.out.print("\n");
   System.out.println("---------------------");
   System.out.println(friends);
   System.out.println("---------------------");

   String dialogName = JOptionPane.showInputDialog("Enter your name");
   JOptionPane.showMessageDialog(null, "Hello " + dialogName);

    System.out.print("\n");
    System.out.println("---------------------");
    System.out.print(" Hello Java\n");
    System.out.print(" Java is preety fun!\n");
    System.out.println("---------------------");
        
    System.out.print("\n");
    System.out.println("******************");
    System.out.println("What is your name?");
    System.out.println("******************");

    String name = scanner.nextLine();
  
    System.out.print("\n");
    System.out.println("******************");
    System.out.println("How old are you?");
    System.out.println("******************");

    int age = scanner.nextInt();
    scanner.nextLine();
    
    System.out.print("\n");
    System.out.println("---------------------");
    System.out.println("Hello "+name);
    System.out.println("Your are "+age+" years old");
    System.out.println("---------------------");
    


   }
}
