package addHomework.addHomework2.task_22.methods;

public class Dog {
    private String dogName;
    private int dogAge;
    private String dogColour;

    public Dog(String dogName, int dogAge, String dogColour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }

    public void voice(){
        System.out.println(dogName+"; "+dogAge+"; "+dogColour);
    }


    void changeColour(String newDogColour){
        this.dogColour = newDogColour;
        System.out.println(newDogColour);
    }

    }



