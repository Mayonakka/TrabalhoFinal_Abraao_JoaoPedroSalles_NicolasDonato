package test;

import datastructures.StudentList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
    
public class StudentListTest {

    StudentList sList;
 
    @Before
    public void setUp(){
        sList = new StudentList();
    }

    @Test
    public void createUser() {
        assertTrue(sList.createUser("sList"));
    }

    @Test
    public void deleteUser() {
        sList.createUser("sList");
        assertTrue(sList.deleteUser(1001));
        assertFalse(sList.deleteUser(1002));
    }
    
    @Test
    public void searchInList() throws Exception{
        sList.createUser("sList");
        assertEquals("sList", sList.searchInList(1001).getName());
    }
}
    