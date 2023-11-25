package test;

import datastructures.ProfessorList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;  
    
public class ProfessorListTest {

    ProfessorList pList;

    @Before
    public void setup(){
        pList = new ProfessorList();
    }
        
    @Test
    public void createUser() {
        assertTrue(pList.createUser("pList"));
    }

    @Test
    public void deleteUser() {
        pList.createUser("pList");
        assertTrue(pList.deleteUser(1001));
        assertFalse(pList.deleteUser(1002));
    }

    @Test
    public void searchInList() throws Exception{
        pList.createUser("pList");
        assertEquals("pList", pList.searchInList(1001).getName());
    }
}
    