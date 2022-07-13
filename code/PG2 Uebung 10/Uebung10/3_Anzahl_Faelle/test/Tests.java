import org.junit.Assert;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Tests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSolution() {
        Main.main(new String[0]);
        int is = Integer.parseInt(outContent.toString().replaceAll("(\\r)", "").trim());
        int sol = 4032;
        Assert.assertTrue(is > sol*0.8 && is < sol*1.2 );

        try {
            Submit.submit();
        } catch (IOException e) {
            Assert.fail("Correct but submission failed: " + e.getMessage());
        }
    }
}