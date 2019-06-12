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
import com.squareup.connect.models.MeasurementUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents the unit used to measure a [CatalogItemVariation](#type-catalogitemvariation) and specifies the precision for decimal quantities.
 */
@ApiModel(description = "Represents the unit used to measure a [CatalogItemVariation](#type-catalogitemvariation) and specifies the precision for decimal quantities.")

public class CatalogMeasurementUnit {
  @JsonProperty("measurement_unit")
  private MeasurementUnit measurementUnit = null;

  @JsonProperty("precision")
  private Integer precision = null;

  public CatalogMeasurementUnit measurementUnit(MeasurementUnit measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * Indicates the unit used to measure the quantity of a catalog item variation.
   * @return measurementUnit
  **/
  @ApiModelProperty(value = "Indicates the unit used to measure the quantity of a catalog item variation.")
  public MeasurementUnit getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(MeasurementUnit measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public CatalogMeasurementUnit precision(Integer precision) {
    this.precision = precision;
    return this;
  }

   /**
   *  Represents the maximum number of positions allowed after the decimal in quantities measured with this unit. For example, if the precision is 2, then an itemization’s quantity can be 0.01, 0.12, etc.  Min: 0  Max: 5  Default: 3
   * @return precision
  **/
  @ApiModelProperty(value = " Represents the maximum number of positions allowed after the decimal in quantities measured with this unit. For example, if the precision is 2, then an itemization’s quantity can be 0.01, 0.12, etc.  Min: 0  Max: 5  Default: 3")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogMeasurementUnit catalogMeasurementUnit = (CatalogMeasurementUnit) o;
    return Objects.equals(this.measurementUnit, catalogMeasurementUnit.measurementUnit) &&
        Objects.equals(this.precision, catalogMeasurementUnit.precision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurementUnit, precision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogMeasurementUnit {\n");
    
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
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

