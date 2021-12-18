package Carros;

public class Car {
    int potencia, velocidade;
    String nome;

    void acelerar() {
        velocidade += potencia;
    }

    void frear() {
        velocidade += potencia / 2;
    }

    int getVelocidade() {
        return velocidade;
    }

    void imprimir() {
        System.out.println("The car " + nome + " velocity is " + getVelocidade() + "km/h");
    }

}
