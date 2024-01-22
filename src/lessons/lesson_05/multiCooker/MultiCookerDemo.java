package lessons.lesson_05.multiCooker;

public class MultiCookerDemo {
    public static void main(String[] args) {
        MultiCooker mc1 = new MultiCooker("Bosch","Super cook", 200, 10);
        // Show all parameters of variables:
        System.out.println(mc1);

        mc1.currentProgramNumber = 1;
        mc1.programNumbers = 4;
        mc1.nameProgram = "Stewing";
        mc1.dish = "Cabbage";
        mc1.timeForProgram = 30;
        // Show all parameters of variables:
        System.out.println(mc1);

        System.out.println();
        //OR Using our new methods:
        mc1.changeProgram(1,"Stewing");
        mc1.changeDish("Cabbage");

        mc1.changeProgram(2,"Baking");
        mc1.changeDish("Cake");

        mc1.changeProgram(3,"Cooking");
        mc1.changeDish("Soup");





    }
}
