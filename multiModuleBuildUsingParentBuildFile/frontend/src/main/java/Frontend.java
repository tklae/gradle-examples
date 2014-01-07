public class Frontend {

    public static final String SUCCESS_TOKEN = "Success! ";
    private Backend backend;

    public Frontend() {
        this.backend = new Backend();
    }

    public static void main(String[] args) {
        Frontend frontend = new Frontend();
        System.out.println(frontend.invoke("Hello World!"));
    }

    public String invoke(String requestMessage) {
        return SUCCESS_TOKEN + backend.invoke(requestMessage).getPayload();
    }
}
