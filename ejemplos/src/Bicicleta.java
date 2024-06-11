
// El extends es para tomar o heredad de Vehiculo. 
public class Bicicleta extends Vehiculo { 
    
    public  Bicicleta(){
        super(); // Hace referencia al constructor en blanco 
        this.setVelocidadMaxima(2);
        this.setColor("Blanco");        
    }

    public void andar(int aceleracion){
        this.setPosicionX(this.getPosicionX() + this.getVelocidadMaxima() + aceleracion);
    }

}
 