import inner_class_sample.Outer;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}
