import java.util.Random;

public class FirstPresident {
    private static final int[] YEARS = new int[] {
            1881,1893,1900,1910,1919,1923,1930,1932,1934,1938

    };
    private static final String[] QUOTES = new String[] {
            "Teachers are the one and only people who save nations.",
            "Everything we see in the world is the creative work of women.",
            "Our true mentor in life is science.",
            "Peace at home, peace in the world.",
            "Our great idea is to raise our nation to highest standards of civilization and prosperity.",
            "Happy is the one who says, 'I'm a Turk'.",
            "One day my mortal body will turn to dust, but the Turkish Republic will stand forever.",
            "Authority, without any condition and reservation, belongs to the nation."
    };
    private static int getRandomYear() {
        return YEARS[new Random().nextInt(YEARS.length)];
    }
    private static String getRandomQuote() {
        return QUOTES[new Random().nextInt(QUOTES.length)];
    }

    public static void main(String[] args) {
        int year = getRandomYear();
        String quotes = getRandomQuote();
        String quote = null;
        switch (year) {
            case 1881:
                quote="Mustafa Kemal was born in Salonika.";
                System.out.printf("In %d,%s",year,quote);
                break;
            case 1893:
                quote="Mustafa was given the additional name Kemal at military school.";
                System.out.printf("In %d,%s",year,quote);
                break;
            case 1919:
                quote="Mustafa Kemal landed in Samsun.";
                System.out.printf("In %d,%s",year,quote);
                break;
            case 1923:
                quote="Mustafa Kemal was elected as the first president of the Republic of Turkey.";
                System.out.printf("In %d,%s",year,quote);
                break;
            case 1932:
                quote="Mustafa Kemal founded the Turkish Linguistic Society.";
                System.out.printf("In %d,%s",year,quote);
                break;
            case 1934:
                quote="The Grand National Assembly of Turkey granted him the surname Atatürk.";
                System.out.printf("In %d,%s",year,quote);
                break;
            case 1938:
                quote="Atatürk died in Istanbul.";
                System.out.printf("In %d,%s",year,quote);
                break;
            case 1900:
            case 1910:
            case 1930:
                System.out.printf("%s",quotes);
                break;

        }
    }
}
