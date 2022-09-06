import java.util.Scanner;

public class Actividad5 {
    public static void  main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        double x=leer.nextDouble();
        System.out.println("Escribe el segundo numero");
        double y=leer.nextDouble();
        System.out.println("X= " +x);
        System.out.println("Y= " +y);

        double suma= x+y;
        System.out.println("El resultado de la suma es:" +suma);

        double resta= x-y;
        System.out.println("El resultado de la resta es:" +resta);

        double multiplicacion= x*y;
        System.out.println("El resultado de la multiplicacion es:" +multiplicacion);

        double division = x/y;
        System.out.println("El resultado de la suma es:" +division);

        double modulo = x%y;
        System.out.println("El resultado deL modulo es:" +modulo);
    }
}
