import source.ArrayBub;

class oddEvenTester {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);

        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(88);
        arr.insert(33);

        System.out.println("ODD EVEN TESTER !!! \n\n");

        System.out.println("Before sort:\n");
        arr.display(); // display items
        arr.oddEvenSort(); // bubble sort them

        System.out.println("\n\nAfter sort:\n");
        arr.display();
    }
}
