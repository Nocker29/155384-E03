package Z2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class zad2 {
    public static<T> void usun(LinkedHashSet<T> hashSet)
    {
        Iterator<T> iter1 = hashSet.iterator();
        Iterator<T> iter2 = hashSet.iterator();
        int x = 0;
        while(iter1.hasNext())
        {
            x++;
            iter1.next();
        }
        int i = 0;
        while(i < x - 1)
        {
            if(i == x)
            {
                iter2.remove();
            }
            iter2.next();
            i++;
        }

        iter2.remove();
    }

    public static void main(String[] args) {
        LinkedHashSet<Double> hashSet1 = new LinkedHashSet<>();
        hashSet1.add(7.23);
        hashSet1.add(15.5);
        hashSet1.add(10.2);
        hashSet1.add(15.62);
        usun(hashSet1);
        System.out.println(hashSet1);

        LinkedHashSet<String> hashSet2 = new LinkedHashSet<>();
        hashSet2.add("Test");
        hashSet2.add("Hash");
        hashSet2.add("Setu");
        hashSet2.add("Egzamin");
        usun(hashSet2);
        System.out.println(hashSet2);

        LinkedHashSet<Double> hashSet3 = new LinkedHashSet<>();
        hashSet3.add(2.10);
        hashSet3.add(273.21);
        hashSet3.add(32.1);
        hashSet3.add(75.21);
        usun(hashSet3);
        System.out.println(hashSet3);
    }
}
