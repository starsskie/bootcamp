package bootcamp.ejercicio;

public class parte_3 {

    public static void main(String[] args) {
        int numeroIf = 6;
        int numeroWhile = 1;
        int numerodoWhile = 5;
        String estacion = "Verano";

        System.out.println("CICLO IF");

        if(numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if(numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
        
        System.out.println("WHILE");

        while(numeroWhile < 3) {
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        System.out.println("CICLO DO-WHILE");

        do {
            numerodoWhile ++;
            System.out.println(numerodoWhile);
        }
        while(numerodoWhile < 3);
        
        System.out.println("CICLO FOR");

        for(int numeroFor = 1; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("SWITCH");

        switch (estacion) {
            case "Verano":
            case "Invierno":
            case "Primavera":
            case "Otoño":
                System.out.println("La estación es: " + estacion);
                break;
            default:
                System.out.println("El valor de la variable no es ninguna estación");
        }


    }
}
