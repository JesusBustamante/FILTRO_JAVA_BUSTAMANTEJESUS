package Model;

public class skill {
    private int id;
    private String name;
    private String ddescription;

    public skill(int id, String name, String ddescription) {
        this.id = id;
        this.name = name;
        this.ddescription = ddescription;
    }

    public skill(String name, String ddescription) {
        this.name = name;
        this.ddescription = ddescription;
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

    public String getDdescription() {
        return ddescription;
    }

    public void setDdescription(String ddescription) {
        this.ddescription = ddescription;
    }
    
}
