package lessons.lesson_06.publicAndPrivate.moto;

public class Moto {
    private String colour;
    private String model;
    private String producer;

    public Moto(String colour, String model, String producer) {
        this.colour = colour;
        this.model = model;
        this.producer = producer;
    }
// Getter and setter generating:
    public String getColour() {return colour;}
    public void setColour(String colour) {this.colour = colour;}
    public String getModel() {return model;}
    public String getProducer() {return producer;}

    public void startRoad(){
        // 1) включил двигатель
        // 2) включил первую передачу
        // 3) начал движение

//        System.out.println("Завел двигатель");
//        System.out.println("Включил первую передачу");
//        System.out.println("Начал движение");
        startMoto();
        changeGear();
        startMoving();
    }
    private void startMoto(){System.out.println("Завел двигатель");}
    private void changeGear(){System.out.println("Включил первую передачу");}
    private void startMoving(){System.out.println("Начал движение");}

}
