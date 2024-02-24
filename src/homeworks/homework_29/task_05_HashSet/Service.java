package homeworks.homework_29.task_05_HashSet;

import java.util.Set;

public class Service {
    public void printCollection(Set<String> namesCollection){
        System.out.println("----------- UNIQUE NAMES -------------");
        for (String currentName : namesCollection ){
            System.out.println(currentName);
        }
        System.out.println("Total unique names: "+ namesCollection.size());
    }
    public void checkName(Set<String> namesCollection, String NameToCheck){
        if (namesCollection.contains(NameToCheck)){
            System.out.println("Collection contains the name: "+NameToCheck);
        }else{
            System.out.println("Name: '"+NameToCheck+"' not founded in this collection");
        }
    }
}
