package Laboratorios;

public class ShopApp {
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("welcome to Duke Choice Shop");

        Customer c1 = new Customer();

        c1.setName("Pinky");
        c1.setSize("S");


        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        int measurement = 4;

        c1.setSize(measurement);



        for (Clothing item: items){
            if(c1.getSize().equals(item.getSize())){
                System.out.println("Item: "+","+ item.getDescription() + ","+ item.getPrice()+","+ item.getSize());
                total = total + total * tax;

                if(total > 15 ){break;}
            }
        }
        System.out.println("total: "+total);




    }
}
