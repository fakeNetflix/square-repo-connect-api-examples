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
 * Retrieves a list of refunds for the account making the request.  Max results per page: 100
 */
@ApiModel(description = "Retrieves a list of refunds for the account making the request.  Max results per page: 100")

public class ListPaymentRefundsRequest {
  @JsonProperty("begin_time")
  private String beginTime = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("sort_order")
  private String sortOrder = null;

  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("source_type")
  private String sourceType = null;

  public ListPaymentRefundsRequest beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Timestamp for the beginning of the requested reporting period, in RFC 3339 format.  Default: The current time minus one year.
   * @return beginTime
  **/
  @ApiModelProperty(value = "Timestamp for the beginning of the requested reporting period, in RFC 3339 format.  Default: The current time minus one year.")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public ListPaymentRefundsRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp for the end of the requested reporting period, in RFC 3339 format.  Default: The current time.
   * @return endTime
  **/
  @ApiModelProperty(value = "Timestamp for the end of the requested reporting period, in RFC 3339 format.  Default: The current time.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ListPaymentRefundsRequest sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * The order in which results are listed. - `ASC` - oldest to newest - `DESC` - newest to oldest (default).
   * @return sortOrder
  **/
  @ApiModelProperty(value = "The order in which results are listed. - `ASC` - oldest to newest - `DESC` - newest to oldest (default).")
  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public ListPaymentRefundsRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public ListPaymentRefundsRequest locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * ID of location associated with payment.
   * @return locationId
  **/
  @ApiModelProperty(value = "ID of location associated with payment.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public ListPaymentRefundsRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * If provided, only refunds with the given status are returned.  For a list of refund status values, see [PaymentRefund](#type-paymentrefund).  Default: If omitted refunds are returned regardless of status.
   * @return status
  **/
  @ApiModelProperty(value = "If provided, only refunds with the given status are returned.  For a list of refund status values, see [PaymentRefund](#type-paymentrefund).  Default: If omitted refunds are returned regardless of status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ListPaymentRefundsRequest sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * If provided, only refunds with the given source type are returned.  - `CARD` - List refunds only for payments where card was specified as payment  source.  Default: If omitted refunds are returned regardless of source type.
   * @return sourceType
  **/
  @ApiModelProperty(value = "If provided, only refunds with the given source type are returned.  - `CARD` - List refunds only for payments where card was specified as payment  source.  Default: If omitted refunds are returned regardless of source type.")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPaymentRefundsRequest listPaymentRefundsRequest = (ListPaymentRefundsRequest) o;
    return Objects.equals(this.beginTime, listPaymentRefundsRequest.beginTime) &&
        Objects.equals(this.endTime, listPaymentRefundsRequest.endTime) &&
        Objects.equals(this.sortOrder, listPaymentRefundsRequest.sortOrder) &&
        Objects.equals(this.cursor, listPaymentRefundsRequest.cursor) &&
        Objects.equals(this.locationId, listPaymentRefundsRequest.locationId) &&
        Objects.equals(this.status, listPaymentRefundsRequest.status) &&
        Objects.equals(this.sourceType, listPaymentRefundsRequest.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, endTime, sortOrder, cursor, locationId, status, sourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPaymentRefundsRequest {\n");

    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

