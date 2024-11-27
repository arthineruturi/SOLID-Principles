package LSP;

public class Main {
 public static void main(String[] args) {
     
     ETLExecutor executor = new ETLExecutor();

     DataExtractor dbExtractor = new DatabaseExtractor("jdbc:mysql://localhost:3306/mydb");
     DataExtractor csvExtractor = new CSVExtractor("data/input.csv");
     DataExtractor apiExtractor = new APIExtractor("https://api.example.com/data");

     System.out.println("Running ETL for Database:");
     executor.runETL(dbExtractor);

     System.out.println("\nRunning ETL for CSV:");
     executor.runETL(csvExtractor);

     System.out.println("\nRunning ETL for API:");
     executor.runETL(apiExtractor);
 }
}
