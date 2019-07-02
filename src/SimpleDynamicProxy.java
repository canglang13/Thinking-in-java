import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Interface{
	public void doSomething();
	public void doElsething();
}


class RealObject implements Interface{
	public void doSomething() {
		System.out.println("doSomething");
	}
	public void doElsething() {
		System.out.println("doElsething");
	}
}

class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied=proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("doElsething")) {
			System.out.println("doElsething1");
		}
			
		System.out.println("proxy1");
		Object obj=method.invoke(proxied, args);
		System.out.println("proxy2");
		return obj;
	}
	
}



public class SimpleDynamicProxy {
	public static void  main(String[] args) {
		RealObject rel=new RealObject();
		Interface proxy=(Interface)Proxy.newProxyInstance(rel.getClass().getClassLoader()
				, rel.getClass().getInterfaces(), new DynamicProxyHandler(rel));
		proxy.doSomething();
		proxy.doElsething();
	}
}
