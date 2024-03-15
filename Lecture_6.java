public class Lecture_6 {
    public static void main(String args[]){
        int a=Character.getNumericValue('Z');
        int y=10;
        System.out.println("A is: " + a);
        char c='a';
        int x=c;
        System.out.println(x);
        int z=x+y;
        // + -> operator
        // x,y -> operands
        //Increment & Decrement Operators
        int m=5;
        int n=m++; //assign the value of m to n and then increase value of m wherever it was defined
        // Think of this as:
        // 1. int n = ;
        // 2. m-m+1;
        System.out.println("M is: "+m);
        System.out.println(n);
    }
}
