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
        this.commits = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String setName(String newName) {
        return this.name = newName;
    }

    public String getDescription() {
        return this.description;
    }

    public String setDescription(String newDescription) {
        return this.description = newDescription;
    }

    public RepoType getRepoType() {
        return this.repoType;
    }

    public RepoType setRepoType(RepoType repoType) {
        return this.repoType = repoType;
    }

    public int commitCount() {
        return this.commits.size();
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

    public void removeCommit() {
        this.commits.remove(0);
    }

//    public Commit getCommitByUniqueId(String Id) {
//        for (Commit commits : this.commits) {
//            if (commits.getUniqueId().equals(Id)) ;
//        }
//        return commits.get(Id.);
//    }
}
