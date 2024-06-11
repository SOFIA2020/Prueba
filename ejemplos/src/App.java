public class App {
    public static void main(String[] args) throws Exception {
        
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("azul","Mazda");

        System.out.println(v1.transportar());
        System.out.println(v1.andar());
        System.out.println(v1.getColor()); //Estoy llamando el metodo get Color para conocer el valor asignado
        v1.setColor("amarillo"); //Estoy cambiando el dato del get que era negro con el void que es el set
        System.out.println(v1.getColor()); 

        System.out.println(v2.getColor());
        System.out.println(v1.getColor());

        System.out.println("----");
        v1.andar();
        v1.andar();
        v2.andar();
        v2.andar();
        v1.andar();
        v1.andar();
        v2.andar();

        System.out.println(v1.getPosicionX());
        System.out.println(v2.getPosicionX());

        Bicicleta b1 = new Bicicleta();
        b1.andar();
        b1.andar();
        b1.andar();
        b1.andar();
        b1.andar(1);
        b1.andar();
        b1.andar();
        b1.andar(2);

        System.out.println(b1.getPosicionX());

        
    }
}
