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
import com.squareup.connect.models.Error;
import com.squareup.connect.models.Payment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Return value from a [CompletePayment](#endpoint-payments-completepayment) call.
 */
@ApiModel(description = "Return value from a [CompletePayment](#endpoint-payments-completepayment) call.")

public class CompletePaymentResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("payment")
  private Payment payment = null;

  public CompletePaymentResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CompletePaymentResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Information on errors encountered during the request
   * @return errors
  **/
  @ApiModelProperty(value = "Information on errors encountered during the request")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public CompletePaymentResponse payment(Payment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * The successfully completed `Payment`.
   * @return payment
  **/
  @ApiModelProperty(value = "The successfully completed `Payment`.")
  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletePaymentResponse completePaymentResponse = (CompletePaymentResponse) o;
    return Objects.equals(this.errors, completePaymentResponse.errors) &&
        Objects.equals(this.payment, completePaymentResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, payment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletePaymentResponse {\n");

    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

