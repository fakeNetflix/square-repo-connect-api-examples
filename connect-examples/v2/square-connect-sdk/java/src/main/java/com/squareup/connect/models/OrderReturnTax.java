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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a tax being returned that applies to one or more return line items in an order.  Fixed-amount, order-scoped taxes are distributed across all non-zero return line item totals. The amount distributed to each return line item is relative to that item’s contribution to the order subtotal.
 */
@ApiModel(description = "Represents a tax being returned that applies to one or more return line items in an order.  Fixed-amount, order-scoped taxes are distributed across all non-zero return line item totals. The amount distributed to each return line item is relative to that item’s contribution to the order subtotal.")

public class OrderReturnTax {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("source_tax_uid")
  private String sourceTaxUid = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("applied_money")
  private Money appliedMoney = null;

  @JsonProperty("scope")
  private String scope = null;

  public OrderReturnTax uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the return tax only within this order.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the return tax only within this order.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderReturnTax sourceTaxUid(String sourceTaxUid) {
    this.sourceTaxUid = sourceTaxUid;
    return this;
  }

   /**
   * `uid` of the Tax from the Order which contains the original charge of this tax.
   * @return sourceTaxUid
  **/
  @ApiModelProperty(value = "`uid` of the Tax from the Order which contains the original charge of this tax.")
  public String getSourceTaxUid() {
    return sourceTaxUid;
  }

  public void setSourceTaxUid(String sourceTaxUid) {
    this.sourceTaxUid = sourceTaxUid;
  }

  public OrderReturnTax catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The catalog object id referencing [CatalogTax](#type-catalogtax).
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The catalog object id referencing [CatalogTax](#type-catalogtax).")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public OrderReturnTax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tax's name.
   * @return name
  **/
  @ApiModelProperty(value = "The tax's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderReturnTax type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the calculation method used to apply the tax. See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the calculation method used to apply the tax. See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderReturnTax percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the tax, as a string representation of a decimal number. For example, a value of `\"7.25\"` corresponds to a percentage of 7.25%.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the tax, as a string representation of a decimal number. For example, a value of `\"7.25\"` corresponds to a percentage of 7.25%.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public OrderReturnTax appliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of the money applied by the tax in an order.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of the money applied by the tax in an order.")
  public Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public OrderReturnTax scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates the level at which the `OrderReturnTax` applies. For `ORDER` scoped taxes, Square generates references in `applied_taxes` on all `OrderReturnLineItem`s. For `LINE_ITEM` scoped taxes, the tax will only apply to `OrderReturnLineItem`s with references in their `applied_discounts` field. See [OrderLineItemTaxScope](#type-orderlineitemtaxscope) for possible values
   * @return scope
  **/
  @ApiModelProperty(value = "Indicates the level at which the `OrderReturnTax` applies. For `ORDER` scoped taxes, Square generates references in `applied_taxes` on all `OrderReturnLineItem`s. For `LINE_ITEM` scoped taxes, the tax will only apply to `OrderReturnLineItem`s with references in their `applied_discounts` field. See [OrderLineItemTaxScope](#type-orderlineitemtaxscope) for possible values")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReturnTax orderReturnTax = (OrderReturnTax) o;
    return Objects.equals(this.uid, orderReturnTax.uid) &&
        Objects.equals(this.sourceTaxUid, orderReturnTax.sourceTaxUid) &&
        Objects.equals(this.catalogObjectId, orderReturnTax.catalogObjectId) &&
        Objects.equals(this.name, orderReturnTax.name) &&
        Objects.equals(this.type, orderReturnTax.type) &&
        Objects.equals(this.percentage, orderReturnTax.percentage) &&
        Objects.equals(this.appliedMoney, orderReturnTax.appliedMoney) &&
        Objects.equals(this.scope, orderReturnTax.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, sourceTaxUid, catalogObjectId, name, type, percentage, appliedMoney, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReturnTax {\n");

    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sourceTaxUid: ").append(toIndentedString(sourceTaxUid)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

