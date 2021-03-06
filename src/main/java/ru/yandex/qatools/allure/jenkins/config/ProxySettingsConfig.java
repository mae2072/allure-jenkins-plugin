package ru.yandex.qatools.allure.jenkins.config;

import java.io.Serializable;

/**
 * eroshenkoam
 * 19/11/14
 */
public class ProxySettingsConfig implements Serializable {

    private boolean active;

    private String host;

    private int port;

    private String username;

    private String password;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
