
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            int games = 0;
            int wins = 0;
            int losses = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);

                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    games++;
                }
                if (team.equals(homeTeam)) {
                    if (homePoints > visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team.equals(visitingTeam)) {
                    if (visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
