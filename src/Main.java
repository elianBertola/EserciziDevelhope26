public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(15.5,23.5);
        Punto punto2 = new Punto(15.5,23.5);
        Punto punto3 = new Punto(50.0,27.0);

        System.out.println(punto1);
        System.out.println(punto1.equals(punto2));
        boolean comparazzione = punto1.x() + punto1.y() > punto3.x() + punto3.y();
        System.out.println(comparazzione);
    }
}