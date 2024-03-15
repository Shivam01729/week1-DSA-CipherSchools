public class Lecture_5 {
    public static void main(String args[]){
        int x=5;
        int y=7;
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);

        byte b=10;
        System.out.println("b is: "+b);

        int i=b;
        System.out.println("i is: "+i);
        
        byte b2 = (byte)129; //Explicit Type Casting or Narrowing or Down-Casting
        System.out.println("82 is: "+ b2);

        byte b3 = (byte)128;
        System.out.println("83 is: "+ b3);
        
        byte b4 = (byte)256;
        System.out.println("84 is: "+ b4);
        
        float f = (float)5.5; //by default considers decimal to be double
        float f2 = 5.5f;
        
        double d = 10.5;
        char ch = 'a';
        System.out.println(ch);
        
        //Task - 1: Different ways to convert character to int.
        
        int z=x+y;
        // + -> operator
        // x,y -> operands
    }
}
