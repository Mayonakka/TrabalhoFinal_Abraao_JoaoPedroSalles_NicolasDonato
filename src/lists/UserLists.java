package lists;

import components.Person;

public interface UserLists extends Lists{
    public boolean createUser(String name);
    public boolean deleteUser(int uCode);
    public Person searchInList(int uCode) throws Exception;
}
