public class Ejercicio2dos
{
  public static void main (String[] args)
 {
   //declaracion
   double tf;
   double vo = 2.5;
   double g = 6.23;
   double h = 10.8;
   
   //proceso
   double div1 = - vo/g;
   double div2 = (2*h)/g;
   double pot = Math.pow(vo/g,2);
   double raiz = Math.sqrt(pot + div2);
   
   //almacenamiento
   tf = div1 + raiz;
   
   //salida
   System.out.println("Resultado es: " + tf);
 }
}