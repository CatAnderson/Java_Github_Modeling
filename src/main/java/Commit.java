public class Commit {

    private String description;
    private final String uniqueId;


    public Commit(String description, String uniqueId){
        this.description = description;
        this.uniqueId = uniqueId;
    }

    public String getDescription() {
        return this.description;
    }

    public String setDescription(String newDescription) {
        return this.description = newDescription;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }
}
