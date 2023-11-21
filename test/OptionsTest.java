package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import datastructures.ProfessorList;
import datastructures.StudentList;
import userinterface.Options;

public class OptionsTest {

    StudentList sList;
    ProfessorList pList;

    @Before
    public void setup() {
        sList = new StudentList();
        pList = new ProfessorList();
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
        
    }

    @Test
    public void testRegisterUser() throws Exception {

    }

    @Test
    public void registerClass() {

    }

    @Test
    public void unregisterClass() {

    }

    @Test
    public void addUserInClassroom() {

    }

    @Test
    public void removeUserInClassroom() {

    }

    @Test
    public void addGrade() throws Exception {

    }
}
