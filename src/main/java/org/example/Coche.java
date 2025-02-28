package org.example;

public class Coche {
    //Atributos de la clase org.example.Coche
    public   int ruedas;
    public   float velocidad;

    //Metodos de la clase org.example.Coche
    //Constructor personalizado para la clase org.example.Coche
    public Coche(int ruedas, float velocidad){
        this.ruedas = ruedas;
        this.velocidad = velocidad;
    }
    //Constructor base para la clase org.example.Coche
    public Coche(){
        this.ruedas = 4;
        this.velocidad = 0;
    }
    //Metodo para cambiar el numero de ruedas
    public  void setRuedas(int ruedas){
        this.ruedas = ruedas;
    }
    //Metodo para obtener el numero de ruedas
    public  int getRuedas(){
        return ruedas;
    }
    //Metodo para establecer la velocidad del coche
    public  void setVelocidad(float velocidad){
        this.velocidad = velocidad;
    }
    //Metodo para obtener la velocidad del coche
    public  float getVelocidad(){
        return velocidad;
    }

    public void acelerar(float aceleracion){
        velocidad += aceleracion;
    }
    public void imprimir(){
        System.out.println("El coche tiene " + ruedas + " ruedas y va a " + velocidad + " km/h");
    }
}
