class Base{
	public void fun1() {
		this.fun2();
	}
	public void fun2() {
		System.out.println("Base fun2()");
	}
	public String toString() {
		return "Base in toString";
	}
}

class Base1 extends Base{
	@Override public void fun2() {
		System.out.println("Base1 fun2()");
	}
	public String toString() {
		return "Base1 in toString";
	}
}

public class UpCast {
	public static void main(String[] args) {
	Base b= new Base1();
	b.fun1();
	System.out.println(b);
	}
}
