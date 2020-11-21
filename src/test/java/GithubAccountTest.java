import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        account = new GithubAccount("Cat Anderson", "CA1990", AccountType.FREE);

        repo1.addCommit(commit1);
        repo1.addCommit(commit2);
    }

    @Test
    public void hasUserName(){
        assertEquals("Cat Anderson", account.getUserName());
    }

    @Test
    public void canChangeUserName(){
        assertEquals("Catherine Anderson", account.setUserName("Catherine Anderson"));
    }

    @Test
    public void hasAccountName(){
        assertEquals("CA1990", account.getAccountName());
    }

    @Test
    public void canChangeAccountName(){
        assertEquals("CAT1990", account.setAccountName("CAT1990"));
    }

    @Test
    public void hasNoRepos(){
        assertEquals(0, account.repoCount());
    }

    @Test
    public void hasRepos(){
        account.addRepos(repo1);
        assertEquals(1, account.repoCount());
    }

    @Test
    public void hasAccountType(){
        assertEquals(AccountType.FREE, account.getAccountType());
    }

    @Test
    public void updateAccountType(){
        assertEquals(AccountType.PRO, account.setAccountType(AccountType.PRO));
    }
}
