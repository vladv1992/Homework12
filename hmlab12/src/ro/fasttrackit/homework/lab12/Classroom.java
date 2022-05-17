package ro.fasttrackit.homework.lab12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public static void main(String[] args) throws IOException {
        List<StundentGrade> stundentGrades = new ArrayList<>();
        writeReport(stundentGrades);
        System.out.println(stundentGrades);
    }

    private static void writeReport(List<StundentGrade> stundentGrades) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("fild/gradesds.txt"))) {
            for (StundentGrade p : stundentGrades) {
                writer.write(stundentGradesToLine(p));
                writer.newLine();
            }
            writer.write("ana are mere dulci");
        }
    }

    private static String stundentGradesToLine(StundentGrade p) {
        return p.getName() +"with age"+ p.getAge()+"discipline" + p.getDiscipline();

    }
}
