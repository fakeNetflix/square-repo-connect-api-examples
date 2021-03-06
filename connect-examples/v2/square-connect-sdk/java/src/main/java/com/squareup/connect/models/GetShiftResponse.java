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
import com.squareup.connect.models.Shift;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A response to request to get a &#x60;Shift&#x60;. Contains the requested &#x60;Shift&#x60; object. May contain a set of &#x60;Error&#x60; objects if the request resulted in errors.
 */
@ApiModel(description = "A response to request to get a `Shift`. Contains the requested `Shift` object. May contain a set of `Error` objects if the request resulted in errors.")

public class GetShiftResponse {
  @JsonProperty("shift")
  private Shift shift = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  public GetShiftResponse shift(Shift shift) {
    this.shift = shift;
    return this;
  }

   /**
   * The requested `Shift`.
   * @return shift
  **/
  @ApiModelProperty(value = "The requested `Shift`.")
  public Shift getShift() {
    return shift;
  }

  public void setShift(Shift shift) {
    this.shift = shift;
  }

  public GetShiftResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GetShiftResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShiftResponse getShiftResponse = (GetShiftResponse) o;
    return Objects.equals(this.shift, getShiftResponse.shift) &&
        Objects.equals(this.errors, getShiftResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shift, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShiftResponse {\n");

    sb.append("    shift: ").append(toIndentedString(shift)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

