package OCP;


public class Main {
 public static void main(String[] args) {
     OperatingSystem os = new OperatingSystem();

     os.callFunction("123-456-7890"); 
     os.messageFunction("123-456-7890", "Hello! How are you?"); 

    
     os.addFeature("Camera", new CameraFeature());   
    
     os.accessFeature("Camera");     

     os.accessFeature("MusicPlayer"); 
 }
}
