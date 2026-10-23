
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void shouldReturnExpectedMessage() {
        HelloWorld app = new HelloWorld();

        assertEquals(
                "Hello from Jenkins CI!",
                app.getMessage()
        );
    }
}
