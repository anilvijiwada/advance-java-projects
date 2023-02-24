//create abstract class shape
//create the following child classes,circle,Sphere,Cylinder
package classobjectDEMO;
abstract class shape {
	abstract public void area();
}
class circle extends shape {
	private int radius=5;
	public void area() {
		System.out.println("area of circle is "+3.141*radius*radius);
	}
}
class Sphere1 extends shape {
	private int radius=3;
	public void area() {
		System.out.println("area of sphere is "+4*3.141*radius*radius);
	}
}
class Cylinder1 extends shape {
	private int radius=3,height=2;
	public void area() {
		System.out.println("area of cylinder is "+(2*3.141*radius*height+2*3))
	}	
}

public class Test4 {

	public static void main(String[] args) {
		circle c=new circle();
		Sphere1 s=new Sphere();
		Cylinder1 r=new Cylinder();
		   c.area();
		   s.area();
		   r.area();
		// TODO Auto-generated method stub

	}

}

