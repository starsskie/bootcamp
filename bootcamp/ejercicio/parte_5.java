package bootcamp.ejercicio;

public class parte_5 {
    
    public static void main(String[] args) {
        Cliente objeto = new Cliente();
        Trabajador objeto2 = new Trabajador();
        objeto.setNombre1("nombre");
        objeto.setEdad1(23);
        objeto.setTelefono1(1234);
        objeto.setCredito(123456);
        System.out.println(objeto.getNombre1());
        System.out.println(objeto.getEdad1());
        System.out.println(objeto.getTelefono1());
        System.out.println(objeto.getCredito());

        System.out.println("---------------------------------------");

        objeto2.setNombre1("nombre_2");
        objeto2.setEdad1(24);
        objeto2.setTelefono1(1333);
        objeto2.setSalario(10000);
        System.out.println(objeto2.getNombre1());
        System.out.println(objeto2.getEdad1());
        System.out.println(objeto2.getTelefono1());
        System.out.println(objeto2.getSalario());
        
        
    }
}

abstract class Personas {
    int edad1;
    int telefono1;
    String nombre1;

    abstract public int getEdad1(); 
    abstract public void setEdad1(int edad1);

    abstract public int getTelefono1(); 
    abstract public void setTelefono1(int telefono1);

    abstract public String getNombre1(); 
    abstract public void setNombre1(String nombre1);

}

class Cliente extends Personas {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }

    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }

    public int getEdad1() {
        return this.edad1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono1() {
        return this.telefono1;
    }
    
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre1() {
        return this.nombre1;
    }
}

class Trabajador extends Personas {
    int salario;
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setEdad1(int edad1) {
        this.edad1 = edad1;
    }

    public int getEdad1() {
        return this.edad1;
    }

    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono1() {
        return this.telefono1;
    }
    
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre1() {
        return this.nombre1;
    }
}