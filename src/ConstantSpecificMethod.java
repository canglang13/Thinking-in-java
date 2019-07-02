import java.util.*;
import java.text.*;

public enum ConstantSpecificMethod {
	DATA_TIME{
		String getInfo() {
			return 
					DateFormat.getDateInstance().format(new Date());
		}
	},
	CLASSPATH{
		String getInfo() {
			return System.getenv("CLASSPATH");
		}
	},
	VERSION{
		String getInfo() {
			return System.getProperty("java.version");
		}
	};
	String getInfo() {
		return "defualt getInfo";
	};
	
	public static void main(String[] args) {
		for(ConstantSpecificMethod csm:values())
			System.out.println(csm.getInfo());
		
	}
}
