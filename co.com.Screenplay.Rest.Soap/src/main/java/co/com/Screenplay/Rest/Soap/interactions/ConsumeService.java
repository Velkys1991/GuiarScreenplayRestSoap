package co.com.Screenplay.Rest.Soap.interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeService {
    private ConsumeService() {
    }

    public static WithPost withPost(String body) {
        return Tasks.instrumented(WithPost.class, body);
    }
}
