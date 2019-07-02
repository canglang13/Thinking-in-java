import java.util.*;
public class ForEach {
	static int[] a=new int[100];
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			a[i]=i;
		}
		for(int s: a)
			System.out.println(s);
		System.out.println(Arrays.toString(a));
	}
}
