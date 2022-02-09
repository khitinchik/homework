public class Bottle {
    private int capacity;
    private int coast;
    
    public Bottle(int capa, int coa) {
        this.capacity = capa;
        this.coast = coa;
    }

    void getCapacity() {
        System.out.println(capacity);
    }

    void getCoast() {
        System.out.println(coast);
    }


}
