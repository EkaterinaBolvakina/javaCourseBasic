package addHomework.addHomework2.task_20.methods;

public class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void voice(){
        System.out.println(dogName+" Woow ");
    }
    public void happyBirthday(){
        System.out.println("Happy birthday, "+dogName);
        System.out.println(dogName+" new age: "+(dogAge+1));
    }


}
