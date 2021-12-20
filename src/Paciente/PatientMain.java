package Paciente;

public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.peso = 100;
        p1.altura = 1.85;
        System.out.println(p1.calcularImc());
        System.out.println(p1.diagnostico());
        // Segundo paciente
        Patient p2 = new Patient();
        p2.peso = 85;
        p2.altura = 1.60;
        System.out.println(p2.calcularImc());
        System.out.println(p2.diagnostico());
        // Terceiro paciente
        Patient p3 = new Patient();
        p3.peso = 160;
        p3.altura = 1.70;
        System.out.println(p3.calcularImc());
        System.out.println(p3.diagnostico());
    }
}
