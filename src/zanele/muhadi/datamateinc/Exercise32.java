package zanele.muhadi.datamateinc;


import java.io.*;

public class Exercise32 {
    public static void main(String[] args) throws IOException {
        String fileName ="Test1.txt";

        String s1 = "Never eat silk worms\n";
        String s2 = "Every dog has its own day\n";
        String s3 = "Experience is the teacher of all things";

        FileWriter f1 = new FileWriter(fileName);
        BufferedWriter f2 = new BufferedWriter(f1);

        f2.write(s1);
        f2.write(s2);
        f2.write(s3);

        f2.close();

        FileReader f3 = new FileReader(fileName);
        BufferedReader f4 = new BufferedReader(f3);

        String result = "something";

        while((result = f4.readLine())!=null){
            System.out.println(result);
        }
        f4.close();




    }
}
