package de.othr.grundlagen;

public class DatentypenBeispiel {
    public static void main(String args[]) {
        int zahl;
        int n = 10;
        var m = 20;
        int a,b,c;
        a = b = c = 5;
        zahl = n*(a+b+c);

        System.out.println("zahl = "+zahl);

        {
            int x = 3;
            {
                int y = x+1;
            }
            // hier kann nicht mehr auf y zugegriffen werden
        }

        if(zahl > 100) {
            System.out.println("Große Zahl!");
        } else if(zahl == 100) {
            System.out.println("Die Zahl ist 100");
        } else {
            System.out.println("Kleine Zahl!");
        }

        while(n < 20) {
            System.out.println("n ist jetzt "+n);
            n++; // steht für n+=1; und das steht für n = n + 1;
        }

        do {
            System.out.println("Nun ist n "+n);
            n++;
        } while(n < 20);

        for(int i = 0; i < 10; i++) {
            System.out.println("i ist jetzt "+i);
        }


        boolean erfolg = true;
        long id = 123456789000L;
        double temperatur = 22.81333;
        char buchstabe = 'b';
        Integer i = null;

        String vorname = "Peter";
        String nachname = "Müller";
        String name = vorname + " " + nachname;
        String text = "Geht ein Text über mehrere Code-Zeilen, muss " +
                "man ihn aus mehreren Strings mittels + konkatenieren.";

        String siebzehn = "" + 1 + 7;
        String acht = "" + (1+7);

        System.out.println("siebzehn = "+siebzehn);
        System.out.println("acht = "+acht);

        name = "Peter Müller";
        name = "Herr "+name;

        if(name.equals("Herr Peter Müller")) {
            System.out.println("Hallo Peter!");
        }

        char geschlecht = 'm';
        String anrede;
        anrede = geschlecht == 'w' ? "Frau" : "Herr";
        System.out.println("Hallo "+anrede+" "+nachname);

        if(geschlecht == 'w') {
            anrede = "Frau";
        } else {
            anrede = "Herr";
        }

        String sprache = "Deutsch";
        switch(sprache) {
            case "Englisch":
                System.out.println("Hello!");
                break;
            case "Deutsch":
                System.out.println("Hallo!");
                break;
            default:
                System.out.println("Hä?");
                break;
        }
    }
}
