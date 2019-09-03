package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsExchangeOutputModel
 */
public class BQPaymentsExchangeOutputModel   {
  private String paymentsExchangeActionTaskReference = null;

  private Object paymentsExchangeActionTaskRecord = null;

  private String paymentsExchangeActionResponse = null;

  private String paymentsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance exchange service call 
   * @return paymentsExchangeActionTaskReference
  **/

  public String getPaymentsExchangeActionTaskReference() {
    return paymentsExchangeActionTaskReference;
  }

  public void setPaymentsExchangeActionTaskReference(String paymentsExchangeActionTaskReference) {
    this.paymentsExchangeActionTaskReference = paymentsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentsExchangeActionTaskRecord
  **/

  public Object getPaymentsExchangeActionTaskRecord() {
    return paymentsExchangeActionTaskRecord;
  }

  public void setPaymentsExchangeActionTaskRecord(Object paymentsExchangeActionTaskRecord) {
    this.paymentsExchangeActionTaskRecord = paymentsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return paymentsExchangeActionResponse
  **/

  public String getPaymentsExchangeActionResponse() {
    return paymentsExchangeActionResponse;
  }

  public void setPaymentsExchangeActionResponse(String paymentsExchangeActionResponse) {
    this.paymentsExchangeActionResponse = paymentsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. accepted, rejected, verified) 
   * @return paymentsInstanceStatus
  **/

  public String getPaymentsInstanceStatus() {
    return paymentsInstanceStatus;
  }

  public void setPaymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
  }


}

