package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureRequestInputModelCRCustomerBillingProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureRequestOutputModel
 */
public class CRCustomerBillingProcedureRequestOutputModel   {
  private CRCustomerBillingProcedureRequestInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private String customerBillingProcedureRequestActionTaskReference = null;

  private Object customerBillingProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public CRCustomerBillingProcedureRequestInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureRequestInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Billing Procedure instance request service call 
   * @return customerBillingProcedureRequestActionTaskReference
  **/

  public String getCustomerBillingProcedureRequestActionTaskReference() {
    return customerBillingProcedureRequestActionTaskReference;
  }

  public void setCustomerBillingProcedureRequestActionTaskReference(String customerBillingProcedureRequestActionTaskReference) {
    this.customerBillingProcedureRequestActionTaskReference = customerBillingProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerBillingProcedureRequestActionTaskRecord
  **/

  public Object getCustomerBillingProcedureRequestActionTaskRecord() {
    return customerBillingProcedureRequestActionTaskRecord;
  }

  public void setCustomerBillingProcedureRequestActionTaskRecord(Object customerBillingProcedureRequestActionTaskRecord) {
    this.customerBillingProcedureRequestActionTaskRecord = customerBillingProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

