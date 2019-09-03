package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.CRCustomerBillingProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureExecuteInputModel
 */
public class CRCustomerBillingProcedureExecuteInputModel   {
  private String customerBillingServicingSessionReference = null;

  private String customerBillingProcedureInstanceReference = null;

  private CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private Object customerBillingProcedureExecuteActionTaskRecord = null;

  private CRCustomerBillingProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(CRCustomerBillingProcedureExecuteInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerBillingProcedureExecuteActionTaskRecord
  **/

  public Object getCustomerBillingProcedureExecuteActionTaskRecord() {
    return customerBillingProcedureExecuteActionTaskRecord;
  }

  public void setCustomerBillingProcedureExecuteActionTaskRecord(Object customerBillingProcedureExecuteActionTaskRecord) {
    this.customerBillingProcedureExecuteActionTaskRecord = customerBillingProcedureExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerBillingProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerBillingProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

