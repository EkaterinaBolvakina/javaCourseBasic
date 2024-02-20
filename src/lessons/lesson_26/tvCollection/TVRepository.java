package lessons.lesson_26.tvCollection;

import java.util.ArrayList;

public class TVRepository {

    public void addList (ArrayList<TV> tvList, TV tv){
            tvList.add(tv);
       // System.out.println(tvList);
    }

    public void printTvList(ArrayList<TV> tvList){
        for (int i = 0; i < tvList.size(); i++) {
            System.out.println(tvList.get(i));
        }
    }

    public TV findFirstTvByProducer(ArrayList<TV> tvList, String producerForDelete){
        for (int i = 0; i < tvList.size(); i++) {
            TV currentTvFromCollection = tvList.get(i);
            if (currentTvFromCollection.getProducer().equals(producerForDelete)) {
                return currentTvFromCollection;
            }
        }
        return null;
    }
    public void remove (ArrayList<TV> tvList, TV tvForRemove){
        if (tvForRemove != null) {
            tvList.remove(tvForRemove);
            System.out.println("Our collection after sales:");
            printTvList(tvList);
        } else {
            System.out.println("This producer is not founded!");
        }
    }



}
