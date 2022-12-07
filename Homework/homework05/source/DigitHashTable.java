package source;

public class DigitHashTable {
    private long[] hashArray;
    private int maxSize;

    public DigitHashTable(int sizeConstraint) {
        maxSize = sizeConstraint;
        hashArray = new long[maxSize];
    }

    public int insert(long digitValue) {
        int index = hash(digitValue);
        hashArray[index] = digitValue;

        return index;
    }

    public int hash(long digitValue) {
        int hashValue = 0;
        double digitDouble = digitValue;
        int digitSize = (int) Math.floor(Math.log10(digitDouble)) + 1;

        for (int i = 0; i < digitSize + 3; i += 3) {
            long digitPart = digitValue / (10 ^ i);
            digitPart %= 10 ^ (i + 3);

            digitPart += 1;

            hashValue += digitPart;
            System.out.println("Digit Size: " + digitSize + " Digit Value:" + digitValue + " Digit Part:" + digitPart
                    + " Hash Value:" + hashValue);
        }

        hashValue %= maxSize;

        if (hashArray[hashValue] == 0) {
            return hashValue;
        }

        while (hashArray[hashValue] != 0 && hashArray[hashValue] != digitValue) {
            hashValue++;

            if (hashValue > maxSize - 1) {
                hashValue = 0;
            }
        }

        return hashValue;
    }

    public long getValue(int hashValue) {
        return hashArray[hashValue];
    }

    public void printContents() {
        int iterator = 0;
        System.out.print("\n\n Hash Table Contents: \n");
        while (iterator < maxSize) {
            if (hashArray[iterator] != 0)
                System.out.print(hashArray[iterator] + "   ");

            iterator++;
        }
    }
}
