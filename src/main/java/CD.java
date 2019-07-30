public class CD extends Component implements IPlay {

    private int numDiscs;

    public CD(String make, String model, int numDiscs){
        super(make, model);
        this.numDiscs = numDiscs;
    }

    public int getNumDiscs(){
        return numDiscs;
    }

    public void play(String action){
        this.actionTaken = action;
    }
}
