package LSP;

public class ETLExecutor {
 public void runETL(DataExtractor extractor) {
     extractor.connect();
     extractor.extractData();
     extractor.close();
 }
}
