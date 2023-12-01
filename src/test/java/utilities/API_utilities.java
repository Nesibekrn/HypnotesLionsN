package utilities;

import enums.Enum_Fy;
import io.restassured.response.Response;
import org.junit.Assert;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_utilities {
public static Response response;

public static String phpSessId;
public static String csrfToken;
public static  Map<String,Object> payload=new HashMap<>();

public static String login(String email, String password){
    payload.put("username",email);
    payload.put("password",password);

    response=given().body(payload).post("https://test.hypnotes.net/api/login");
    Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));

    response.prettyPrint();

    phpSessId=response.cookies().get("PHPSESSID");
    csrfToken=response.cookies().get("csrfToken");

    System.out.println("phpSessId = " + phpSessId);

    return phpSessId;
}

    public static String loginWithEnum(Enum_Fy user){
        payload.put("username",user.getUsername());
        payload.put("password",user.getPassword());

        response=given()
                .body(payload)
                .post("https://test.hypnotes.net/api/login");
        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));

        response.prettyPrint();

        phpSessId=response.cookies().get("PHPSESSID");

        System.out.println("phpSessId = " + phpSessId);

        return phpSessId;
    }
    public static String nextDate(int daysLater) {
        LocalDateTime myDate=LocalDateTime.now();
        LocalDateTime nextDay=myDate.plus(Period.ofDays(daysLater));
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String nextDateTime=nextDay.format(myFormat);
        System.out.println(nextDateTime);
        return nextDateTime;
    }
    public static String nextTime(int nextHour) {
        LocalTime myTime=LocalTime.now();
        LocalTime oneHoursLater=myTime.plusHours(nextHour);
        DateTimeFormatter myTimeFormatter=DateTimeFormatter.ofPattern("HH:mm");
        String nextHours=oneHoursLater.format(myTimeFormatter);
        return nextHours;
    }
}
