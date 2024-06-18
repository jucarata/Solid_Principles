import java.util.List;
/*
 * Imaginemos este caso, si alguien quisiera crear un nuevo tipo de reporte tendria que modificar esta clase
 * Tendria que: Añadir un condicional, crear una nueva funcion y ademas cambiar la modificacion en la clase principal tambien
 * Esto es algo que incumple con el Open-Closed Principle
 */
public class ReportServiceP {


    public void generateReport(List<String> orders, ReportType type) throws Exception{
        if(type == ReportType.PDF){
            generatePDFReport(orders);
        } else if(type == ReportType.EXCEL){
            generateEXCELReport(orders);
        } else if(type == ReportType.JSON){
            generateJSONReport(orders);
        } else if(type == ReportType.DOCS){
            generateDOCSReport(orders);
        } else {
            throw new Exception("Reporte no valido");
        }
    }

    private void generatePDFReport(List<String> orders){
        // Logica para implementar el reporte en PDF
    }

    private void generateEXCELReport(List<String> orders){
        // Logica para implementar el reporte en EXCEL
    }
    
    private void generateJSONReport(List<String> orders){
        // Logica para implementar el reporte en JSON
    }

    private void generateDOCSReport(List<String> orders){
        // Logica para implementar el reporte en DOCS
    }
}


enum ReportType{
    PDF, EXCEL, JSON, DOCS
}