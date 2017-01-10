
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		System.out.println("Keegan");
		
		System.out.println("mullinska@s.dcsdk12.org");
		
		System.out.println("Wanted in 140 states");
		
		System.out.println("4k monitor bby");
		
		doStuff(12, 5);
	}
	
	public static void doStuff(int a, int b) {
		int c = b * a;
		c = c + 1;
		System.out.println(c);
		String[] words = new String[2];
		words[0] = "help";
		words[1] = "me";
		for (int i=0; i < words.length; i++) {
			System.out.println(i + 1);
		}
	}

}
