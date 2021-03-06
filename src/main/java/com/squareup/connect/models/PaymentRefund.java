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
import com.squareup.connect.models.ProcessingFee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a refund of a payment made using Square. Contains information on the original payment and the amount of money refunded.
 */
@ApiModel(description = "Represents a refund of a payment made using Square. Contains information on the original payment and the amount of money refunded.")

public class PaymentRefund {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("app_fee_money")
  private Money appFeeMoney = null;

  @JsonProperty("processing_fee")
  private List<ProcessingFee> processingFee = new ArrayList<ProcessingFee>();

  @JsonProperty("payment_id")
  private String paymentId = null;

  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public PaymentRefund id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID for this refund, generated by Square.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique ID for this refund, generated by Square.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentRefund status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The refund's status: - `PENDING` - awaiting approval - `COMPLETED` - successfully completed - `REJECTED` - the refund was rejected - `FAILED` - an error occurred
   * @return status
  **/
  @ApiModelProperty(value = "The refund's status: - `PENDING` - awaiting approval - `COMPLETED` - successfully completed - `REJECTED` - the refund was rejected - `FAILED` - an error occurred")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentRefund locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Location ID associated with the payment this refund is attached to.
   * @return locationId
  **/
  @ApiModelProperty(value = "Location ID associated with the payment this refund is attached to.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public PaymentRefund amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of money refunded, specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
   * @return amountMoney
  **/
  @ApiModelProperty(required = true, value = "The amount of money refunded, specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public PaymentRefund appFeeMoney(Money appFeeMoney) {
    this.appFeeMoney = appFeeMoney;
    return this;
  }

   /**
   * Amount of money the app developer contributed to help cover the refunded amount. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents. See [Working with monetary amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for details.
   * @return appFeeMoney
  **/
  @ApiModelProperty(value = "Amount of money the app developer contributed to help cover the refunded amount. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents. See [Working with monetary amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for details.")
  public Money getAppFeeMoney() {
    return appFeeMoney;
  }

  public void setAppFeeMoney(Money appFeeMoney) {
    this.appFeeMoney = appFeeMoney;
  }

  public PaymentRefund processingFee(List<ProcessingFee> processingFee) {
    this.processingFee = processingFee;
    return this;
  }

  public PaymentRefund addProcessingFeeItem(ProcessingFee processingFeeItem) {
    this.processingFee.add(processingFeeItem);
    return this;
  }

   /**
   * Processing fees and fee adjustments assessed by Square on this refund.
   * @return processingFee
  **/
  @ApiModelProperty(value = "Processing fees and fee adjustments assessed by Square on this refund.")
  public List<ProcessingFee> getProcessingFee() {
    return processingFee;
  }

  public void setProcessingFee(List<ProcessingFee> processingFee) {
    this.processingFee = processingFee;
  }

  public PaymentRefund paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The ID of the payment assocated with this refund.
   * @return paymentId
  **/
  @ApiModelProperty(value = "The ID of the payment assocated with this refund.")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentRefund orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The ID of the order associated with the refund.
   * @return orderId
  **/
  @ApiModelProperty(value = "The ID of the order associated with the refund.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PaymentRefund reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the refund.
   * @return reason
  **/
  @ApiModelProperty(value = "The reason for the refund.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PaymentRefund createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the refund was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Timestamp of when the refund was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public PaymentRefund updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the refund was last updated, in RFC 3339 format.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Timestamp of when the refund was last updated, in RFC 3339 format.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRefund paymentRefund = (PaymentRefund) o;
    return Objects.equals(this.id, paymentRefund.id) &&
        Objects.equals(this.status, paymentRefund.status) &&
        Objects.equals(this.locationId, paymentRefund.locationId) &&
        Objects.equals(this.amountMoney, paymentRefund.amountMoney) &&
        Objects.equals(this.appFeeMoney, paymentRefund.appFeeMoney) &&
        Objects.equals(this.processingFee, paymentRefund.processingFee) &&
        Objects.equals(this.paymentId, paymentRefund.paymentId) &&
        Objects.equals(this.orderId, paymentRefund.orderId) &&
        Objects.equals(this.reason, paymentRefund.reason) &&
        Objects.equals(this.createdAt, paymentRefund.createdAt) &&
        Objects.equals(this.updatedAt, paymentRefund.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, locationId, amountMoney, appFeeMoney, processingFee, paymentId, orderId, reason, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRefund {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    appFeeMoney: ").append(toIndentedString(appFeeMoney)).append("\n");
    sb.append("    processingFee: ").append(toIndentedString(processingFee)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

