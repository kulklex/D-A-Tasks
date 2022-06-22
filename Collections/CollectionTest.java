import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();

        for (String color : colors){
            list.add(color);
        }

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();

        for (String removeColor : removeColors){
            removeList.add(removeColor);
        }

        
        System.out.println("ArrayList: ");

        for(int count = 0; count < list.size(); count++){
            System.out.println(list.get(count));
        }

        removeColors(list, removeList);
        System.out.printf("%n%nArrayList after calling removeColors:%n");
        for (String iterateList : list){
            System.out.println(iterateList);
        }        
    }

    //remove colors specified in collection2 from collection1
    private static void removeColors(Collection<String> collection1, Collection<String> collection2){
        //get iterator
        Iterator<String> iterator = collection1.iterator();
        while(iterator.hasNext()){
            if (collection2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
