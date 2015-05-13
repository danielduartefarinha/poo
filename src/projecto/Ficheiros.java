package projecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ficheiros<T> {
	
	Object[][] matriz;
	int[] Contagem;
	int linhasmaximas;
	int tamanhomaximo;
	int countvariaveis;
	int countlinhas;
	
	public Ficheiros(String nomeficheiro) {
		Contagem = new int[2];
		linhasmaximas = 0;
		tamanhomaximo = 0;
		countvariaveis = 1;
		countlinhas = 0;
		AnaliseFicheiro(nomeficheiro);
		matriz = new Object[2*countvariaveis][countlinhas];
		System.out.println(Contagem);
		
	}
	
	public void AnaliseFicheiro(String nomeficheiro){
		
		String[] a, b, c;
		BufferedReader br = null;
		String ficheiro = "/home/danielduartefarinha/"+ nomeficheiro;
		System.out.println(ficheiro);
		try {
			 
			String sCurrentLine;
			br = new BufferedReader(new FileReader(ficheiro));
			
			while ((sCurrentLine = br.readLine()) != null) {
				
				if(tamanhomaximo == 0){
					if(sCurrentLine.contains(",")){
					a = sCurrentLine.split(",");
					System.out.println("o a tem este tamanho: " + a.length);
					
					b=a[0].split("");

					for(int i =1; i < sCurrentLine.length(); i++){
						c=a[i].split("");
						
						if(!b[1].equals(c[1])){
							countvariaveis++;
						}else break;
					}
					

					tamanhomaximo = 1;
					}else{
						throw new IllegalArgumentException("String não contem ,");
					}
				}else{
					
				}
				
				if(sCurrentLine.length()>tamanhomaximo){
					tamanhomaximo = sCurrentLine.length();
					
				}
				
				linhasmaximas++;
			}
			Contagem[0] = tamanhomaximo;
			Contagem[1] = linhasmaximas;
			System.out.println("contagm1 "+ Contagem[0] + "contagem 2 " + Contagem[1]);
			
		}catch (IOException e) {
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
