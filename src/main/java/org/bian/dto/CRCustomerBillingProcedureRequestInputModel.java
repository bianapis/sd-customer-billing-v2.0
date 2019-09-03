package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureRequestInputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.CRCustomerBillingProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureRequestInputModel
 */
public class CRCustomerBillingProcedureRequestInputModel   {
  private String customerBillingServicingSessionReference = null;

  private String customerBillingProcedureInstanceReference = null;

  private CRCustomerBillingProcedureRequestInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private Object customerBillingProcedureRequestActionTaskRecord = null;

  private CRCustomerBillingProcedureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerBillingServicingSessionReference
  **/

  public String getCustomerBillingServicingSessionReference() {
    return customerBillingServicingSessionReference;
  }

  public void setCustomerBillingServicingSessionReference(String customerBillingServicingSessionReference) {
    this.customerBillingServicingSessionReference = customerBillingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Billing Procedure instance 
   * @return customerBillingProcedureInstanceReference
  **/

  public String getCustomerBillingProcedureInstanceReference() {
    return customerBillingProcedureInstanceReference;
  }

  public void setCustomerBillingProcedureInstanceReference(String customerBillingProcedureInstanceReference) {
    this.customerBillingProcedureInstanceReference = customerBillingProcedureInstanceReference;
  }


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerBillingProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerBillingProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

