package bootcamp.ejercicio;

public class parte_2 {

    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.IncrementoPuertas();
        System.out.println(miCoche.puertas);
    }
    
}

class coche {
    public int puertas = 5;

    public void IncrementoPuertas() {
        this.puertas++;
    }
}