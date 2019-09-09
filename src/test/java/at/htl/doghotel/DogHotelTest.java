package at.htl.doghotel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.lang.reflect.Method;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * https://futalis.de/hunderatgeber/hunderassen
 */
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class DogHotelTest {

    private static DogBreed affenpinscher;
    private static DogBreed havaneser;
    private static DogBreed basenji;
    private static DogBreed dobermann;
    private static DogBreed ridgeback;

    @BeforeAll
    static void init() {
        affenpinscher = new DogBreed("Affenpinscher", 30);
        havaneser = new DogBreed("Havaneser", 27);
        basenji = new DogBreed("Basenji", 43);
        dobermann = new DogBreed("Dobermann", 72);
        ridgeback = new DogBreed("Rhodesian Ridgeback", 69);
    }

    @Test
    void t01AddDog() {

        DogHotel dogHotel = new DogHotel();
        dogHotel.addDog(new Dog("Bello", 27, affenpinscher));
        assertThat(dogHotel.getDogList().size(), is(1));
        assertThat(dogHotel.getDogList().get(0).getName(), is("Bello"));
    }

    @Test
    void t04ToString() {
        DogHotel dogHotel = new DogHotel();
        dogHotel.addDog(new Dog("Tino", 63, ridgeback));

        assertThat(dogHotel.getDogList().get(0).toString(), is("Tino (Rhodesian Ridgeback)"));
    }

    @Test
    void t05importCsvFile() {
        DogHotel dogHotel = new DogHotel();
        dogHotel.importCsvFile(DogHotel.FILE_NAME);

        System.out.println(dogHotel.getDogBreedList());
        System.out.println(dogHotel.getDogList());

        assertThat(dogHotel.getDogBreedList().size(), is(6));
        assertThat(dogHotel.getDogList().size(), is(4));
    }

    @Test
    void t06countLinesWhenImportingCsvFile() {
        DogHotel dogHotel = new DogHotel();
        int noOfLines = dogHotel.importCsvFile(DogHotel.FILE_NAME);

        assertThat(noOfLines, is(9));
    }
}