package homeworks.homework_30.task_02;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
2) Чемодан - 3 параметра материал (пластик или ткань), размер - M, L, XL и цвет.
   Создать две коллекции - TreeSet и LinkedList и отсортировать по трем параметрам - размеру и материалу и цвету
 */
public class SuitcaseDemo {
    public static void main(String[] args) {

        SuitcaseComparatorColour suitcaseComparatorColour = new SuitcaseComparatorColour();
        SuitcaseComparatorSize suitcaseComparatorSize = new SuitcaseComparatorSize();
        SuitcaseComparatorMaterial suitcaseComparatorMaterial = new SuitcaseComparatorMaterial();

        Set<Suitcase> suitcaseSet = new TreeSet<>(suitcaseComparatorSize.thenComparing(suitcaseComparatorMaterial).thenComparing(suitcaseComparatorColour));
        suitcaseSet.add(new Suitcase(Material.Plastic,Size.M,Colour.Red));
        suitcaseSet.add(new Suitcase(Material.Fabric,Size.S,Colour.Red));
        suitcaseSet.add(new Suitcase(Material.Plastic,Size.L,Colour.Rose));
        suitcaseSet.add(new Suitcase(Material.Plastic,Size.S,Colour.Red));
        suitcaseSet.add(new Suitcase(Material.Fabric,Size.S,Colour.Grey));
        suitcaseSet.add(new Suitcase(Material.Plastic,Size.M,Colour.Blue));
        suitcaseSet.add(new Suitcase(Material.Fabric,Size.M,Colour.Black));
        suitcaseSet.add(new Suitcase(Material.Fabric,Size.M,Colour.Yellow));

        System.out.println("------ TreeSet collection : UNIQUE elements sorted by COMPARATORS: Size -> Material -> Colour with ENUM ----------");
        System.out.println(suitcaseSet);
        System.out.println();

        List<Suitcase> suitcasesList = new LinkedList<>();
        suitcasesList.add(new Suitcase(Material.Plastic,Size.M,Colour.Red));
        suitcasesList.add(new Suitcase(Material.Fabric,Size.S,Colour.Red));
        suitcasesList.add(new Suitcase(Material.Plastic,Size.L,Colour.Rose));
        suitcasesList.add(new Suitcase(Material.Plastic,Size.S,Colour.Red));
        suitcasesList.add(new Suitcase(Material.Fabric,Size.S,Colour.Grey));
        suitcasesList.add(new Suitcase(Material.Plastic,Size.M,Colour.Blue));
        suitcasesList.add(new Suitcase(Material.Fabric,Size.M,Colour.Black));
        suitcasesList.add(new Suitcase(Material.Fabric,Size.M,Colour.Yellow));

        System.out.println("------ LinkedList collection : ALL elements NOT sorted ----------");
        System.out.println(suitcasesList);
        System.out.println();

        System.out.println("------ LinkedList collection : ALL elements SORTED by COMPARATORS:  Size -> Material -> Colour with ENUM ----------");
        suitcasesList.sort(suitcaseComparatorSize.thenComparing(suitcaseComparatorMaterial).thenComparing(suitcaseComparatorColour));
        System.out.println(suitcasesList);


    }
}
