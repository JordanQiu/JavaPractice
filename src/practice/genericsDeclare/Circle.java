package practice.genericsDeclare;

public class Circle {
  double area;
double radius;
  public Circle(double r){
  radius = r;}
  
  public String toString(){
	  area = Math.PI*radius*radius;
	  return ""+area;
  }
}
