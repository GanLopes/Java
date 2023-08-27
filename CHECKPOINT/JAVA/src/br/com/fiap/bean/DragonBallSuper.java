
	package br.com.fiap.bean;
	/** 
	 * Classe de objetos relacionados a DragonBallSuper.
	 * @author Amorgan Mendes Lopes
	 * @version 1.0
	 */

	import java.io.BufferedReader;

	import java.io.File;
	import java.io.FileReader;
	import java.io.PrintWriter;

	public class DragonBallSuper implements IDBSuper {
		private String nome;
		private int ki; 
		private int tecnicas;
		private int velocidade;
		private int transformacoes;
		
		public DragonBallSuper() {
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getKi() {
			return ki;
		}
		public void setKi(int ki) {
			this.ki = ki;
		}
		public int getTecnicas() {
			return tecnicas;
		}
		public void setTecnicas(int tecnicas) {
			this.tecnicas = tecnicas;
		}
		public int getVelocidade() {
			return velocidade;
		}
		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}

		public int getTransformacoes() {
			return transformacoes;
		}

		public void setTransformacoes(int transformacoes) {
			this.transformacoes = transformacoes;
		}
		/** Método ler permite ler as informações inseridas de um lutador e já armazenadas dentro de um diretorio informado.
		 * @author Amorgan Mendes Lopes 
		 * @param  path - caminho/pasta que armazenará as informaçôes.                                                                                                                                   
		 * @return String - Objeto da classe DragonBallSuper.
		 * */
		
		public DragonBallSuper ler (String path) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(path  + "/" + nome + ".txt"));
				nome = br.readLine();
				ki = Integer.parseInt (br.readLine());
				tecnicas = Integer.parseInt (br.readLine());
				velocidade = Integer.parseInt (br.readLine());
				transformacoes = Integer.parseInt (br.readLine());
				br.close();
				return this;
				
			} catch (Exception e) {
				return null;
			}
		}

	/** Método gravar permite salvar as informações de um lutador inseridas dentro de um diretorio informado.
	 * @author Amorgan Mendes Lopes 
	 * @param  path - caminho/pasta que armazenará as informaçôes.                                                                                                                                   
	 * @return String - Objeto da classe DragonBallSuper
	 * */
		
		public String gravar (String path) {
			try {
				File dir = new File(path);
				if (!dir.exists()) {
					dir.mkdir();	
				}
				PrintWriter pw = new PrintWriter(path  + "/" + nome + ".txt");
				pw.println(nome);
				pw.println(ki);
				pw.println(tecnicas);
				pw.println(velocidade);
				pw.println(transformacoes);
				pw.flush();
				pw.close();
				
				return "Arquivo salvo.";
				
			} catch (Exception e) {
				return "Falha a salvar arquivo " + e.getMessage();
			}
		}
	}

