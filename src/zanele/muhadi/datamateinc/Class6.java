package zanele.muhadi.datamateinc;

public class Class6 {
    public static String str1 = "I don't like programing";
    public static String str2 = "its better to go home";

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
    }

    public  static void a(){
        System.out.println("The  first occurrence of K is at  index  : "+str1.indexOf('k'));
    }

    public  static void b(){
        System.out.println("The  index of letter 'g' : "+str1.indexOf('g'));
    }

    public  static void c(){
        System.out.println(str1.concat(" ").concat(str2));
    }

    public  static void d(){
        // better  starts  on  index 3  in and  ends  in  position 10
        System.out.println(str2.substring(4,10));
    }

    public  static void e(){
        System.out.println("'"+str2 +"'"+ " in upper case is  : "+ "'"+str2.toUpperCase()+"'");
    }

    public  static void f(){
        System.out.println("The  first occurrence of the beginning  of the  word programming is  : "+str1.indexOf('p'));
    }

}
