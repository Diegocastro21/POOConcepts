package Laboratorios;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pinky", 14);

        //c1.setName("Pinky");
        //c1.setSize("S");


        System.out.println("Min Price: "+Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt",10.5,"S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf",5.0,"S"), new Clothing("Blue T-Shirt",10.5,"S")};

        int measurement = 8;

        c1.addItems(items);

//        c1.setSize(measurement);
        System.out.println("Customer is: "+c1.getName() + ","+c1.getName()+","+c1.getSize()+","+ c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {
//            System.out.println("Items : "+ item.getDescription());
            System.out.println("Item output: "+item);
        }

        int average = 0;
        int count = 0;


        for (Clothing item : c1.getItems()){
            if(item.getSize().equals("L")){
                count++;
                average += item.getPrice();
            }
        }

        try{
            average = (count == 0) ? 0 : average/count;
            average = average / count;
            System.out.println("Average price: "+average+ ", Cont: "+count);
        }catch (ArithmeticException e){
            System.out.println("Dont divide by zero");
        }


        Arrays.sort(c1.getItems());
        System.out.println("________________    Ordenado    __________________");

        for (Clothing item : c1.getItems()) {

            System.out.println("Item output: "+item);
        }

    }
}
