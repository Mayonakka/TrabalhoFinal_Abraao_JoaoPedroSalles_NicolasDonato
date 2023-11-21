package test;

import org.junit.Test;
import datastructures.ProfessorList;
import static org.junit.Assert.*;
import org.junit.Before;    
    
public class ProfessorListTest {

    ProfessorList pList;

    @Before
    public void setup(){
        pList = new ProfessorList();
    }
        
    @Test
    public void createUser() {
        assertTrue(pList.createUser("Test"));
    }

    @Test
    public void deleteUser() {
        pList.createUser("Test");
        assertTrue(pList.deleteUser(1001));
        assertFalse(pList.deleteUser(1002));
    }

    @Test
    public void searchInList() throws Exception{
        pList.createUser("Test");
        assertEquals("Test", pList.searchInList(1001).getName());
    }
}
    