package high.low;

public class Controller {
    
    private final Model Model;
    private final View View;
    
    Controller(Model sModel, View sView){
        this.Model = sModel;
        this.View = sView;
    }
    
    public void Start(){
        View.introduction();
        while(true){
            if(View.Quit() == 0){View.goodbye();} //ask if the player would like to quit
            Model.reset();
            this.selectLevel();
            this.chooseYourBet();
            this.takeGuess();
        }
    }
    
    //Select game level
    public void selectLevel(){
        View.selectLevel();
        boolean done = false;
        while(!done){
            done = true;
            switch(View.getInt()) {
                case 1:
                  // level easy 1-20
                    Model.setLimit(1, 20);
                    Model.generateComputerNo();
                    Model.setCredits(20);
                    View.creditAward(20);
                break;
                case 2:
                  // level medium 1-50
                    Model.setLimit(1, 50);
                    Model.generateComputerNo();
                    Model.setCredits(20);
                    View.creditAward(20);
                break;
                case 3:
                  // level hard 1-100
                    Model.setLimit(1, 100);
                    Model.generateComputerNo();
                    Model.setCredits(20);
                    View.creditAward(20);
                break;
                default:
                    View.selectError();
                    done = false;
            }
        }
    }
    
    //Ask user to pick an amount to bet
    public void chooseYourBet(){
        View.chooseYourBet();
        Model.setBetAmount(View.getInt());
    }
    
    //Ask user to guess the number
    public void takeGuess(){
        View.takeGuess();
        boolean done = false; int counter = 1;
        while(!done){
            int input = View.getInt();
            if(input == -1){//if player decides to exit
                View.matchResult(counter, Model.getCredits());
                done = true;
            }else{
                if(Model.getCredits() > 0){
                    Model.setPlayerGuess(input);
                    switch(checkAnswer()) {
                        case 0:
                            View.guessedTooLow(Model.getPlayerGuess());
                            Model.setCredits(Model.getCredits() - Model.getBetAmount());
                            break;
                        case 2:
                            View.guessedTooHigh(Model.getPlayerGuess());
                            Model.setCredits(Model.getCredits() - Model.getBetAmount());
                            break;
                        default:
                            int rewardAmount = Model.getCredits() * Model.getBetAmount();
                            View.winResult(counter, Model.getCredits(), Model.getPlayerGuess());
                            Model.setCredits(rewardAmount); View.creditReward(rewardAmount);
                            if(View.Exit() == 1){
                                Model.generateComputerNo();
                            }else{
                                done = true;
                            }
                    }
                }else{
                    View.insufficientCredits();
                    done = true;
                }  
            }
            counter++;
        }
    }
    
    //check if the guessed number is correct
    public int checkAnswer(){
        if(Model.getPlayerGuess() < Model.getComputerNo()){//lower than target no
            return 0;
        }else if(Model.getPlayerGuess() > Model.getComputerNo()){//greater than target no
            return 2;
        }else{
            return 1;
        }
    }
    
}
