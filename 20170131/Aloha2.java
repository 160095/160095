import java.io.*;
public class Aloha2 {
	public static void main(String[] args) {
		
		Dataman dataman = new Dataman();
		Fileman fileman = new Fileman();
		String[] data = new String[2];
		data[0] = "Aoki,Ebina";
		data[1] = "Horie,Yokohama";

		fileman.writeFile(data);

		
	}
}

class Dataman implements ActionListener{
	JFrame frame;
	JTextField fileName;
	String[] data;
	int numData;
public Dataman(){
		data = new String[2];
		int numData = 2;
		data[0] = "Aoki,Ebina,52";
		data[1] = "Horie,Yokohama,55";
	}
public void inputData(){
		System.out.print("何人のデータ？ > ");
		this.numData = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
	}
public void saveData(String[] strData){
		strData[0] = "Aoki";
		strData[1] = "Horie";
		
		System.out.println("データを保存します☆");
	}
		public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		
				fw = new FileWriter(textFileName);
				pw = new PrintWriter(fw);

				String data = textArea.getText();
				pw.println(data);
			} catch(IOException e) {
					
			}finally{
				try{
					pw.close();
					fw.close();
				} catch(IOException e){
					System.out.println("IO error.");
				}
		
	}
}


class Fileman {

public Fileman(){
		System.out.println("Fileman!");
	}
public void writeFile(String[] strData) {
		System.out.println(strData[0]);
		System.out.println(strData[1]);

	}

		
}