package TUTORIAL;

public class Car4 {
    private final String model;
    private String color;
    private int price;

    Car4(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

//    void setModel(String model) {
//        this.model = model;
//    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if(price < 0){
            System.out.println("Price can't be less than zero");
        }else{
            this.price = price;
        }
    }

}
