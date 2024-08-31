package com.cwa.crudspringboot.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TDDServiceTest {

    private TDDService tddService;

    @BeforeEach
    void setUp() {
        tddService = new TDDService();
    }

    @Test
    void testGetAge() {
        //Arrange
        LocalDate birthdate = LocalDate.of(1995, 1, 1);

        //Act
        int age = tddService.getAge(birthdate);

        //Assert
        assertEquals(29, age);
    }

    @Test
    void testIsMinorShouldReturnTrue() {
        //Arrange
        LocalDate birthdate = LocalDate.of(2010, 1, 1);

        //Act
        boolean isMinor = tddService.isMinor(birthdate);

        //Assert
        assertTrue(isMinor);
    }

    @Test
    void testIsMinorShouldReturnFalse() {
        //Arrange
        LocalDate birthdate = LocalDate.of(2000, 1, 1);

        //Act
        boolean isMinor = tddService.isMinor(birthdate);

        //Assert
        assertFalse(isMinor);
    }

    @Test
    void testFizz() {
        //Arrange
        int number = 33;

        //Act
        String result = tddService.fizzbuzz(number);

        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testBuzz() {
        //Arrange
        int number = 100;

        //Act
        String result = tddService.fizzbuzz(number);

        //Assert
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzz() {
        //Arrange
        int number = 15;

        //Act
        String result = tddService.fizzbuzz(number);

        //Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testFizzBuzzShouldReturnMessage() {
        //Arrange
        int number = 14;

        //Act
        String result = tddService.fizzbuzz(number);

        //Assert
        assertEquals("This number is neither Fizz nor Buzz nor FizzBuzz", result);
    }
  
}