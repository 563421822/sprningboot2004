package com.qf.sprningboot.conf;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfig {

    private String host;

    private int port;

    public RestHighLevelClient client() {
        HttpHost httpHost = new HttpHost(host, port);
        return null;
    }

}
