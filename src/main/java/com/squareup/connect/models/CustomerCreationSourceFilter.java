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
import java.util.ArrayList;
import java.util.List;

/**
 * Creation source filter.  If one or more creation sources are set, customer profiles are included in, or excluded from, the result if they match at least one of the filter criteria.
 */
@ApiModel(description = "Creation source filter.  If one or more creation sources are set, customer profiles are included in, or excluded from, the result if they match at least one of the filter criteria.")

public class CustomerCreationSourceFilter {
  /**
   * Gets or Sets values
   */
  public enum ValuesEnum {
    OTHER("OTHER"),
    
    APPOINTMENTS("APPOINTMENTS"),
    
    COUPON("COUPON"),
    
    DELETION_RECOVERY("DELETION_RECOVERY"),
    
    DIRECTORY("DIRECTORY"),
    
    EGIFTING("EGIFTING"),
    
    EMAIL_COLLECTION("EMAIL_COLLECTION"),
    
    FEEDBACK("FEEDBACK"),
    
    IMPORT("IMPORT"),
    
    INVOICES("INVOICES"),
    
    LOYALTY("LOYALTY"),
    
    MARKETING("MARKETING"),
    
    MERGE("MERGE"),
    
    ONLINE_STORE("ONLINE_STORE"),
    
    INSTANT_PROFILE("INSTANT_PROFILE"),
    
    TERMINAL("TERMINAL"),
    
    THIRD_PARTY("THIRD_PARTY"),
    
    THIRD_PARTY_IMPORT("THIRD_PARTY_IMPORT"),
    
    UNMERGE_RECOVERY("UNMERGE_RECOVERY");

    private String value;

    ValuesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValuesEnum fromValue(String text) {
      for (ValuesEnum b : ValuesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("values")
  private List<ValuesEnum> values = new ArrayList<ValuesEnum>();

  /**
   * Indicates whether a customer profile matching the filter criteria should be included in the result or excluded from the result. Default: `INCLUDE`. See [CustomerInclusionExclusion](#type-customerinclusionexclusion) for possible values.
   */
  public enum RuleEnum {
    INCLUDE("INCLUDE"),
    
    EXCLUDE("EXCLUDE");

    private String value;

    RuleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RuleEnum fromValue(String text) {
      for (RuleEnum b : RuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("rule")
  private RuleEnum rule = null;

  public CustomerCreationSourceFilter values(List<ValuesEnum> values) {
    this.values = values;
    return this;
  }

  public CustomerCreationSourceFilter addValuesItem(ValuesEnum valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of creation sources used as filtering criteria. See [CustomerCreationSource](#type-customercreationsource) for possible values.
   * @return values
  **/
  @ApiModelProperty(value = "The list of creation sources used as filtering criteria. See [CustomerCreationSource](#type-customercreationsource) for possible values.")
  public List<ValuesEnum> getValues() {
    return values;
  }

  public void setValues(List<ValuesEnum> values) {
    this.values = values;
  }

  public CustomerCreationSourceFilter rule(RuleEnum rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Indicates whether a customer profile matching the filter criteria should be included in the result or excluded from the result. Default: `INCLUDE`. See [CustomerInclusionExclusion](#type-customerinclusionexclusion) for possible values.
   * @return rule
  **/
  @ApiModelProperty(value = "Indicates whether a customer profile matching the filter criteria should be included in the result or excluded from the result. Default: `INCLUDE`. See [CustomerInclusionExclusion](#type-customerinclusionexclusion) for possible values.")
  public RuleEnum getRule() {
    return rule;
  }

  public void setRule(RuleEnum rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreationSourceFilter customerCreationSourceFilter = (CustomerCreationSourceFilter) o;
    return Objects.equals(this.values, customerCreationSourceFilter.values) &&
        Objects.equals(this.rule, customerCreationSourceFilter.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreationSourceFilter {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
