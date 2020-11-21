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
}
