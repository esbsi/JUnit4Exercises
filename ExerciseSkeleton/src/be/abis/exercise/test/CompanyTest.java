package be.abis.exercise.test;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import org.junit.Test;
// import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {

    Address address = new Address("Ham", "5", "9000", "Gent", "Belgium", "BE");
    Company company = new Company("TTL", address);

    @Test
    public void taxForBelgianCompaniesShouldBe51(){
        assert(51.0 == company.calculateTaxToPay());
    }



}
