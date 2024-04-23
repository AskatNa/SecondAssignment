import java.util.ArrayList;

public class FifthTask {
    public static int countUnableToEat(ArrayList<Integer> students, ArrayList<Integer> samsas) {
        int unableToEat = 0;
        int samsaIndex = 0;
        for (int student : students) {
            if (samsaIndex < samsas.size()) {
                int samsaType = samsas.get(samsaIndex);
                if (student == samsaType) {
                    samsas.remove(samsaIndex);
                } else {
                    unableToEat++;
                }
            }
        }
        return unableToEat;
    }
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>();
        students.add(1);
        students.add(1);
        students.add(0);
        students.add(0);

        ArrayList<Integer> samsas = new ArrayList<>();
        samsas.add(0);
        samsas.add(1);
        samsas.add(0);
        samsas.add(1);
        System.out.println(countUnableToEat(students, samsas));

    }
}
