
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many guesses do you want to have:");
        System.out.println("5, 10 or 15");
        Scanner ds = new Scanner(System.in);
        int cd = ds.nextInt();
        int difficulty = 15;
        if (cd == 5){
            difficulty = 5;
        }
        else if(cd == 10){
            difficulty = 10;
        } 
         else if(cd == 15){
            difficulty = 15;
        }
        else{
          System.out.println("You typed in a wrong input!");  
        }

        System.out.println("Take a guess between 0-100, you have "+ difficulty +" tries:");
        int i= 0;
        int number = (int)(Math.random() * 101);

        while(i < difficulty){
            int guess = scan.nextInt();
            if(guess == number){
                System.out.println("You guessed correctly. The number was "+number);
                break;
            }
            else if(guess < number){
                System.out.println("guess higher");
            }
            else if(guess > number){
                System.out.println("guess lower");
            }
            i++;    
        }if (i == difficulty){
            System.out.print("Game Over. You guessed to many times."); 
        }

    }
}
