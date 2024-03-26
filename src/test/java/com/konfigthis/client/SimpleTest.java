package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://hub.suprsend.com";
        
        configuration.sec0  = "YOUR API KEY";
        SuprSend client = new SuprSend(configuration);
        assertNotNull(client);
    }
}
