package addHomework.extraHomework1_oop.interfaces.task_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService{
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

    @Override
    public void signal() {
        System.out.println("Message");
    }
}
