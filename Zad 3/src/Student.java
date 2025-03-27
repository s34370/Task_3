import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.List;

    public class Student {
        public String fname;
        public String iname;
        public String indexnumber;
        public String email;
        public String address;
        public List<Double> grades = new ArrayList<Double>();


        public double srednia(){
            if(grades.size()==0) {
                throw new RuntimeException("Student nie ma ocen!");
            }
            double suma=0;
            for (int i = 0; i < grades.size(); i++){
                suma+=grades.get(i);
            }
            double avg = suma/grades.size();
            avg = round(avg*2);
            return avg/2;
        }

        public void addgrade(double grade){
            if(grades.size()>20) {
                throw new RuntimeException("Student nie może mieć więcej niż 20 ocen!");
            }
            grades.add(grade);
        }

    }
