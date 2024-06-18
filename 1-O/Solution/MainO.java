import java.util.ArrayList;
import java.util.List;

/*
 * Se deja abierto a la extension es decir se puede crear nuevos tipos de reportes sin necesidad 
 * de modificar el codigo de los demas reportes
 */
public class MainO {

    private static ReportService reportService;

    public static void main(String[] args) {
        List<String> order = new ArrayList<>();
        order.add("req1");
        order.add("req2");
        order.add("req3");

        try {
            reportService = new ReportService(new PDFReportGenerator());
            reportService.generateReport(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
