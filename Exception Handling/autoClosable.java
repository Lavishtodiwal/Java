import java.util.Scanner;
class autoClosable{
	//autocloseable is a special (try-with-resources). It is designed to automatically manage resources like database connections, files, scanners etc. 	
	//the rule is that any variable declare inside the try(...) must be the type of a that implements the Autoclosable interfaces
	public static void main(String... s){
		try(Scanner sc = new Scanner(System.in)){
			System.out.println(sc);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

//						------OUTPUT------

// java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false][need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}][positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]


//						-----Reason----

// That type of output is the result of the toString() method of the Scanner class.

// When you pass any object to System.out.println(), Java automatically calls that object's toString() method to get a String that it can print to the console.

// While a basic object would just print its class name and a memory address (e.g., java.util.Scanner@15db9742), the Scanner class has a custom toString() method that provides a detailed summary of its internal state, which is incredibly useful for debugging