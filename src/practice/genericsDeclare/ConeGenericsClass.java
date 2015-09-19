package practice.genericsDeclare;

public class ConeGenericsClass<E> {
 double height;
 public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
E bottom;


public ConeGenericsClass(E b){
	 bottom = b;
 }
	public double computeVolume(){
		String s = bottom.toString();
		double area = Double.valueOf(s).doubleValue();
		return 1.0/3.0*area*height;
	}
	
}
