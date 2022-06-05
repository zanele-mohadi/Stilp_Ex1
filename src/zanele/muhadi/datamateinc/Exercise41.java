package zanele.muhadi.datamateinc;

import java.util.ArrayList;

public class Exercise41 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Thato");
        al.add("Radha");
        al.add("Rambuda");
        al.add("Mark");
        al.add("Keletso");
        al.add("Tata");
        al.add("Nkosi");

        // 4.1.a
        System.out.println("Displaying  List  for 4.1.a");
        System.out.println("=============================");
        displayList(al);
        System.out.println("");


        // 4.1.b
        removeItem(al , "Mark");

        System.out.println("Displaying  List  for 4.1.b");
        System.out.println("=============================");
        displayList(al);
        System.out.println("");


        System.out.println("Displaying  List  for 4.1.c");
        System.out.println("=============================");

        al.add(1,"Jacobs");
        displayList(al);
        System.out.println("");
        System.out.println("Displaying  List  for 4.1.d");
        System.out.println("=============================");

        removeItemAtIndex(al,3);
        displayList(al);








    }
    public static void displayList(ArrayList<String> al ) {

        al.forEach(name->System.out.println(name));
    }

    public static void  removeItem(ArrayList<String> al,String personToRemove){
        al.removeIf(person->(person == personToRemove));
    }

    public static void  removeItemAtIndex(ArrayList<String> al,int i){
        al.remove(i);

    }
}
