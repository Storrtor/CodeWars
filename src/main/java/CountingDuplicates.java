public class CountingDuplicates {
    public static void main(String[] args) {
//        duplicateCount("abcde");
//        duplicateCount("indivisibility");
        duplicateCount("aabb");



        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');


//        duplicateCount(testThousandA);
//        duplicateCount(testHundredB);
//        duplicateCount(testTenC);
//        duplicateCount(test1CapitalA);
//        duplicateCount(test1d);

        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;

        // duplicateCount(test);
    }


    public static int duplicateCount(String text) {
        int count = 0;
        int countCompare = 0;
        String lowText = text.toLowerCase();
        char[] s = lowText.toCharArray();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if(i != j){
                    if (s[i] == s[j]){
                        count++;
                        if(count > countCompare){
                            countCompare++;
                            count = 0;
                        } else {
                            count = 0;
                        }
                    }
                }
            }
        }
        System.out.println(countCompare);
        return countCompare;
    }
}
