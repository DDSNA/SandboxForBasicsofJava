package syntax.demo;

class item_inventoryobjectTemplate {
    //fields!
    String type;
    String quantity_type;
    double quantity;
    float price;

    //constructor (needs to include all of the above)
    item_inventoryobjectTemplate(String type, String quantity_type, float price) {
        this.type = type;
        this.quantity_type = quantity_type;
        this.quantity = quantity;
        this.price = price;
    }

    //methods
    float updatepriceValue(float updatedpriceValue) {
        this.price = updatedpriceValue;
        return this.price;
    }

    double updatestockQuantity(double updatedstockQuantity) {
        this.quantity = updatedstockQuantity;
        return  this.quantity;
    }

    //objects

    item_inventoryobjectTemplate faina = new item_inventoryobjectTemplate("aliment de baza", "buc", 15f);
    item_inventoryobjectTemplate cascaval = new item_inventoryobjectTemplate("aliment de baza","kg", 4.11f);
}

public class main {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, this is the test!");
            if (args[0].equals("test")) {
                //loads test params
            } else if (args[0].equals("production")) {
                //loads prod params
                System.out.println("Hello!");
            }
        }
        System.out.print("Hi!");

    }

}

