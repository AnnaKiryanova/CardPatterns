package ru.netology.delivery;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private static final Faker faker = new Faker(new Locale("ru"));
    private static Random random = new Random();
    private static String[] cities = {"Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Казань", "Белгород", "Курск", "Барнаул", "Нарьян-Мар"};

    private DataGenerator() {
    }

    public static String generateCityName() {
        int index = random.nextInt(cities.length);
        return cities[index];
    }

    public static String generateFullName() {
        return faker.name().fullName();
    }

    public static String generatePhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public static String generateIncompleteNumber() {
        return faker.numerify("+# (###) ###");
    }


    public static String generateDate(long addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));

    }
}