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
import io.swagger.client.model.TimePeriod;
import java.io.IOException;

/**
 * Proof of freedom from taxes imposed by a taxing jurisdiction
 */
@ApiModel(description = "Proof of freedom from taxes imposed by a taxing jurisdiction")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T02:51:28.145Z")
public class AccountTaxExemption {
  @SerializedName("certificateNumber")
  private String certificateNumber = null;

  @SerializedName("issuingJurisdiction")
  private String issuingJurisdiction = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("validFor")
  private TimePeriod validFor = null;

  @SerializedName("@baseType")
  private String baseType = null;

  @SerializedName("@schemaLocation")
  private String schemaLocation = null;

  @SerializedName("@type")
  private String type = null;

  public AccountTaxExemption certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

   /**
   * Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction
   * @return certificateNumber
  **/
  @ApiModelProperty(value = "Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction")
  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public AccountTaxExemption issuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
    return this;
  }

   /**
   * Name of the taxing jurisdiction for which taxes are exempt
   * @return issuingJurisdiction
  **/
  @ApiModelProperty(required = true, value = "Name of the taxing jurisdiction for which taxes are exempt")
  public String getIssuingJurisdiction() {
    return issuingJurisdiction;
  }

  public void setIssuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
  }

  public AccountTaxExemption reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason of the tax exemption
   * @return reason
  **/
  @ApiModelProperty(value = "Reason of the tax exemption")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AccountTaxExemption validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

   /**
   * Period for which the exemption is valid
   * @return validFor
  **/
  @ApiModelProperty(required = true, value = "Period for which the exemption is valid")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public AccountTaxExemption baseType(String baseType) {
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

  public AccountTaxExemption schemaLocation(String schemaLocation) {
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

  public AccountTaxExemption type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTaxExemption accountTaxExemption = (AccountTaxExemption) o;
    return Objects.equals(this.certificateNumber, accountTaxExemption.certificateNumber) &&
        Objects.equals(this.issuingJurisdiction, accountTaxExemption.issuingJurisdiction) &&
        Objects.equals(this.reason, accountTaxExemption.reason) &&
        Objects.equals(this.validFor, accountTaxExemption.validFor) &&
        Objects.equals(this.baseType, accountTaxExemption.baseType) &&
        Objects.equals(this.schemaLocation, accountTaxExemption.schemaLocation) &&
        Objects.equals(this.type, accountTaxExemption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateNumber, issuingJurisdiction, reason, validFor, baseType, schemaLocation, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTaxExemption {\n");
    
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    issuingJurisdiction: ").append(toIndentedString(issuingJurisdiction)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

