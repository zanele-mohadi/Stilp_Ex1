package zanele.muhadi.datamateinc;

public class Exercise43 {
    public static void main(String[] args) {

        String String1  ="Limpopo is  far away from Gauteng";
        String String2  ="Mpumalanga is  the biggest province in South Africa";
        String sa =  "South Africa";
        int  lastIndexInSouthAfrica  =  String2.lastIndexOf(sa);
        int  i  =  lastIndexInSouthAfrica-sa.length();

        System.out.println("The index  of 'S' in 'South Africa' in String 2 is "+ String2.indexOf("S",i));


// b
        String  testWord  =  "biggest province";
        int  testWordLength  =  "biggest province".length();
        String longerStr =  String2.substring(String2.indexOf("b"));
        String shorterString =  longerStr.substring(0,testWordLength);
        System.out.println(shorterString);

        // c

        int  s1l =  String1.length();
        int  s2l =  String2.length();
        boolean  stringsEqual = (s1l==s2l);
        System.out.println("Is String1 = To String2? "+stringsEqual);

        //  d
        System.out.println("The index  of the  beginning  of the  word  'away'  in String1 is: "+getFirstInstance(String1,"away"));

        // e /// reminder to add descriptions
        System.out.println("The index  of the  last occurrence of the  word 'Limpopo'  in String1 is: "+getFirstInstance(String1,"Limpopo")+"Limpopo".length());







    }

    public static int getFirstInstance(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        if ("".equals(target) || source.equals(target)) {
            return 0;
        }
        int i = 0;
        int last = source.length() - target.length() + 1;
        while (i < last) {
            if (source.charAt(i) == target.charAt(0)) {
                boolean equal = true;
                for (int j = 0; j < target.length() && equal; ++j) {
                    if (source.charAt(i + j) != target.charAt(j)) {
                        equal = false;
                    }
                }
                if (equal) {
                    return i;
                }
            }
            ++i;
        }
        return -1;
    }
}
