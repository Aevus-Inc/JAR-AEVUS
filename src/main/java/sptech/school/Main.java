package sptech.school;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ETL etlAevus = new ETL();

        List<String> arquivos = Arrays.asList("2024-02tri.xlsx", "2024-03tri.xlsx", "2024-04tri.xlsx");

        for (String arquivo : arquivos) {
            etlAevus.ConectarS3(arquivo);
        }
    }
}
