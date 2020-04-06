package com.github.phillipkruger.intro.springboot;

public class HostInfoService {

    private final String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
    
    public String getHostName(){
        return this.hostname;
    }
    
}