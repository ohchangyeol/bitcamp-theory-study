package phone;

public class CellPhone{
	//Field
	private String phoneNumber;
	private int totalCallTime;
	private int feePerCallTime;
	private int totalFee;
	//Constructor
	public CellPhone(){}
	public CellPhone(String userNumber, int fee){
		this.phoneNumber = userNumber;
		this.feePerCallTime = fee;
	}
	//getter
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public int getTotalCallTime(){
		return totalCallTime;
	}
	public int getTotalFee(){
		return totalFee;
	}
	public int getFeePerCallTime(){
		return feePerCallTime;
	}
	
//	setter
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
		
	//method
	public void call(String number, int time){
		this.totalCallTime += time;
		System.out.println(number + "번호로 " + time + "통화함");
	}
	
	public void calculateTotalFee(){
		totalFee = totalCallTime * feePerCallTime;
	}
}