package lessons.lesson_31.iterator.cat_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cat_ListCollection_Iterator {
    public static void main(String[] args) {
        List<CatData> catDataList = new ArrayList<>();
        CatData barsik = new CatData("Barsik");
        CatData mursik = new CatData("Mursik");
        CatData begemot = new CatData("Begemot");
        CatData finik = new CatData("Finik");
        CatData murka = new CatData("Murka");

        CatData pushok = new CatData("Pushok");

        catDataList.add(barsik);
        catDataList.add(mursik);
        catDataList.add(begemot);
        catDataList.add(finik);
        catDataList.add(murka);

        System.out.println(catDataList);
        /* ===== FOR EACH gibt den Fehler aus,
                 denn in dieser Schleife in JAVA keine Modifikation der Kollektion erlaubt ist!

        for (CatData tempCat : catDataList){
            if (tempCat.getCatName().equals("Begemot")){
                catDataList.remove(begemot);
            }
        }     */

        // ======== deswegen wird ITERATOR eingesetzt =======
        // Iterator<ObjectName/VariableType> nameOfIterator = nameOfCollection.method iterator()

        System.out.println("===== ITERATOR 1 =====");
        Iterator<CatData> catDataIterator = catDataList.iterator();

        while (catDataIterator.hasNext()){
            CatData tempCat = catDataIterator.next();
            System.out.println(tempCat);
        }

        System.out.println("===== ITERATOR 2 (kann nur REMOVE) =====");
        Iterator<CatData> catDataIterator1 = catDataList.iterator();

        while (catDataIterator1.hasNext()){
            CatData tempCat = catDataIterator1.next();
            System.out.println(tempCat);
            if (tempCat.getCatName().equals("Begemot")){
                catDataIterator1.remove();
            }
            System.out.println("Gibt es ein weiteres Element? "+ catDataIterator1.hasNext());
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Katzen Kollektion nach REMOVE von 'Begemot': ");
        System.out.println(catDataList);
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("===== ITERATOR 3: LIST ITERATOR nur speziell bei LIST Kollektionen! (kann REMOVE and ADD) =====");
        ListIterator<CatData> catDataListIterator = catDataList.listIterator();

        while (catDataListIterator.hasNext()){
            CatData tempCat = catDataListIterator.next();
            System.out.println(tempCat);
            if (tempCat.getCatName().equals("Mursik")){
                catDataListIterator.add(pushok);
            }
            System.out.println("Gibt es ein weiteres Element? "+catDataListIterator.hasNext());
        }

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Katzen Kollektion nach ADD von 'Pushok', nachdem 'Murzik' gefunden wurde: ");
        System.out.println(catDataList);
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("===== ITERATOR 3: LIST ITERATOR und die Schleife läuft in die andere Richtung =====");
        while (catDataListIterator.hasPrevious()){
          CatData tempCat = catDataListIterator.previous();
            System.out.println(tempCat);
        }




    }
}
