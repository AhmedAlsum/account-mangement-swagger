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
import io.swagger.client.model.PartyAccount;
import java.io.IOException;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T02:51:28.145Z")
public class PartyAccountAttributeValueChangeEventPayload {
  @SerializedName("partyAccount")
  private PartyAccount partyAccount = null;

  public PartyAccountAttributeValueChangeEventPayload partyAccount(PartyAccount partyAccount) {
    this.partyAccount = partyAccount;
    return this;
  }

   /**
   * The involved resource data for the event
   * @return partyAccount
  **/
  @ApiModelProperty(value = "The involved resource data for the event")
  public PartyAccount getPartyAccount() {
    return partyAccount;
  }

  public void setPartyAccount(PartyAccount partyAccount) {
    this.partyAccount = partyAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyAccountAttributeValueChangeEventPayload partyAccountAttributeValueChangeEventPayload = (PartyAccountAttributeValueChangeEventPayload) o;
    return Objects.equals(this.partyAccount, partyAccountAttributeValueChangeEventPayload.partyAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyAccountAttributeValueChangeEventPayload {\n");
    
    sb.append("    partyAccount: ").append(toIndentedString(partyAccount)).append("\n");
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

