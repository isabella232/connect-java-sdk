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
import com.squareup.connect.models.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines the body parameters that can be provided in a request to the UpdateCustomer endpoint.
 */
@ApiModel(description = "Defines the body parameters that can be provided in a request to the UpdateCustomer endpoint.")

public class UpdateCustomerRequest {
  @JsonProperty("given_name")
  private String givenName = null;

  @JsonProperty("family_name")
  private String familyName = null;

  @JsonProperty("company_name")
  private String companyName = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("email_address")
  private String emailAddress = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("birthday")
  private String birthday = null;

  public UpdateCustomerRequest givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * The given (i.e., first) name associated with the customer profile.
   * @return givenName
  **/
  @ApiModelProperty(value = "The given (i.e., first) name associated with the customer profile.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public UpdateCustomerRequest familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * The family (i.e., last) name associated with the customer profile.
   * @return familyName
  **/
  @ApiModelProperty(value = "The family (i.e., last) name associated with the customer profile.")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public UpdateCustomerRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * A business name associated with the customer profile.
   * @return companyName
  **/
  @ApiModelProperty(value = "A business name associated with the customer profile.")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UpdateCustomerRequest nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * A nickname for the customer profile.
   * @return nickname
  **/
  @ApiModelProperty(value = "A nickname for the customer profile.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public UpdateCustomerRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address associated with the customer profile.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address associated with the customer profile.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UpdateCustomerRequest address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * The physical address associated with the customer profile.
   * @return address
  **/
  @ApiModelProperty(value = "The physical address associated with the customer profile.")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public UpdateCustomerRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The 11-digit phone number associated with the customer profile.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The 11-digit phone number associated with the customer profile.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UpdateCustomerRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * An optional, second ID used to associate the customer profile with an entity in another system.
   * @return referenceId
  **/
  @ApiModelProperty(value = "An optional, second ID used to associate the customer profile with an entity in another system.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public UpdateCustomerRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A custom note associated with the customer profile.
   * @return note
  **/
  @ApiModelProperty(value = "A custom note associated with the customer profile.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public UpdateCustomerRequest birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * The birthday associated with the customer profile, in RFC-3339 format. Year is optional, timezone and times are not allowed. For example: `0000-09-01T00:00:00-00:00` indicates a birthday on September 1st. `1998-09-01T00:00:00-00:00` indications a birthday on September 1st __1998__.
   * @return birthday
  **/
  @ApiModelProperty(value = "The birthday associated with the customer profile, in RFC-3339 format. Year is optional, timezone and times are not allowed. For example: `0000-09-01T00:00:00-00:00` indicates a birthday on September 1st. `1998-09-01T00:00:00-00:00` indications a birthday on September 1st __1998__.")
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerRequest updateCustomerRequest = (UpdateCustomerRequest) o;
    return Objects.equals(this.givenName, updateCustomerRequest.givenName) &&
        Objects.equals(this.familyName, updateCustomerRequest.familyName) &&
        Objects.equals(this.companyName, updateCustomerRequest.companyName) &&
        Objects.equals(this.nickname, updateCustomerRequest.nickname) &&
        Objects.equals(this.emailAddress, updateCustomerRequest.emailAddress) &&
        Objects.equals(this.address, updateCustomerRequest.address) &&
        Objects.equals(this.phoneNumber, updateCustomerRequest.phoneNumber) &&
        Objects.equals(this.referenceId, updateCustomerRequest.referenceId) &&
        Objects.equals(this.note, updateCustomerRequest.note) &&
        Objects.equals(this.birthday, updateCustomerRequest.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName, companyName, nickname, emailAddress, address, phoneNumber, referenceId, note, birthday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerRequest {\n");
    
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
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

