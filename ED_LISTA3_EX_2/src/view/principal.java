package view;
import controller.metodos;
import javax.swing.*;
public class principal {
	public static void main(String args[])
	 {
	  int numero = Integer.parseInt(
	      JOptionPane.showInputDialog("Digite um número inteiro:"));

	  int digito = Integer.parseInt(JOptionPane.showInputDialog("Digite o dígito que deseja contar (0 a 9):"));

	  // Se número for negativo, transforma em positivo
	  if(numero < 0)
	  {
	   numero = numero * -1;
	  }

	  // Validação do dígito
	  if(digito < 0 || digito > 9)
	  {
	   JOptionPane.showMessageDialog(null,"Digite apenas um dígito entre 0 e 9.");
	  }
	  else
	  {
	   metodos c = new metodos();

	   int resultado = c.contarOcorrencia(numero, digito);

	   JOptionPane.showMessageDialog(null,"O dígito " +digito + " aparece " + resultado + " vezes");
}
}}