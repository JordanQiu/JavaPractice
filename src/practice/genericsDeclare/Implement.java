package practice.genericsDeclare;

public class Implement {

	public static void main(String arg[]){
		Circle circle = new Circle(3);
		ConeGenericsClass<Circle> cone = new ConeGenericsClass<Circle>(circle); //创建一个（圆）锥对象。
	
		cone.setHeight(3);
		System.out.println(cone.computeVolume());
		
		Rect rect = new Rect(3, 3);
		ConeGenericsClass<Rect> coneRect = new ConeGenericsClass<Rect>(rect);//创建一个（方）锥对象。
	    coneRect.setHeight(4);
		System.out.println(coneRect.computeVolume());
	}
}
