class AmericanAdapter implements Socket {
    Pin indian;

    public AmericanAdapter(Pin indian) {
        this.indian = indian;
    }

    @Override
    public void sockerDetails() {
        indian.pinDetails();
    }
}
