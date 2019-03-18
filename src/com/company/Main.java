package com.company;

public class Main {

    public static void main(String[] args) {

        PrivateHouse ph = new PrivateHouse(2f,112,"Voronezh", 2, 150, "Voroshilova");
        Construction c = new Construction("stone",112,"Voronezh", 3, 110, "Voroshilova");
        Flat f = new Flat(10f,112,"Voronezh", 4, 30, "Voroshilova");

        // вызов собственных методов
        System.out.println(ph.getYardSquare());
        System.out.println(c.getMaterial());
        System.out.println(f.getKitchenSquare());

        // наследуется интерфейс родителя Taxable
        System.out.println(ph.returnTax());
        System.out.println(c.returnTax());
        System.out.println(f.returnTax());

        // вызов методов интерфейса Valuable
        System.out.println(ph.returnValue());
        System.out.println(c.returnValue());
        // f.returnValue() не определено

        // вызов методов интерфейса Printable
        ph.print();
        f.print();
        // c.print() не определен
    }
}
