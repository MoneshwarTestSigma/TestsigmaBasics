class PaymentVendor {
    UPI upi;

    public PaymentVendor(UPI upi) {
        this.upi = upi;
    }

    void makePayment() {
        upi.debit();
    }

    void receivePayment() {
        upi.credit();
    }

}
