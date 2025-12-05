package github;
import javax.swing.JOptionPane;
class calculo {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "Digite o valor de A", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		String b = JOptionPane.showInputDialog(null, "Digite o valor de B", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		String c = JOptionPane.showInputDialog(null, "Digite o valor de C", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		
		
		int a0 = Integer.parseInt(a);
		int b0 = Integer.parseInt(b);
		int c0 = Integer.parseInt(c);
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a operação: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Contagem\n6 - Bhaskara", "Operação", JOptionPane.QUESTION_MESSAGE));
		switch(valor) {
		case 1:
			JOptionPane.showMessageDialog(null, "O símbolo selecionado é soma");
			JOptionPane.showMessageDialog(null, "O valor da soma é: " + (a0 + b0));
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "O símbolo selecionado é subtração");
			JOptionPane.showInputDialog(null, "O valor da subtração é: " + (a0 - b0));
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "O símbolo selecionado é multiplicação");
			JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + (a0 * b0));
			break;
			
		case 4:
			if(b0 == 0) {
				JOptionPane.showMessageDialog(null, "ERRO: Divisão por zero!!");
			} else {
				JOptionPane.showMessageDialog(null, "O símbolo selecionado é divisão");
				JOptionPane.showMessageDialog(null, "O valor da divisão" + (a0 / b0));
				
			}
			break;
		case 5 :
			for(int i = a0; i>= 0; i--) {
				JOptionPane.showMessageDialog(null, "Contagem regressiva..." + i);
			}
			break;
			
		case 6:
			if(a0 == 0) {
				JOptionPane.showMessageDialog(null, "Se A = 0, não é uma equacção do 2° grau.", "Erro", JOptionPane.ERROR_MESSAGE);
				return;
			} 
			double delta = b0 * b0 - 4 * a0 * c0;
			if(delta < 0) {
				JOptionPane.showMessageDialog(null,  "Delta < 0: não existem raízes reais.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			} else if (delta == 0) {
				double x = -b0 / (2 * a0);
				JOptionPane.showMessageDialog(null, String.format( "Delta = 0\nRaiz única: x = %.4f", x), "Resultado", JOptionPane.INFORMATION_MESSAGE);
			} else {
				double sqrt = Math.sqrt(delta);
				double x1 = (-b0 + sqrt) / (2 * a0);
				double x2 = (-b0 - sqrt) / (2 * a0);
				JOptionPane.showMessageDialog(null, String.format("Delta = %.4f\nx1 = %.4f\nx2 = %.4f", delta, x1, x2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "O código informado é inválido.");
                break;
		}
	}

}
