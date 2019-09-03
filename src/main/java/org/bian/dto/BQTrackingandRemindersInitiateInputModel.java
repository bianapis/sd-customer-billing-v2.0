package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersInitiateInputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecord;
import org.bian.dto.BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersInitiateInputModel
 */
public class BQTrackingandRemindersInitiateInputModel   {
  private BQTrackingandRemindersInitiateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecord invoicingInstanceRecord = null;

  private String customerBillingProcedureInstanceReference = null;

  private Object trackingandRemindersInitiateActionRecord = null;

  private BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord trackingandRemindersInstanceRecord = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public BQTrackingandRemindersInitiateInputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(BQTrackingandRemindersInitiateInputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * Get invoicingInstanceRecord
   * @return invoicingInstanceRecord
  **/

  public BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecord getInvoicingInstanceRecord() {
    return invoicingInstanceRecord;
  }

  public void setInvoicingInstanceRecord(BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecord invoicingInstanceRecord) {
    this.invoicingInstanceRecord = invoicingInstanceRecord;
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
   * @return trackingandRemindersInitiateActionRecord
  **/

  public Object getTrackingandRemindersInitiateActionRecord() {
    return trackingandRemindersInitiateActionRecord;
  }

  public void setTrackingandRemindersInitiateActionRecord(Object trackingandRemindersInitiateActionRecord) {
    this.trackingandRemindersInitiateActionRecord = trackingandRemindersInitiateActionRecord;
  }


  /**
   * Get trackingandRemindersInstanceRecord
   * @return trackingandRemindersInstanceRecord
  **/

  public BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord getTrackingandRemindersInstanceRecord() {
    return trackingandRemindersInstanceRecord;
  }

  public void setTrackingandRemindersInstanceRecord(BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord trackingandRemindersInstanceRecord) {
    this.trackingandRemindersInstanceRecord = trackingandRemindersInstanceRecord;
  }


}

