package high.low
;
import java.util.Scanner;

public class View {
    
    Scanner input = new Scanner(System.in);
    
    // Output section
    
    public void introduction(){
        System.out.println("-------------------------");
        System.out.println("High Low is a game where the computer picks a number in a defined set, \nand the goal of the game is to guess that number.");
        System.out.println("-------------------------");
    }
    
    public void goodbye(){
        System.out.println("The app has been succesfully closed. Goodbye!");
        System.exit(0);
    }
    
    public void selectLevel(){
        System.out.println("");
        System.out.println("Please select your desired game level(Enter the numeric value): ");
        System.out.println("1)Easy 1-20, \n2)Medium 1-50, \n3)Hard 1-100");
        System.out.println("");
    }
    
    public void selectError(){
        System.out.println("Enter a valid game level!");
    }
    
    public void creditAward(int credits){
        System.out.println("\nYou have been awarded "+ credits +" credits!");
    }
    
    public void creditReward(int credits){
        System.out.println("\nYou have been reawarded "+ credits +" credits!");
    }
    
    public void insufficientCredits(){
        System.out.println("Insufficient credits!");
    }
    
    public void chooseYourBet(){
        System.out.println("\nEnter the amount of credits you would like to wager each guess.");
    }
    
    public void takeGuess(){
        System.out.println("\nEnter your guess or -1 to exit the game.");
    }
    
    public void guessedTooLow(int guess){
        System.out.println(guess +" is too low!");
    }
    
    public void guessedTooHigh(int guess){
        System.out.println(guess +" is too high!");
    }
    
    public void winResult(int times, int credits, int guess){
        System.out.println("Times guessed: "+ times);
        System.out.println("Available Credits: "+ credits);
        System.out.println(guess +" is the perfect guess! You have won the game!");
    }
    
    public void matchResult(int times, int credits){
        System.out.println("Times guessed: "+ times);
        System.out.println("Available Credits: "+ credits);
    }
    
    public void output(String message){
        System.out.println(message);
    }
    
    public void outputError(String message){
        System.out.println(message);
    }
    
    // Input Section
    
    public int getInt(){
        return Integer.parseInt(input.nextLine());
    }
    
    public String getString(){
        return input.nextLine();
    }
    
    public int Exit(){
        System.out.println("");
        System.out.print("Enter 1 to contineu or 0 to exit: ");
        return this.getInt();
    }
    
    public int Quit(){
        System.out.println();
        System.out.print("Enter 1 to start a new game or 0 to quit the app: ");
        return this.getInt();
    }
    
}
