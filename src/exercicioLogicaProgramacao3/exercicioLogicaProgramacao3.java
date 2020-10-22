package exercicioLogicaProgramacao3;
 
//Crie duas funções para conversão de temperaturas: uma converterá celsius em fahrenheit e a outra fará o inverso.
//Saiba que 100c é igual a 212f.
	import java.util.Scanner;

public class exercicioLogicaProgramacao3 {

	public static void main(String[] args) {
	
		Scanner leitura =new Scanner(System.in);
		
		int opc;
		float grau;
		double res;
		
		System.out.println("Selecione qual Temperatura para coversão, digite 1 : C° para F°: Digite 2:  F° para C°:");
		 opc = leitura.nextInt();
		 System.out.println("Digite a temperatura:");
		grau=leitura.nextFloat();
		 
		 if (opc==1) {			 
			 res = (grau*1.8)+32;
			 System.out.println("A conversão é de:" +res);
		 }
		 
		 else if (opc==2) {
			 res =( grau -32)*5/9;
			 System.out.println("A conversão é de:" +res);
		 }
		 
		 
		 
		 
		

	}

}
