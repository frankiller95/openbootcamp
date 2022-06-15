public class Main {

    public static void main(String[] args) {
        suma(10, 20, 60);
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c){
        System.out.println(a + b + c);
    }
}

class Coche{
    public int puertas = 0;

    public void AgregarPuerta(){
        this.puertas++;
    }

}