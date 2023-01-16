import java.util.Scanner;

public class Start {

	public static int Suma(int op1, int op2, int op3) {
		int result=0;
		result = op1+op2+op3;
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op1 = 0;
		int op2 = 0;
		int op3 = 0;
		int resultado = 0 ;
		Scanner edd = new Scanner(System.in);
		
		System.out.println("*********************************************");
		System.out.println("*** Introduccion a la programacion_T3_ej1 ***");
		System.out.println("*********************************************");
		
		System.out.println("Introduzca el valor 1");
			op1 = edd.nextInt();
		System.out.println("Introduzca el valor 2");
			op2 = edd.nextInt();
		System.out.println("Introduzca el valor 3");
			op3 = edd.nextInt();
		
			resultado = Suma(op1,op2,op3);
		System.out.println("el resultado es " + resultado);
	}

}
