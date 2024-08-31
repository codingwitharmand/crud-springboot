package com.cwa.crudspringboot.service;

import java.time.LocalDate;
import java.time.Period;

public class TDDService {

    public int getAge(LocalDate birthdate) {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public boolean isMinor(LocalDate birthdate) {
        return getAge(birthdate) < 18;
    }

    public String fizzbuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return "This number is neither Fizz nor Buzz nor FizzBuzz";
    }
}
