package base;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    String name;

    public Plant(boolean needsWatering, String plantFamily, String name) {
        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.name = name;
    }

    static void wateringInstruction() {
        System.out.println("Water me everyday!");
    }

    static void sunlightRequirments() {
        System.out.println("Make sure I get lots of direct sunlight!");

    }
    
}
