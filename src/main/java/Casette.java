public class Casette extends Component {

    private int numTapes;

    public Casette(String make, String model, int numTapes){
        super(make, model);
        this.numTapes = numTapes;
    }

    public int getNumTapes(){
        return numTapes;
    }
}
