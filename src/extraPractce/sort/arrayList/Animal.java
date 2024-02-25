package extraPractce.sort.arrayList;

public class Animal {
    private Integer animalId;
    private String animalType;

    public Animal(Integer animalId, String animalType) {
        this.animalId = animalId;
        this.animalType = animalType;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public String getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
