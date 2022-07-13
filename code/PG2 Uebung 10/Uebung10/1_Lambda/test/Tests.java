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
        Assert.assertEquals("Afghanistan\n" +
                "Africa\n" +
                "Albania\n" +
                "Algeria\n" +
                "Andorra\n" +
                "Angola\n" +
                "Anguilla\n" +
                "Antigua and Barbuda\n" +
                "Argentina\n" +
                "Armenia\n" +
                "Aruba\n" +
                "Asia\n" +
                "Australia\n" +
                "Austria\n" +
                "Azerbaijan\n" +
                "Bahamas\n" +
                "Bahrain\n" +
                "Bangladesh\n" +
                "Barbados\n" +
                "Belarus\n" +
                "Belgium\n" +
                "Belize\n" +
                "Benin\n" +
                "Bermuda\n" +
                "Bhutan\n" +
                "Bolivia\n" +
                "Bonaire Sint Eustatius and Saba\n" +
                "Bosnia and Herzegovina\n" +
                "Botswana\n" +
                "Brazil\n" +
                "British Virgin Islands\n" +
                "Brunei\n" +
                "Bulgaria\n" +
                "Burkina Faso\n" +
                "Burundi\n" +
                "Cambodia\n" +
                "Cameroon\n" +
                "Canada\n" +
                "Cape Verde\n" +
                "Cayman Islands\n" +
                "Central African Republic\n" +
                "Chad\n" +
                "Chile\n" +
                "China\n" +
                "Colombia\n" +
                "Comoros\n" +
                "Congo\n" +
                "Cook Islands\n" +
                "Costa Rica\n" +
                "Cote d'Ivoire\n" +
                "Croatia\n" +
                "Cuba\n" +
                "Curacao\n" +
                "Cyprus\n" +
                "Czechia\n" +
                "Democratic Republic of Congo\n" +
                "Denmark\n" +
                "Djibouti\n" +
                "Dominica\n" +
                "Dominican Republic\n" +
                "Ecuador\n" +
                "Egypt\n" +
                "El Salvador\n" +
                "Equatorial Guinea\n" +
                "Eritrea\n" +
                "Estonia\n" +
                "Eswatini\n" +
                "Ethiopia\n" +
                "Europe\n" +
                "European Union\n" +
                "Faeroe Islands\n" +
                "Falkland Islands\n" +
                "Fiji\n" +
                "Finland\n" +
                "France\n" +
                "French Polynesia\n" +
                "Gabon\n" +
                "Gambia\n" +
                "Georgia\n" +
                "Germany\n" +
                "Ghana\n" +
                "Gibraltar\n" +
                "Greece\n" +
                "Greenland\n" +
                "Grenada\n" +
                "Guam\n" +
                "Guatemala\n" +
                "Guernsey\n" +
                "Guinea\n" +
                "Guinea-Bissau\n" +
                "Guyana\n" +
                "Haiti\n" +
                "High income\n" +
                "Honduras\n" +
                "Hong Kong\n" +
                "Hungary\n" +
                "Iceland\n" +
                "India\n" +
                "Indonesia\n" +
                "International\n" +
                "Iran\n" +
                "Iraq\n" +
                "Ireland\n" +
                "Isle of Man\n" +
                "Israel\n" +
                "Italy\n" +
                "Jamaica\n" +
                "Japan\n" +
                "Jersey\n" +
                "Jordan\n" +
                "Kazakhstan\n" +
                "Kenya\n" +
                "Kiribati\n" +
                "Kosovo\n" +
                "Kuwait\n" +
                "Kyrgyzstan\n" +
                "Laos\n" +
                "Latvia\n" +
                "Lebanon\n" +
                "Lesotho\n" +
                "Liberia\n" +
                "Libya\n" +
                "Liechtenstein\n" +
                "Lithuania\n" +
                "Low income\n" +
                "Lower middle income\n" +
                "Luxembourg\n" +
                "Macao\n" +
                "Madagascar\n" +
                "Malawi\n" +
                "Malaysia\n" +
                "Maldives\n" +
                "Mali\n" +
                "Malta\n" +
                "Marshall Islands\n" +
                "Mauritania\n" +
                "Mauritius\n" +
                "Mexico\n" +
                "Micronesia (country)\n" +
                "Moldova\n" +
                "Monaco\n" +
                "Mongolia\n" +
                "Montenegro\n" +
                "Montserrat\n" +
                "Morocco\n" +
                "Mozambique\n" +
                "Myanmar\n" +
                "Namibia\n" +
                "Nauru\n" +
                "Nepal\n" +
                "Netherlands\n" +
                "New Caledonia\n" +
                "New Zealand\n" +
                "Nicaragua\n" +
                "Niger\n" +
                "Nigeria\n" +
                "Niue\n" +
                "North America\n" +
                "North Korea\n" +
                "North Macedonia\n" +
                "Northern Cyprus\n" +
                "Northern Mariana Islands\n" +
                "Norway\n" +
                "Oceania\n" +
                "Oman\n" +
                "Pakistan\n" +
                "Palau\n" +
                "Palestine\n" +
                "Panama\n" +
                "Papua New Guinea\n" +
                "Paraguay\n" +
                "Peru\n" +
                "Philippines\n" +
                "Pitcairn\n" +
                "Poland\n" +
                "Portugal\n" +
                "Puerto Rico\n" +
                "Qatar\n" +
                "Romania\n" +
                "Russia\n" +
                "Rwanda\n" +
                "Saint Helena\n" +
                "Saint Kitts and Nevis\n" +
                "Saint Lucia\n" +
                "Saint Pierre and Miquelon\n" +
                "Saint Vincent and the Grenadines\n" +
                "Samoa\n" +
                "San Marino\n" +
                "Sao Tome and Principe\n" +
                "Saudi Arabia\n" +
                "Senegal\n" +
                "Serbia\n" +
                "Seychelles\n" +
                "Sierra Leone\n" +
                "Singapore\n" +
                "Sint Maarten (Dutch part)\n" +
                "Slovakia\n" +
                "Slovenia\n" +
                "Solomon Islands\n" +
                "Somalia\n" +
                "South Africa\n" +
                "South America\n" +
                "South Korea\n" +
                "South Sudan\n" +
                "Spain\n" +
                "Sri Lanka\n" +
                "Sudan\n" +
                "Suriname\n" +
                "Sweden\n" +
                "Switzerland\n" +
                "Syria\n" +
                "Taiwan\n" +
                "Tajikistan\n" +
                "Tanzania\n" +
                "Thailand\n" +
                "Timor\n" +
                "Togo\n" +
                "Tokelau\n" +
                "Tonga\n" +
                "Trinidad and Tobago\n" +
                "Tunisia\n" +
                "Turkey\n" +
                "Turkmenistan\n" +
                "Turks and Caicos Islands\n" +
                "Tuvalu\n" +
                "Uganda\n" +
                "Ukraine\n" +
                "United Arab Emirates\n" +
                "United Kingdom\n" +
                "United States\n" +
                "United States Virgin Islands\n" +
                "Upper middle income\n" +
                "Uruguay\n" +
                "Uzbekistan\n" +
                "Vanuatu\n" +
                "Vatican\n" +
                "Venezuela\n" +
                "Vietnam\n" +
                "Wallis and Futuna\n" +
                "Western Sahara\n" +
                "World\n" +
                "Yemen\n" +
                "Zambia\n" +
                "Zimbabwe\n".trim(), outContent.toString().replaceAll("(\\r)", "").trim());
        try {
            Submit.submit();
        } catch (IOException e) {
            Assert.fail("Correct but submission failed: " + e.getMessage());
        }
    }
}