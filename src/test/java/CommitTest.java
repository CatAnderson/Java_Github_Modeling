import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void before(){
        commit = new Commit("added some css styling", "2de56ffs781fc99dh9");
    }

    @Test
    public void hasDescription(){
        assertEquals("added some css styling", commit.getDescription());
    }

    @Test
    public void canChangeDescription(){
        assertEquals("added some css styling & changed html", commit.setDescription("added some css styling & changed html"));
    }

    @Test
    public void hasUniqueId(){
        assertEquals("2de56ffs781fc99dh9", commit.getUniqueId());
    }

}
