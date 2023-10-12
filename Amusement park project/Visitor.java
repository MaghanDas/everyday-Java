import java.util.ArrayList;

class Visitor {
    private String name;
    private int age;
    private String ticketType;
    private ArrayList<Attraction> visitedAttractions;

    public Visitor(String name, int age, String ticketType) {
        this.name = name;
        this.age = age;
        this.ticketType = ticketType;
        this.visitedAttractions = new ArrayList<>();
    }

    public void visitAttraction(Attraction attraction) {
        visitedAttractions.add(attraction);
        System.out.println(name + " visited " + attraction.getName());
    }

    public void listVisitedAttractions() {
        System.out.println(name + "'s visited attractions:");
        for (Attraction attraction : visitedAttractions) {
            System.out.println("- " + attraction.getName());
        }
    }

    public String getName() {
        return name;
    }
}
