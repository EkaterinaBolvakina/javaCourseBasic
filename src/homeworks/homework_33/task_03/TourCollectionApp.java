package homeworks.homework_33.task_03;

public class TourCollectionApp {
    public static void main(String[] args) {

        TourCollection tourCollection = new TourCollection(5);
        System.out.println("Max count of requests in collection: "+tourCollection.getMaxSize());
        System.out.println("Count of requests in collection: "+tourCollection.getQueueSize());
        tourCollection.addRequest("1 Tour Mountains");
        tourCollection.addRequest("2 Question about tour SEE WONDERFUL");
        tourCollection.addRequest("3 Bicycle tour in France");
        tourCollection.addRequest("4 Wandern in Alpen");
        tourCollection.addRequest("5 Tour Mountains Alps");
        System.out.println("Count of requests in collection: "+tourCollection.getQueueSize());
        tourCollection.addRequest("тип тура или спецификацию запроса клиента");

        System.out.println("----- Request collection ------");
        System.out.println(tourCollection.getRequests());

        System.out.println();
        tourCollection.processRequest();
        System.out.println("----- Request collection ------");
        System.out.println("Count of requests in collection: "+tourCollection.getQueueSize());
        System.out.println(tourCollection.getRequests());

        tourCollection.processRequest();
        tourCollection.processRequest();
        System.out.println("Count of requests in collection: "+tourCollection.getQueueSize());
        System.out.println(tourCollection.getRequests());
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        System.out.println("Count of requests in collection: "+tourCollection.getQueueSize());
        System.out.println(tourCollection.getRequests());

    }
}
