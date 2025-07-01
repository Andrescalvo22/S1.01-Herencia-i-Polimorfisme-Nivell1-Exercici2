public class Main {
    public static void main(String[] args){
        Cotxe.model="Civic";

        Cotxe cotxe1= new Cotxe(158);

        System.out.println("Marca: " + Cotxe.marca);
        System.out.println("Model: " + Cotxe.model);
        System.out.println("Potencia: " + cotxe1.potencia);

        cotxe1.Accelerar();
        Cotxe.Frenar();

    }
}