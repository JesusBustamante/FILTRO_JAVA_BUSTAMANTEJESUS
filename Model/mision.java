package Model;

public class mision {
    
    private int id;
    private String description;
    private RangesMission rangesMission;
    private Double reward;

    public mision(int id, String description, RangesMission rangesMission, Double reward) {
        this.id = id;
        this.description = description;
        this.rangesMission = rangesMission;
        this.reward = reward;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RangesMission getRangesMission() {
        return rangesMission;
    }

    public void setRangesMission(RangesMission rangesMission) {
        this.rangesMission = rangesMission;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }
    
}