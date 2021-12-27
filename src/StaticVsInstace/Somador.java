package StaticVsInstace;

public class Somador {

    String name;
    int valueInstace = 0;
    static int valueStatic = 0;

    void somar() {
        valueInstace++;
        valueStatic++;
    }

    void print() {
        System.out.println("O somador " + name + " instance: " + valueInstace + " e static: " + valueStatic);
    }

}
