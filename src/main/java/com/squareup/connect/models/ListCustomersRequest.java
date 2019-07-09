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
 * Defines the query parameters that can be provided in a request to the ListCustomers endpoint.
 */
@ApiModel(description = "Defines the query parameters that can be provided in a request to the ListCustomers endpoint.")

public class ListCustomersRequest {
  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("sort_field")
  private String sortField = null;

  @JsonProperty("sort_order")
  private String sortOrder = null;

  public ListCustomersRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Pagination](/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Pagination](/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public ListCustomersRequest sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

   /**
   * Indicates how Customers should be sorted. Default: `DEFAULT`. See [CustomerSortField](#type-customersortfield) for possible values
   * @return sortField
  **/
  @ApiModelProperty(value = "Indicates how Customers should be sorted. Default: `DEFAULT`. See [CustomerSortField](#type-customersortfield) for possible values")
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public ListCustomersRequest sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Indicates whether Customers should be sorted in ascending (`ASC`) or descending (`DESC`) order. Default: `ASC`. See [SortOrder](#type-sortorder) for possible values
   * @return sortOrder
  **/
  @ApiModelProperty(value = "Indicates whether Customers should be sorted in ascending (`ASC`) or descending (`DESC`) order. Default: `ASC`. See [SortOrder](#type-sortorder) for possible values")
  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCustomersRequest listCustomersRequest = (ListCustomersRequest) o;
    return Objects.equals(this.cursor, listCustomersRequest.cursor) &&
        Objects.equals(this.sortField, listCustomersRequest.sortField) &&
        Objects.equals(this.sortOrder, listCustomersRequest.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, sortField, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCustomersRequest {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

