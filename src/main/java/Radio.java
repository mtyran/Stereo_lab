public class Radio extends Component implements IPlay{

    public Radio(String make, String model){
        super(make, model);
    }

    public String tune() {
        return "Radio1";
    }

    public void play(String action){
        this.actionTaken = action;
    }
}

