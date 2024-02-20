package lessons.lesson_26.tvCollection;

import java.util.Objects;

public class TV {
    private String producer;
    private String sizeTV;

    public TV(String producer, String sizeTV) {
        this.producer = producer;
        this.sizeTV = sizeTV;
    }

    public String getProducer() {
        return producer;
    }

    public String getSizeTV() {
        return sizeTV;
    }

    @Override
    public String toString() {
        return "TV{" +
                "producer='" + producer + '\'' +
                ", sizeTV='" + sizeTV + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer);
    }
}
