package br.com.fiap.main;

import java.io.File;

public class CriaDiretorio {

	public static void main(String[] args) {
		try {
			File dir = new File("d:/loja");
			if (!dir.exists()){
				dir.mkdir();
			}
			dir = new File("d:/loja/site");
					if (!dir.exists()) {
						dir.mkdir();
					}
					
			dir = new File("d:/loja/site/imagens");
					if (!dir.exists()) {
						dir.mkdir();
					}
					
					dir = new File("d:/loja/site/videos");
					if (!dir.exists()) {
						dir.mkdir();
					
			dir = new File("d:/loja/site/sons");
					if (!dir.exists()) {
						dir.mkdir();
					}
		
					}
			System.out.println("Pastas criadas com sucesso");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	}

}
