import org.junit.Before;

public class GithubAccountTest {

    private Commit commit1;
    private Commit commit2;

    private Repository repo1;
    private Repository repo2;

    private GithubAccount account;

    @Before
    public void before(){
        commit1 = new Commit("added some css styling", "2de56ffs781fc99dh9");
        commit2 = new Commit("added some css styling & html", "2de56d44o2483302j3");
        repo1 = new Repository("Java_Github_Modelling", "make a representation of github using Java", RepoType.PUBLIC);
        repo2 = new Repository("Watch_this_Space", "space app", RepoType.PRIVATE);
        account = new GithubAccount("CatAnderson", "CA1990", AccountType.FREE);

        repo1.addCommit(commit1);
        repo1.addCommit(commit2);
    }




}
