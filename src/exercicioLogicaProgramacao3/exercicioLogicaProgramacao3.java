package exercicioLogicaProgramacao3;
 
//Crie duas fun��es para convers�o de temperaturas: uma converter� celsius em fahrenheit e a outra far� o inverso.
//Saiba que 100c � igual a 212f.
	import java.util.Scanner;

public class exercicioLogicaProgramacao3 {

	public static void main(String[] args) {
	
		Scanner leitura =new Scanner(System.in);
		
		int opc;
		float grau;
		double res;
		
		System.out.println("Selecione qual Temperatura para covers�o, digite 1 : C� para F�: Digite 2:  F� para C�:");
		 opc = leitura.nextInt();
		 System.out.println("Digite a temperatura:");
		grau=leitura.nextFloat();
		 
		 if (opc==1) {			 
			 res = (grau*1.8)+32;
			 System.out.println("A convers�o � de:" +res);
		 }
		 
		 else if (opc==2) {
			 res =( grau -32)*5/9;
			 System.out.println("A convers�o � de:" +res);
		 }
		 
		 
		 
		 
		

	}

}
