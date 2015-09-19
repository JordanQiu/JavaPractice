package practice.set;

public class SetData2 implements Comparable<SetData2>{
    private String test2;
	@Override
	public int compareTo(SetData2 o) {
		
		return (this.getTest2().hashCode()-o.getTest2().hashCode());
	}
	public String getTest2() {
		return test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}
}
