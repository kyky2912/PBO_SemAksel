import java.util.Scanner;

/*
Nama: Nicky
Kelas: 18TI2
NIM: 03082180028

Penambahan =
*Tranlasi Inggris -> Bahasa Indonesia
*init data 
*exception

*/

public class InventoryTask {

    public static void MainMenuDisplay() {
        System.out.println("------------------------------------------");
        System.out.println("-------Selamat Datang di GrabMartKW-------");
        System.out.println("------------------------------------------");
        System.out.println("Seluruh Harga yang tertera dalam Kurs Euro");
        System.out.println("------------------------------------------");
        System.out.println("Layanan yang disediakan:");
        System.out.println("1.Tambah Barang" + "\n" + "2.Tambah Order" + "\n" + "3.Tampilkan Barang" + "\n" + "4.Tampilkan Order" 
        + "\n" + "5.Tampilkan Seluruh Data" + "\n" + "6.Keluar");
    }

    public static void displayINV() {
        System.out.println("Tambahkan item: " + "\n" + "1.Baju" + "\n" + "2.Kosmetik" + "\n" + "3.Alat Elektronik");
    }

    public static void displayAddInv() {
        System.out.println("Add to your cart" + "\n" + "[");

    }
    public static void main(String[] args) {    
        Inventory inv = new Inventory();
        String product;
        int qtty;
        double pricee;
        Item initclothes = new Clothes("Adidas", 78, 70);
        Item initclothes1 = new Clothes("ADLV", 37, 114);
        Item initclothes2 = new Clothes("Armani Exchange", 50, 169);
        Item initclothes3 = new Clothes("BLVG", 32, 179);
        Item initclothes4 = new Clothes("Burberry", 19, 300);
        Item initcosmetic = new Cosmetics("A'pieu", 25, 135);
        Item initcosmetic1   = new Cosmetics("Clinique", 65, 78);
        Item initcosmetic2 = new Cosmetics("Estee Lauder", 45, 55);
        Item initcosmetic3 = new Cosmetics("Nivea", 44, 39);
        Item initcosmetic4 = new Cosmetics("Loreal", 3, 70);
        Item initelectronic = new Electronics("Apple", 124, 699);
        Item initelectronic1   = new Electronics("Huawei", 82, 469);
        Item initelectronic2 = new Electronics("Toshiba", 65, 159);
        Item initelectronic3 = new Electronics("Samsung", 84, 559);
        Item initelectronic4 = new Electronics("Xiaomi", 13, 390);
        inv.addToInventory(initclothes);
        inv.addToInventory(initclothes1);
        inv.addToInventory(initclothes2);
        inv.addToInventory(initclothes3);
        inv.addToInventory(initclothes4);
        inv.addToInventory(initcosmetic);
        inv.addToInventory(initcosmetic1);
        inv.addToInventory(initcosmetic2);
        inv.addToInventory(initcosmetic3);
        inv.addToInventory(initcosmetic4);
        inv.addToInventory(initelectronic);
        inv.addToInventory(initelectronic1);
        inv.addToInventory(initelectronic2);
        inv.addToInventory(initelectronic3);
        inv.addToInventory(initelectronic4);

        while (true) {
            try{
            MainMenuDisplay();
            Scanner input = new Scanner(System.in);
            int mainmenu = input.nextInt();
            switch (mainmenu) {
                case 1:
                    displayINV();
                    int anyInput = input.nextInt();
                    switch (anyInput) {
                        case 1:
                            System.out.println("---Clothes---");
                            System.out.print("Enter Name:");
                            String name = input.next();
                            input.hasNextLine();
                            System.out.print("Enter quantity: ");
                            int qty = input.nextInt();
                            System.out.print("Enter Price per Unit: ");
                            double price = input.nextDouble();
                            Item clothes = new Clothes(name, qty, price);
                            inv.addToInventory(clothes);
                            break;
                        case 2:
                            System.out.println("---Cosmetics---");
                            System.out.print("Enter Name:");
                            String name2 = input.next();
                            input.hasNextLine();
                            System.out.print("Enter quantity: ");
                            int qty2 = input.nextInt();
                            System.out.print("Enter Price per Unit: ");
                            double price2 = input.nextDouble();
                            Item cosmetic = new Cosmetics(name2, qty2, price2);
                            inv.addToInventory(cosmetic);
                            break;
                        case 3:
                            System.out.println("---Electronics---");
                            System.out.print("Enter Name:");
                            String name3 = input.next();
                            input.hasNextLine();
                            System.out.print("Enter quantity: ");
                            int qty3 = input.nextInt();
                            System.out.print("Enter Price per Unit: ");
                            double price3 = input.nextDouble();
                            Item electonic = new Electronics(name3, qty3, price3);
                            inv.addToInventory(electonic);
                            break;
                    }
                break;
                case 2:
                    Order order = new Order();
                    System.out.println("You can choose the items from following list: ");
                    System.out.println(inv.items.toString());
                    boolean bool = true;
                    while (bool) {
                        input.nextLine();
                        System.out.println("Please enter name: ");
                        String name = input.nextLine();
                        boolean Boolean = true;
                        for (int s = 0; s < inv.items.size(); s++) {
                            if (inv.items.get(s).name.equalsIgnoreCase(name)) {
                                Boolean = false;
                                System.out.println("Please enter quantity: ");
                                order.addItem(inv.items.get(s), input.nextInt());
                                break;
                            }
                        }
                        if(Boolean)System.out.println("No item with such name found!");
                        System.out.println("Press 1 to add something else \nPress 2 to complete order");
                        if (input.nextInt() == 2) {
                            System.out.println("Order Added");
                            System.out.println(order.toString());
                            bool = false;
                        }
                    }
                    inv.addOrders(order);

                    break;
                        case 3:
                    System.out.println(inv.getInventory());
                    break;
                        case 4:
                        System.out.println(inv.orders.toString());
                        break;
                        case 5:
                    System.out.println("----------------------------INVENTORY---------------------------- \n");
                    System.out.println(inv.toString());
                    System.out.println("\n----------------------------ORDERS----------------------------\n");
                    System.out.println(inv.orders.toString());
                    break;

                case 6:
                    System.out.println("Thank you for using our service :) !" + "\n" + "BYE!");
                    System.exit(0);
            }
        
            }
            catch (Exception e) {
                System.out.println("Something went wrong!!! (TT.TT)");
        }
    }

}
}