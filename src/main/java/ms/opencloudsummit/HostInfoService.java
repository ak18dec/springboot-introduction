package ms.opencloudsummit;

public class HostInfoService {

    private final String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
    
    public String getHostName(){
        return this.hostname;
    }
    
}