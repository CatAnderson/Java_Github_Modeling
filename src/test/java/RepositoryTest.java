import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Commit commit;
    private Repository repository;

    @Before
    public void before() {
        commit = new Commit("added some css styling", "2de56ffs781fc99dh9");
        repository = new Repository("Java_Github_Modelling", "make a representation of github using Java", RepoType.PUBLIC);
    }

    @Test
    public void hasName() {
        assertEquals("Java_Github_Modelling", repository.getName());
    }

    @Test
    public void canChangeName(){
        assertEquals("JAVA_Github_Modelling", repository.setName("JAVA_Github_Modelling"));
    }

    @Test
    public void hasDescription() {
        assertEquals("make a representation of github using Java", repository.getDescription());
    }

    @Test
    public void canChangeDescription() {
        assertEquals("making a representation of github using Java", repository.setDescription("making a representation of github using Java"));
    }

    @Test
    public void hasRepoType(){
        assertEquals(RepoType.PUBLIC, repository.getRepoType());
    }

    @Test
    public void canChangeRepoType(){
        assertEquals(RepoType.PRIVATE, repository.setRepoType(RepoType.PRIVATE));
    }

}