package Carros;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.potencia = 10;
        c1.nome = "Corcel";
        c1.velocidade = 0;

        Car c2 = new Car();
        c2.potencia = 15;
        c2.nome = "Caranga";
        c2.velocidade = 0;

        Car c3 = new Car();
        c3.potencia = 10;
        c3.nome = "Corcel";
        c3.velocidade = 0;

        c1.acelerar();
        c1.acelerar();
        c1.imprimir();
        c1.acelerar();
        c1.frear();

        c2.acelerar();
        c2.acelerar();

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
