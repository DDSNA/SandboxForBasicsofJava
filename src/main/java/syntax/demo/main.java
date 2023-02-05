package syntax.demo;
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

        class item_inventoryobjectTemplate {
            //fields!
            String type;
            String quantity_type;
            float price;

            //constructor (needs to include all of the above)
            item_inventoryobjectTemplate(String type, String quantity_type, float price) {
                this.type = type;
                this.quantity_type = quantity_type;
                this.price = price;
            }

            //methods
            float updatepriceValue(float updatedpriceValue) {
                this.price = this.price + updatedpriceValue - this.price;
                return this.price;
            }

            //objects

            item_inventoryobjectTemplate faina = new item_inventoryobjectTemplate("aliment de baza", "buc", 15);

        }
    }

}
