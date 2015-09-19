package practice.childToParent;

public abstract class Parent {
	protected String name;
	private double money;
	final private String LastName="Qiu";
	
	
    public void canMakeMoney(){
    	System.out.println("I can make lots of money");
    }
    public void canSpeak(){
    	System.out.println("I can speak");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getLastName() {
		return LastName;
	}
    
}
