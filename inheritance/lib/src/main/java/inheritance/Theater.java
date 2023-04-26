package inheritance;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class Theater extends ReviewParent{
    private String name;
    private ArrayList<String> featuredFilms;
//    private ArrayList<Review> theaterReview;

    public Theater(String name, ArrayList<String> featuredFilms, ArrayList<Review> theaterReview)
    {
        super(theaterReview);
        this.name = name;
        this.featuredFilms = featuredFilms;
//        this.theaterReview = theaterReview;
    }

    public void addMovie(String movie)
    {
        if(movie != null){
        if(featuredFilms == null) {
            featuredFilms = new ArrayList<>();
        }
        featuredFilms.add(movie);
        }
    }

    public boolean removeMovie(String movie)
    {
        if(movie == null){
            return false;
        }
        if (featuredFilms != null){
            return featuredFilms.remove(movie);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFeaturedFilms() {
        return featuredFilms;
    }

    public void setFeaturedFilms(ArrayList<String> featuredFilms) {
        this.featuredFilms = featuredFilms;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", featuredFilms=" + featuredFilms.toString() +
                ", Review=" + allReviews.toString() +
                "}";
    }
}
