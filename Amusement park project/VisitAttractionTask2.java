class VisitAttractionTask2 implements Runnable {
    private Visitor visitor2;
    private Attraction ferrisWheel;
    private Attraction hauntedHouse;

    public VisitAttractionTask2(Visitor visitor2, Attraction ferrisWheel, Attraction hauntedHouse) {
        this.visitor2 = visitor2;
        this.ferrisWheel = ferrisWheel;
        this.hauntedHouse = hauntedHouse;
    }

    @Override
    public void run() {
        visitor2.visitAttraction(ferrisWheel);
        visitor2.visitAttraction(hauntedHouse);
    }
}