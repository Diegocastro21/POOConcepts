package generics;

public class GenericsLearn {
    public static void main(String[] args) {


        Integer[] intArray = {1, 2, 3 ,4 ,5, 6, 7, 8, 9, 0};
        Double[] doubleArray = {1.0, 2.2, 3.3, 4.3, 5.9, 9.1, 1.2};
        Character[] charArray = {'H','O','L','A'};
        String[] stringArray = {"Aprendiendo ", "a ", "usar ", "los ", "generics"};
        Boolean[] booleanArray = {true, true, false, true , true , true , false , false, false};


        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        displayArray(booleanArray);

    }

    public static <Thing> void displayArray(Thing[] array){
        for (Thing x: array) {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}
