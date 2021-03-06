package template;

import java.util.ArrayList;
import java.util.List;

public class TemplateDemo {
    public static void main(String[] args) {
        List<ReportTemplate> reports = new ArrayList<>();
        reports.add(new ShortReport("Krótki raport"));
        reports.add(new FullReport("ADAM", "Raport 12/21"));
        for(ReportTemplate report: reports){
            System.out.println(report.generate());
        }
    }
}
