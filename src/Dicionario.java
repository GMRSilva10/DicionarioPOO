import java.util.HashMap;

import javax.swing.JOptionPane;

public class Dicionario {
	
	
	
	public static void main (String [] args){
		
		
		
		HashMap <String, String>lista = new HashMap <String, String>();
		String palavra;
		
		do{
		palavra = JOptionPane.showInputDialog("Pesquise uma palavra ou digite SAIR para fechar: ");
		palavra = palavra.toLowerCase();
				
		switch(palavra){
		case "sair":
			System.exit(0);
			
		default:
			if(lista.containsKey(palavra)){
				JOptionPane.showMessageDialog(null, lista.get(palavra));
				
							
			}else{
				String definicao = JOptionPane.showInputDialog("Palavra não localizada, informe sua definição para adicionar ao dicionário:");
				definicao = definicao.toLowerCase();
				definicao = definicao.substring(0, 1).toUpperCase() + definicao.substring(1);
				
				lista.put(palavra, definicao);
				
			}
		
		}
		}while(palavra!="sair");
		
	}
		
	
	
	
}
