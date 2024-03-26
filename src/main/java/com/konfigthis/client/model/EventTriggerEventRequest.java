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
import com.konfigthis.client.model.EventTriggerEventRequestUserOperationsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * EventTriggerEventRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EventTriggerEventRequest {
  public static final String SERIALIZED_NAME_DISTINCT_ID = "distinct_id";
  @SerializedName(SERIALIZED_NAME_DISTINCT_ID)
  private String distinctId = "_distinct_id_";

  public static final String SERIALIZED_NAME_$_USER_OPERATIONS = "$user_operations";
  @SerializedName(SERIALIZED_NAME_$_USER_OPERATIONS)
  private List<EventTriggerEventRequestUserOperationsInner> $userOperations = null;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event = "_event_name_";

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private String properties = "{}";

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_$_IDEMPOTENCY_KEY = "$idempotency_key";
  @SerializedName(SERIALIZED_NAME_$_IDEMPOTENCY_KEY)
  private String $idempotencyKey;

  public EventTriggerEventRequest() {
  }

  public EventTriggerEventRequest distinctId(String distinctId) {
    
    
    
    
    this.distinctId = distinctId;
    return this;
  }

   /**
   * distinct_id of recipient who should receive the notification
   * @return distinctId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_distinct_id_", required = true, value = "distinct_id of recipient who should receive the notification")

  public String getDistinctId() {
    return distinctId;
  }


  public void setDistinctId(String distinctId) {
    
    
    
    this.distinctId = distinctId;
  }


  public EventTriggerEventRequest $userOperations(List<EventTriggerEventRequestUserOperationsInner> $userOperations) {
    
    
    
    
    this.$userOperations = $userOperations;
    return this;
  }

  public EventTriggerEventRequest add$UserOperationsItem(EventTriggerEventRequestUserOperationsInner $userOperationsItem) {
    if (this.$userOperations == null) {
      this.$userOperations = new ArrayList<>();
    }
    this.$userOperations.add($userOperationsItem);
    return this;
  }

   /**
   * Creating &amp; updating users on SuprSend is done by sending an &#x60;$user_operations&#x60; event. All changes can be combined in one API call in an easy to replay format
   * @return $userOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creating & updating users on SuprSend is done by sending an `$user_operations` event. All changes can be combined in one API call in an easy to replay format")

  public List<EventTriggerEventRequestUserOperationsInner> get$UserOperations() {
    return $userOperations;
  }


  public void set$UserOperations(List<EventTriggerEventRequestUserOperationsInner> $userOperations) {
    
    
    
    this.$userOperations = $userOperations;
  }


  public EventTriggerEventRequest event(String event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * string identifier for the event like &#x60;product_purchased&#x60;
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "_event_name_", required = true, value = "string identifier for the event like `product_purchased`")

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    
    
    
    this.event = event;
  }


  public EventTriggerEventRequest properties(String properties) {
    
    
    
    
    this.properties = properties;
    return this;
  }

   /**
   * a dictionary representing event attributes like &#x60;first_name&#x60;. Event properties can be used to pass template variables in case of event based trigger
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "a dictionary representing event attributes like `first_name`. Event properties can be used to pass template variables in case of event based trigger")

  public String getProperties() {
    return properties;
  }


  public void setProperties(String properties) {
    
    
    
    this.properties = properties;
  }


  public EventTriggerEventRequest brandId(String brandId) {
    
    
    
    
    this.brandId = brandId;
    return this;
  }

   /**
   * string identifier of the brand this event is associated with
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "string identifier of the brand this event is associated with")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    
    
    
    this.brandId = brandId;
  }


  public EventTriggerEventRequest $idempotencyKey(String $idempotencyKey) {
    
    
    
    
    this.$idempotencyKey = $idempotencyKey;
    return this;
  }

   /**
   * Idempotency key (valid for 24hours)
   * @return $idempotencyKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Idempotency key (valid for 24hours)")

  public String get$IdempotencyKey() {
    return $idempotencyKey;
  }


  public void set$IdempotencyKey(String $idempotencyKey) {
    
    
    
    this.$idempotencyKey = $idempotencyKey;
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
   * @return the EventTriggerEventRequest instance itself
   */
  public EventTriggerEventRequest putAdditionalProperty(String key, Object value) {
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
    EventTriggerEventRequest eventTriggerEventRequest = (EventTriggerEventRequest) o;
    return Objects.equals(this.distinctId, eventTriggerEventRequest.distinctId) &&
        Objects.equals(this.$userOperations, eventTriggerEventRequest.$userOperations) &&
        Objects.equals(this.event, eventTriggerEventRequest.event) &&
        Objects.equals(this.properties, eventTriggerEventRequest.properties) &&
        Objects.equals(this.brandId, eventTriggerEventRequest.brandId) &&
        Objects.equals(this.$idempotencyKey, eventTriggerEventRequest.$idempotencyKey)&&
        Objects.equals(this.additionalProperties, eventTriggerEventRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distinctId, $userOperations, event, properties, brandId, $idempotencyKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTriggerEventRequest {\n");
    sb.append("    distinctId: ").append(toIndentedString(distinctId)).append("\n");
    sb.append("    $userOperations: ").append(toIndentedString($userOperations)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    $idempotencyKey: ").append(toIndentedString($idempotencyKey)).append("\n");
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
    openapiFields.add("distinct_id");
    openapiFields.add("$user_operations");
    openapiFields.add("event");
    openapiFields.add("properties");
    openapiFields.add("brand_id");
    openapiFields.add("$idempotency_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("distinct_id");
    openapiRequiredFields.add("event");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventTriggerEventRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventTriggerEventRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventTriggerEventRequest is not found in the empty JSON string", EventTriggerEventRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventTriggerEventRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("distinct_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distinct_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distinct_id").toString()));
      }
      if (jsonObj.get("$user_operations") != null && !jsonObj.get("$user_operations").isJsonNull()) {
        JsonArray jsonArray$userOperations = jsonObj.getAsJsonArray("$user_operations");
        if (jsonArray$userOperations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("$user_operations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `$user_operations` to be an array in the JSON string but got `%s`", jsonObj.get("$user_operations").toString()));
          }

          // validate the optional field `$user_operations` (array)
          for (int i = 0; i < jsonArray$userOperations.size(); i++) {
            EventTriggerEventRequestUserOperationsInner.validateJsonObject(jsonArray$userOperations.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if ((jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) && !jsonObj.get("properties").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `properties` to be a primitive type in the JSON string but got `%s`", jsonObj.get("properties").toString()));
      }
      if ((jsonObj.get("brand_id") != null && !jsonObj.get("brand_id").isJsonNull()) && !jsonObj.get("brand_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_id").toString()));
      }
      if ((jsonObj.get("$idempotency_key") != null && !jsonObj.get("$idempotency_key").isJsonNull()) && !jsonObj.get("$idempotency_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$idempotency_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$idempotency_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventTriggerEventRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventTriggerEventRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventTriggerEventRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventTriggerEventRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EventTriggerEventRequest>() {
           @Override
           public void write(JsonWriter out, EventTriggerEventRequest value) throws IOException {
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
           public EventTriggerEventRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EventTriggerEventRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EventTriggerEventRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventTriggerEventRequest
  * @throws IOException if the JSON string is invalid with respect to EventTriggerEventRequest
  */
  public static EventTriggerEventRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventTriggerEventRequest.class);
  }

 /**
  * Convert an instance of EventTriggerEventRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

