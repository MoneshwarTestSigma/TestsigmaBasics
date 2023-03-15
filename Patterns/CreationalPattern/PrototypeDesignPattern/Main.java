public class Main {
    public static void main(String[] args) {
        Car monesh=new Car(123,"Red","BMW");
        Car naveen=monesh.clone();
        monesh.getDetails();
        naveen.getDetails();
    }
}