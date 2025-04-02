package Model;

public class ninja {
    
    private int id;
    private String name;
    private RangesNinja ranges;
    private String village;

    public ninja(int id, String name, RangesNinja ranges, String village) {
        this.id = id;
        this.name = name;
        this.ranges = ranges;
        this.village = village;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RangesNinja getRanges() {
        return ranges;
    }

    public void setRanges(RangesNinja ranges) {
        this.ranges = ranges;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

}
