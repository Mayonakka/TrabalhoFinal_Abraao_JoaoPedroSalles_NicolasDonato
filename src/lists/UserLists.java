package lists;

import main.Person;

public interface UserLists extends Lists{
    public boolean createUser(String name, String cpf);
    public boolean deleteUser(int uCode);
    public Person searchInList(int uCode);
}
