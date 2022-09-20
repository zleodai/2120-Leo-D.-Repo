import source.HighArray;

class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(88);
        arr.insert(88);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 35;
        if(arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't Find " + searchKey);

            
        System.out.println(" \n \n \n Test case #1");
        arr.getMax();
        arr.display();
        arr.noDups();
        arr.display();


        arr.delete(99);
        arr.insert(22);
        arr.insert(11);
        arr.delete(0);
        arr.delete(0);
        arr.delete(0);
        arr.delete(0);
        arr.insert(36);
        arr.insert(89);

        System.out.println(" \n \n \n Test case #2");
        arr.getMax();
        arr.display();
        arr.noDups();
        arr.display();


        arr.delete(0);
        arr.delete(0);
        arr.insert(11);
        arr.insert(77);
        arr.insert(33);
        arr.insert(90);

        System.out.println(" \n \n \n Test case #3");
        arr.getMax();
        arr.display();
        arr.noDups();
        arr.display();

        
        arr.delete(0);
        arr.delete(0);
        arr.delete(0);
        arr.insert(40);

        System.out.println(" \n \n \n Test case #4");
        arr.getMax();
        arr.display();
        arr.noDups();
        arr.display();


        arr.insert(100);
        arr.insert(77);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(66);
        arr.insert(33);
        arr.insert(36);
        arr.insert(89);
        arr.insert(90);
        arr.insert(40);

        System.out.println(" \n \n \n Test case #5");
        arr.getMax();
        arr.display();
        arr.noDups();
        arr.display();
    }
}

