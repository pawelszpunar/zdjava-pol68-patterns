package template;

public class FullReport extends ReportTemplate{
    final String author;
    final String title;

    public FullReport(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    String header() {
        return "Tytuł: " + title + "\nAuthor: " + author;
    }

    @Override
    String content() {
        return "Treść";
    }

    @Override
    String footer() {
        return "stopka";
    }
}
