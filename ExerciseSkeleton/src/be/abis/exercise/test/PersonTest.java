package be.abis.exercise.test;

import be.abis.exercise.exception.PersonShouldBeAdultException;
import be.abis.exercise.exception.SalaryTooLowException;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Person;

import org.junit.Test;
import org.junit.*;
// import org.junit.jupiter.api.*;
// import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.equalTo;
// import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWithIgnoringCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
// import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

// @ExtendWith(MockitoExtension.class)

public class PersonTest {

    @Mock
    private Company mockCompany;

    Person person1;
    Person person2;


    @Before
    public void setUp(){
        person1 = new Person(1, "Jef", "Dhont", LocalDate.parse("1980-10-01"));
        person1.setGrossSalary(2000.0);

        person2 = new Person(2, "Joske", "Demeuleneire", LocalDate.parse("2020-10-01"));
        person2.setGrossSalary(4000.0);
        person2.setCompany(mockCompany);

    }


    @Test
    public void person1ShouldBe42YearsOld() throws PersonShouldBeAdultException {
        assertEquals(42, person1.calculateAge());
        // LocalDate.now().minusYears(42)
    }

    @Test
    public void person1ShouldBe42YearsOldHamCrest() throws PersonShouldBeAdultException {
        assertThat(42, equalTo(person1.calculateAge()));
    }

    @Test
 //   @Order(2)
    public void toStringSentenceStartsWithPerson(){
        System.out.println("Test 2");
        assertTrue(person1.toString().startsWith("Person"));
    }

    @Test
    public void toStringSentenceStartsWithPersonHamcrest(){
        String string = person1.toString();
        assertThat(string, startsWithIgnoringCase("person"));
    }

    @Test (expected = PersonShouldBeAdultException.class)
  //  @Order(1)
    public void shouldThrowPersonShouldBeAdultException() throws PersonShouldBeAdultException {
        System.out.println("Test 1");
        person2.calculateAge();
//        assertThrows(PersonShouldBeAdultException.class, () -> person2.calculateAge());
    }


/*
    @Test
    public void calculateNetSalaryOfBelgianPersonUsingMockCompany() throws SalaryTooLowException {
        when(mockCompany.calculateTaxToPay()).thenReturn(51.0);
        person2.setCompany(mockCompany);
//        System.out.println(person1.calculateNetSalary());
        assertEquals(person2.getGrossSalary()*0.49, person2.calculateNetSalary());
        verify(mockCompany, atLeastOnce()).calculateTaxToPay();
    }

    @Mock
    private Person mockPerson;

    @Test (expected = SalaryTooLowException.class)
    public void shouldThrowSalaryTooLowException() throws SalaryTooLowException {
        when(mockCompany.calculateTaxToPay()).thenReturn(51.0);
        person1.setCompany(mockCompany);
        person1.calculateNetSalary();
 //       assertThrows(SalaryTooLowException.class, () -> person1.calculateNetSalary());
    }
*/



}
