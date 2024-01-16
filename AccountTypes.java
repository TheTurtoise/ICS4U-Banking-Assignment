public class AccountTypes {
    Double savingsBal;
    Double chequingBal;
    public AccountTypes() {
        // Initialize the fields in the constructor
        this.savingsBal = 0.0;
        this.chequingBal = 0.0;
    }
    public void setSavingsBal(Double savingsBal) {
        this.savingsBal = savingsBal;
    }
    public void setChequingBal(Double chequingBal) {
        this.chequingBal = chequingBal;
    }
    public Double getSavingsBal() {
        return savingsBal;
    }
    public Double getChequingBal() {
        return chequingBal;
    }

}
