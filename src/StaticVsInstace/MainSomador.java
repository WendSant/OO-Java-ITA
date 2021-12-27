package StaticVsInstace;

public class MainSomador {
    public static void main(String[] args) {
        Somador s1 = new Somador();
        s1.name = "Somador 1";
        Somador s2 = new Somador();
        s2.name = "Somador 2";
        Somador s3 = new Somador();
        s3.name = "Somador 3";

        for (int i = 0; i < 3; i++) {
            s1.somar();
            s2.somar();
            s3.somar();
        }
        s1.print();
        s2.print();
        s3.print();
    }
}
