package Z1;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class zad1 {
    public static<T> void redukuj(LinkedList<T> linkedList, int n)
    {
        int tmp = 0;
        Iterator<T> iter = linkedList.iterator();
        while(iter.hasNext())
        {
            if(tmp == n)
            {
                iter.remove();
                tmp -= n;
            }
            else
            {
                iter.next();
                tmp++;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        lista1.add(6);
        redukuj(lista1,2);
        System.out.println(lista1);

        LinkedList<LocalTime> lista2 = new LinkedList<>();
        lista2.add(LocalTime.of(1,1));
        lista2.add(LocalTime.of(2,2));
        lista2.add(LocalTime.of(3,3));
        lista2.add(LocalTime.of(4,4));
        lista2.add(LocalTime.of(5,5));
        lista2.add(LocalTime.of(6,6));
        redukuj(lista2, 2);
        System.out.println(lista2);
    }
}
