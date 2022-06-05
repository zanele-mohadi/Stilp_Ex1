package zanele.muhadi.datamateinc;

import java.util.Hashtable;

public class Exercise42 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"Thato");
        ht.put(2,"Radha");
        ht.put(3,"Rambuda");
        ht.put(4,"Mark");
        ht.put(5,"Keletso");
        ht.put(6,"Tata");
        ht.put(7,"Nkosi");

        // 4.2.a
        System.out.println("Displaying  List  for 4.2.a");
        System.out.println("=============================");
        displayList(ht);
        System.out.println("");

        // 4.2.a
        System.out.println("Displaying  List  for 4.2.b");
        System.out.println("=============================");
        removeByKey(ht,4);
        displayList(ht);
        System.out.println("");

        // 4.2.c
        System.out.println("Displaying  List  for 4.2.c");
        System.out.println("=============================");
        addValueAtIndex(ht,2,"Jacobs");
        displayList(ht);
        System.out.println("");

        // 4.2.c
        System.out.println("Displaying  List  for 4.2.d");
        System.out.println("=============================");
        removeByKey(ht,4);
        displayList(ht);
        System.out.println("");


    }
    public static void displayList(Hashtable<Integer,String> ht ){
        ht.forEach((id,name)->{
            System.out.println(name);
        });
    }

    public static void removeByKey(Hashtable<Integer,String> ht,int id ){
        ht.remove(id);
    }

    public static void addValueAtIndex(Hashtable<Integer,String> ht,int i ,String value){
        ht.put(i,value);
    }
}
