import source.HashTable;

class HashTableTester {
    public static void main(String[] args) {
        HashTable testTable = new HashTable(10);

        int hash1 = testTable.insert("Hiiii");
        int hash2 = testTable.insert("hinumbatwoo");
        int hash3 = testTable.insert("hinumbathreee");
        int hash4 = testTable.insert("fuckdafour");
        int hash5 = testTable.insert("fiveisbest");
        int hash6 = testTable.insert("sixmid");
        int hash7 = testTable.insert("seveneleven");
        int hash8 = testTable.insert("luckyeight");
        int hash9 = testTable.insert("wow wowowow wo wo");
        int hash10 = testTable.insert("ten is the best not five");

        testTable.printContents();

        System.out.println("\n\n\n Printing all Strings via hash values:");
        System.out.print(testTable.getString(hash1) + "   ");
        System.out.print(testTable.getString(hash2) + "   ");
        System.out.print(testTable.getString(hash3) + "   ");
        System.out.print(testTable.getString(hash4) + "   ");
        System.out.print(testTable.getString(hash5) + "   ");
        System.out.print(testTable.getString(hash6) + "   ");
        System.out.print(testTable.getString(hash7) + "   ");
        System.out.print(testTable.getString(hash8) + "   ");
        System.out.print(testTable.getString(hash9) + "   ");
        System.out.print(testTable.getString(hash10) + "   ");

        System.out.println("\n\n\nHash is working !!");
    }
}
