public class Main {
    public static void main(String[] args) {
        String json = "{ \"name\": \"Peter\", \"alter\": \"20\" }";
        System.out.println(APIHelper.parseJson(json).get("name"));
    }
}