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
import com.squareup.connect.models.Address;
import com.squareup.connect.models.V1MerchantLocationDetails;
import com.squareup.connect.models.V1PhoneNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in the response body of a request to the **RetrieveBusiness** endpoint.
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the **RetrieveBusiness** endpoint.")

public class V1Merchant {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("account_type")
  private String accountType = null;

  @JsonProperty("account_capabilities")
  private List<String> accountCapabilities = new ArrayList<String>();

  @JsonProperty("country_code")
  private String countryCode = null;

  @JsonProperty("language_code")
  private String languageCode = null;

  @JsonProperty("currency_code")
  private String currencyCode = null;

  @JsonProperty("business_name")
  private String businessName = null;

  @JsonProperty("business_address")
  private Address businessAddress = null;

  @JsonProperty("business_phone")
  private V1PhoneNumber businessPhone = null;

  @JsonProperty("business_type")
  private String businessType = null;

  @JsonProperty("shipping_address")
  private Address shippingAddress = null;

  @JsonProperty("location_details")
  private V1MerchantLocationDetails locationDetails = null;

  @JsonProperty("market_url")
  private String marketUrl = null;

  public V1Merchant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The merchant account's unique identifier.
   * @return id
  **/
  @ApiModelProperty(value = "The merchant account's unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1Merchant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name associated with the merchant account.
   * @return name
  **/
  @ApiModelProperty(value = "The name associated with the merchant account.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Merchant email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address associated with the merchant account.
   * @return email
  **/
  @ApiModelProperty(value = "The email address associated with the merchant account.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public V1Merchant accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Indicates whether the merchant account corresponds to a single-location account (LOCATION) or a business account (BUSINESS). This value is almost always LOCATION. See [V1MerchantAccountType](#type-v1merchantaccounttype) for possible values
   * @return accountType
  **/
  @ApiModelProperty(value = "Indicates whether the merchant account corresponds to a single-location account (LOCATION) or a business account (BUSINESS). This value is almost always LOCATION. See [V1MerchantAccountType](#type-v1merchantaccounttype) for possible values")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public V1Merchant accountCapabilities(List<String> accountCapabilities) {
    this.accountCapabilities = accountCapabilities;
    return this;
  }

  public V1Merchant addAccountCapabilitiesItem(String accountCapabilitiesItem) {
    this.accountCapabilities.add(accountCapabilitiesItem);
    return this;
  }

   /**
   * Capabilities that are enabled for the merchant's Square account. Capabilities that are not listed in this array are not enabled for the account.
   * @return accountCapabilities
  **/
  @ApiModelProperty(value = "Capabilities that are enabled for the merchant's Square account. Capabilities that are not listed in this array are not enabled for the account.")
  public List<String> getAccountCapabilities() {
    return accountCapabilities;
  }

  public void setAccountCapabilities(List<String> accountCapabilities) {
    this.accountCapabilities = accountCapabilities;
  }

  public V1Merchant countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country associated with the merchant account, in ISO 3166-1-alpha-2 format.
   * @return countryCode
  **/
  @ApiModelProperty(value = "The country associated with the merchant account, in ISO 3166-1-alpha-2 format.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public V1Merchant languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The language associated with the merchant account, in BCP 47 format.
   * @return languageCode
  **/
  @ApiModelProperty(value = "The language associated with the merchant account, in BCP 47 format.")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public V1Merchant currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency associated with the merchant account, in ISO 4217 format. For example, the currency code for US dollars is USD.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency associated with the merchant account, in ISO 4217 format. For example, the currency code for US dollars is USD.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public V1Merchant businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * The name of the merchant's business.
   * @return businessName
  **/
  @ApiModelProperty(value = "The name of the merchant's business.")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public V1Merchant businessAddress(Address businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * The address of the merchant's business.
   * @return businessAddress
  **/
  @ApiModelProperty(value = "The address of the merchant's business.")
  public Address getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(Address businessAddress) {
    this.businessAddress = businessAddress;
  }

  public V1Merchant businessPhone(V1PhoneNumber businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * The phone number of the merchant's business.
   * @return businessPhone
  **/
  @ApiModelProperty(value = "The phone number of the merchant's business.")
  public V1PhoneNumber getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(V1PhoneNumber businessPhone) {
    this.businessPhone = businessPhone;
  }

  public V1Merchant businessType(String businessType) {
    this.businessType = businessType;
    return this;
  }

   /**
   * The type of business operated by the merchant. See [V1MerchantBusinessType](#type-v1merchantbusinesstype) for possible values
   * @return businessType
  **/
  @ApiModelProperty(value = "The type of business operated by the merchant. See [V1MerchantBusinessType](#type-v1merchantbusinesstype) for possible values")
  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  public V1Merchant shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The merchant's shipping address.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The merchant's shipping address.")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public V1Merchant locationDetails(V1MerchantLocationDetails locationDetails) {
    this.locationDetails = locationDetails;
    return this;
  }

   /**
   * Additional information for a single-location account specified by its associated business account, if it has one.
   * @return locationDetails
  **/
  @ApiModelProperty(value = "Additional information for a single-location account specified by its associated business account, if it has one.")
  public V1MerchantLocationDetails getLocationDetails() {
    return locationDetails;
  }

  public void setLocationDetails(V1MerchantLocationDetails locationDetails) {
    this.locationDetails = locationDetails;
  }

  public V1Merchant marketUrl(String marketUrl) {
    this.marketUrl = marketUrl;
    return this;
  }

   /**
   * The URL of the merchant's online store.
   * @return marketUrl
  **/
  @ApiModelProperty(value = "The URL of the merchant's online store.")
  public String getMarketUrl() {
    return marketUrl;
  }

  public void setMarketUrl(String marketUrl) {
    this.marketUrl = marketUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Merchant v1Merchant = (V1Merchant) o;
    return Objects.equals(this.id, v1Merchant.id) &&
        Objects.equals(this.name, v1Merchant.name) &&
        Objects.equals(this.email, v1Merchant.email) &&
        Objects.equals(this.accountType, v1Merchant.accountType) &&
        Objects.equals(this.accountCapabilities, v1Merchant.accountCapabilities) &&
        Objects.equals(this.countryCode, v1Merchant.countryCode) &&
        Objects.equals(this.languageCode, v1Merchant.languageCode) &&
        Objects.equals(this.currencyCode, v1Merchant.currencyCode) &&
        Objects.equals(this.businessName, v1Merchant.businessName) &&
        Objects.equals(this.businessAddress, v1Merchant.businessAddress) &&
        Objects.equals(this.businessPhone, v1Merchant.businessPhone) &&
        Objects.equals(this.businessType, v1Merchant.businessType) &&
        Objects.equals(this.shippingAddress, v1Merchant.shippingAddress) &&
        Objects.equals(this.locationDetails, v1Merchant.locationDetails) &&
        Objects.equals(this.marketUrl, v1Merchant.marketUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, accountType, accountCapabilities, countryCode, languageCode, currencyCode, businessName, businessAddress, businessPhone, businessType, shippingAddress, locationDetails, marketUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Merchant {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCapabilities: ").append(toIndentedString(accountCapabilities)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    locationDetails: ").append(toIndentedString(locationDetails)).append("\n");
    sb.append("    marketUrl: ").append(toIndentedString(marketUrl)).append("\n");
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

