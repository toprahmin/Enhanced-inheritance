import org.junit.Test;
import io.zipcoder.pets.Pets;
import org.junit.*;
/**
 * Created by rahmirford on 5/1/17.
 */
public class TestPets {
    Pets pet;

    @Before
    public void setUp() {
        pet = new Pets();
    }

    @Test
    public void TestSpeak(){
        //: Given
        String phrase = "Hello human";
        String expectedPhrase = "Hello human";
        //: When
        String actualPhrase = Pets.speak();
        //: Then
        Assert.assertEquals("The expected out put is Hello Human.", actualPhrase,expectedPhrase);
    }

    @Test
    public void Test getName(){
        //: Given
        String name = "george" ;
        String expectedName = "george";
        //: When
        String actualName
        //: Then
    }
}
