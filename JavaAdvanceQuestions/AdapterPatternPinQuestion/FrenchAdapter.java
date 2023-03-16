class FrenchAdapter implements PinSocket {
    Pin indian;

    public FrenchAdapter(Pin indian) {
        this.indian = indian;
    }

    @Override
    public void pinSocketDetails() {
        indian.pinDetails();
    }
}
