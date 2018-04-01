public abstract class KueKering implements Item {
    
    @Override
    public Packing packing() {
        return new Topples();
    }

    @Override
    public abstract float price();
        
    
}
