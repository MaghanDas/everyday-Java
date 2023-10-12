class FerrisWheel extends Attraction {
    private int height;

    public FerrisWheel(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}