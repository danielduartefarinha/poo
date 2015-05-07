package projectolol;

import java.io.*;
import java.lang.*;

public class mainloli {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	DataInputStream in;
		in = new DataInputStream(new BufferedInputStream(new FileInputStream("train_data.cvs")));
	*/
		
		BufferedReader br = null;
		String ficheiro = "/home/danielduartefarinha/Área de Trabalho/pooproject/projectolol/"+args[0];
		 
		try {
 
			String sCurrentLine;
			String[] a;
			
			br = new BufferedReader(new FileReader(ficheiro));
 
			while ((sCurrentLine = br.readLine()) != null) {
				a = sCurrentLine.split("");
				System.out.println(a[1]);
				System.out.println(a[13]);
				
				for(int i=2; i < a.length; i++){
					if(a[1]==a[i]){
						i = (i-1)/4;
						System.out.println(i);
				}
				
				/*System.out.println(a.length/3.0);*/
			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	

}
