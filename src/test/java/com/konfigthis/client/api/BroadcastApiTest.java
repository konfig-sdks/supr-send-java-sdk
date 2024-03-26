/*
 * SuprSend API
 * SuprSend is a central communication stack for easily creating, managing and delivering notifications to your end users on multiple channels. Our single notification API has all the features set, which enables you to send notifications in a reliable and scalable manner and take care of end user experience, thereby eliminating the need to develop any notification service in-house for transactional/engagement notifications.
 *
 * The version of the OpenAPI document: 1.2.1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.BroadcastTriggerMessageListRequest;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BroadcastApi
 */
@Disabled
public class BroadcastApiTest {

    private static BroadcastApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BroadcastApi(apiClient);
    }

    /**
     * Trigger Broadcast
     *
     * API to trigger broadcast messages on a list of users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerMessageListTest() throws ApiException {
        String listId = null;
        String template = null;
        String notificationCategory = null;
        String workspaceKey = null;
        List<String> channels = null;
        String data = null;
        String delay = null;
        LocalDate triggerAt = null;
        String brandId = null;
        Object response = api.triggerMessageList(listId, template, notificationCategory, workspaceKey)
                .channels(channels)
                .data(data)
                .delay(delay)
                .triggerAt(triggerAt)
                .brandId(brandId)
                .execute();
        // TODO: test validations
    }

}