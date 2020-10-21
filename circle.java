package day2labassignment;

public class circle {
 double radius;
 String color;
  circle(){
	  radius=1.0;
	  color="red";
	  System.out.println("circle is red in color");
  }
  circle(double r){
	  System.out.println("radius of a circle:"+r);
  }
  public double getRadius() {
	  return this.radius;
	  
  }
  public double getArea() {
	return  radius*radius*Math.PI;
      //System.out.println(color);
  }
  public static void main(String[] args) {
	  circle c = new circle();
	  circle c1=new circle(11.2);
	  System.out.println("Radius of a circle is:"+c.getRadius());
	  System.out.println("Area of the circle is:"+c1.getArea());
	  
		// TODO Auto-generated method stub

	}

}
