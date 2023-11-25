package test;

import java.util.Scanner;
import datastructures.ClassroomList;
import datastructures.ProfessorList;
import datastructures.StudentList;
import userinterface.Options;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OptionsTest {

    StudentList sList;
    ProfessorList pList;
    ClassroomList crList;
    Scanner s;

    @Before
    public void setup() {
        sList = new StudentList();
        pList = new ProfessorList();
        crList = new ClassroomList();
        s = Mockito.mock(Scanner.class);
    }

    @Test
    public void checksTypeUser() throws Exception {
        try {
            assertEquals(sList, Options.checksTypeUser(1, sList, pList));
            assertEquals(pList, Options.checksTypeUser(2, sList, pList));
            Options.checksTypeUser(3, sList, pList);
            assert false;
        } catch (Exception e) {
            assertEquals("\nOpcao invalida", e.getMessage());
        }
    }

    @Test
    public void registerUser() throws Exception {
        when(s.nextLine())
        .thenReturn("1")
        .thenReturn("Student");
        assertTrue(Options.registerUser(s, sList, pList));
    }

    @Test
    public void unregisterUser() throws Exception {
        when(s.nextLine())
        .thenReturn("1")
        .thenReturn("Student")
        .thenReturn("1")
        .thenReturn("1001");;
        Options.registerUser(s, sList, pList);
        assertTrue(Options.unregisterUser(s, sList, pList));
    }

    @Test
    public void registerClass() {
        when(s.nextLine())
        .thenReturn("Classroom")
        .thenReturn("00/0000");
        assertTrue(Options.registerClass(s, crList));
    }

    @Test
    public void unregisterClass() {
        when(s.nextLine())
        .thenReturn("Classroom")
        .thenReturn("00/0000")
        .thenReturn("1001");
        Options.registerClass(s, crList);
        assertTrue(Options.unregisterClass(s, crList));
    }

    @Test
    public void addUserInClassroom() throws Exception{
        when(s.nextLine())
        .thenReturn("1")
        .thenReturn("Student")
        .thenReturn("Classroom")
        .thenReturn("00")
        .thenReturn("0000")
        .thenReturn("1")
        .thenReturn("1001");
        Options.registerUser(s, sList, pList);
        Options.registerClass(s, crList);
        assertTrue(Options.addUserInClassroom(s, sList, pList, crList));
    }

    @Test
    public void removeUserInClassroom() throws Exception{
        when(s.nextLine())
        .thenReturn("1")
        .thenReturn("Student")
        .thenReturn("Classroom")
        .thenReturn("00")
        .thenReturn("0000")
        .thenReturn("1")
        .thenReturn("1001")
        .thenReturn("1001")
        .thenReturn("1")
        .thenReturn("1001");
        Options.registerUser(s, sList, pList);
        Options.registerClass(s, crList);
        Options.addUserInClassroom(s, sList, pList, crList);
        assertTrue(Options.removeUserInClassroom(s, sList, pList ,crList));
    }

    @Test
    public void addGrade() throws Exception {
        when(s.nextLine())
        .thenReturn("1")
        .thenReturn("Student")
        .thenReturn("Classroom")
        .thenReturn("00")
        .thenReturn("0000")
        .thenReturn("1")
        .thenReturn("1001")
        .thenReturn("1001")
        .thenReturn("1001")
        .thenReturn("1001")
        .thenReturn("9.8")
        .thenReturn("7.9");
        Options.registerUser(s, sList, pList);
        Options.registerClass(s, crList);
        Options.addUserInClassroom(s, sList, pList, crList);
        assertTrue(Options.addGrade(s, crList));
    }
}
