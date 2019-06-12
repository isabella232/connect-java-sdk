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
import com.squareup.connect.models.CatalogInfoResponseLimits;
import com.squareup.connect.models.Error;
import com.squareup.connect.models.StandardUnitDescriptionGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class CatalogInfoResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("limits")
  private CatalogInfoResponseLimits limits = null;

  @JsonProperty("standard_unit_description_group")
  private StandardUnitDescriptionGroup standardUnitDescriptionGroup = null;

  public CatalogInfoResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CatalogInfoResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The set of [Error](#type-error)s encountered.
   * @return errors
  **/
  @ApiModelProperty(value = "The set of [Error](#type-error)s encountered.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public CatalogInfoResponse limits(CatalogInfoResponseLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * 
   * @return limits
  **/
  @ApiModelProperty(value = "")
  public CatalogInfoResponseLimits getLimits() {
    return limits;
  }

  public void setLimits(CatalogInfoResponseLimits limits) {
    this.limits = limits;
  }

  public CatalogInfoResponse standardUnitDescriptionGroup(StandardUnitDescriptionGroup standardUnitDescriptionGroup) {
    this.standardUnitDescriptionGroup = standardUnitDescriptionGroup;
    return this;
  }

   /**
   * Names and abbreviations for standard units.
   * @return standardUnitDescriptionGroup
  **/
  @ApiModelProperty(value = "Names and abbreviations for standard units.")
  public StandardUnitDescriptionGroup getStandardUnitDescriptionGroup() {
    return standardUnitDescriptionGroup;
  }

  public void setStandardUnitDescriptionGroup(StandardUnitDescriptionGroup standardUnitDescriptionGroup) {
    this.standardUnitDescriptionGroup = standardUnitDescriptionGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogInfoResponse catalogInfoResponse = (CatalogInfoResponse) o;
    return Objects.equals(this.errors, catalogInfoResponse.errors) &&
        Objects.equals(this.limits, catalogInfoResponse.limits) &&
        Objects.equals(this.standardUnitDescriptionGroup, catalogInfoResponse.standardUnitDescriptionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, limits, standardUnitDescriptionGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogInfoResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    standardUnitDescriptionGroup: ").append(toIndentedString(standardUnitDescriptionGroup)).append("\n");
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

