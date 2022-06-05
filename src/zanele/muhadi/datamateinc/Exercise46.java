package zanele.muhadi.datamateinc;

public class Exercise46 {
    public static void main(String[] args) {

        double num1=7;
        double  num2=3.5;


        System.out.println("Implementing the addition: "+num1 +" + "+num2+" = " + addition(num1,num2));
        System.out.println("Implementing the multiplication: "+num1 +" x "+num2+" = " + multiplication(num1,num2));
        System.out.println("Implementing the modulus: "+num1 +" % "+num2+" = " + modulus(num1,num2));
        System.out.println("Implementing the division: "+num1 +" / "+num2+" = " + division(num1,num2));
    }

    public static  double addition(double num1,double num2){
        return  num1+num2;
    }
    public static  double multiplication(double num1,double num2){
        return  num1*num2;
    }

    public static  double modulus(double num1,double num2){
        return  num1%num2;
    }
    public static  double division(double num1,double num2){
        return  num1/num2;
    }


}
