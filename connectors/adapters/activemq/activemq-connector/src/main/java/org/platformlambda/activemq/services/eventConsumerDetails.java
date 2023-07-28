package org.platformlambda.activemq.services;

import java.util.Properties;

public class eventConsumerDetails {
    private final String domain;
    private final Properties properties;
    private final String topic;
    private final int partition;
    private final String[] parameters;

    public eventConsumerDetails(String domain, Properties properties, String topic, int partition, String... parameters) {
        this.domain = domain;
        this.properties = properties;
        this.topic = topic;
        this.partition = partition;
        this.parameters = parameters;
    }

    public String getDomain() {
        return domain;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getTopic() {
        return topic;
    }

    public int getPartition() {
        return partition;
    }

    public String[] getParameters() {
        return parameters;
    }
}
