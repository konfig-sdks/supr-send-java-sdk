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
import com.konfigthis.client.model.TemplateGetContentChannelResponseVersionsInnerTemplatesInner;
import com.konfigthis.client.model.TemplateGetContentChannelResponseVersionsInnerUpdatedBy;
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
 * TemplateGetContentChannelResponseVersionsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TemplateGetContentChannelResponseVersionsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<TemplateGetContentChannelResponseVersionsInnerTemplatesInner> templates = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VERSION_TAG = "version_tag";
  @SerializedName(SERIALIZED_NAME_VERSION_TAG)
  private String versionTag;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updated_by";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private TemplateGetContentChannelResponseVersionsInnerUpdatedBy updatedBy;

  public static final String SERIALIZED_NAME_VERSION_TAG_USER = "version_tag_user";
  @SerializedName(SERIALIZED_NAME_VERSION_TAG_USER)
  private String versionTagUser;

  public static final String SERIALIZED_NAME_PUBLISHED_LANGUAGES = "published_languages";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_LANGUAGES)
  private List<String> publishedLanguages = null;

  public static final String SERIALIZED_NAME_APPARENT_PUBLISHED_LANGUAGES = "apparent_published_languages";
  @SerializedName(SERIALIZED_NAME_APPARENT_PUBLISHED_LANGUAGES)
  private List<String> apparentPublishedLanguages = null;

  public TemplateGetContentChannelResponseVersionsInner() {
  }

  public TemplateGetContentChannelResponseVersionsInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10830", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public TemplateGetContentChannelResponseVersionsInner templates(List<TemplateGetContentChannelResponseVersionsInnerTemplatesInner> templates) {
    
    
    
    
    this.templates = templates;
    return this;
  }

  public TemplateGetContentChannelResponseVersionsInner addTemplatesItem(TemplateGetContentChannelResponseVersionsInnerTemplatesInner templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TemplateGetContentChannelResponseVersionsInnerTemplatesInner> getTemplates() {
    return templates;
  }


  public void setTemplates(List<TemplateGetContentChannelResponseVersionsInnerTemplatesInner> templates) {
    
    
    
    this.templates = templates;
  }


  public TemplateGetContentChannelResponseVersionsInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public TemplateGetContentChannelResponseVersionsInner versionTag(String versionTag) {
    
    
    
    
    this.versionTag = versionTag;
    return this;
  }

   /**
   * Get versionTag
   * @return versionTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getVersionTag() {
    return versionTag;
  }


  public void setVersionTag(String versionTag) {
    
    
    
    this.versionTag = versionTag;
  }


  public TemplateGetContentChannelResponseVersionsInner createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-25T04:53:40.016463Z", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public TemplateGetContentChannelResponseVersionsInner updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-25T04:53:40.083969Z", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public TemplateGetContentChannelResponseVersionsInner updatedBy(TemplateGetContentChannelResponseVersionsInnerUpdatedBy updatedBy) {
    
    
    
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateGetContentChannelResponseVersionsInnerUpdatedBy getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(TemplateGetContentChannelResponseVersionsInnerUpdatedBy updatedBy) {
    
    
    
    this.updatedBy = updatedBy;
  }


  public TemplateGetContentChannelResponseVersionsInner versionTagUser(String versionTagUser) {
    
    
    
    
    this.versionTagUser = versionTagUser;
    return this;
  }

   /**
   * Get versionTagUser
   * @return versionTagUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v1", value = "")

  public String getVersionTagUser() {
    return versionTagUser;
  }


  public void setVersionTagUser(String versionTagUser) {
    
    
    
    this.versionTagUser = versionTagUser;
  }


  public TemplateGetContentChannelResponseVersionsInner publishedLanguages(List<String> publishedLanguages) {
    
    
    
    
    this.publishedLanguages = publishedLanguages;
    return this;
  }

  public TemplateGetContentChannelResponseVersionsInner addPublishedLanguagesItem(String publishedLanguagesItem) {
    if (this.publishedLanguages == null) {
      this.publishedLanguages = new ArrayList<>();
    }
    this.publishedLanguages.add(publishedLanguagesItem);
    return this;
  }

   /**
   * Get publishedLanguages
   * @return publishedLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPublishedLanguages() {
    return publishedLanguages;
  }


  public void setPublishedLanguages(List<String> publishedLanguages) {
    
    
    
    this.publishedLanguages = publishedLanguages;
  }


  public TemplateGetContentChannelResponseVersionsInner apparentPublishedLanguages(List<String> apparentPublishedLanguages) {
    
    
    
    
    this.apparentPublishedLanguages = apparentPublishedLanguages;
    return this;
  }

  public TemplateGetContentChannelResponseVersionsInner addApparentPublishedLanguagesItem(String apparentPublishedLanguagesItem) {
    if (this.apparentPublishedLanguages == null) {
      this.apparentPublishedLanguages = new ArrayList<>();
    }
    this.apparentPublishedLanguages.add(apparentPublishedLanguagesItem);
    return this;
  }

   /**
   * Get apparentPublishedLanguages
   * @return apparentPublishedLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getApparentPublishedLanguages() {
    return apparentPublishedLanguages;
  }


  public void setApparentPublishedLanguages(List<String> apparentPublishedLanguages) {
    
    
    
    this.apparentPublishedLanguages = apparentPublishedLanguages;
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
   * @return the TemplateGetContentChannelResponseVersionsInner instance itself
   */
  public TemplateGetContentChannelResponseVersionsInner putAdditionalProperty(String key, Object value) {
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
    TemplateGetContentChannelResponseVersionsInner templateGetContentChannelResponseVersionsInner = (TemplateGetContentChannelResponseVersionsInner) o;
    return Objects.equals(this.id, templateGetContentChannelResponseVersionsInner.id) &&
        Objects.equals(this.templates, templateGetContentChannelResponseVersionsInner.templates) &&
        Objects.equals(this.status, templateGetContentChannelResponseVersionsInner.status) &&
        Objects.equals(this.versionTag, templateGetContentChannelResponseVersionsInner.versionTag) &&
        Objects.equals(this.createdAt, templateGetContentChannelResponseVersionsInner.createdAt) &&
        Objects.equals(this.updatedAt, templateGetContentChannelResponseVersionsInner.updatedAt) &&
        Objects.equals(this.updatedBy, templateGetContentChannelResponseVersionsInner.updatedBy) &&
        Objects.equals(this.versionTagUser, templateGetContentChannelResponseVersionsInner.versionTagUser) &&
        Objects.equals(this.publishedLanguages, templateGetContentChannelResponseVersionsInner.publishedLanguages) &&
        Objects.equals(this.apparentPublishedLanguages, templateGetContentChannelResponseVersionsInner.apparentPublishedLanguages)&&
        Objects.equals(this.additionalProperties, templateGetContentChannelResponseVersionsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templates, status, versionTag, createdAt, updatedAt, updatedBy, versionTagUser, publishedLanguages, apparentPublishedLanguages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateGetContentChannelResponseVersionsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    versionTagUser: ").append(toIndentedString(versionTagUser)).append("\n");
    sb.append("    publishedLanguages: ").append(toIndentedString(publishedLanguages)).append("\n");
    sb.append("    apparentPublishedLanguages: ").append(toIndentedString(apparentPublishedLanguages)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("templates");
    openapiFields.add("status");
    openapiFields.add("version_tag");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("updated_by");
    openapiFields.add("version_tag_user");
    openapiFields.add("published_languages");
    openapiFields.add("apparent_published_languages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateGetContentChannelResponseVersionsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateGetContentChannelResponseVersionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateGetContentChannelResponseVersionsInner is not found in the empty JSON string", TemplateGetContentChannelResponseVersionsInner.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("templates") != null && !jsonObj.get("templates").isJsonNull()) {
        JsonArray jsonArraytemplates = jsonObj.getAsJsonArray("templates");
        if (jsonArraytemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `templates` to be an array in the JSON string but got `%s`", jsonObj.get("templates").toString()));
          }

          // validate the optional field `templates` (array)
          for (int i = 0; i < jsonArraytemplates.size(); i++) {
            TemplateGetContentChannelResponseVersionsInnerTemplatesInner.validateJsonObject(jsonArraytemplates.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("version_tag") != null && !jsonObj.get("version_tag").isJsonNull()) && !jsonObj.get("version_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_tag").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      // validate the optional field `updated_by`
      if (jsonObj.get("updated_by") != null && !jsonObj.get("updated_by").isJsonNull()) {
        TemplateGetContentChannelResponseVersionsInnerUpdatedBy.validateJsonObject(jsonObj.getAsJsonObject("updated_by"));
      }
      if ((jsonObj.get("version_tag_user") != null && !jsonObj.get("version_tag_user").isJsonNull()) && !jsonObj.get("version_tag_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_tag_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_tag_user").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("published_languages") != null && !jsonObj.get("published_languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `published_languages` to be an array in the JSON string but got `%s`", jsonObj.get("published_languages").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("apparent_published_languages") != null && !jsonObj.get("apparent_published_languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `apparent_published_languages` to be an array in the JSON string but got `%s`", jsonObj.get("apparent_published_languages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateGetContentChannelResponseVersionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateGetContentChannelResponseVersionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateGetContentChannelResponseVersionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateGetContentChannelResponseVersionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateGetContentChannelResponseVersionsInner>() {
           @Override
           public void write(JsonWriter out, TemplateGetContentChannelResponseVersionsInner value) throws IOException {
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
           public TemplateGetContentChannelResponseVersionsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateGetContentChannelResponseVersionsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateGetContentChannelResponseVersionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateGetContentChannelResponseVersionsInner
  * @throws IOException if the JSON string is invalid with respect to TemplateGetContentChannelResponseVersionsInner
  */
  public static TemplateGetContentChannelResponseVersionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateGetContentChannelResponseVersionsInner.class);
  }

 /**
  * Convert an instance of TemplateGetContentChannelResponseVersionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

