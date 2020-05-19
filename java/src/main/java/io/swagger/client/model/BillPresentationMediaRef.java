/*
 * Account Management
 * This is Swagger UI environment generated for the TMF Account Management specification
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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

/**
 * PresentationMedia reference. A mean of communicating a bill, supported by the associated bill format. For example, post mail, email, web page.
 */
@ApiModel(description = "PresentationMedia reference. A mean of communicating a bill, supported by the associated bill format. For example, post mail, email, web page.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T02:51:28.145Z")
public class BillPresentationMediaRef {
  @SerializedName("id")
  private String id = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("@baseType")
  private String baseType = null;

  @SerializedName("@schemaLocation")
  private String schemaLocation = null;

  @SerializedName("@type")
  private String type = null;

  @SerializedName("@referredType")
  private String referredType = null;

  public BillPresentationMediaRef id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the bill presentation media
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the bill presentation media")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillPresentationMediaRef href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Reference of the bill presentation media
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the bill presentation media")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BillPresentationMediaRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A short descriptive name
   * @return name
  **/
  @ApiModelProperty(value = "A short descriptive name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillPresentationMediaRef baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public BillPresentationMediaRef schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public BillPresentationMediaRef type(String type) {
    this.type = type;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BillPresentationMediaRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

   /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillPresentationMediaRef billPresentationMediaRef = (BillPresentationMediaRef) o;
    return Objects.equals(this.id, billPresentationMediaRef.id) &&
        Objects.equals(this.href, billPresentationMediaRef.href) &&
        Objects.equals(this.name, billPresentationMediaRef.name) &&
        Objects.equals(this.baseType, billPresentationMediaRef.baseType) &&
        Objects.equals(this.schemaLocation, billPresentationMediaRef.schemaLocation) &&
        Objects.equals(this.type, billPresentationMediaRef.type) &&
        Objects.equals(this.referredType, billPresentationMediaRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, baseType, schemaLocation, type, referredType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillPresentationMediaRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
