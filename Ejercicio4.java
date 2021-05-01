import java.util.Scanner;

public class Ejercicio4
{
  public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   
   //Declaración
   int x = 0;
   System.out.println("Programa de aproximacion por la suma");
   
   //Entrada
   System.out.print("Introduzca x: ");
   x = in.nextInt();
   in.close();
   
   //Salida
   System.out.println("El aproximado del numero "+ x +" es "+ calcularAproximacion(x));
 }
   
   static int calcularFactorial(int pNumero)
  {
    int factorial = 1;
    
    //Calcular factorial de un numero
    for (int i = 1; i <= pNumero; i++)
   {
     factorial = factorial*i;
   }
    return factorial;
  }
    static double calcularAproximacion(int pX)
   {
    
    //Aproximacion de un numero
    double suma = 1;
    
    for(int i=1; i<= 8; i++)
   {
    suma = suma + (Math.pow(pX,i)/calcularFactorial(i));
    
    System.out.println("N: "+i+", Aproximacion es "+suma);
   }
    return suma;
  }
}