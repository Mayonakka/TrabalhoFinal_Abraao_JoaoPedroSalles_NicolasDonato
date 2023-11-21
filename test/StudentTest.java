package test;

import org.junit.Test;

import components.Course;
import components.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class StudentTest {

    Student s;
    Course c;

    @Before
    public void setup(){
        s = new Student("Test", 1001);
        c = new Course("CourseTest");
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
        assertTrue(s.removeCourse("CourseTest"));
        assertFalse(s.removeCourse("CourseTest"));
    }

    @Test
    public void searchCourse() throws Exception{
        
    }
}
    