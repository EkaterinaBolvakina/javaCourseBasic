package homeworks.homework_33.task_03;

import java.util.LinkedList;
import java.util.Queue;

public class TourCollection{
    Queue<String> requests;
    int maxSize;
    public TourCollection(int maxSize) {    //- Конструктор, принимающий `maxSize`
        this.maxSize = maxSize;
        this.requests = new LinkedList<>(); // и инициализирующий коллекцию.
    }
    public void addRequest(String request){
        if (requests.size() < maxSize){
            requests.offer(request);
            System.out.println("Request: "+request+" is added");
        } else {
            System.out.println("Request collection is full");
        }
    }
    public void processRequest(){
        if (!requests.isEmpty()){
            System.out.println("Request "+requests.poll()+" is processed");
        }else {
            System.out.println("Request collection is empty");
        }
    }
    public Integer getQueueSize(){
        int currentQueueSize = requests.size();
        return currentQueueSize;
    }

    public Queue<String> getRequests() {
        return requests;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
