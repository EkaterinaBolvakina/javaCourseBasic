package homeworks.homework_40.streamAPI.task_09;

import java.time.LocalDate;

public class Order {
    private Integer ID;
    private LocalDate date;
    private Double amount;
    private String status;

    public Order(Integer ID, LocalDate date, Double amount, String status) {
        this.ID = ID;
        this.date = date;
        this.amount = amount;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", date=" + date +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
