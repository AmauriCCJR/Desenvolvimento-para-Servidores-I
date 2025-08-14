package Aula1408;

public class testaConta {

	public static void main(String[] args) {
		//Instancia em memória RAM
		Aula1408 controle = new Aula1408(); //Controle é a referencia, e ela se torna o objeto com os atributos
		//Pode ter qualquer nome
		Aula1408 controle2 = new Aula1408();
		
		
		//Objeto 1
		controle.limite = 100;
		controle.numero = 123;
		controle.saldo = 234.98;
		controle.agencia = 223;
		
		//Controle 2
		controle2.agencia = 113;
		controle2.limite = 123.87;
		controle2.numero = 25;
		controle2.saldo = 225.872;
		
		
		
		//Mostrando no terminal
		System.out.println("O limite do objeto 1 é: "+controle.limite);
		System.out.println("O limite do objeto 2 é: "+controle2.limite);	
	}

}
