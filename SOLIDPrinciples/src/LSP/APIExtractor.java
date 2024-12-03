package LSP;


public class APIExtractor extends DataExtractor {
 public APIExtractor(String source) {
     super(source);
 }

 @Override
 public void connect() {
     System.out.println("Connecting to API: " + source);
 }

 @Override
 public void extractData() {
     System.out.println("Fetching data from API...");

 }

 @Override
 public void close() {
     System.out.println("Disconnecting from API.");
 }
}
