import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepoType repoType){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
