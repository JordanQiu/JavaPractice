package practice.set;

import java.util.Comparator;

public class SetData implements Comparable<SetData>{
    private String test;
	@Override
	public int compareTo(SetData o) {
		
		return (this.getTest().hashCode()-o.getTest().hashCode());
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
