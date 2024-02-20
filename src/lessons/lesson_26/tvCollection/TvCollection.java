package lessons.lesson_26.tvCollection;

import java.util.ArrayList;

public class TvCollection {
    public static void main(String[] args) {
         /*
    создать класс TV
    - производитель
    - размер

    создать коллекцию
    и внести туда 3 элемента
    распечатать
    и удалить один - первый из всех у кого совпадет производитель

     */
        TVRepository tvRepository = new TVRepository();
        System.out.println("==============================================");
        System.out.println("Our TV collection for sales 10% rebates:");
        ArrayList<TV> tvArrayList = new ArrayList<>();
        tvRepository.addList(tvArrayList,new TV("Panasonic","65"));
        tvRepository.addList(tvArrayList,new TV("Sony","55"));
        tvRepository.addList(tvArrayList,new TV("Phillips","65"));


        tvRepository.printTvList(tvArrayList);
        System.out.println();

        TV tvForRemove = tvRepository.findFirstTvByProducer(tvArrayList,"Sony");
        tvRepository.remove(tvArrayList,tvForRemove);

        System.out.println("==============================================");
        System.out.println("Our TV collection for sales 50% rebates:");
        ArrayList<TV> tvArrayList2 = new ArrayList<>();
        tvRepository.addList(tvArrayList2,new TV("Panasonic","50"));
        tvRepository.addList(tvArrayList2,new TV("Panasonic","55"));
        tvRepository.addList(tvArrayList2,new TV("Panasonic","40"));

        tvRepository.printTvList(tvArrayList2);
        System.out.println();

        TV tvForRemove2 = tvRepository.findFirstTvByProducer(tvArrayList2,"Sony");
        tvRepository.remove(tvArrayList2,tvForRemove2);


    }
}
