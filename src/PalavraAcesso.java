import javax.swing.JOptionPane;
public class PalavraAcesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra1 = "Java-2021";
		
		
		for (int i = 1;i <= 5;i++) {
		
			String palavra2 = JOptionPane.showInputDialog("Digite a senha");
		
	
		
			if ( palavra2.equals(palavra1)== true) {
			JOptionPane.showMessageDialog(null,"parabens");
			break;
		
			}	else {
				JOptionPane.showMessageDialog(null,"Senha incorreta, tentativa "+i+" de 5");
				
				}
			
			
			
			
		}
	}

}
