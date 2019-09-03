package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecordCustomerReminderContactRecord
 */
public class BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecordCustomerReminderContactRecord   {
  private String contactMessage = null;

  private String contactDate = null;

  private String contactResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Content of the reminder message  
   * @return contactMessage
  **/

  public String getContactMessage() {
    return contactMessage;
  }

  public void setContactMessage(String contactMessage) {
    this.contactMessage = contactMessage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time of the contact 
   * @return contactDate
  **/

  public String getContactDate() {
    return contactDate;
  }

  public void setContactDate(String contactDate) {
    this.contactDate = contactDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any response arising from the contact 
   * @return contactResult
  **/

  public String getContactResult() {
    return contactResult;
  }

  public void setContactResult(String contactResult) {
    this.contactResult = contactResult;
  }


}

