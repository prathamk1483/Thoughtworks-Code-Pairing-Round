package Code;

public class Restaurant {
    Menu menu;
    String[] items;
    double threshold;
    double serviceCharge;

    Restaurant(Menu menu,double threshold,double serviceCh){
        this.menu = menu;
        this.threshold = threshold;
        this.serviceCharge = serviceCh;
    }

    void placeOrder(String[] itemCodes){
        for(String isError : itemCodes){
            try{
                double exceptionChecking = Double.parseDouble(isError);
                if(exceptionChecking >= 0 || exceptionChecking < 0){
                    System.out.println("Incorrect Code provided");
                }
            } catch (Exception e) {
                System.out.print("");
            }

        }

        this.items = itemCodes;
    }
    double getBill(){
        double value = 0;
        for(String itemCode:this.items){
            FoodItem item = this.menu.getItemViaCode(itemCode);
            if(item == null){
                System.out.println("Item Not Available in the restaurant");
                return 0;
            }
            value += item.value;
        }
        return value <= this.threshold ? value+serviceCharge : value;
    }
}
