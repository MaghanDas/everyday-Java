class RollerCoaster extends Attraction {
    private int thrillLevel;

    public RollerCoaster(String name, int thrillLevel) {
        super(name);
        this.thrillLevel = thrillLevel;
    }

    public int getThrillLevel() {
        return thrillLevel;
    }
}