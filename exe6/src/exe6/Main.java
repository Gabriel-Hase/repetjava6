package exe6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[]args) {
		
		int n;
		int ex1=0;
		int e=0;
		int sl;
		String r;
		int contador=0;
		int slf=0;
		
		
		
		do {
			
			n=Integer.parseInt(JOptionPane.showInputDialog("Quantas horas você trabalhou esse mês? "));
			sl=n*10;
			contador++;
			
			if (n>50) {
				ex1=n-50;
				e=ex1*20;
				sl=500;
				slf=sl+e;
			}
			
			
			r=(JOptionPane.showInputDialog("Deseja encerrar o programa? (Digite S ou N)"));
		}
		while(!r.equalsIgnoreCase("S")); {
			
			JOptionPane.showMessageDialog(null, "O salário do usúario é: " + sl);
			JOptionPane.showMessageDialog(null, "O salário total do usúario é: " + slf);
			JOptionPane.showMessageDialog(null, "O excedente é: " + e);
			
		}
	}

	
}
