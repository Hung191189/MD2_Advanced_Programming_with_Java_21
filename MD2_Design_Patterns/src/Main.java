public class Main {
    public static void main(String[] args) {
        Person a = new Person("kon");
        Person b = new Person("hoang");
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
    static class Person{
        public String name;
        public Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static void swap(Person a, Person b){
        String temp = a.name;
        a.name = b.name;
        b.name = temp;
    }
}