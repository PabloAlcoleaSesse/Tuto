package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public  static void main(String[] args) {
            //Creacion de un objeto de la clase Coche personalizado
            Coche coche_personalizado = new Coche(4, 90);
            //Creacion de un objeto de la clase Coche base
            Coche coche_base = new Coche();
            //Mostrar el numero de ruedas del coche personalizado
            System.out.println("El coche personalizado tiene " + coche_personalizado.getRuedas() + " ruedas");
            //Cambiar el numero de ruedas del coche personalizado
            coche_personalizado.setRuedas(6);
            //Mostrar el numero de ruedas del coche personalizado
            System.out.println("El coche personalizado tiene " + coche_personalizado.getRuedas() + " ruedas");
            //Acelerar el coche personalizado
            coche_personalizado.acelerar(10);
            //Mostrar la velocidad del coche personalizado
            System.out.println("La velocidad del coche personalizado es de " + coche_personalizado.getVelocidad() + " km/h");
            //Mostrar los atributos de la clase Coche
            coche_personalizado.imprimir();
            //Mostrar los atributos de la clase Coche
            coche_base.imprimir();
        }



}