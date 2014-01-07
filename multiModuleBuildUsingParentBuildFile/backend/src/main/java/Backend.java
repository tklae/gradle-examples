public class Backend {

    public static final String RESPONSE_TEXT = "Response for: ";

    public SharedDataContainer invoke(String request) {
        return new SharedDataContainer(RESPONSE_TEXT + request);
    }
}
