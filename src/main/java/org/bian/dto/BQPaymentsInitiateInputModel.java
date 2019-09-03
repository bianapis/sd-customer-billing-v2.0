package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateInputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateInputModel
 */
public class BQPaymentsInitiateInputModel   {
  private BQPaymentsInitiateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private String customerBillingProcedureInstanceReference = null;

  private Object paymentsInitiateActionRecord = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public BQPaymentsInitiateInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(BQPaymentsInitiateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Billing Procedure instance 
   * @return customerBillingProcedureInstanceReference
  **/

  public String getCustomerBillingProcedureInstanceReference() {
    return customerBillingProcedureInstanceReference;
  }

  public void setCustomerBillingProcedureInstanceReference(String customerBillingProcedureInstanceReference) {
    this.customerBillingProcedureInstanceReference = customerBillingProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentsInitiateActionRecord
  **/

  public Object getPaymentsInitiateActionRecord() {
    return paymentsInitiateActionRecord;
  }

  public void setPaymentsInitiateActionRecord(Object paymentsInitiateActionRecord) {
    this.paymentsInitiateActionRecord = paymentsInitiateActionRecord;
  }


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


}

