package Project;
public class NumberToString {
    public static void main(String[] args){
        // Example
        metodo_01(1);
        metodo_02(2);
        metodo_03(3);
    }

    static void metodo_01(int number){
        String string = String.valueOf(number);
        System.out.println(string);
    }

    static void metodo_02(int number){
        String string = Integer.toString(number);
        System.out.println(string);
    }

    static void metodo_03(int number){
        String string = "" + number;
        System.out.println(string);
    }
}
