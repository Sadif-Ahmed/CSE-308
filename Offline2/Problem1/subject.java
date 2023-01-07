import java.io.IOException;

public interface subject {
    void registerobserver(observer obs);
    boolean removeobserver(String name);
    void notifyobservers() throws IOException;  
}
