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
        Assert.assertEquals("<!doctype html><html><head>    <title>Example Domain</title>    <meta charset=\"utf-8\" />    <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\" />    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />    <style type=\"text/css\">    body {        background-color: #f0f0f2;        margin: 0;        padding: 0;        font-family: -apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", \"Open Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;            }    div {        width: 600px;        margin: 5em auto;        padding: 2em;        background-color: #fdfdff;        border-radius: 0.5em;        box-shadow: 2px 3px 7px 2px rgba(0,0,0,0.02);    }    a:link, a:visited {        color: #38488f;        text-decoration: none;    }    @media (max-width: 700px) {        div {            margin: 0 auto;            width: auto;        }    }    </style>    </head><body><div>    <h1>Example Domain</h1>    <p>This domain is for use in illustrative examples in documents. You may use this    domain in literature without prior coordination or asking for permission.</p>    <p><a href=\"https://www.iana.org/domains/example\">More information...</a></p></div></body></html>\n", outContent.toString().replaceAll("(\\r)", ""));
        try {
            Submit.submit();
        } catch (IOException e) {
            Assert.fail("Correct but submission failed: " + e.getMessage());
        }
    }
}