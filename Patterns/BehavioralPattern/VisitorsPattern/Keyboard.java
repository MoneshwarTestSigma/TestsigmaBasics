public class Keyboard implements ComputerParts{
    @Override
    public void accept(ComputerPartsVisitor computer) {
            computer.getDetails(this);
    }
}
