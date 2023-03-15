public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("The sparrow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("The sparrow is singing");
    }
}
