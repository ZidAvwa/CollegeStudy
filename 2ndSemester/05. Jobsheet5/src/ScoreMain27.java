public class ScoreMain27 {
    public static void main(String[] args) {
        ScoreAnalysis27 sa = new ScoreAnalysis27();
        String tableHeader[] = {"No", "Name", "NIM","Year", "UTS", "UAS"};
        System.out.printf("%-3s %-8s %-10s %-4s %-4s %-4s\n", tableHeader[0], tableHeader[1], tableHeader[2], tableHeader[3], tableHeader[4], tableHeader[5]);
        for (int i = 0; i < sa.name.length; i++) {
            System.out.printf("%-3d %-8s %-10d %-4d %-4d %-4d\n", (i + 1), sa.name[i], sa.NIM[i], sa.year[i], sa.UTS[i], sa.UAS[i]);
        }

        System.out.println("Highest UTS score: " + sa.findMaxDC(sa.UTS, 0, sa.UTS.length - 1));
        System.out.println("Lowest UTS score: " + sa.findMinDC(sa.UTS, 0, sa.UTS.length - 1));
        System.out.println("Average UAS score: " + sa.calculateAverageBF(sa.UAS));
    }
}
