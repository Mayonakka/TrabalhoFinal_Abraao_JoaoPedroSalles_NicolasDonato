package test;

import org.junit.Test;
import org.mockito.Mockito;
import datastructures.ProfessorList;
import datastructures.StudentList;
import userinterface.Options;
import userinterface.UI;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Scanner;
import org.junit.Before;

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
