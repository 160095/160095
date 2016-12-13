public class Aloha {
	public static void main(String[] args) {
		while (true){
				System.out.println("Input name : "); 
			String name = new java.util.Scanner(System.in).nextLine();
		System.out.println(name);
			if( name.equals("exit") ){
				break;
			}
		}
	}
}