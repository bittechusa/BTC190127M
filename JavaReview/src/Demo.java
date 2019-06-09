import org.junit.Test;



public  class Demo implements ToyCar{
	private String userid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String pass;
	
	public void login()
	{
		Plaay p=new Plaay();
		Plaay.B g=p.new B();
		//Plaay.B n=Plaay.B();
		System.out.println("user id "+getUserid()+" password is "+getPass());
	}
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getLength() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nopower() {
		// TODO Auto-generated method stub
		
	}
	
}
