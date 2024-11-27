package LSP;


public class DatabaseExtractor extends DataExtractor {
 public DatabaseExtractor(String source) {
     super(source);
 }

 @Override
 public void connect() {
     System.out.println("Connecting to the database: " + source);
 }

 @Override
 public void extractData() {
     System.out.println("Extracting data from database...");
 
 }

 @Override
 public void close() {
     System.out.println("Closing database connection.");
 }
}
