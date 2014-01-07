import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontendTest extends SuperImportantTestHelper {

    @Test
    public void testFrontend() throws Exception {
        notifyTestStarted();
        Frontend frontend = new Frontend();
        String requestMessage = "Hello backend!";
        String response = frontend.invoke(requestMessage);

        assertEquals(Frontend.SUCCESS_TOKEN + Backend.RESPONSE_TEXT + requestMessage, response);
    }
}
