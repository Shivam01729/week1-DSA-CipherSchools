public class Lecture_10{
    int rollno;
    String name;
    static int count = 0;

    Lecture_10(int rollno, String namString) {
        this.rollno = rollno;
        this.name = name;
        count++;
    }

    static void show(){
        // can only be contain static varibles thesee are created becuase to main single
        // refrence  --used to do common task for all objects 
        System.out.println(count);
    }

    public static void main(String[] args) {
        Lecture_10 a = new Lecture_10(1, "sanjay");
        System.out.println(count);
        Lecture_10 b = new Lecture_10(1, "sanjay");
        System.out.println(count);
        Lecture_10 c = new Lecture_10(1, "sanjay");
        System.out.println(Lecture_10.count);
        Lecture_10.show();
    }
}