 import javax.swing.JOptionPane;
public class StatusAluno {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		String nota = JOptionPane.showInputDialog("Digite a nota do aluno: ");
		int not = Integer.parseInt(nota);
		
			if (not >= 7){		
			
				JOptionPane.showMessageDialog(null,"O aluno "+aluno+ " teve a nota "+not+ "  Parabens Aprovado!!!");
			
			}
			else if(not >= 4 && not <= 6) {
				
				
				JOptionPane.showMessageDialog(null,"O aluno "+aluno+ " teve a nota "+not+ "  Está de Recuperação!!!");
				
				
			}
			else {
				
				JOptionPane.showMessageDialog(null,"O aluno "+aluno+ " teve a nota "+not+ "  Infelizmente está Reprovado!!!");
				
			}

	}

}
