class AccountDetail{
	private long acc_no;
	private String name;
	private float amount;
public long getAcc_no(){
	return acc_no;
}
public void setAcc_no(long acc_no){
	this.acc_no=acc_no;
}
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public float getAmount(){
	return amount;
}
public void setAmount(float amount){
	this.amount= amount;
}
}
public class Account {
public static void main(String[] args) {
		AccountDetail acc =new AccountDetail();
		acc.setAcc_no(7524865455l);
		acc.setName("swara");
		acc.setAmount(500000);
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());


	}

}
