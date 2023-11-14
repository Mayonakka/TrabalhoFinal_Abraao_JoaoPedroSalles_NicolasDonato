package lists;

public interface Lists {
    public void createUser(String name, String cpf);
    public void removeUser(int codeStudent);
    public String getUserList(int index) throws Exception;
}
