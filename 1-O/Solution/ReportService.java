import java.util.List;

public class ReportService {
    private IReportGenerator reportGenerator;

    public ReportService(IReportGenerator reportGenerator){
        this.reportGenerator = reportGenerator;
    }

    public void generateReport(List<String> orders){
        reportGenerator.generate(orders);
    }



}
