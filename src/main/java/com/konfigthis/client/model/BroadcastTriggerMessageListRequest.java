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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * BroadcastTriggerMessageListRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BroadcastTriggerMessageListRequest {
  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId = "_list_id_";

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template = "_template_slug_";

  public static final String SERIALIZED_NAME_NOTIFICATION_CATEGORY = "notification_category";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_CATEGORY)
  private String notificationCategory = "transactional";

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<String> channels = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data = "{ \"key\": { \"k1\": \"v1\", \"k2\": \"v2\" } }";

  public static final String SERIALIZED_NAME_DELAY = "delay";
  @SerializedName(SERIALIZED_NAME_DELAY)
  private String delay;

  public static final String SERIALIZED_NAME_TRIGGER_AT = "trigger_at";
  @SerializedName(SERIALIZED_NAME_TRIGGER_AT)
  private LocalDate triggerAt;

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public BroadcastTriggerMessageListRequest() {
  }

  public BroadcastTriggerMessageListRequest listId(String listId) {
    
    
    
    
    this.listId = listId;
    return this;
  }

   /**
   * unique identifier to user list that you want to send broadcast messages to.
   * @return listId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_list_id_", required = true, value = "unique identifier to user list that you want to send broadcast messages to.")

  public String getListId() {
    return listId;
  }


  public void setListId(String listId) {
    
    
    
    this.listId = listId;
  }


  public BroadcastTriggerMessageListRequest template(String template) {
    
    
    
    
    this.template = template;
    return this;
  }

   /**
   * Unique slug name of the template created on SuprSend dashboard. You can get this by clicking on the clipboard icon next to the Template name on SuprSend templates page.
   * @return template
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_template_slug_", required = true, value = "Unique slug name of the template created on SuprSend dashboard. You can get this by clicking on the clipboard icon next to the Template name on SuprSend templates page.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    
    
    
    this.template = template;
  }


  public BroadcastTriggerMessageListRequest notificationCategory(String notificationCategory) {
    
    
    
    
    this.notificationCategory = notificationCategory;
    return this;
  }

   /**
   * Category in which your notification belongs. You can understand more about them in the [Notification Category](https://docs.suprsend.com/docs/notification-category) documentation
   * @return notificationCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "transactional", required = true, value = "Category in which your notification belongs. You can understand more about them in the [Notification Category](https://docs.suprsend.com/docs/notification-category) documentation")

  public String getNotificationCategory() {
    return notificationCategory;
  }


  public void setNotificationCategory(String notificationCategory) {
    
    
    
    this.notificationCategory = notificationCategory;
  }


  public BroadcastTriggerMessageListRequest channels(List<String> channels) {
    
    
    
    
    this.channels = channels;
    return this;
  }

  public BroadcastTriggerMessageListRequest addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * If set, broadcast will be sent only on the channels defined here irrespective of communication channels present in user profile.
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, broadcast will be sent only on the channels defined here irrespective of communication channels present in user profile.")

  public List<String> getChannels() {
    return channels;
  }


  public void setChannels(List<String> channels) {
    
    
    
    this.channels = channels;
  }


  public BroadcastTriggerMessageListRequest data(String data) {
    
    
    
    
    this.data = data;
    return this;
  }

   /**
   * Mock data to replace the template variables.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{ \"key\": { \"k1\": \"v1\", \"k2\": \"v2\" } }", value = "Mock data to replace the template variables.")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    
    
    
    this.data = data;
  }


  public BroadcastTriggerMessageListRequest delay(String delay) {
    
    
    
    
    this.delay = delay;
    return this;
  }

   /**
   * Broadcast will be halted for the time mentioned in delay, and become active once the delay period is over. Format - &#x60;XXdXXhXXmXXs&#x60; or if its number (n) then delay is in seconds (n)
   * @return delay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Broadcast will be halted for the time mentioned in delay, and become active once the delay period is over. Format - `XXdXXhXXmXXs` or if its number (n) then delay is in seconds (n)")

  public String getDelay() {
    return delay;
  }


  public void setDelay(String delay) {
    
    
    
    this.delay = delay;
  }


  public BroadcastTriggerMessageListRequest triggerAt(LocalDate triggerAt) {
    
    
    
    
    this.triggerAt = triggerAt;
    return this;
  }

   /**
   * Trigger broadcast on a specific date-time. Format - date string in ISO 8601 eg. \&quot;2022-08-27T20:14:51.643Z\&quot;
   * @return triggerAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trigger broadcast on a specific date-time. Format - date string in ISO 8601 eg. \"2022-08-27T20:14:51.643Z\"")

  public LocalDate getTriggerAt() {
    return triggerAt;
  }


  public void setTriggerAt(LocalDate triggerAt) {
    
    
    
    this.triggerAt = triggerAt;
  }


  public BroadcastTriggerMessageListRequest brandId(String brandId) {
    
    
    
    
    this.brandId = brandId;
    return this;
  }

   /**
   * string identifier of the brand this broadcast is associated with
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "string identifier of the brand this broadcast is associated with")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    
    
    
    this.brandId = brandId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BroadcastTriggerMessageListRequest instance itself
   */
  public BroadcastTriggerMessageListRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTriggerMessageListRequest broadcastTriggerMessageListRequest = (BroadcastTriggerMessageListRequest) o;
    return Objects.equals(this.listId, broadcastTriggerMessageListRequest.listId) &&
        Objects.equals(this.template, broadcastTriggerMessageListRequest.template) &&
        Objects.equals(this.notificationCategory, broadcastTriggerMessageListRequest.notificationCategory) &&
        Objects.equals(this.channels, broadcastTriggerMessageListRequest.channels) &&
        Objects.equals(this.data, broadcastTriggerMessageListRequest.data) &&
        Objects.equals(this.delay, broadcastTriggerMessageListRequest.delay) &&
        Objects.equals(this.triggerAt, broadcastTriggerMessageListRequest.triggerAt) &&
        Objects.equals(this.brandId, broadcastTriggerMessageListRequest.brandId)&&
        Objects.equals(this.additionalProperties, broadcastTriggerMessageListRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, template, notificationCategory, channels, data, delay, triggerAt, brandId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTriggerMessageListRequest {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    notificationCategory: ").append(toIndentedString(notificationCategory)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    triggerAt: ").append(toIndentedString(triggerAt)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("list_id");
    openapiFields.add("template");
    openapiFields.add("notification_category");
    openapiFields.add("channels");
    openapiFields.add("data");
    openapiFields.add("delay");
    openapiFields.add("trigger_at");
    openapiFields.add("brand_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("list_id");
    openapiRequiredFields.add("template");
    openapiRequiredFields.add("notification_category");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BroadcastTriggerMessageListRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BroadcastTriggerMessageListRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BroadcastTriggerMessageListRequest is not found in the empty JSON string", BroadcastTriggerMessageListRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BroadcastTriggerMessageListRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if (!jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      if (!jsonObj.get("notification_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notification_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notification_category").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("channels") != null && !jsonObj.get("channels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channels` to be an array in the JSON string but got `%s`", jsonObj.get("channels").toString()));
      }
      if ((jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("delay") != null && !jsonObj.get("delay").isJsonNull()) && !jsonObj.get("delay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delay").toString()));
      }
      if ((jsonObj.get("brand_id") != null && !jsonObj.get("brand_id").isJsonNull()) && !jsonObj.get("brand_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BroadcastTriggerMessageListRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BroadcastTriggerMessageListRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BroadcastTriggerMessageListRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BroadcastTriggerMessageListRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BroadcastTriggerMessageListRequest>() {
           @Override
           public void write(JsonWriter out, BroadcastTriggerMessageListRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BroadcastTriggerMessageListRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BroadcastTriggerMessageListRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BroadcastTriggerMessageListRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BroadcastTriggerMessageListRequest
  * @throws IOException if the JSON string is invalid with respect to BroadcastTriggerMessageListRequest
  */
  public static BroadcastTriggerMessageListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BroadcastTriggerMessageListRequest.class);
  }

 /**
  * Convert an instance of BroadcastTriggerMessageListRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

