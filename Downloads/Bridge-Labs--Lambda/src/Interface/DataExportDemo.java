package Interface;

interface Exporter {
    void export();

    default void exportToJSON() {
        System.out.println("Exported data to JSON format.");
    }
}

class CSVExporter implements Exporter {
    public void export() {
        System.out.println("Exported data to CSV file.");
    }
}

class PDFExporter implements Exporter {
    public void export() {
        System.out.println("Exported data to PDF file.");
    }
}

public class DataExportDemo {
    public static void main(String[] args) {
        CSVExporter csv = new CSVExporter();
        PDFExporter pdf = new PDFExporter();

        csv.export();
        csv.exportToJSON();

        pdf.export();
        pdf.exportToJSON();
    }
}
