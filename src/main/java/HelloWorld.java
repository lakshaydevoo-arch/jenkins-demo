
public class HelloWorld {

    public String getMessage() {
        return "Hello from Jenkins CI!";
    }

    public static void main(String[] args) {
        HelloWorld app = new HelloWorld();
        System.out.println(app.getMessage());
    }
}
