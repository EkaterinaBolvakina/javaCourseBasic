package lessons.lesson_39.anonymClass;

public class Programme {
    public static void main(String[] args) {
        Message start = new Message() {
            @Override
            public void message() {
                System.out.println("Start!");
            }
        };

        Message continueMsg =new Message() {
            @Override
            public void message() {
                System.out.println("Continue!");
            }
        };

        start.message();
        continueMsg.message();

    }
}


