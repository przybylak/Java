/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
class HelloWorldApp {
    public static void main(String[] args) {
		for(String element:args){
			System.out.println(element); 
		} 
		int i = 0;
		while(i < args.length ){
			System.out.println("Argument " + i + " " + args[i]);
			i++;
		} 
		
		do {
			System.out.println(String element:args);
		} while(args.length);
    }
}
