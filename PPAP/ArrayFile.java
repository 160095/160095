import java.io.*;
public class ArrayFile{
	public static void main(String[] args) {
		FileReader fr;
		BufferedReader br;
		String[] words= new String[23];
		int num = 0;

		 try{
		 	fr = new FileReader("words.txt");
		 	br = new BufferedReader(fr);

		 	String data;		 	
		 	int i = 0;

		 	while((data=br.readLine())!=null){
		 	words[i] = data;		 	
		 	i++;
			}
			num = i;
		 }catch(IOException e){
		 	System.out.println("IO Error.");
		 }
		

		System.out.println(words[21]);
		System.out.println(words[22]);


		int rdm = (int)(Math.random()*num);
		System.out.println(words[rdm]);
		rdm = (int)(Math.random()*num);
		System.out.println(words[rdm]);

	}
}