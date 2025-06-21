package ProxyPatternExample;

public class ProxyImage implements Image{
    private RealImage ri;
    private String file;

    public ProxyImage(String file){
        this.file = file;
    }

    public void display(){
        if(ri == null) ri = new RealImage(file);
        ri.display();
    }
    
}
