package inheritance;

import java.util.ArrayList;

public class Restaurant extends ReviewParent{
    private String name;
    private double numberOfStars;
    private double price;
    private ArrayList<Review> myReviews;

//    public Restaurant(String name, double price) {
//        this.name = name;
//        this.price = price;
//        this.numberOfStars = 0;
//    }

    //trying to overload but it is not working
    public Restaurant(String name, double price, ArrayList<Review> myReviews) {
        super(myReviews);
        this.name = name;
//        this.numberOfStars = numberOfStars;
        this.price = price;
//        this.myReviews = myReviews;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        this.numberOfStars = numberOfStars;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public ArrayList<Review> getMyReviews() {
        return myReviews;
    }

    public void setMyReviews(ArrayList<Review> myReviews) {
        this.myReviews = myReviews;
    }

    public void addReview(Review review) {
        if(myReviews == null){
            myReviews = new ArrayList<>();
        }
        myReviews.add(review);
    }
    @Override
    public String toString()
    {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Review: " + allReviews.toString() +
                "}";
    }
}
