public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }

    public static int findIt(int[] a){
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if(a[i] == a[j]){
                    tmp = a[i];
                    count++;
                }

            }
            if(count % 2 != 0 ){
                return tmp;
            }
            count = 0;

        }
        return tmp;
    }
}
