public abstract class KueBasah implements Item {
    
    
    @Override
    public Packing packing() {
        return new Daun();
    }

    @Override
    public abstract float price();
        
    
}
