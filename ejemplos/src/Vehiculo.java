
public class Vehiculo { // siempre el nombre de la clase va la primera en mayuscula
    
    // Las propiedades siempre van de primeras
    private String color;  // son propiedades o variables, son datos de UML
    private String marca; 
    private int capacidad;
    private int velocidadMaxima;
    private int  posicionX = 0;

    //Metodos Costructores no estan en el UML
    public Vehiculo(){
        this.color = "Negro";
        this.marca = "generica";
        this.capacidad = 0;
        this.velocidadMaxima = 1;
    }

    public Vehiculo(String color, String marca){ //Polimorfismo de Sobre Carga son varios metodos con el mismo nombre pero que difir¿eren en la cantidad de argumentos que recive
        this.color = color;
        this.marca = marca;
        this.capacidad = 0;
        this.velocidadMaxima = 1;
    }

    // Metodos Funciones/Procedimientos y van de ultimo
   
    public int andar(){     //Son los metodos o funciones "verbos" de UML
        this.posicionX = this.posicionX + this.velocidadMaxima;
        return velocidadMaxima;
    }
    public int transportar(){
        return capacidad;    
    }

    // Geter & Setter
    public String getColor(){  //Me permite Obtener la información o propiedad establecida
        return this.color;
    }

    public void setColor(String color){  // Me permite Poner o Remplazar información, siempre seran void Es procedimiento
        this.color = color;        
    }

    public String getMarca() {return this.marca;}

    public int getCapacidad() {return this.capacidad;}

    public int getVelocidadMaxima() {return this.velocidadMaxima;}

    public int getPosicionX() {return this.posicionX;}

    public void setMarca(String marca){this.marca = marca;}

    public void setCapacidad(int capacidad){this.capacidad = capacidad;}

    public void setVelocidadMaxima(int velocidadMaxima) {this.velocidadMaxima = velocidadMaxima;}

    public void setPosicionX(int posicionX) { this.posicionX = posicionX;}
    }
    
