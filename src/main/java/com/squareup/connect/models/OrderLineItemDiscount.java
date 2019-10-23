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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a discount that applies to one or more line items in an order.  Fixed-amount, order-scoped discounts are distributed across all non-zero line item totals. The amount distributed to each line item is relative to the amount contributed by the item to the order subtotal.
 */
@ApiModel(description = "Represents a discount that applies to one or more line items in an order.  Fixed-amount, order-scoped discounts are distributed across all non-zero line item totals. The amount distributed to each line item is relative to the amount contributed by the item to the order subtotal.")

public class OrderLineItemDiscount {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("applied_money")
  private Money appliedMoney = null;

  @JsonProperty("metadata")
  private Map<String, String> metadata = new HashMap<String, String>();

  @JsonProperty("scope")
  private String scope = null;

  public OrderLineItemDiscount uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the discount only within this order.
   * Note: This model is in beta.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the discount only within this order.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderLineItemDiscount catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The catalog object id referencing `CatalogDiscount`.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The catalog object id referencing `CatalogDiscount`.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public OrderLineItemDiscount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The discount's name.
   * @return name
  **/
  @ApiModelProperty(value = "The discount's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLineItemDiscount type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the discount.  Discounts that don't reference a catalog object ID must have a type of `FIXED_PERCENTAGE` or `FIXED_AMOUNT`. See [OrderLineItemDiscountType](#type-orderlineitemdiscounttype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "The type of the discount.  Discounts that don't reference a catalog object ID must have a type of `FIXED_PERCENTAGE` or `FIXED_AMOUNT`. See [OrderLineItemDiscountType](#type-orderlineitemdiscounttype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderLineItemDiscount percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the discount, as a string representation of a decimal number. A value of `7.25` corresponds to a percentage of 7.25%.  `percentage` is not set for amount-based discounts.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the discount, as a string representation of a decimal number. A value of `7.25` corresponds to a percentage of 7.25%.  `percentage` is not set for amount-based discounts.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public OrderLineItemDiscount amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The total declared monetary amount of the discount.  `amount_money` is not set for percentage-based discounts.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The total declared monetary amount of the discount.  `amount_money` is not set for percentage-based discounts.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public OrderLineItemDiscount appliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of discount actually applied to the line item.  Represents the amount of money applied as a line item-scoped discount. When an amount-based discount is scoped to the entire order, the value of `applied_money` is different from `amount_money` because the total amount of the discount is distributed across all line items.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of discount actually applied to the line item.  Represents the amount of money applied as a line item-scoped discount. When an amount-based discount is scoped to the entire order, the value of `applied_money` is different from `amount_money` because the total amount of the discount is distributed across all line items.")
  public Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public OrderLineItemDiscount metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderLineItemDiscount putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Application-defined data attached to this discount. Metadata fields are intended to store descriptive references or associations with an entity in another system or store brief information about the object. Square does not process this field; it only stores and returns it in relevant API calls. Do not use metadata to store any sensitive information (personally identifiable information, card details, etc.).  Keys written by applications must be 60 characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries may also include metadata generated by Square. These keys are prefixed with a namespace, separated from the key with a ':' character.  Values have a max length of 255 characters.  An application may have up to 10 entries per metadata field.  Entries written by applications are private and can only be read or modified by the same application.  See [Metadata](https://developer.squareup.com/docs/build-basics/metadata) for more information.
   * Note: This model is in beta.
   * @return metadata
  **/
  @ApiModelProperty(value = "Application-defined data attached to this discount. Metadata fields are intended to store descriptive references or associations with an entity in another system or store brief information about the object. Square does not process this field; it only stores and returns it in relevant API calls. Do not use metadata to store any sensitive information (personally identifiable information, card details, etc.).  Keys written by applications must be 60 characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries may also include metadata generated by Square. These keys are prefixed with a namespace, separated from the key with a ':' character.  Values have a max length of 255 characters.  An application may have up to 10 entries per metadata field.  Entries written by applications are private and can only be read or modified by the same application.  See [Metadata](https://developer.squareup.com/docs/build-basics/metadata) for more information.")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public OrderLineItemDiscount scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates the level at which the discount applies. For `ORDER` scoped discounts, Square generates references in `applied_discounts` on all order line items that do not have them. For `LINE_ITEM` scoped discounts, the discount only applies to line items with a discount reference in their `applied_discounts` field.  This field is immutable. To change the scope of a discount you must delete the discount and re-add it as a new discount. See [OrderLineItemDiscountScope](#type-orderlineitemdiscountscope) for possible values
   * @return scope
  **/
  @ApiModelProperty(value = "Indicates the level at which the discount applies. For `ORDER` scoped discounts, Square generates references in `applied_discounts` on all order line items that do not have them. For `LINE_ITEM` scoped discounts, the discount only applies to line items with a discount reference in their `applied_discounts` field.  This field is immutable. To change the scope of a discount you must delete the discount and re-add it as a new discount. See [OrderLineItemDiscountScope](#type-orderlineitemdiscountscope) for possible values")
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
    OrderLineItemDiscount orderLineItemDiscount = (OrderLineItemDiscount) o;
    return Objects.equals(this.uid, orderLineItemDiscount.uid) &&
        Objects.equals(this.catalogObjectId, orderLineItemDiscount.catalogObjectId) &&
        Objects.equals(this.name, orderLineItemDiscount.name) &&
        Objects.equals(this.type, orderLineItemDiscount.type) &&
        Objects.equals(this.percentage, orderLineItemDiscount.percentage) &&
        Objects.equals(this.amountMoney, orderLineItemDiscount.amountMoney) &&
        Objects.equals(this.appliedMoney, orderLineItemDiscount.appliedMoney) &&
        Objects.equals(this.metadata, orderLineItemDiscount.metadata) &&
        Objects.equals(this.scope, orderLineItemDiscount.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, catalogObjectId, name, type, percentage, amountMoney, appliedMoney, metadata, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItemDiscount {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

