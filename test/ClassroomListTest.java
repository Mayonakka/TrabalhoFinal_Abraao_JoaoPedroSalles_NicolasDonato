package test;

import datastructures.ClassroomList;
import datastructures.ProfessorList;
import datastructures.StudentList;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ClassroomListTest {

    ClassroomList crList;
    StudentList sList;
    ProfessorList pList;

    @Before
    public void setup() {
        crList = new ClassroomList();
        sList = new StudentList();
        pList = new ProfessorList();
    }

    @Test
    public void createClass() {
        assertTrue(crList.createClass("Classroom", "0/0000"));
    }

    @Test
    public void deleteClass() {
        crList.createClass("Classroom", "0/0000");
        assertTrue(crList.deleteClass(1001));
        assertFalse(crList.deleteClass(1002));
    }

    @Test
    public void addStudentInClassroom() throws Exception {
        sList.createUser("Student");
        crList.createClass("Classroom", "0/0000");
        assertTrue(crList.addStudentInClassroom(sList, 1001, 1001));
    }

    @Test
    public void removeStudentInClassroom() throws Exception {
        sList.createUser("Student");
        crList.createClass("Classroom", "0/0000");
        crList.addStudentInClassroom(sList, 1001, 1001);
        assertTrue(crList.removeStudentInClassroom(sList, 1001, 1001));

    }

    @Test
    public void addProfessorInClassroom() throws Exception {
        pList.createUser("Professor");
        crList.createClass("Classroom", "0/0000");
        assertTrue(crList.addProfessorInClassroom(pList, 1001, 1001));
    }

    @Test
    public void removeProfessorInClassroom() throws Exception {
        pList.createUser("Professor");
        crList.createClass("Classroom", "0/0000");
        crList.addProfessorInClassroom(pList, 1001, 1001);
        assertTrue(crList.removeProfessorInClassroom(pList, 1001));
    }

    @Test
    public void addGrade() throws Exception {
        sList.createUser("Student");
        crList.createClass("Classroom", "0/0000");
        crList.addStudentInClassroom(sList, 1001, 1001);
        assertTrue(crList.addGrade(1001,1001,10f,10f));
    }

    @Test
    public void searchList() {
        try {
            crList.createClass("Classroom", "00/0000");
            assertEquals("Classroom", crList.searchList(1001).getCourse());
            crList.deleteClass(1001);
            crList.searchList(1001);
        } catch (Exception e) {
            assertEquals("\nTurma nao encontrada", e.getMessage());
        }
    }
}
