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
 * TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private String header;

  public static final String SERIALIZED_NAME_EXAMPLE = "example";
  @SerializedName(SERIALIZED_NAME_EXAMPLE)
  private List<String> example = null;

  public static final String SERIALIZED_NAME_VENDOR_SLUG = "vendor_slug";
  @SerializedName(SERIALIZED_NAME_VENDOR_SLUG)
  private String vendorSlug;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "message_type";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private String messageType;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "template_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_ENTERPRISE_NAME = "enterprise_name";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_NAME)
  private String enterpriseName;

  public static final String SERIALIZED_NAME_HANDLEBARS_TEXT = "handlebars_text";
  @SerializedName(SERIALIZED_NAME_HANDLEBARS_TEXT)
  private String handlebarsText;

  public static final String SERIALIZED_NAME_VENDOR_TEMPLATE_ID = "vendor_template_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_TEMPLATE_ID)
  private String vendorTemplateId;

  public static final String SERIALIZED_NAME_X_KONFIG_ORIGINAL_EXAMPLE = "x-konfig-original-example";
  @SerializedName(SERIALIZED_NAME_X_KONFIG_ORIGINAL_EXAMPLE)
  private List<String> xKonfigOriginalExample = null;

  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent() {
  }

  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "You purchased product {#var#} worth Rs. {#var#} will reach to you {#var#}. You can track your order here: {#var#} - SuprSend", value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent header(String header) {
    
    
    
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SPRSND", value = "")

  public String getHeader() {
    return header;
  }


  public void setHeader(String header) {
    
    
    
    this.header = header;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent example(List<String> example) {
    
    
    
    
    this.example = example;
    return this;
  }

  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent addExampleItem(String exampleItem) {
    if (this.example == null) {
      this.example = new ArrayList<>();
    }
    this.example.add(exampleItem);
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExample() {
    return example;
  }


  public void setExample(List<String> example) {
    
    
    
    this.example = example;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent vendorSlug(String vendorSlug) {
    
    
    
    
    this.vendorSlug = vendorSlug;
    return this;
  }

   /**
   * Get vendorSlug
   * @return vendorSlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "acl-sms", value = "")

  public String getVendorSlug() {
    return vendorSlug;
  }


  public void setVendorSlug(String vendorSlug) {
    
    
    
    this.vendorSlug = vendorSlug;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent contentType(String contentType) {
    
    
    
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    
    
    
    this.contentType = contentType;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent messageType(String messageType) {
    
    
    
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SERVICE_IMPLICIT", value = "")

  public String getMessageType() {
    return messageType;
  }


  public void setMessageType(String messageType) {
    
    
    
    this.messageType = messageType;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent templateName(String templateName) {
    
    
    
    
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "purchase_made_en_v2", value = "")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    
    
    
    this.templateName = templateName;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent enterpriseName(String enterpriseName) {
    
    
    
    
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * Get enterpriseName
   * @return enterpriseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SPRSND", value = "")

  public String getEnterpriseName() {
    return enterpriseName;
  }


  public void setEnterpriseName(String enterpriseName) {
    
    
    
    this.enterpriseName = enterpriseName;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent handlebarsText(String handlebarsText) {
    
    
    
    
    this.handlebarsText = handlebarsText;
    return this;
  }

   /**
   * Get handlebarsText
   * @return handlebarsText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "You purchased product {{event.product_name}} worth Rs. {{event.amount}} will reach to you {{event.location.city}}. You can track your order here: {{event.link}} - SuprSend", value = "")

  public String getHandlebarsText() {
    return handlebarsText;
  }


  public void setHandlebarsText(String handlebarsText) {
    
    
    
    this.handlebarsText = handlebarsText;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent vendorTemplateId(String vendorTemplateId) {
    
    
    
    
    this.vendorTemplateId = vendorTemplateId;
    return this;
  }

   /**
   * Get vendorTemplateId
   * @return vendorTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1007xxxxxxxxxx", value = "")

  public String getVendorTemplateId() {
    return vendorTemplateId;
  }


  public void setVendorTemplateId(String vendorTemplateId) {
    
    
    
    this.vendorTemplateId = vendorTemplateId;
  }


  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent xKonfigOriginalExample(List<String> xKonfigOriginalExample) {
    
    
    
    
    this.xKonfigOriginalExample = xKonfigOriginalExample;
    return this;
  }

  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent addXKonfigOriginalExampleItem(String xKonfigOriginalExampleItem) {
    if (this.xKonfigOriginalExample == null) {
      this.xKonfigOriginalExample = new ArrayList<>();
    }
    this.xKonfigOriginalExample.add(xKonfigOriginalExampleItem);
    return this;
  }

   /**
   * Get xKonfigOriginalExample
   * @return xKonfigOriginalExample
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getxKonfigOriginalExample() {
    return xKonfigOriginalExample;
  }


  public void setxKonfigOriginalExample(List<String> xKonfigOriginalExample) {
    
    
    
    this.xKonfigOriginalExample = xKonfigOriginalExample;
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
   * @return the TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent instance itself
   */
  public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent putAdditionalProperty(String key, Object value) {
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
    TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent = (TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent) o;
    return Objects.equals(this.text, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.text) &&
        Objects.equals(this.header, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.header) &&
        Objects.equals(this.example, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.example) &&
        Objects.equals(this.vendorSlug, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.vendorSlug) &&
        Objects.equals(this.contentType, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.contentType) &&
        Objects.equals(this.messageType, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.messageType) &&
        Objects.equals(this.templateName, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.templateName) &&
        Objects.equals(this.enterpriseName, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.enterpriseName) &&
        Objects.equals(this.handlebarsText, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.handlebarsText) &&
        Objects.equals(this.vendorTemplateId, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.vendorTemplateId) &&
        Objects.equals(this.xKonfigOriginalExample, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.xKonfigOriginalExample)&&
        Objects.equals(this.additionalProperties, templateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, header, example, vendorSlug, contentType, messageType, templateName, enterpriseName, handlebarsText, vendorTemplateId, xKonfigOriginalExample, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    vendorSlug: ").append(toIndentedString(vendorSlug)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    handlebarsText: ").append(toIndentedString(handlebarsText)).append("\n");
    sb.append("    vendorTemplateId: ").append(toIndentedString(vendorTemplateId)).append("\n");
    sb.append("    xKonfigOriginalExample: ").append(toIndentedString(xKonfigOriginalExample)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("header");
    openapiFields.add("example");
    openapiFields.add("vendor_slug");
    openapiFields.add("content_type");
    openapiFields.add("message_type");
    openapiFields.add("template_name");
    openapiFields.add("enterprise_name");
    openapiFields.add("handlebars_text");
    openapiFields.add("vendor_template_id");
    openapiFields.add("x-konfig-original-example");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent is not found in the empty JSON string", TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("header") != null && !jsonObj.get("header").isJsonNull()) && !jsonObj.get("header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("example") != null && !jsonObj.get("example").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `example` to be an array in the JSON string but got `%s`", jsonObj.get("example").toString()));
      }
      if ((jsonObj.get("vendor_slug") != null && !jsonObj.get("vendor_slug").isJsonNull()) && !jsonObj.get("vendor_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_slug").toString()));
      }
      if ((jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull()) && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if ((jsonObj.get("message_type") != null && !jsonObj.get("message_type").isJsonNull()) && !jsonObj.get("message_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_type").toString()));
      }
      if ((jsonObj.get("template_name") != null && !jsonObj.get("template_name").isJsonNull()) && !jsonObj.get("template_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_name").toString()));
      }
      if ((jsonObj.get("enterprise_name") != null && !jsonObj.get("enterprise_name").isJsonNull()) && !jsonObj.get("enterprise_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_name").toString()));
      }
      if ((jsonObj.get("handlebars_text") != null && !jsonObj.get("handlebars_text").isJsonNull()) && !jsonObj.get("handlebars_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handlebars_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handlebars_text").toString()));
      }
      if ((jsonObj.get("vendor_template_id") != null && !jsonObj.get("vendor_template_id").isJsonNull()) && !jsonObj.get("vendor_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor_template_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("x-konfig-original-example") != null && !jsonObj.get("x-konfig-original-example").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `x-konfig-original-example` to be an array in the JSON string but got `%s`", jsonObj.get("x-konfig-original-example").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent>() {
           @Override
           public void write(JsonWriter out, TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent value) throws IOException {
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
           public TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent
  * @throws IOException if the JSON string is invalid with respect to TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent
  */
  public static TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent.class);
  }

 /**
  * Convert an instance of TemplateGetDetailsResponseChannelsInnerVersionsInnerTemplatesInnerContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
