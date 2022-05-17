public class Autopolicy {
    private int accountNumber;
    private String makeAndmobile;
    private String state;

    public  Autopolicy(int accountNumber, String makeAndMobile, String state){
        this.accountNumber = accountNumber;
        this.makeAndmobile = makeAndMobile;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setMakeAndModel(String makeAndModel){
        this.makeAndmobile = makeAndModel;
    }

    public String getMakeAndModel(){
        return this.makeAndmobile;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public boolean isNoFaultState(){
        boolean noFaultState;

        switch(getState()){
            case "MA": case "NJ": case "PA":
            noFaultState = true;
            break;
            default:
            noFaultState = false;
            break;
        }
        return noFaultState;
    }
}
