import chair.ChairFactory;
import chair.Furniture;
import sofa.SofaFactory;
import table.TableFactory;

public class FurnitureFactory {
    Furniture getObject(String s1, String s2)
    {
        if(s1=="chair")
        {
            return ChairFactory.getInstance(s2);
        }
        else if(s1=="sofa")
        {
            return SofaFactory.getInstance(s2);
        }
        else {
            return TableFactory.getInstance(s2);
        }
    }
}
