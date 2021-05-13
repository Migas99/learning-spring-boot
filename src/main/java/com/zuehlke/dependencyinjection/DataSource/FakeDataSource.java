package com.zuehlke.dependencyinjection.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FakeDataSource {

    private String username;
    private String password;
    private String url;

    public FakeDataSource(@Value("${db.username}") String username, @Value("${db.password}") String password, @Value("${db.url}") String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
