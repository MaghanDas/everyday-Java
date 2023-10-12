class VisitAttractionTask1 implements Runnable {
    
    private Visitor visitor1;
    private Attraction rollerCoaster;
    private Attraction ferrisWheel;

    public VisitAttractionTask1(Visitor visitor1, Attraction rollerCoaster, Attraction ferrisWheel) {
        this.visitor1 = visitor1;
        this.rollerCoaster = rollerCoaster;
        this.ferrisWheel = ferrisWheel;
    }

    @Override
    public void run() {
        visitor1.visitAttraction(rollerCoaster);
        visitor1.visitAttraction(ferrisWheel);
    }
}