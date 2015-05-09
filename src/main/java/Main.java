import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        SparkapplicationImpl sparkapplication = new SparkapplicationImpl();

        setPort(Integer.parseInt(System.getenv("PORT")));

        get("/hello", (req, res) -> "Hello World");

        get("/hello/:name", (req, res) -> {
            return "Hello " + req.params(":name");
        });
    }
}