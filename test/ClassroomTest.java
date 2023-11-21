package test;

import components.Classroom;
import components.Professor;
import components.Student;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ClassroomTest {

    Classroom cr;
    Professor p;
    Student s;

    @Before
    public void setUp() {
        cr = new Classroom("cr", null, 1001);
        p = new Professor("p", 1001);
        s = new Student("s", 01001);
    }

    @Test
    public void SetProfessor() throws Exception {
        try {
            assertTrue(cr.setProfessor(p));
            cr.setProfessor(p);
        } catch (Exception e) {
            assertEquals("Turma ja possui professor", e.getMessage());
        }
    }

    @Test
    public void addUser() {
        try {
            assertTrue(cr.addUser(s));
            cr.addUser(s);
        } catch (Exception e) {
            assertEquals("\nAluno ja esta matriculado nesta disciplina", e.getMessage());
        }

    }

    @Test
    public void removeUser() throws Exception {
        assertFalse(cr.removeUser(s));
        cr.addUser(s);
        assertTrue(cr.removeUser(s));
    }

    @Test
    public void searchStudent() throws Exception {
        try {
            cr.addUser(s);
            assertEquals(s.getName(), cr.searchStudent(1001).getName());
            cr.removeUser(s);
            cr.searchStudent(1001);
        } catch (Exception e) {
            assertEquals("Aluno nao encontrado", e.getMessage());
        }
    }
}
