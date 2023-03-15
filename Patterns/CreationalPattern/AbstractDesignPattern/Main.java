import chair.Furniture;

public class Main {
    public static void main(String[] args) {
        String s1="table";
        String s2="victoria";
        FurnitureFactory obj=new FurnitureFactory();
        Furniture fur = obj.getObject(s1,s2);
        fur.getDetails();
    }
}