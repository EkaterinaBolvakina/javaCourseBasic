package lessons.lesson_38.practice.innerClassTask;

public class Car {
private Integer doorCount;

    public Car(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public Integer getDoorCount() {
        return doorCount;
    }

    public class Door {
        private Integer doorLength;
        private Integer doorHigh;

        public Door(Integer doorLength, Integer doorHigh) {
            this.doorLength = doorLength;
            this.doorHigh = doorHigh;
        }

        public boolean isOpen() {
            return true;
        }
        public void doorOpenClose(boolean isOpen){
            if (isOpen()== isOpen) {
                System.out.println("Door is open");
            }else {
                System.out.println("Door is closed");
            }
        }
    }

}
