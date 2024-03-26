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
import com.konfigthis.client.model.SubscriberListCreateListRequest;
import com.konfigthis.client.model.SubscriberListRemoveSubscribersFromListRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriberListApi
 */
@Disabled
public class SubscriberListApiTest {

    private static SubscriberListApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SubscriberListApi(apiClient);
    }

    /**
     * Create a List
     *
     * API to create / manage lists to send notification to a bulk list of users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createListTest() throws ApiException {
        String listId = null;
        String listName = null;
        String listDescription = null;
        Object response = api.createList(listId)
                .listName(listName)
                .listDescription(listDescription)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete List
     *
     * API to delete a list created in your workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteListTest() throws ApiException {
        String listId = null;
        Object response = api.deleteList(listId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all Lists
     *
     * API to get the data of all the lists created in your workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllListsTest() throws ApiException {
        String limit = null;
        String offset = null;
        Object response = api.getAllLists()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Get List data
     *
     * API to get information corresponding to a list id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListDataTest() throws ApiException {
        String listId = null;
        Object response = api.getListData(listId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove Subscribers from List
     *
     * API to remove users / subscribers from the list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSubscribersFromListTest() throws ApiException {
        String listId = null;
        List<String> distinctIds = null;
        Object response = api.removeSubscribersFromList(listId)
                .distinctIds(distinctIds)
                .execute();
        // TODO: test validations
    }

}