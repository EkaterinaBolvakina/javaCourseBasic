package lessons.lesson_37.practice.task_3;

public class UserDemo {
    public static void main(String[] args) {
        UserRepository demo = new UserRepository();
        demo.addUser(new User("1","Pelz123"));
        demo.addUser(new User("2","abrakadabra"));
        demo.addUser(new User("3","Funtik23"));

        System.out.println(demo.findById("4"));
        System.out.println(demo.findById("1"));
    }
}
