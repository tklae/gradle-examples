import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackendTest extends SuperImportantTestHelper {

    @Test
    public void testBackend() throws Exception {
        notifyTestStarted();
        Backend backend = new Backend();
        String requestMessage = "someRequest";
        SharedDataContainer response = backend.invoke(requestMessage);

        assertEquals(Backend.RESPONSE_TEXT + requestMessage, response.getPayload());
    }
}
