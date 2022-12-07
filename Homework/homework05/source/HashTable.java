package source;

public class HashTable {
    private String[] hashArray;
    private int maxSize;

    public HashTable(int sizeConstraint) {
        maxSize = sizeConstraint;
        hashArray = new String[maxSize];
    }

    public int insert(String stringValue) {
        int index = hash(stringValue);
        hashArray[index] = stringValue;

        return index;
    }

    public int hash(String stringValue) {
        int hashValue = 0;
        char[] stringArray = stringValue.toLowerCase().toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            hashValue += stringArray[i];
        }

        hashValue %= maxSize;

        if (hashArray[hashValue] == null) {
            return hashValue;
        }

        while (hashArray[hashValue] != null && !(hashArray[hashValue].equals(stringValue))) {
            hashValue++;

            if (hashValue > maxSize - 1) {
                hashValue = 0;
            }
        }

        return hashValue;
    }

    public String getString(int hashValue) {
        if (hashArray[hashValue] == null)
            return "Empty";
        return hashArray[hashValue];
    }

    public void printContents() {
        int iterator = 0;
        System.out.print("\n\n Hash Table Contents: \n");
        while (iterator < maxSize) {
            if (hashArray[iterator] == null)
                System.out.print("0   ");
            else
                System.out.print(hashArray[iterator] + "   ");

            iterator++;
        }
    }
}
