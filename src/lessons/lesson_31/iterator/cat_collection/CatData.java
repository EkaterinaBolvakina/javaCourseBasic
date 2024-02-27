package lessons.lesson_31.iterator.cat_collection;

public class CatData {
    private String catName;

    public CatData(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    @Override
    public String toString() {
        return "CatData{" +
                "catName='" + catName + '\'' +
                '}';
    }
}
