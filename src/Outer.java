
public class Outer {
	private String id;
	Outer(String s){
		id=s;
	}
	class Inter{
		public Inter() {
			System.out.println("new inter");
		}
		public String toString() {
			return id;
		}
	}
	public Inter fun() {
		return new Inter();
	}
	public static void main(String[] args) {
		Outer o=new Outer("canglang");
		Outer.Inter i=o.fun();
		System.out.println(i.toString());
	}
}
