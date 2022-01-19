import java.io.Console;

public class Test {
	
	public static void main(String[] args) {
		Console console = System.console();
		char[] pwd=new char[100];
		pwd=console.readPassword("Enter the password", pwd);
		System.out.println(pwd);
		System.out.println(String.valueOf(pwd));
	}

}
