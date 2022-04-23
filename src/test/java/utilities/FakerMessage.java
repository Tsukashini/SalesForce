package utilities;

import com.github.javafaker.Faker;

public class FakerMessage {

    public static String getAccountName() {
        Faker faker = new Faker();
        return faker.elderScrolls().dragon();
    }

    public static String getPhone() {
        Faker faker = new Faker();
        return faker.phoneNumber().cellPhone();
    }

    public static String getFax() {
        Faker faker = new Faker();
        return faker.phoneNumber().phoneNumber();
    }

    public static String getWebsite() {
        Faker faker = new Faker();
        return faker.internet().domainName();
    }

    public static String getRevenue() {
        Faker faker = new Faker();
        return Long.toString(faker.number().randomNumber());
    }

    public static String getEmployees() {
        Faker faker = new Faker();
        return Long.toString(faker.number().randomNumber());
    }

    public static String getDescription() {
        Faker faker = new Faker();
        return faker.chuckNorris().fact();
    }

    public static String getBillingStreet() {
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }

    public static String getShippingStreet() {
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }

    public static int getType() {
        Faker faker = new Faker();
        return faker.number().numberBetween(0, 10);
    }

    public static int getIndustry() {
        Faker faker = new Faker();
        return faker.number().numberBetween(1, 32);
    }

    public static String getBillingCity() {
        Faker faker = new Faker();
        return faker.address().city();
    }
}
