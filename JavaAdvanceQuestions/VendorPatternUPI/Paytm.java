class Paytm implements UPI {
    @Override
    public void credit() {
        System.out.println("Amount credited VIA Paytm");
    }

    @Override
    public void debit() {
        System.out.println("Amount debited VIA Paytm");
    }
}
