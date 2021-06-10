import javax.swing.JOptionPane;
	public class NumerosEntre {

	public static void main(String[] args) {
		
		
		String num1 = JOptionPane.showInputDialog("Digite um número ");
		String num2 = JOptionPane.showInputDialog("Digite outro número ");
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
			if (numero2 > numero1) {
			
			
				for (int i = numero1; i < numero2;i++) {
					
						if (i != numero1 ) {
					
						System.out.println(i);
				
						}
				}
				
				
				
			
			}	else if (numero2 < numero1) {
				
					for (int i = numero2; i < numero1;i++) {
					
						if (i != numero2 ) {
				
							System.out.println(i);
			
						}
					}
					
				
				
				}	
		
		

	}

}
