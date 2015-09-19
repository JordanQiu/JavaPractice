package practice.childToParent;

public class Child extends Parent {
	private String qqName;
	
	
	 public void canMakeMoney(){
		 System.out.println("I can make more money");
		 
	 }
    public void canPlayGame(){
    	System.out.println("I can play games");
    }
	public String getQqName() {
		return qqName;
	}
	public void setQqName(String qqName) {
		this.qqName = qqName;
	}
	
	
}
