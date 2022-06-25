package bootcamp.ejercicio;

public class parte_1 {

    public static void main(String[] args) {
        int param1 = 20;
        int param2 = 10;
        int param3 = 3;

        var valor = suma(param1, param2, param3);
        System.out.println(valor);
    }

    public static int suma(int param1, int param2, int param3) {
        return param1 + param2 + param3;
    }
    
}


