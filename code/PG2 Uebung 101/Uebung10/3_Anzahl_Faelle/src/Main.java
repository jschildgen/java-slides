import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> corona_daten;
        try {
            corona_daten = APIHelper.httpGetList("https://covid.ourworldindata.org/data/owid-covid-data.csv");
        } catch(Exception e) {
            e.printStackTrace();
            return;
        }

        Stream<CoronaDatensatz> daten = corona_daten.stream()
                .skip(1)
                .map(s -> s.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"))
                .filter(a -> a.length > 5)
                .map(a -> new CoronaDatensatz(
                        LocalDate.parse(a[3]),
                        a[5].isEmpty() ? 0 : Math.round(Float.parseFloat(a[5])),
                        a[2],
                        a[1]));

        CoronaDatensatz cd = daten.filter(d -> d.getLand().equals("Germany"))
                .filter(d -> d.getDatum().equals( LocalDate.parse("2022-05-01") ) )
                        .findAny().orElse(null);

        if(cd != null) {
            System.out.println(cd.getFaelle());
        } else {
            System.out.println("Wurde nicht gefunden.");
        }
    }
}