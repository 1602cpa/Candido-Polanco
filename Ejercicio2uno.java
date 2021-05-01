public class Ejercicio2uno
{
 public static void main (String[] args)
 {
   //declaracion
   double tfPos;
   double tfNeg;
   double vo = 2.5;
   double g = 6.23;
   double h = 10.8;
   
   //proceso
   double div1 = -(2*vo)/g;
   double div2 = (8*h)/g;
   double pot = Math.pow((2*vo)/g,2);
   double raiz = Math.sqrt(pot + div2);
   
   //almacenamiento
   tfPos = (div1 + raiz)/2;
   tfNeg = (div1- raiz)/2;
   
   //salida
   System.out.println("Resultado + es: " + tfPos);
   System.out.println("Resultado - es: " + tfNeg);
 }
}