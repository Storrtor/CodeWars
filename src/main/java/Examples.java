public class Examples {
    public static void main(String[] args) {

        int a = 70;
        example(a);

    }


    public static void example(int num){
        if(num > 100) {
            System.out.println("Цифра больше 100");
        } else  if (num > 40){
            System.out.println("Цифра > 40");
        } else {
            System.out.println("Цифра < 40");
        }


    }
}
