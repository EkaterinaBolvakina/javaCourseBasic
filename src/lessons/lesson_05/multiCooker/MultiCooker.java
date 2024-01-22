package lessons.lesson_05.multiCooker;

public class MultiCooker {
    //Define the variables:
    String producer;
    String model;
    int power;
    int volume;
    //additional variables:
    String dish;
    int currentProgramNumber;
    int programNumbers;
    String nameProgram;
    int timeForProgram;

    //Generate constructor:
    public MultiCooker(String producer, String model, int power, int volume) {
        this.producer = producer;
        this.model = model;
        this.power = power;
        this.volume = volume;
    }
    //Define methods (functions):
    public void changeProgram(int newProgramNumber, String newProgram){
        this.currentProgramNumber = newProgramNumber;
        this.nameProgram = newProgram;
        System.out.println("The cooking program was switched to "+nameProgram+" (program number: "+currentProgramNumber+" )");
    }

    public void changeDish(String newDish){
        this.dish = newDish;
        System.out.println("Added new ingredients for cooking: "+dish+" in mode: "+nameProgram);
    }
// Show all parameters of variables:
    @Override
    public String toString() {
        return "MultiCooker{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", dish='" + dish + '\'' +
                ", currentProgramNumber=" + currentProgramNumber +
                ", programNumbers=" + programNumbers +
                ", nameProgram='" + nameProgram + '\'' +
                ", timeForProgram=" + timeForProgram +
                '}';
    }
}
