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
import com.konfigthis.client.model.TemplateGetDetailsResponseChannelsInner;
import com.konfigthis.client.model.TemplateGetDetailsResponseDefaultLanguage;
import com.konfigthis.client.model.TemplateGetDetailsResponseUpdatedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * TemplateGetDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TemplateGetDetailsResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive = true;

  public static final String SERIALIZED_NAME_DEFAULT_LANGUAGE = "default_language";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LANGUAGE)
  private TemplateGetDetailsResponseDefaultLanguage defaultLanguage;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updated_by";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private TemplateGetDetailsResponseUpdatedBy updatedBy;

  public static final String SERIALIZED_NAME_LAST_TRIGGERED_AT = "last_triggered_at";
  @SerializedName(SERIALIZED_NAME_LAST_TRIGGERED_AT)
  private String lastTriggeredAt;

  public static final String SERIALIZED_NAME_IS_AUTO_TRANSLATE_ENABLED = "is_auto_translate_enabled";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_TRANSLATE_ENABLED)
  private Boolean isAutoTranslateEnabled = true;

  public static final String SERIALIZED_NAME_ENABLED_LANGUAGES = "enabled_languages";
  @SerializedName(SERIALIZED_NAME_ENABLED_LANGUAGES)
  private List<String> enabledLanguages = null;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<TemplateGetDetailsResponseChannelsInner> channels = null;

  public TemplateGetDetailsResponse() {
  }

  public TemplateGetDetailsResponse description(Object description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDescription() {
    return description;
  }


  public void setDescription(Object description) {
    
    
    
    this.description = description;
  }


  public TemplateGetDetailsResponse id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2445", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public TemplateGetDetailsResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Grocery Purchased", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TemplateGetDetailsResponse slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grocery-purchased", value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public TemplateGetDetailsResponse isActive(Boolean isActive) {
    
    
    
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    
    
    
    this.isActive = isActive;
  }


  public TemplateGetDetailsResponse defaultLanguage(TemplateGetDetailsResponseDefaultLanguage defaultLanguage) {
    
    
    
    
    this.defaultLanguage = defaultLanguage;
    return this;
  }

   /**
   * Get defaultLanguage
   * @return defaultLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateGetDetailsResponseDefaultLanguage getDefaultLanguage() {
    return defaultLanguage;
  }


  public void setDefaultLanguage(TemplateGetDetailsResponseDefaultLanguage defaultLanguage) {
    
    
    
    this.defaultLanguage = defaultLanguage;
  }


  public TemplateGetDetailsResponse createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-25T04:53:39.237291Z", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public TemplateGetDetailsResponse updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-28T05:06:22.461443Z", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public TemplateGetDetailsResponse updatedBy(TemplateGetDetailsResponseUpdatedBy updatedBy) {
    
    
    
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateGetDetailsResponseUpdatedBy getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(TemplateGetDetailsResponseUpdatedBy updatedBy) {
    
    
    
    this.updatedBy = updatedBy;
  }


  public TemplateGetDetailsResponse lastTriggeredAt(String lastTriggeredAt) {
    
    
    
    
    this.lastTriggeredAt = lastTriggeredAt;
    return this;
  }

   /**
   * Get lastTriggeredAt
   * @return lastTriggeredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-10T12:44:03.361158Z", value = "")

  public String getLastTriggeredAt() {
    return lastTriggeredAt;
  }


  public void setLastTriggeredAt(String lastTriggeredAt) {
    
    
    
    this.lastTriggeredAt = lastTriggeredAt;
  }


  public TemplateGetDetailsResponse isAutoTranslateEnabled(Boolean isAutoTranslateEnabled) {
    
    
    
    
    this.isAutoTranslateEnabled = isAutoTranslateEnabled;
    return this;
  }

   /**
   * Get isAutoTranslateEnabled
   * @return isAutoTranslateEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsAutoTranslateEnabled() {
    return isAutoTranslateEnabled;
  }


  public void setIsAutoTranslateEnabled(Boolean isAutoTranslateEnabled) {
    
    
    
    this.isAutoTranslateEnabled = isAutoTranslateEnabled;
  }


  public TemplateGetDetailsResponse enabledLanguages(List<String> enabledLanguages) {
    
    
    
    
    this.enabledLanguages = enabledLanguages;
    return this;
  }

  public TemplateGetDetailsResponse addEnabledLanguagesItem(String enabledLanguagesItem) {
    if (this.enabledLanguages == null) {
      this.enabledLanguages = new ArrayList<>();
    }
    this.enabledLanguages.add(enabledLanguagesItem);
    return this;
  }

   /**
   * Get enabledLanguages
   * @return enabledLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEnabledLanguages() {
    return enabledLanguages;
  }


  public void setEnabledLanguages(List<String> enabledLanguages) {
    
    
    
    this.enabledLanguages = enabledLanguages;
  }


  public TemplateGetDetailsResponse channels(List<TemplateGetDetailsResponseChannelsInner> channels) {
    
    
    
    
    this.channels = channels;
    return this;
  }

  public TemplateGetDetailsResponse addChannelsItem(TemplateGetDetailsResponseChannelsInner channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TemplateGetDetailsResponseChannelsInner> getChannels() {
    return channels;
  }


  public void setChannels(List<TemplateGetDetailsResponseChannelsInner> channels) {
    
    
    
    this.channels = channels;
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
   * @return the TemplateGetDetailsResponse instance itself
   */
  public TemplateGetDetailsResponse putAdditionalProperty(String key, Object value) {
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
    TemplateGetDetailsResponse templateGetDetailsResponse = (TemplateGetDetailsResponse) o;
    return Objects.equals(this.description, templateGetDetailsResponse.description) &&
        Objects.equals(this.id, templateGetDetailsResponse.id) &&
        Objects.equals(this.name, templateGetDetailsResponse.name) &&
        Objects.equals(this.slug, templateGetDetailsResponse.slug) &&
        Objects.equals(this.isActive, templateGetDetailsResponse.isActive) &&
        Objects.equals(this.defaultLanguage, templateGetDetailsResponse.defaultLanguage) &&
        Objects.equals(this.createdAt, templateGetDetailsResponse.createdAt) &&
        Objects.equals(this.updatedAt, templateGetDetailsResponse.updatedAt) &&
        Objects.equals(this.updatedBy, templateGetDetailsResponse.updatedBy) &&
        Objects.equals(this.lastTriggeredAt, templateGetDetailsResponse.lastTriggeredAt) &&
        Objects.equals(this.isAutoTranslateEnabled, templateGetDetailsResponse.isAutoTranslateEnabled) &&
        Objects.equals(this.enabledLanguages, templateGetDetailsResponse.enabledLanguages) &&
        Objects.equals(this.channels, templateGetDetailsResponse.channels)&&
        Objects.equals(this.additionalProperties, templateGetDetailsResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, slug, isActive, defaultLanguage, createdAt, updatedAt, updatedBy, lastTriggeredAt, isAutoTranslateEnabled, enabledLanguages, channels, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateGetDetailsResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    lastTriggeredAt: ").append(toIndentedString(lastTriggeredAt)).append("\n");
    sb.append("    isAutoTranslateEnabled: ").append(toIndentedString(isAutoTranslateEnabled)).append("\n");
    sb.append("    enabledLanguages: ").append(toIndentedString(enabledLanguages)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("is_active");
    openapiFields.add("default_language");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("updated_by");
    openapiFields.add("last_triggered_at");
    openapiFields.add("is_auto_translate_enabled");
    openapiFields.add("enabled_languages");
    openapiFields.add("channels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateGetDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateGetDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateGetDetailsResponse is not found in the empty JSON string", TemplateGetDetailsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      // validate the optional field `default_language`
      if (jsonObj.get("default_language") != null && !jsonObj.get("default_language").isJsonNull()) {
        TemplateGetDetailsResponseDefaultLanguage.validateJsonObject(jsonObj.getAsJsonObject("default_language"));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      // validate the optional field `updated_by`
      if (jsonObj.get("updated_by") != null && !jsonObj.get("updated_by").isJsonNull()) {
        TemplateGetDetailsResponseUpdatedBy.validateJsonObject(jsonObj.getAsJsonObject("updated_by"));
      }
      if ((jsonObj.get("last_triggered_at") != null && !jsonObj.get("last_triggered_at").isJsonNull()) && !jsonObj.get("last_triggered_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_triggered_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_triggered_at").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("enabled_languages") != null && !jsonObj.get("enabled_languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabled_languages` to be an array in the JSON string but got `%s`", jsonObj.get("enabled_languages").toString()));
      }
      if (jsonObj.get("channels") != null && !jsonObj.get("channels").isJsonNull()) {
        JsonArray jsonArraychannels = jsonObj.getAsJsonArray("channels");
        if (jsonArraychannels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("channels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `channels` to be an array in the JSON string but got `%s`", jsonObj.get("channels").toString()));
          }

          // validate the optional field `channels` (array)
          for (int i = 0; i < jsonArraychannels.size(); i++) {
            TemplateGetDetailsResponseChannelsInner.validateJsonObject(jsonArraychannels.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateGetDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateGetDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateGetDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateGetDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateGetDetailsResponse>() {
           @Override
           public void write(JsonWriter out, TemplateGetDetailsResponse value) throws IOException {
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
           public TemplateGetDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateGetDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateGetDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateGetDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to TemplateGetDetailsResponse
  */
  public static TemplateGetDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateGetDetailsResponse.class);
  }

 /**
  * Convert an instance of TemplateGetDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

