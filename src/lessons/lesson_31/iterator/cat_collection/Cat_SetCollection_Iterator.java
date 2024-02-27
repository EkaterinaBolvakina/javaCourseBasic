package lessons.lesson_31.iterator.cat_collection;

import java.util.*;

public class Cat_SetCollection_Iterator {
    public static void main(String[] args) {
        Set<CatData> catDataSet = new HashSet<>();
        CatData barsik = new CatData("Barsik");
        CatData mursik = new CatData("Mursik");
        CatData begemot = new CatData("Begemot");
        CatData finik = new CatData("Finik");
        CatData murka = new CatData("Murka");

        CatData pushok = new CatData("Pushok");
        CatData mishka = new CatData("Mishka");

        catDataSet.add(barsik);
        catDataSet.add(mursik);
        catDataSet.add(begemot);
        catDataSet.add(finik);
        catDataSet.add(murka);

        System.out.println("Katzen HASH SET Kollektion: ");
        System.out.println(catDataSet);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("--- ITERATOR (kann nur REMOVE)---");
        Iterator<CatData> catDataIterator = catDataSet.iterator();
        while (catDataIterator.hasNext()){
            CatData tempCat = catDataIterator.next();
            System.out.println(tempCat);
            if (tempCat.getCatName().contains("a")){
                catDataIterator.remove();
            }
            System.out.println("Gibt es ein weiteres Element? "+ catDataIterator.hasNext());
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Katzen Kollektion nach dem Löschen des Elements, wenn es 'a' beinhaltet: ");
        System.out.println(catDataSet);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("--- VARIANTE 1:  ADD element (Kopie -> SET -> FOR EACH)------- ");
        // erzeuge neue SET collection als Kopie:
        Set<CatData> catDataSetCopy = new HashSet<>(catDataSet);

        for (CatData tempCat : catDataSetCopy){           //gehe mit der Schleife FOR EACH durch die Kopie-Kollektion
         //   if (tempCat.getCatName().equals("Begemot")){  //vergleiche Element in der Kopie-Kollektion mit der Bedingung
                catDataSet.add(mishka);                   // füge das neue Element der Original-Kollektion zu
         //   }
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Katzen SET Kollektion nach dem Hinzufügen eines neuen Elements: ");
        System.out.println(catDataSet);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("--- VARIANTE 2:  ADD element (Kopie -> LIST -> LIST ITERATOR) ------- ");
        // erzeuge neue LIST collection als Kopie:
        List<CatData> catDataListKopie = new ArrayList<>(catDataSet);
        //weiter LIST ITERATOR einsetzen:
        ListIterator<CatData> catDataListIterator = catDataListKopie.listIterator();
        while (catDataListIterator.hasNext()){                //gehe mit der Schleife durch die Kopie-Kollektion
         CatData tempCat = catDataListIterator.next();
          //  if (tempCat.getCatName().equals("Finik")){        //vergleiche Element in der Kopie-Kollektion mit der Bedingung __BRAUCHT MAN HIER NICHT, da SET Kollektion
                catDataSet.add(pushok);                       // füge das neue Element der Original-Kollektion zu
          //  }
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Katzen SET Kollektion nach dem Hinzufügen eines neuen Elements: ");
        System.out.println(catDataSet);




    }
}
