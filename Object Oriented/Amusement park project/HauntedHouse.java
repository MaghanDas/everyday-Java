class HauntedHouse extends Attraction {
    private boolean scary;

    public HauntedHouse(String name, boolean scary) {
        super(name);
        this.scary = scary;
    }

    public boolean isScary() {
        return scary;
    }
}