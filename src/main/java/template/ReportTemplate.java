package template;

abstract public class ReportTemplate {
    public String generate(){
        return header()
                + "\n"
                + content()
                + "\n"
                + footer();
    }

    abstract String header();

    abstract String content();

    abstract String footer();
}
