package be.abis.exercise.test;

// import org.junit.jupiter.api.*;
// import org.junit.jupiter.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/*
import org.junit.platform.suite.api.SelectPackages;

import be.abis.exercise.exception.PersonShouldBeAdultException;
import be.abis.exercise.model.Person;

import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWithIgnoringCase;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import be.abis.exercise.model.Address;
import org.junit.jupiter.api.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SelectPackages({"be.abis.exercise.*"})
*/

@Suite
@SelectClasses({AddressTest.class, PersonTest.class, CompanyTest.class})
public class TestSuite {
}
