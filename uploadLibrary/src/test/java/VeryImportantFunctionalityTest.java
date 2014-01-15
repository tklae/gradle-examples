import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VeryImportantFunctionalityTest {

    @Test
    public void shouldPerformSomeMagic() throws Exception {
        VeryImportantFunctionality vif = new VeryImportantFunctionality();
        assertEquals("Hello!World", vif.performMagic("Hello World"));
    }
}
