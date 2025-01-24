package Code;
import java.util.HashMap;

public class Menu {
    HashMap<String, FoodItem> chart;
    Menu(){
        this.chart = new HashMap<>();
    }
    void addItem(String code, FoodItem item){
        this.chart.put(code, item);
    }
    FoodItem getItemViaCode(String code){
        return (chart.containsKey(code)) ?  chart.get(code) : null;
    }
}
