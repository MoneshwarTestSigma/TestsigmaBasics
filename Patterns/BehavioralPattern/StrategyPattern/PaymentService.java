public class PaymentService {
    PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void makePayment() {
        paymentGateway.display();
    }
}
