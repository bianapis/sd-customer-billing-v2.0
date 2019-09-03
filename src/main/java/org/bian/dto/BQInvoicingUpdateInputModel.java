package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvoicingUpdateInputModelInvoicingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInvoicingUpdateInputModel
 */
public class BQInvoicingUpdateInputModel   {
  private String customerBillingProcedureInstanceReference = null;

  private String invoicingInstanceReference = null;

  private BQInvoicingUpdateInputModelInvoicingInstanceRecord invoicingInstanceRecord = null;

  private Object invoicingUpdateActionTaskRecord = null;

  private String invoicingUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Invoicing instance 
   * @return invoicingInstanceReference
  **/

  public String getInvoicingInstanceReference() {
    return invoicingInstanceReference;
  }

  public void setInvoicingInstanceReference(String invoicingInstanceReference) {
    this.invoicingInstanceReference = invoicingInstanceReference;
  }


  /**
   * Get invoicingInstanceRecord
   * @return invoicingInstanceRecord
  **/

  public BQInvoicingUpdateInputModelInvoicingInstanceRecord getInvoicingInstanceRecord() {
    return invoicingInstanceRecord;
  }

  public void setInvoicingInstanceRecord(BQInvoicingUpdateInputModelInvoicingInstanceRecord invoicingInstanceRecord) {
    this.invoicingInstanceRecord = invoicingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return invoicingUpdateActionTaskRecord
  **/

  public Object getInvoicingUpdateActionTaskRecord() {
    return invoicingUpdateActionTaskRecord;
  }

  public void setInvoicingUpdateActionTaskRecord(Object invoicingUpdateActionTaskRecord) {
    this.invoicingUpdateActionTaskRecord = invoicingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return invoicingUpdateActionRequest
  **/

  public String getInvoicingUpdateActionRequest() {
    return invoicingUpdateActionRequest;
  }

  public void setInvoicingUpdateActionRequest(String invoicingUpdateActionRequest) {
    this.invoicingUpdateActionRequest = invoicingUpdateActionRequest;
  }


}

