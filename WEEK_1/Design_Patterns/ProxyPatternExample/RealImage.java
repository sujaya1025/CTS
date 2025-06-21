package ProxyPatternExample;

public class RealImage implements Image{
  private String file;

  public RealImage(String file){
    this.file = file;
    loadFromRemoteServer();
  }
  
  private void loadFromRemoteServer(){
    System.out.println("Loading the image from remote server: "+file);
  }

  public void display(){
    System.out.println("Displaying: "+file);
  }
}
