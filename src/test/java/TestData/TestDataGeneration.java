package TestData;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public interface TestDataGeneration {

    interface LocationInfoData {
        static Map<String, Object> generateLocationInput() {
            Faker faker = new Faker();

            Map<String, Object> location = new HashMap<>();

            location.put("addressTitle", faker.name().title());
            location.put("address", faker.address().streetAddress());
            location.put("zipCode", faker.address().zipCode());
            location.put("timeZone", faker.address().timeZone());
            location.put("city", faker.address().city());
            location.put("state", faker.address().state());
            location.put("country", faker.address().country());
            return location;
        }

    }

}
