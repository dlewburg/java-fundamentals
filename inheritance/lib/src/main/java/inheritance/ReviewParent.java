package inheritance;

import java.util.ArrayList;

public class ReviewParent {
    protected ArrayList<Review> allReviews;

    protected ReviewParent(ArrayList<Review> allReviews) {
        this.allReviews = allReviews;
    }

    @Override
    public String toString() {
        return "ReviewParent{" +
                "allReviews=" + allReviews.toString() +
                '}';
    }
}
