package at.htl.doghotel;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DogHotel {

    static final String FILE_NAME = "dogs.csv";
    static final Charset ENCODING = StandardCharsets.UTF_8;


    /**
     * Der Liste dogGuests wird ein Element hinzugefügt
     * @param dog
     */
    public void addDog(Dog dog) {

    }

    /**
     * Der Liste dogBreeds wird ein element hinzugefügt
     * @param dogBreed
     */
    public void addBreed(DogBreed dogBreed) {

    }

    /**
     *
     * @return Eine unveränderliche Liste der Hundegäste wird zurückgegeben
     */
    public List<Dog> getDogList() {
        return null;
    }

    /**
     *
     * @return Eine unveränderliche Liste der Hunderassen wird zurückgegeben
     */
    public List<DogBreed> getDogBreedList() {
        return null;
    }

    /**
     *
     * @param name  Bezeichnung der Hunderasse
     * @return In der Liste dogBreeds wird das Element zurückgegeben, welches die Bezeichnung hat
     *
     * Wird keine Hunderasse gefunden, wird 'null' zurückgegeben
     */
    public DogBreed searchDogBreedByName(String name) {
        return null;
    }

    /**
     *
     * Hunde und Hunderassen werden importiert. Falls eine Hunderasse noch nicht in der Liste dogBreeds
     * existiert, wird eine neue Hunderasse mit der Bezeichnung angelegt (height = -1)
     *
     * @param fileName Name des Files, welches importiert wird
     * @return die Anzahl der eingelesenen Zeilen werden zurückgegeben
     */
    public int importCsvFile(String fileName) {

        return -1;
    }
}
