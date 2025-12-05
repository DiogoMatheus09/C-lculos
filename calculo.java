package github;
import javax.swing.JOptionPane;
class calculo {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "Digite o valor de A", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		String b = JOptionPane.showInputDialog(null, "Digite o valor de B", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		
		int a0 = Integer.parseInt(a);
		int b0 = Integer.parseInt(b);
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a operação: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão ", "Operação", JOptionPane.QUESTION_MESSAGE));
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
			default:
				JOptionPane.showMessageDialog(null, "O código informado é inválido.");
                break;
		}
	}

}
