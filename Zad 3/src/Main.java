public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.addgrade(3);
        student1.addgrade(3.5);
        student1.addgrade(2);
        System.out.println("Średnia studenta wynosi: " + student1.srednia());

        studentgroup grupa1 = new studentgroup();
        grupa1.addtogroup("s12121");
        grupa1.addtogroup("s23232");
        grupa1.addtogroup("s34343");
        System.out.println(grupa1.sklad);
    }
}