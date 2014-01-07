import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExampleTest1 {

    @Test
    public void shouldPass() throws Exception {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void shouldBeSkipped() throws Exception {
        assertTrue(false);
    }

    @Test
    public void shouldFailToDemonstrateTheLoggingForSimpleFailures() throws Exception {
        assertTrue(false);
    }

    @Test
    public void shouldThrowAnExceptionToDemonstrateTheLoggingForException() throws Exception {
        try {
            throw new IllegalArgumentException("Some bogus message");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Creating some stacktrace", e);
        }
    }
}
