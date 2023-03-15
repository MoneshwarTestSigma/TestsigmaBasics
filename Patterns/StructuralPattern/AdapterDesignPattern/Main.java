public class Main {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        ToyDuck toyDuck=new PlasticToyDuck(); //this one can only squeak;
        ToyDuck birdAdapter=new BirdAdapter(sparrow);
        birdAdapter.squeak(); //This is a toyDuck and we use the same functions of the toyDuck but we can call the sparrow with this
        //this type is known as Adapter pattern
    }
}