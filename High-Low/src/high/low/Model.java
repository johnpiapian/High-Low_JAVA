package high.low;

public class Model {
    
    //Contructing data
    private int lowerLimit, upperLimit; //range
    private int computerNo, playerGuess, credits = 0, betAmount = 0;
    
    public int getRandom(int lowerLimit, int upperLimit) {
        return (int)(Math.random() * (upperLimit + 1 - lowerLimit)) + lowerLimit;
    }
    
    public void reset(){
        this.credits = 0;
        this.betAmount = 0;
    }
    
    public void setLimit(int lowerLimit, int upperLimit){
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    
    public void generateComputerNo(){
        this.setComputerNo(this.getRandom(this.lowerLimit, this.upperLimit));
    }

    //Setters & Getters
    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getComputerNo() {
        return computerNo;
    }

    public void setComputerNo(int computerNo) {
        this.computerNo = computerNo;
    }

    public int getPlayerGuess() {
        return playerGuess;
    }

    public void setPlayerGuess(int playerGuess) {
        this.playerGuess = playerGuess;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }
    
    
}
