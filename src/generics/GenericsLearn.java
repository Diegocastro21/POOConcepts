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


       /* MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Aprendiendo usar generics en clases");
*/

        /*System.out.println(myInt.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myString.getValue());
        */


        /*
        * Todo lo anterior con las clases se puede hacer
        * usando los generics
        * de esta manera
        * */


        MyGenericClass<Integer> myInt = new    MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new  MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new  MyGenericClass<>("Aprendiendo usar generics en clases");


        /*
        *
        * Tambien se puede usar de manera doble ejemplo:
        * MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 5);
        * pero para esto desde la clase MyGenericClass tenemos que indicarle
        * <Thing, Thing2>
        */
        System.out.println(myInt.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myString.getValue());


    }

    public static <Thing> void displayArray(Thing[] array){
        for (Thing x: array) {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}
