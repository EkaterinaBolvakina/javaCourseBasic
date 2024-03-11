package consultation.cons_15.practice.task_01.variantWithFunctionalInterface;

public class Request {
    private String message;
    private Integer number;

    public Request(String message, Integer number) {
        this.message = message;
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Request{" +
                "message='" + message + '\'' +
                ", number=" + number +
                '}';
    }
}
