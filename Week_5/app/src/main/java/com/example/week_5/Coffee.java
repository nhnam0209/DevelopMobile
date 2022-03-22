package com.example.week_5;
import java.util.ArrayList;
import java.util.List;

public class Coffee {
    private String coffeeName;
    private int Pic;
    private String Price;

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public static List<Coffee> init(){
        String[] coffee = {"Cà Phê Đen", "Cà Phê Sữa", "Cappuccino", "Latte", "Americano"};
        String[] prices = {"15.000", "17.000", "28.000", "28.000", "27.000"};
        int[] pics = {R.drawable.blackcoffee, R.drawable.whitecoffee, R.drawable.capuchino, R.drawable.latte, R.drawable.americano};
        Coffee c;
        List<Coffee> lstCoffee = new ArrayList<>();
        for(int i = 0; i < coffee.length; i++){
            c = new Coffee();
            c.setPic(pics[i]); c.setCoffeeName(coffee[i]); c.setPrice(prices[i]);
            lstCoffee.add(c);

        }
        return lstCoffee;
    }
}
