package week5;

public class Ex93 {
    public static class Main {
        public static void main(String[] args) {
            // write test code here
            Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
            Person steve = new Person("Steve");

            System.out.println( pekka );
            System.out.println( steve );
        }
    }
}
