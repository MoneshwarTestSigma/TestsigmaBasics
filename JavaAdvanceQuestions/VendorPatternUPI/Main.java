public class Main {
    public static void main(String[] args) {
        UPI upiPlatform=new PhonePe();
        PaymentVendor paymentVendor=new PaymentVendor(upiPlatform);
        paymentVendor.makePayment();
        paymentVendor.receivePayment();
    }
}