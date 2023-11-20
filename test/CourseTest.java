package test;

import static org.junit.Assert.*;
import org.junit.*;
import components.Course;
import components.Status;

public class CourseTest {

    Course c;

    @Before
    public void setUp() {
        c = new Course("c");
    }

    @Test
    public void testcheckGrade(){
        assertTrue(c.checkGrade(10));
        assertFalse(c.checkGrade(11));
    }

    @Test
    public void calcFinalGrade() throws Exception{
        assertTrue(c.calcFinalGrade(8.5f, 7.0f));
        assertEquals(7.5f, c.getWeightedAvarage(), 0.01f);
        assertEquals(Status.APROVADO, c.getStatus());
        assertTrue(c.calcFinalGrade(6f, 5));
        assertEquals(5.5f, c.getArithimeticAvarage(), 0.01f);
        assertEquals(Status.REPROVADO, c.getStatus());
    }
}
    