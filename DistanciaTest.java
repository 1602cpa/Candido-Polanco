public class DistanciaTest {

    public static void main(String []args){
        Punto p1 = new Punto(4, 1);
        Punto p2 = new Punto(7, 5);

        try {
            System.out.println("La distancia entre los dos puntos es: " + p1.distancia(p2));
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
