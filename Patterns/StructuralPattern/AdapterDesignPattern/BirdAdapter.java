public class BirdAdapter implements ToyDuck{
    Bird bird=null;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        //This is equvalent to makeSound() so we are cahnging this
        bird.makeSound();
    }
}
