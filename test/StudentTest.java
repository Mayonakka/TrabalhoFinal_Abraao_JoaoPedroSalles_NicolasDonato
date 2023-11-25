package test;

import components.Course;
import components.Student;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;    
    
public class StudentTest {

    Student s;
    Course c;

    @Before
    public void setup(){
        s = new Student("Student", 1001);
        c = new Course("Course");
    }
        
    @Test
    public void addNewCourse() throws Exception{
        assertTrue(s.addNewCourse(c));
        try {
            s.addNewCourse(c);
        } catch (Exception e) {
            assertEquals("\nAluno ja matriculado nesta disciplina", e.getMessage());
        }
    }
    
    @Test
    public void removeCourse() throws Exception{
        s.addNewCourse(c);
        assertTrue(s.removeCourse("Course"));
        assertFalse(s.removeCourse("Course"));
    }

    @Test
    public void searchCourse() throws Exception{
        s.addNewCourse(c);
        assertEquals("Course", s.searchCourse("Course").getName());
    }
}
    