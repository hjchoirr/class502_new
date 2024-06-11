package exam01;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Ex01Test {

    @Test
    void test01() {

        //Locale.KOREAN
        Faker faker = new Faker(new Locale("ko_kr"));
        String name = faker.name().fullName();
        System.out.println(name);
        String fname = faker.funnyName().name();
        System.out.println(fname);

    }
    @Test
    void test2() {
        Faker faker = new Faker(Locale.KOREAN);
        String address = faker.address().fullAddress();
        System.out.println(address);

        address = faker.address().zipCode() + " " + faker.address().cityName() + " " + faker.address().streetAddress();
        System.out.println(address);
        String addressSub = faker.address().secondaryAddress();
        System.out.println(addressSub);
    }
}
