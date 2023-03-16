public class Main {
    public static void main(String[] args) {
        IndianPin indianPin=new IndianPin();
        indianPin.pinDetails();
        AmericanAdapter americanAdapter=new AmericanAdapter(indianPin);
        FrenchAdapter frenchAdapter=new FrenchAdapter(indianPin);
        americanAdapter.sockerDetails();
        frenchAdapter.pinSocketDetails();
    }
}