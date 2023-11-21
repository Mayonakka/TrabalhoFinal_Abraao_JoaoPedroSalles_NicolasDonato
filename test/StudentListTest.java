package test;

import org.junit.Test;
import datastructures.StudentList;
import static org.junit.Assert.*;
import org.junit.Before;    
    
public class StudentListTest {

    StudentList sList;
 
    @Before
    public void setUp(){
        sList = new StudentList();
    }

    @Test
    public void createUser() {
        assertTrue(sList.createUser("Test"));
    }

    @Test
    public void deleteUser() {
        sList.createUser("Test");
        assertTrue(sList.deleteUser(1001));
        assertFalse(sList.deleteUser(1002));
    }
    
    @Test
    public void searchInList() throws Exception{
        sList.createUser("Test");
        assertEquals("Test", sList.searchInList(1001).getName());
    }
}
    