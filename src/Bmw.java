/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : More on methods
 * Lecture  : http://youtu.be/oRO33S1Z0bw
 * Tutorial : http://youtu.be/M0Bx5jyaN40
 * License  : None.  Do with it as you wish! :)
 */

public class Bmw extends Car {
	public Bmw() {
		name = "Bmw";
		model = "1 series";
		age = 1.5f;
	}
	
	/* Only accessible if you instantiate
	 * as "Bmw", not "Car"
	 */
	public void methodOnlyBmwHas() {
		//do something
	}
}
