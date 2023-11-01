package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String season = switch (monthNumber) {
            case (1), (2), (12) -> "winter";
            case (3), (4), (5) -> "spring";
            case (6), (7), (8) -> "summer";
            case (9), (10), (11) -> "autumn";
            default -> "Wrong month number";
        };

        System.out.println(season);
    }
}
