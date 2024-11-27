package LSP;

public abstract class DataExtractor {
 protected String source;

 public DataExtractor(String source) {
     this.source = source;
 }

 public abstract void connect();
 public abstract void extractData();
 public abstract void close();
}
