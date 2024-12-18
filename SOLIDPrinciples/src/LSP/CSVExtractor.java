package LSP;


public class CSVExtractor extends DataExtractor {
 public CSVExtractor(String source) {
     super(source);
 }

 @Override
 public void connect() {
     System.out.println("Opening CSV file: " + source);
 }

 @Override
 public void extractData() {
     System.out.println("Reading data from CSV file...");
    
 }

 @Override
 public void close() {
     System.out.println("Closing CSV file.");
 }
}
