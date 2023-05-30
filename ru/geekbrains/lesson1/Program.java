package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

    
        Product product1 = new Product();
        product1.brand = "ООО Чистый Источник";
        product1.name = "Бутылка с водой";
        product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        //product2.brand = "ООО Чистый Источник";
        //product2.name = "__";
        //product2.price = -15;
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk
                = new BottleOfMilk("Простоквашино", "Бутылка с молоком #1", -90.15, 1.5, 10);
        System.out.println(bottleOfMilk.displayInfo());

        Product chocolate1 = new Chocolate("RhiterSport", "milk chokolate", 200, 90, 500);
        System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("AlpenGold", "dark chokolate", 175, 100, 700);
        System.out.println(chocolate2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(chocolate1);
        products.add(chocolate2);

    //     VendingMachine vendingMachine = new VendingMachine(products);
    //     BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
    //     if (bottleOfWaterResult != null){
    //         System.out.println("Вы купили:");
    //         System.out.println(bottleOfWaterResult.displayInfo());
    //     }
    //     else {
    //         System.out.println("Такой бутылки с водой нет в автомате.");
    //     }
    // }
        VendingMachine vendingMachine = new VendingMachine(products);
        Chocolate chocolateResult = vendingMachine.getChocolate(90,500);
        if (chocolateResult != null){
            System.out.println("Вы купили:");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }
    }

}
