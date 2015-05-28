package com.jenkins.plugins.rally.config;

public class RallyConfiguration {
    private final String apiKey;
    private final String workspaceName;
    private final String scmName;

    public RallyConfiguration(String apiKey, String workspaceName, String scmName) {
        this.apiKey = apiKey;
        this.workspaceName = workspaceName;
        this.scmName = scmName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }

    public String getScmName() {
        return scmName;
    }
}