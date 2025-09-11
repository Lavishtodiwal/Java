class ToString{
	public String toString(){
		return "custom return instead of ToString@1f021e6c";
	}
	public static void main(String... s){
		ToString t1 = new ToString();
		System.out.println(t1);
	}
}


// When an object of a Throwable subclass is created (like when you throw new NullPointerException()), it stores valuable information. You can access this information using these methods:

// getMessage(): Returns the detailed error message string that was provided when the exception was created (e.g., "Invalid Age").

// printStackTrace(): Prints the "stack trace" to the console. This is a powerful debugging tool that shows the exact sequence of method calls that led to the error.

// toString(): Returns a short description of the exception, usually the class name followed by the message.