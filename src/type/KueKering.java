package type;

import pack.Topples;
import util.Item;
import util.Packing;

public abstract class KueKering implements Item {
    
    @Override
    public Packing packing() {
        return new Topples();
    }

    @Override
    public abstract float price();
        
    
}
