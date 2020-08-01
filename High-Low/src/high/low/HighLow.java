package high.low;

public class HighLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model Model = new Model();
        View View = new View();
        Controller Controller = new Controller(Model, View);
        
        Controller.Start(); //Initialize the app
    }
    
}
