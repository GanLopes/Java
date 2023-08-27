//Amorgan Mendes Lopes
//RM:98552


package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.bean.DragonBallSuper;

public class UsaDBSuper {

	    public static void main(String[] args) {
		String aux,nome ,ki,tecnica,velocidade,transformacoes,path, continuar = "sim";
		int menu;
		
		DragonBallSuper lutador;
		
		while (continuar.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog(" Que operação deseja executar? "
						+ "\n(1) Cadastrar lutador" + "\n(2) Consultar lutador "); 
				menu = Integer.parseInt(aux);
				path = JOptionPane.showInputDialog("Digite o caminho da pasta: ");
				
				lutador = new DragonBallSuper();
				
				switch (menu) {
				case 1:
					nome = JOptionPane.showInputDialog("Digite o Nome do lutador");
					ki = JOptionPane.showInputDialog("Digite o poder de luta (KI) do lutador");
					tecnica = JOptionPane.showInputDialog("Digite as tecnicas lutador");
					velocidade = JOptionPane.showInputDialog("Digite a velocidade lutador");
					transformacoes = JOptionPane.showInputDialog("Digite as transformações lutador");
					lutador.setNome(nome);
					lutador.setKi(Integer.parseInt(ki));
					lutador.setTecnicas(Integer.parseInt(tecnica));
					lutador.setVelocidade(Integer.parseInt(velocidade));
					lutador.setTransformacoes(Integer.parseInt(transformacoes));
					
					JOptionPane.showMessageDialog(null, lutador.gravar(path));
					break;
				
				case 2:
					aux = JOptionPane.showInputDialog("Digite o nome do lutador: ");
					lutador.setNome(aux);
					lutador = lutador.ler(path);
					if (lutador == null) {
						JOptionPane.showMessageDialog(null, "Pasta inexistente." );
						
					} else {
						JOptionPane.showMessageDialog(null, "Exibindo dados: "
								+ "\nArquivo: " + path + "/" + lutador.getNome() + ".txt"
								+ "\nCaminho:" + path
								+ "\nNome: " + lutador.getNome()
								+ "\nKi: " + lutador.getKi()
								+ "\nTecnicas: " + lutador.getTecnicas()
								+ "\nVelocidade: " + lutador.getVelocidade()
								+ "\nTransformações: " + lutador.getTransformacoes());
					break;
					}
				default:
					JOptionPane.showMessageDialog(null, "Digite um comando valido.");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
		}
			continuar = JOptionPane.showInputDialog("Deseja continuar?");
		}
		JOptionPane.showMessageDialog(null, "Programa finalizado, verme maldito!");
	}
}