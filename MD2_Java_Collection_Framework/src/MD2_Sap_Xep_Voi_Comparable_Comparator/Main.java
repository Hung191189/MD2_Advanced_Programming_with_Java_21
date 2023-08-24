package MD2_Sap_Xep_Voi_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Collections.sort(studentList);
        for(Student st : studentList){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        studentList.sort(ageComparator);
        System.out.println("..................");
        for(Student st : studentList){
            System.out.println(st.toString());
        }
    }
}
