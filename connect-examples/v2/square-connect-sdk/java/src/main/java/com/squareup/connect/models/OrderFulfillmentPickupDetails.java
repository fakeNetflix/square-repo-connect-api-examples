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
import com.squareup.connect.models.OrderFulfillmentRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains details necessary to fulfill a pickup order.
 */
@ApiModel(description = "Contains details necessary to fulfill a pickup order.")

public class OrderFulfillmentPickupDetails {
  @JsonProperty("recipient")
  private OrderFulfillmentRecipient recipient = null;

  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("auto_complete_duration")
  private String autoCompleteDuration = null;

  @JsonProperty("schedule_type")
  private String scheduleType = null;

  @JsonProperty("pickup_at")
  private String pickupAt = null;

  @JsonProperty("pickup_window_duration")
  private String pickupWindowDuration = null;

  @JsonProperty("prep_time_duration")
  private String prepTimeDuration = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("placed_at")
  private String placedAt = null;

  @JsonProperty("accepted_at")
  private String acceptedAt = null;

  @JsonProperty("rejected_at")
  private String rejectedAt = null;

  @JsonProperty("ready_at")
  private String readyAt = null;

  @JsonProperty("expired_at")
  private String expiredAt = null;

  @JsonProperty("picked_up_at")
  private String pickedUpAt = null;

  @JsonProperty("canceled_at")
  private String canceledAt = null;

  @JsonProperty("cancel_reason")
  private String cancelReason = null;

  public OrderFulfillmentPickupDetails recipient(OrderFulfillmentRecipient recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Information on the person meant to pick up this fulfillment from a physical location.
   * @return recipient
  **/
  @ApiModelProperty(value = "Information on the person meant to pick up this fulfillment from a physical location.")
  public OrderFulfillmentRecipient getRecipient() {
    return recipient;
  }

  public void setRecipient(OrderFulfillmentRecipient recipient) {
    this.recipient = recipient;
  }

  public OrderFulfillmentPickupDetails expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when this fulfillment will expire if it is not accepted. Must be in RFC 3339 format e.g., \"2016-09-04T23:59:33.123Z\". Expiration time can only be set up to 7 days in the future. If `expires_at` is not set, this pickup fulfillment will be automatically accepted when placed.
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when this fulfillment will expire if it is not accepted. Must be in RFC 3339 format e.g., \"2016-09-04T23:59:33.123Z\". Expiration time can only be set up to 7 days in the future. If `expires_at` is not set, this pickup fulfillment will be automatically accepted when placed.")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public OrderFulfillmentPickupDetails autoCompleteDuration(String autoCompleteDuration) {
    this.autoCompleteDuration = autoCompleteDuration;
    return this;
  }

   /**
   * The duration of time after which an open and accepted pickup fulfillment will automatically move to the `COMPLETED` state. Must be in RFC3339 duration format e.g., \"P1W3D\".  If not set, this pickup fulfillment will remain accepted until it is canceled or completed.
   * @return autoCompleteDuration
  **/
  @ApiModelProperty(value = "The duration of time after which an open and accepted pickup fulfillment will automatically move to the `COMPLETED` state. Must be in RFC3339 duration format e.g., \"P1W3D\".  If not set, this pickup fulfillment will remain accepted until it is canceled or completed.")
  public String getAutoCompleteDuration() {
    return autoCompleteDuration;
  }

  public void setAutoCompleteDuration(String autoCompleteDuration) {
    this.autoCompleteDuration = autoCompleteDuration;
  }

  public OrderFulfillmentPickupDetails scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * The schedule type of the pickup fulfillment. Defaults to `SCHEDULED`. See [OrderFulfillmentPickupDetailsScheduleType](#type-orderfulfillmentpickupdetailsscheduletype) for possible values
   * @return scheduleType
  **/
  @ApiModelProperty(value = "The schedule type of the pickup fulfillment. Defaults to `SCHEDULED`. See [OrderFulfillmentPickupDetailsScheduleType](#type-orderfulfillmentpickupdetailsscheduletype) for possible values")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public OrderFulfillmentPickupDetails pickupAt(String pickupAt) {
    this.pickupAt = pickupAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) that represents the start of the pickup window. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\". For fulfillments with the schedule type `ASAP`, this is automatically set to the current time plus the expected duration to prepare the fulfillment.
   * @return pickupAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) that represents the start of the pickup window. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\". For fulfillments with the schedule type `ASAP`, this is automatically set to the current time plus the expected duration to prepare the fulfillment.")
  public String getPickupAt() {
    return pickupAt;
  }

  public void setPickupAt(String pickupAt) {
    this.pickupAt = pickupAt;
  }

  public OrderFulfillmentPickupDetails pickupWindowDuration(String pickupWindowDuration) {
    this.pickupWindowDuration = pickupWindowDuration;
    return this;
  }

   /**
   * The window of time in which the order should be picked up after the `pickup_at` timestamp. Must be in RFC3339 duration format, e.g., \"P1W3D\". Can be used as an informational guideline for merchants.
   * @return pickupWindowDuration
  **/
  @ApiModelProperty(value = "The window of time in which the order should be picked up after the `pickup_at` timestamp. Must be in RFC3339 duration format, e.g., \"P1W3D\". Can be used as an informational guideline for merchants.")
  public String getPickupWindowDuration() {
    return pickupWindowDuration;
  }

  public void setPickupWindowDuration(String pickupWindowDuration) {
    this.pickupWindowDuration = pickupWindowDuration;
  }

  public OrderFulfillmentPickupDetails prepTimeDuration(String prepTimeDuration) {
    this.prepTimeDuration = prepTimeDuration;
    return this;
  }

   /**
   * The duration of time it takes to prepare this fulfillment. Must be in RFC3339 duration format, e.g., \"P1W3D\".
   * @return prepTimeDuration
  **/
  @ApiModelProperty(value = "The duration of time it takes to prepare this fulfillment. Must be in RFC3339 duration format, e.g., \"P1W3D\".")
  public String getPrepTimeDuration() {
    return prepTimeDuration;
  }

  public void setPrepTimeDuration(String prepTimeDuration) {
    this.prepTimeDuration = prepTimeDuration;
  }

  public OrderFulfillmentPickupDetails note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A note meant to provide additional instructions about the pickup fulfillment displayed in the Square Point of Sale and set by the API.
   * @return note
  **/
  @ApiModelProperty(value = "A note meant to provide additional instructions about the pickup fulfillment displayed in the Square Point of Sale and set by the API.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public OrderFulfillmentPickupDetails placedAt(String placedAt) {
    this.placedAt = placedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the fulfillment was placed. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return placedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the fulfillment was placed. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getPlacedAt() {
    return placedAt;
  }

  public void setPlacedAt(String placedAt) {
    this.placedAt = placedAt;
  }

  public OrderFulfillmentPickupDetails acceptedAt(String acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the fulfillment was accepted. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return acceptedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the fulfillment was accepted. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(String acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  public OrderFulfillmentPickupDetails rejectedAt(String rejectedAt) {
    this.rejectedAt = rejectedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the fulfillment was rejected. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return rejectedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the fulfillment was rejected. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getRejectedAt() {
    return rejectedAt;
  }

  public void setRejectedAt(String rejectedAt) {
    this.rejectedAt = rejectedAt;
  }

  public OrderFulfillmentPickupDetails readyAt(String readyAt) {
    this.readyAt = readyAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the fulfillment is marked as ready for pickup. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return readyAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the fulfillment is marked as ready for pickup. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getReadyAt() {
    return readyAt;
  }

  public void setReadyAt(String readyAt) {
    this.readyAt = readyAt;
  }

  public OrderFulfillmentPickupDetails expiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the fulfillment expired. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return expiredAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the fulfillment expired. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
  }

  public OrderFulfillmentPickupDetails pickedUpAt(String pickedUpAt) {
    this.pickedUpAt = pickedUpAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the fulfillment was picked up by the recipient. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return pickedUpAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the fulfillment was picked up by the recipient. In RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getPickedUpAt() {
    return pickedUpAt;
  }

  public void setPickedUpAt(String pickedUpAt) {
    this.pickedUpAt = pickedUpAt;
  }

  public OrderFulfillmentPickupDetails canceledAt(String canceledAt) {
    this.canceledAt = canceledAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating when the fulfillment was canceled.
   * @return canceledAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\", indicating when the fulfillment was canceled.")
  public String getCanceledAt() {
    return canceledAt;
  }

  public void setCanceledAt(String canceledAt) {
    this.canceledAt = canceledAt;
  }

  public OrderFulfillmentPickupDetails cancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    return this;
  }

   /**
   * A description of why the pickup was canceled. Max length: 100 characters.
   * @return cancelReason
  **/
  @ApiModelProperty(value = "A description of why the pickup was canceled. Max length: 100 characters.")
  public String getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFulfillmentPickupDetails orderFulfillmentPickupDetails = (OrderFulfillmentPickupDetails) o;
    return Objects.equals(this.recipient, orderFulfillmentPickupDetails.recipient) &&
        Objects.equals(this.expiresAt, orderFulfillmentPickupDetails.expiresAt) &&
        Objects.equals(this.autoCompleteDuration, orderFulfillmentPickupDetails.autoCompleteDuration) &&
        Objects.equals(this.scheduleType, orderFulfillmentPickupDetails.scheduleType) &&
        Objects.equals(this.pickupAt, orderFulfillmentPickupDetails.pickupAt) &&
        Objects.equals(this.pickupWindowDuration, orderFulfillmentPickupDetails.pickupWindowDuration) &&
        Objects.equals(this.prepTimeDuration, orderFulfillmentPickupDetails.prepTimeDuration) &&
        Objects.equals(this.note, orderFulfillmentPickupDetails.note) &&
        Objects.equals(this.placedAt, orderFulfillmentPickupDetails.placedAt) &&
        Objects.equals(this.acceptedAt, orderFulfillmentPickupDetails.acceptedAt) &&
        Objects.equals(this.rejectedAt, orderFulfillmentPickupDetails.rejectedAt) &&
        Objects.equals(this.readyAt, orderFulfillmentPickupDetails.readyAt) &&
        Objects.equals(this.expiredAt, orderFulfillmentPickupDetails.expiredAt) &&
        Objects.equals(this.pickedUpAt, orderFulfillmentPickupDetails.pickedUpAt) &&
        Objects.equals(this.canceledAt, orderFulfillmentPickupDetails.canceledAt) &&
        Objects.equals(this.cancelReason, orderFulfillmentPickupDetails.cancelReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, expiresAt, autoCompleteDuration, scheduleType, pickupAt, pickupWindowDuration, prepTimeDuration, note, placedAt, acceptedAt, rejectedAt, readyAt, expiredAt, pickedUpAt, canceledAt, cancelReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFulfillmentPickupDetails {\n");

    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    autoCompleteDuration: ").append(toIndentedString(autoCompleteDuration)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    pickupAt: ").append(toIndentedString(pickupAt)).append("\n");
    sb.append("    pickupWindowDuration: ").append(toIndentedString(pickupWindowDuration)).append("\n");
    sb.append("    prepTimeDuration: ").append(toIndentedString(prepTimeDuration)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    placedAt: ").append(toIndentedString(placedAt)).append("\n");
    sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
    sb.append("    rejectedAt: ").append(toIndentedString(rejectedAt)).append("\n");
    sb.append("    readyAt: ").append(toIndentedString(readyAt)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    pickedUpAt: ").append(toIndentedString(pickedUpAt)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
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
