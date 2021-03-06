package phone;
public class SmartPhone extends CellPhone {
	// Field
	private boolean isMonthlyFixedRate;
	private int MonthlyFixedFee;
	
	// Constructor
	public SmartPhone() {}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime , boolean isMonthlyFixedRate,int MonthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.MonthlyFixedFee =MonthlyFixedFee;
	}
	// getter
	

	// setter

	// method
	@Override
	public void calculateTotalFee() {
		if(isMonthlyFixedRate) {
			setTotalFee((getTotalCallTime() * getFeePerCallTime()) + MonthlyFixedFee);	
		}else {
			super.calculateTotalFee();
		}
	}
}