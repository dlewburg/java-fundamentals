package inheritance;

import java.util.ArrayList;

public class Shop extends ReviewParent{
    private String name;
    private String description;
    private double price;

    private ArrayList<Review> shopReview;


//    public Shop(String name, String description, double numOfDollarSigns) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//    }

    public Shop(String name, String description, double price, ArrayList<Review> shopReview)
    {
        super(shopReview);
        this.name = name;
        this.description = description;
        this.price = price;
//        this.shopReview = shopReview;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", Review=" + allReviews.toString() +
                "}";
    }
}
