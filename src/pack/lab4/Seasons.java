package pack.lab4;

public class Seasons {
    void TheBestSeason(Season season) {
        System.out.print("Я люблю ");
        switch (season) {
            case WINTER -> System.out.println("зиму");
            case SPRING -> System.out.println("весну");
            case SUMMER -> System.out.println("лето");
            case FALL -> System.out.println("осень");
        }
    }
    public void getDescription(Season season) {
        switch (season) {
            case WINTER, FALL, SPRING -> System.out.println("Холодное время года");
            case SUMMER -> System.out.println("Теплое время года");
        }
    }
    public static void main(String[] args) {
        Season winter = Season.WINTER;

        Seasons enumSeasons = new Seasons();
        enumSeasons.TheBestSeason(winter);
        enumSeasons.getDescription(winter);
        System.out.println("Все времена года:");
        for (Season season :Season.values()) {

            System.out.printf("Время года: %s, средняя температура: %d\n", season, season.getTemp());

        }
    }
}
enum Season {
    WINTER(-20),
    SPRING(8),
    SUMMER(20),
    FALL(5);
    final int Temp;

    Season(int Temp) {
        this.Temp = Temp;
    }
    public int getTemp() {
        return Temp;
    }

}
