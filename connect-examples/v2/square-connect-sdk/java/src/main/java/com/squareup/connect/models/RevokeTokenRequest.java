/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 */
@ApiModel(description = "")

public class RevokeTokenRequest {
  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("merchant_id")
  private String merchantId = null;

  public RevokeTokenRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Your application's ID, available from the [application dashboard](https://connect.squareup.com/apps).
   * @return clientId
  **/
  @ApiModelProperty(value = "Your application's ID, available from the [application dashboard](https://connect.squareup.com/apps).")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public RevokeTokenRequest accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token of the merchant whose token you want to revoke. Do not provide a value for merchant_id if you provide this parameter.
   * @return accessToken
  **/
  @ApiModelProperty(value = "The access token of the merchant whose token you want to revoke. Do not provide a value for merchant_id if you provide this parameter.")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public RevokeTokenRequest merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The ID of the merchant whose token you want to revoke. Do not provide a value for access_token if you provide this parameter.
   * @return merchantId
  **/
  @ApiModelProperty(value = "The ID of the merchant whose token you want to revoke. Do not provide a value for access_token if you provide this parameter.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeTokenRequest revokeTokenRequest = (RevokeTokenRequest) o;
    return Objects.equals(this.clientId, revokeTokenRequest.clientId) &&
        Objects.equals(this.accessToken, revokeTokenRequest.accessToken) &&
        Objects.equals(this.merchantId, revokeTokenRequest.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, accessToken, merchantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeTokenRequest {\n");

    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

