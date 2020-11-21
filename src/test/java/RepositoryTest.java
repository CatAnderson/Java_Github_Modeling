import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Commit commit;
    private Repository repository;

    @Before
    public void before(){
        commit = new Commit("added some css styling", "2de56ffs781fc99dh9");
        repository = new Repository("Java_Github_Modelling", "make a representation of github using Java", RepoType.PUBLIC);
    }

    @Test
    public void hasName(){
        assertEquals("Java_Github_Modelling", repository.getName());
    }
}
