package consultation.cons_15.practice.task_01.variantWithFunctionalInterface;

public class RequestApp {
    public static void main(String[] args) {

        ServiceFunction serviceFunction = new ServiceFunction();
        Request request1 = new Request("Test message 1 test text",100);
        Request request2 = new Request("Test ",50);
        Request request3 = new Request("Test",130);
        Request request4 = new Request("Test ",230);
        Request request5 = new Request("Test",320);
        Request request6 = new Request("Test ",470);
        Request request7 = new Request("Test ",550);

        System.out.println(serviceFunction.apply(request1));
        System.out.println(serviceFunction.apply(request2));
        System.out.println(serviceFunction.apply(request3));
        System.out.println(serviceFunction.apply(request4));
        System.out.println(serviceFunction.apply(request5));
        System.out.println(serviceFunction.apply(request6));
        System.out.println(serviceFunction.apply(request7));

    }
}
