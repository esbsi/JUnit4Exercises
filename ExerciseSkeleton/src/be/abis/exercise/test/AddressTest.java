package be.abis.exercise.test;

import be.abis.exercise.model.Address;
import org.junit.Test;
// import org.junit.jupiter.api.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

// import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    Address address = new Address("Ham", "5", "9000", "Gent", "Belgium", "BE");
    String zipcode;

    @Test
    public void belgianZipCodeShouldBeNumeric(){
        assertTrue(address.isBelgianZipCodeNumeric());
    }

    @Test
    public void writeAddressToFileShouldWriteAndNotThrowIOException(){
        Boolean assertion;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\javacourses\\JUnitAddress.txt"))) {
            address.writeToFile();
            assertion = address.toString().equals(reader.readLine());
        } catch (IOException e){
            assertion = false;
        } assertTrue(assertion);
    }

}
