package table;

import chair.Furniture;

public class TableFactory {
    static public Furniture getInstance(String str)
    {
        if(str=="modern")
            return new TableModern();
        else if(str=="artdecor")
            return new TableArtDeco();
        else
            return new TableVictoria();
    }
}
