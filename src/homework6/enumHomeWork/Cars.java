package homework6.enumHomeWork;

public enum Cars {
    LEXUS(1, "Japan", "LXS"),
    HONDA(2, "Japan", "HND"),
    NIVA(3, "Russia", "NV"),
    Ferrari(4, "Italy", "FR"),
    AUDI(5, "Germany", "AUD"),
    BMW(6, "Germany", "BMW"),
    Chevrolet(7, "USA", "CHLT"),
    PORSCHE(8, "Italy", "PRSH"),
    WV(9, "Germany", "WV"),
    MASERATI(10, "Italy", "MSRT");

    int id;
    String country;
    String code;

    Cars(int id, String country, String code) {
        this.id = id;
        this.country = country;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCode() {
        return code;
    }

    public static Cars findById(int id) {
        for (Cars i : values()) {
            if (i.getId() == id) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    public static Cars findByCountry(String country) {
        for (Cars i : values()) {
            if (i.getCountry() == country) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    public static Cars finndByCode(String code) {
        for (Cars i : values()) {
            if (i.getCode() == code) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }
}