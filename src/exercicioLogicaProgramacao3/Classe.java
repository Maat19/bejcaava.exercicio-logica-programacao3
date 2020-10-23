package exercicioLogicaProgramacao3;

import java.util.Scanner;

public class Classe {
	
	public float Opc;
	public float Grau;
	public float Res;
	public  Scanner leitura =new Scanner(System.in);
	
	
	public void Info() 
	{
		System.out.println("Selecione qual Temperatura para coversão, digite 1 : C° para F°: Digite 2:  F° para C°:");
		 Opc = leitura.nextFloat();
		 System.out.println("Digite a temperatura:");
		Grau=leitura.nextFloat();
		}
	
	public void Conta ()
	{
		if (Opc==1) {			 
			 Res = (float) ((Grau*1.8)+32);
			 System.out.println("A conversão é de:" +Res);
		 }
		 
		 else if (Opc==2) {
			 Res =( Grau -32)*5/9;
			 System.out.println("A conversão é de:" +Res);
		 }
		
	}
	
	
	

}
