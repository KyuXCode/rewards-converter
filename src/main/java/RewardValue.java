public class RewardValue {
    private double cashValue;
    private double milesValue;

    //Cash constructor
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035 ;
    }

    //Miles constructor
    public RewardValue(double milesValue, boolean isMiles){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035 ;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue reward1 = new RewardValue(100.0);
        System.out.println("Cash Value: " + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        RewardValue reward2 = new RewardValue(350.0, true);
        System.out.println("Cash Value: " + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue());
    }



}
