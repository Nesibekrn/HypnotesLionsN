package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.Authentication_Fy.generateCookie;

public class baseUrl_fy {
    public  static RequestSpecification spec;//RequestSpecification interface'i uzerinden bir spec objesi olusturduk
    //interface'ler uzerinden obje olusturulmaz,bir constructor olarak kullanilmaz bu yuzden spec objesini tanimlarken 13.satirda new den sonra RequestSpecBuilder tanimliyoruz bu bizim spec objemizi olusturmamiza yariyor
    public static void hypnotesSetUp(){
        spec=new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Cookie",generateCookie())//bu generatecookie methodunu cagirdik Authentication class'indan value kismi gelecek,yani authentification'a ihtiyac var//eger lazimsa header ekliyoruz
                .setBaseUri("https://test.hypnotes.net/")
                .build();//PHPSESID rskl0s7jfdut83a7p8g64bvo0n
    }
}//.addHeader("PHPSESID","rskl0s7jfdut83a7p8g64bvo0n")
