/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : More on methods
 * Lecture  : http://youtu.be/oRO33S1Z0bw
 * Tutorial : http://youtu.be/M0Bx5jyaN40
 * License  : None.  Do with it as you wish! :)
 */

public class Car {
	String name = "";
	String model = "";
	float age = 0.0f;
	int doors = 5;
	
	//Bmw code essentially goes here
	public static String test() {
		return test("message");
	}
	
	public static String test(String msg) {
		return msg;
	}
}
