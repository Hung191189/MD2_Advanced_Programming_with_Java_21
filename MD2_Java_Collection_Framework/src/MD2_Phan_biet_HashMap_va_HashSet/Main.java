package MD2_Phan_biet_HashMap_va_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 20, "TN");
        Student student2 = new Student("Long", 19, "HN");
        Student student3 = new Student("Duong", 18, "HP");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("....................");
        for (int i = 1; i <= studentMap.size(); i++) {
            System.out.println(studentMap.get(i));
        }
        System.out.println("...........................");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);
//        for(Student student : studentSet){
//            System.out.println(student.toString());
//        }
        System.out.println(studentSet.toString());
    }
}
