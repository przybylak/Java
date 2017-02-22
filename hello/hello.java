/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
class HelloWorldApp {
    public static void main(String[] args) {
		for(int i=0; i < args.length; i++){
			System.out.print("Argument ");
			System.out.print(i);
			System.out.println(args[i]);
		}
        System.out.println("Hello World!"); // Display the string.
    }
}
