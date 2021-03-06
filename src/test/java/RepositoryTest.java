import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RepositoryTest {

    private Commit commit;
    private Commit commit2;
    private Commit commit3;
    private Repository repository;

    @Before
    public void before() {
        commit = new Commit("added some css styling", "2de56ffs781fc99dh9");
        commit2 = new Commit("added some css styling & html", "2de56d44o2483302j3");
        commit3 = new Commit("screwed up...", "2de56d4568db3d3ks983");
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

    @Test
    public void hasNoCommits(){
        assertEquals(0, repository.commitCount());
    }

    @Test
    public void hasCommits(){
        repository.addCommit(commit);
        repository.addCommit(commit2);
        assertEquals(2, repository.commitCount());
    }

    @Test
    public void canRemoveCommit(){
        repository.addCommit(commit);
        repository.removeCommit();
        assertEquals(0, repository.commitCount());
    }

    @Test
    public void canGetCommitByUniqueId(){
        repository.addCommit(commit);
        repository.addCommit(commit2);
        assertEquals(commit2, repository.getCommitByUniqueId("2de56d44o2483302j3"));
    }

//    @Test
//    public void canRollBackCommits(){
//        repository.addCommit(commit);
//        repository.addCommit(commit2);
//        repository.addCommit(commit3);
//        assertArrayEquals([commit, commit2], repository.getCommitArray(commit2));
//
//    }
}