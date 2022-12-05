package Services;

import book.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SearchServiceTest {

    @InjectMocks
    private BookingService bookingService;
    @Mock
    private SearchService searchService;


    @Test
    public void searchForTitle(){
        Book book = new Book("Verity", "Thriller","Colleen Hoover","2020", "4", 349, false);
        when(searchService.searchTitle("Verity")).thenReturn(book);
        String expected = "Verity";
        String actual = searchService.searchTitle("Verity").getTitle();

        assertEquals(expected, actual);
    }

    @Test
    public void searchByGenre(){
        Book book = new Book("Bambi", "Kids", "Walt Disney", "1942", "4", 79, true);
        when(searchService.searchGenre("Kids")).thenReturn(book);
        String expected ="Bambi";
        String actual = searchService.searchGenre("Kids").getTitle();

        assertEquals(expected,actual);
    }

    @Test
    public void searchByAuthor(){
        Book book = new Book("Harry Potter and the Order of the Phoenix", "Fantasy","J.K. Rowling", "2003", "4.5", 249, true);
        when(searchService.searchAuthor("J.K. Rowling")).thenReturn(book);
        String expected = "Harry Potter and the Order of the Phoenix";
        String actual = searchService.searchAuthor("J.K. Rowling").getTitle();

        assertEquals(expected, actual);
    }

    @Test
    public void searchByDateReleased(){
        Book book = new Book("Harry Potter and the Sorcerer’s Stone","Fantasy", "J.K. Rowling","1997", "5", 199, true);
        when(searchService.searchPublicityDate("1997")).thenReturn(book);
        String expected = "Harry Potter and the Sorcerer’s Stone";
        String actual = searchService.searchPublicityDate("1997").getTitle();

        assertEquals(expected, actual);
    }

    @Test
    public void searchByReview(){
        Book book = new Book("Harry Potter and the Sorcerer’s Stone","Fantasy", "J.K. Rowling","1997", "5", 199, true);
        when(searchService.searchReviews("5")).thenReturn(book);
        String expected = "Harry Potter and the Sorcerer’s Stone";
        String actual = searchService.searchReviews("5").getTitle();

        assertEquals(expected, actual);
    }

}