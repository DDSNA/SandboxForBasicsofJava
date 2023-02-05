package syntax.demo;

public class item_inventoryobjectTemplate {
    //fields!
    String type;
    String quantity_type;
    double quantity;
    float price;

    //constructor (needs to include all of the above)
    item_inventoryobjectTemplate(String type, String quantity_type, double quantity, float price) {
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
        return this.quantity;
    }

    //objects
    item_inventoryobjectTemplate faina = new item_inventoryobjectTemplate("aliment de baza", "bucata", 12, 15f);
    item_inventoryobjectTemplate salam = new item_inventoryobjectTemplate("mezeluri", "bucata", 37, 13.5f);
    item_inventoryobjectTemplate cascaval = new item_inventoryobjectTemplate("aliment de baza", "kilogram", 12, 4.11f);
}
