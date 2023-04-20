/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.sql.SQLOutput;
import java.util.*;


public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

    public static int[] roll(int n) {
        int[] rolls = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            rolls[i] = rand.nextInt(6) + 1;
        }

        return rolls;
    }

    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static int[] lowestAverage(int[][] arr) {
        int minAvgIndex = 0;
        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            double avg = sum / arr[i].length;
            if (avg < minAvg) {
                minAvg = avg;
                minAvgIndex = i;
            }
        }
        return arr[minAvgIndex];
    }

    public static String analyzeWeatherData(int[][] temperatures) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        HashSet<Integer> uniqueTemps = new HashSet<Integer>();

        for (int[] week : temperatures) {
            for (int temp : week) {
                minTemp = Math.min(minTemp, temp);
                maxTemp = Math.max(maxTemp, temp);
                uniqueTemps.add(temp);
            }
        }

        StringBuilder missingTemps = new StringBuilder();
        for (int temp = minTemp; temp <= maxTemp; temp++) {
            if (!uniqueTemps.contains(temp)) {
                missingTemps.append("Never saw temperature: ");
                missingTemps.append(temp);
                missingTemps.append("\n");
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("High: ");
        result.append(maxTemp);
        result.append("\n");
        result.append("Low: ");
        result.append(minTemp);
        result.append("\n");
        result.append(missingTemps.toString());

        return result.toString();

    }

    public static String tally(List<String> votes) {
        HashMap<String, Integer> voteCounts = new HashMap<>();

        for (String vote : votes) {
            if (voteCounts.containsKey(vote)) {
                voteCounts.put(vote, voteCounts.get(vote) + 1);
            } else {
                voteCounts.put(vote, 1);
            }
        }

        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            String plant = entry.getKey();
            int voteCount = entry.getValue();
            if (voteCount > maxVotes){
                winner = plant;
                maxVotes = voteCount;
            }
        }

        return winner;
    }


    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String result = analyzeWeatherData(weeklyMonthTemperatures);
        System.out.println(result);

        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes");


    }
}