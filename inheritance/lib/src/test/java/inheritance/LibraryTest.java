/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testRestaurant1()
    {
        ArrayList<Review> emptyReview = new ArrayList<>();
        Restaurant sut = new Restaurant("Tammy's Diner", 10.0, emptyReview);
        String actual = sut.toString();
        String expected ="Restaurant{" +
                "name='" + "Tammy's Diner" + '\'' +
                ", price=" + 10.0 +
                ", Review: " + emptyReview +
                '}';
        assertEquals(expected, actual);
    }
// a restaurant HAS A review => CS word for relationships
    @Test
    void testReview()
    {
        Review sut = new Review("Best Restaurant Ever!!", "Ben Button", 3.5 );
        String actual = sut.toString();
        String expected = "Review{" +
                "body='" + "Best Restaurant Ever!!" + '\'' +
                ", author='" + "Ben Button" + '\'' +
                ", numberOfStars=" + 3.5 +
                '}';
        assertEquals(expected, actual);
    }

    @Test
    void testReviewsForRestaurants()
    {
        Review aReview = new Review("Gross! Flies everywhere. Smelled like roaches", "Tiffany H.", 1);
        ArrayList<Review> myReviews = new ArrayList<>();
        myReviews.add(aReview);
        Restaurant sut = new Restaurant("Sisi's Lounge", 3.5, myReviews);

        assertEquals("Restaurant{name='Sisi's Lounge', price=3.5, Review: [Review{body='Gross! Flies everywhere. Smelled like roaches', author='Tiffany H.', numberOfStars=1.0}]}", sut.toString());

        sut.addReview(new Review("Gross! Flies everywhere. Smelled like roaches", "Tiffany H.", 1));
    }

    @Test
    void testShop()
    {
        ArrayList<Review> emptyReview = new ArrayList<>();
        Shop sut = new Shop("Sweat Shop", "Working kids like no other",  4.5, emptyReview);
        String actual = sut.toString();
        String expected ="Shop{" +
                "name='" + "Sweat Shop" + '\'' +
                ", description='" + "Working kids like no other" + '\'' +
                ", price=" + 4.5 +
                ", Review=" + emptyReview +
                '}';
        assertEquals(expected, actual);
    }

    @Test
    void testTheater()
    {
        ArrayList<String> films = new ArrayList<>();
        films.add("Dracula");
        Review review = new Review("What should I put?", "Me, Myself, I", 3.0);
        ArrayList<Review> emptyReview = new ArrayList<>();
        emptyReview.add(review);
        Theater sut = new Theater("Flicks", films, emptyReview);
        String actual = sut.toString();
        String expected = "Theater{name='Flicks', featuredFilms=[Dracula], Review=[Review{body='What should I put?', author='Me, Myself, I', numberOfStars=3.0}]}";

        assertEquals(actual, expected);
    }



}
