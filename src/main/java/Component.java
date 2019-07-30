public abstract class Component {
    protected String make;
    protected String model;
//    protected String action;
    protected String actionTaken;

    public Component(String make, String model){
        this.make = make;
        this.model = model;
        this.actionTaken = "";
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getActionTaken(){
        return actionTaken;
    }
}
