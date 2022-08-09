package inner_class_sample;

public class Outer {
	public class Inner {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer.Inner();
	}
}
