import java.util.ArrayList;

public class GithubAccount {

    private String userName;
    private String accountName;
    private ArrayList<Repository> repositories;
    private AccountType accountType;

    public GithubAccount(String userName, String accountName, AccountType accountType){
        this.userName = userName;
        this.accountName = accountName;
        this.repositories = new ArrayList<>();
        this.accountType = accountType;
    }

    public String getUserName() {
        return this.userName;
    }

    public String setUserName(String newUserName) {
        return this.userName = newUserName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String setAccountName(String newAccountName) {
        return this.accountName = newAccountName;
    }

    public int repoCount() {
        return this.repositories.size();
    }

    public void addRepos(Repository repo) {
        this.repositories.add(repo);
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public AccountType setAccountType(AccountType newAccountType) {
        return this.accountType = newAccountType;
    }

    public Repository getRepoByName(String repoName) {
        Repository foundRepo = null;
        for (Repository repository : this.repositories){
            if (repository.getName().equals(repoName)) {
                foundRepo = repository;
            }
        }
        return foundRepo;
    }
}
