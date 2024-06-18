import java.util.ArrayList;
import java.util.List;

public class MainO {

    private static ReportServiceP reportService;

    public static void main(String[] args) {
        List<String> order = new ArrayList<>();
        order.add("req1");
        order.add("req2");
        order.add("req3");

        try {
            reportService = new ReportServiceP();
            reportService.generateReport(order, ReportType.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
