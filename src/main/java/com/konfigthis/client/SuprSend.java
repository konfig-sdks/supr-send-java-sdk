package com.konfigthis.client;

import com.konfigthis.client.api.BrandApi;
import com.konfigthis.client.api.BroadcastApi;
import com.konfigthis.client.api.EventApi;
import com.konfigthis.client.api.PrefCategoryApi;
import com.konfigthis.client.api.PreferenceApi;
import com.konfigthis.client.api.SubscriberApi;
import com.konfigthis.client.api.SubscriberListApi;
import com.konfigthis.client.api.SyncApi;
import com.konfigthis.client.api.TemplateApi;
import com.konfigthis.client.api.WorkflowApi;

public class SuprSend {
    private ApiClient apiClient;
    public final BrandApi brand;
    public final BroadcastApi broadcast;
    public final EventApi event;
    public final PrefCategoryApi prefCategory;
    public final PreferenceApi preference;
    public final SubscriberApi subscriber;
    public final SubscriberListApi subscriberList;
    public final SyncApi sync;
    public final TemplateApi template;
    public final WorkflowApi workflow;

    public SuprSend() {
        this(null);
    }

    public SuprSend(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.brand = new BrandApi(this.apiClient);
        this.broadcast = new BroadcastApi(this.apiClient);
        this.event = new EventApi(this.apiClient);
        this.prefCategory = new PrefCategoryApi(this.apiClient);
        this.preference = new PreferenceApi(this.apiClient);
        this.subscriber = new SubscriberApi(this.apiClient);
        this.subscriberList = new SubscriberListApi(this.apiClient);
        this.sync = new SyncApi(this.apiClient);
        this.template = new TemplateApi(this.apiClient);
        this.workflow = new WorkflowApi(this.apiClient);
    }

}
