class GooglePay implements UPI {

    @Override
    public void credit() {
        System.out.println("Amount credited VIA google pay");
    }

    @Override
    public void debit() {
        System.out.println("Amount debited VIA google pay");
    }
}
