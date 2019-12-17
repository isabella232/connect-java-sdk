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
 * 
 */
@ApiModel(description = "")

public class CatalogQueryFilteredItemsCustomAttributeFilter {
  @JsonProperty("filter_type")
  private String filterType = null;

  @JsonProperty("custom_attribute_definition_ids")
  private List<String> customAttributeDefinitionIds = new ArrayList<String>();

  @JsonProperty("custom_attribute_value_exact")
  private String customAttributeValueExact = null;

  @JsonProperty("custom_attribute_value_prefix")
  private String customAttributeValuePrefix = null;

  @JsonProperty("custom_attribute_min_value")
  private String customAttributeMinValue = null;

  @JsonProperty("custom_attribute_max_value")
  private String customAttributeMaxValue = null;

  public CatalogQueryFilteredItemsCustomAttributeFilter filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   *  See [CatalogQueryFilteredItemsCustomAttributeFilterFilterType](#type-catalogqueryfiltereditemscustomattributefilterfiltertype) for possible values
   * @return filterType
  **/
  @ApiModelProperty(value = " See [CatalogQueryFilteredItemsCustomAttributeFilterFilterType](#type-catalogqueryfiltereditemscustomattributefilterfiltertype) for possible values")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public CatalogQueryFilteredItemsCustomAttributeFilter customAttributeDefinitionIds(List<String> customAttributeDefinitionIds) {
    this.customAttributeDefinitionIds = customAttributeDefinitionIds;
    return this;
  }

  public CatalogQueryFilteredItemsCustomAttributeFilter addCustomAttributeDefinitionIdsItem(String customAttributeDefinitionIdsItem) {
    this.customAttributeDefinitionIds.add(customAttributeDefinitionIdsItem);
    return this;
  }

   /**
   * 
   * @return customAttributeDefinitionIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getCustomAttributeDefinitionIds() {
    return customAttributeDefinitionIds;
  }

  public void setCustomAttributeDefinitionIds(List<String> customAttributeDefinitionIds) {
    this.customAttributeDefinitionIds = customAttributeDefinitionIds;
  }

  public CatalogQueryFilteredItemsCustomAttributeFilter customAttributeValueExact(String customAttributeValueExact) {
    this.customAttributeValueExact = customAttributeValueExact;
    return this;
  }

   /**
   * 
   * @return customAttributeValueExact
  **/
  @ApiModelProperty(value = "")
  public String getCustomAttributeValueExact() {
    return customAttributeValueExact;
  }

  public void setCustomAttributeValueExact(String customAttributeValueExact) {
    this.customAttributeValueExact = customAttributeValueExact;
  }

  public CatalogQueryFilteredItemsCustomAttributeFilter customAttributeValuePrefix(String customAttributeValuePrefix) {
    this.customAttributeValuePrefix = customAttributeValuePrefix;
    return this;
  }

   /**
   * 
   * @return customAttributeValuePrefix
  **/
  @ApiModelProperty(value = "")
  public String getCustomAttributeValuePrefix() {
    return customAttributeValuePrefix;
  }

  public void setCustomAttributeValuePrefix(String customAttributeValuePrefix) {
    this.customAttributeValuePrefix = customAttributeValuePrefix;
  }

  public CatalogQueryFilteredItemsCustomAttributeFilter customAttributeMinValue(String customAttributeMinValue) {
    this.customAttributeMinValue = customAttributeMinValue;
    return this;
  }

   /**
   * 
   * @return customAttributeMinValue
  **/
  @ApiModelProperty(value = "")
  public String getCustomAttributeMinValue() {
    return customAttributeMinValue;
  }

  public void setCustomAttributeMinValue(String customAttributeMinValue) {
    this.customAttributeMinValue = customAttributeMinValue;
  }

  public CatalogQueryFilteredItemsCustomAttributeFilter customAttributeMaxValue(String customAttributeMaxValue) {
    this.customAttributeMaxValue = customAttributeMaxValue;
    return this;
  }

   /**
   * 
   * @return customAttributeMaxValue
  **/
  @ApiModelProperty(value = "")
  public String getCustomAttributeMaxValue() {
    return customAttributeMaxValue;
  }

  public void setCustomAttributeMaxValue(String customAttributeMaxValue) {
    this.customAttributeMaxValue = customAttributeMaxValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogQueryFilteredItemsCustomAttributeFilter catalogQueryFilteredItemsCustomAttributeFilter = (CatalogQueryFilteredItemsCustomAttributeFilter) o;
    return Objects.equals(this.filterType, catalogQueryFilteredItemsCustomAttributeFilter.filterType) &&
        Objects.equals(this.customAttributeDefinitionIds, catalogQueryFilteredItemsCustomAttributeFilter.customAttributeDefinitionIds) &&
        Objects.equals(this.customAttributeValueExact, catalogQueryFilteredItemsCustomAttributeFilter.customAttributeValueExact) &&
        Objects.equals(this.customAttributeValuePrefix, catalogQueryFilteredItemsCustomAttributeFilter.customAttributeValuePrefix) &&
        Objects.equals(this.customAttributeMinValue, catalogQueryFilteredItemsCustomAttributeFilter.customAttributeMinValue) &&
        Objects.equals(this.customAttributeMaxValue, catalogQueryFilteredItemsCustomAttributeFilter.customAttributeMaxValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, customAttributeDefinitionIds, customAttributeValueExact, customAttributeValuePrefix, customAttributeMinValue, customAttributeMaxValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogQueryFilteredItemsCustomAttributeFilter {\n");
    
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    customAttributeDefinitionIds: ").append(toIndentedString(customAttributeDefinitionIds)).append("\n");
    sb.append("    customAttributeValueExact: ").append(toIndentedString(customAttributeValueExact)).append("\n");
    sb.append("    customAttributeValuePrefix: ").append(toIndentedString(customAttributeValuePrefix)).append("\n");
    sb.append("    customAttributeMinValue: ").append(toIndentedString(customAttributeMinValue)).append("\n");
    sb.append("    customAttributeMaxValue: ").append(toIndentedString(customAttributeMaxValue)).append("\n");
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
