 import javax.swing.JOptionPane;
public class MaiorNumero {

	public static void main(String[] args) {
		
		
		String num1 = JOptionPane.showInputDialog("Digite um número ");
		String num2 = JOptionPane.showInputDialog("Digite outro número ");
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
		
		if (numero1 > numero2) {
			
			JOptionPane.showMessageDialog(null, "O maior numero é o : "+numero1);
			
			
			
		} else if (numero2 > numero1) {
			
			JOptionPane.showMessageDialog(null, "O maior numero é o : "+numero2);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Os numeros são iguais");
			
		}
		
		
		
		
		
		
		

	}

}
