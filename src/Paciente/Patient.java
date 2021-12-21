package Paciente;

public class Patient {
    double peso, altura;
    String categ;
    double imc;

    Patient() {

    }

    double calcularImc() {
        imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    String diagnostico() {
        calcularImc();
        if (imc < 16) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Baixo peso muito grave", imc);
        } else if (imc >= 16 && imc < 17) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Baixo peso grave", imc);
        } else if (imc >= 17 && imc < 18.50) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Baixo peso", imc);
        } else if (imc >= 18.50 && imc < 25) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Peso normal", imc);
        } else if (imc >= 25 && imc < 30) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Sobrepeso", imc);
        } else if (imc >= 30 && imc < 35) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Obesidade grau I", imc);
        } else if (imc >= 35 && imc < 40) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Obesidade grau II", imc);
        } else if (imc >= 40) {
            categ = String.format("Seu imc é %.2f kg/m² e você está na categoria Obesidade grau III", imc);
        }
        return categ;
    }

}
