import source.DigitHashTable;

class DigitHashTableTester {
    public static void main(String[] args) {
        DigitHashTable testTable = new DigitHashTable(100);

        int hash1 = testTable.insert(4312122);
        int hash2 = testTable.insert(321412344);
        int hash3 = testTable.insert(75312645);
        int hash4 = testTable.insert(1);
        int hash5 = testTable.insert(14);
        int hash6 = testTable.insert(754);
        int hash7 = testTable.insert(6954);
        int hash8 = testTable.insert(3892190);
        int hash9 = testTable.insert(3215923);
        int hash10 = testTable.insert(34);

        testTable.printContents();

        System.out.println("\n\n\n Printing all Strings via hash values:");
        System.out.print(testTable.getValue(hash1) + "   ");
        System.out.print(testTable.getValue(hash2) + "   ");
        System.out.print(testTable.getValue(hash3) + "   ");
        System.out.print(testTable.getValue(hash4) + "   ");
        System.out.print(testTable.getValue(hash5) + "   ");
        System.out.print(testTable.getValue(hash6) + "   ");
        System.out.print(testTable.getValue(hash7) + "   ");
        System.out.print(testTable.getValue(hash8) + "   ");
        System.out.print(testTable.getValue(hash9) + "   ");
        System.out.print(testTable.getValue(hash10) + "   ");

        System.out.println("\n\n\nHash is working using digit folding !!!");
    }
}
