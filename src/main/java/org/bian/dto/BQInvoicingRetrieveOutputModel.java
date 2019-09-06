package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvoicingRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.BQInvoicingRetrieveOutputModelInvoicingInstanceAnalysis;
import org.bian.dto.BQInvoicingRetrieveOutputModelInvoicingInstanceRecord;
import org.bian.dto.BQInvoicingRetrieveOutputModelInvoicingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInvoicingRetrieveOutputModel
 */
public class BQInvoicingRetrieveOutputModel   {
  private BQInvoicingRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private BQInvoicingRetrieveOutputModelInvoicingInstanceRecord invoicingInstanceRecord = null;

  private String invoicingRetrieveActionTaskReference = null;

  private Object invoicingRetrieveActionTaskRecord = null;

  private String invoicingRetrieveActionResponse = null;

  private BQInvoicingRetrieveOutputModelInvoicingInstanceReport invoicingInstanceReport = null;

  private BQInvoicingRetrieveOutputModelInvoicingInstanceAnalysis invoicingInstanceAnalysis = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public BQInvoicingRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerBillingProcedureInstanceRecord")
  public void setCRCustomerBillingProcedureInstanceRecord(BQInvoicingRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * Get invoicingInstanceRecord
   * @return invoicingInstanceRecord
  **/

  public BQInvoicingRetrieveOutputModelInvoicingInstanceRecord getInvoicingInstanceRecord() {
    return invoicingInstanceRecord;
  }

  public void setInvoicingInstanceRecord(BQInvoicingRetrieveOutputModelInvoicingInstanceRecord invoicingInstanceRecord) {
    this.invoicingInstanceRecord = invoicingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Invoicing instance retrieve service call 
   * @return invoicingRetrieveActionTaskReference
  **/

  public String getInvoicingRetrieveActionTaskReference() {
    return invoicingRetrieveActionTaskReference;
  }

  public void setInvoicingRetrieveActionTaskReference(String invoicingRetrieveActionTaskReference) {
    this.invoicingRetrieveActionTaskReference = invoicingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return invoicingRetrieveActionTaskRecord
  **/

  public Object getInvoicingRetrieveActionTaskRecord() {
    return invoicingRetrieveActionTaskRecord;
  }

  public void setInvoicingRetrieveActionTaskRecord(Object invoicingRetrieveActionTaskRecord) {
    this.invoicingRetrieveActionTaskRecord = invoicingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return invoicingRetrieveActionResponse
  **/

  public String getInvoicingRetrieveActionResponse() {
    return invoicingRetrieveActionResponse;
  }

  public void setInvoicingRetrieveActionResponse(String invoicingRetrieveActionResponse) {
    this.invoicingRetrieveActionResponse = invoicingRetrieveActionResponse;
  }


  /**
   * Get invoicingInstanceReport
   * @return invoicingInstanceReport
  **/

  public BQInvoicingRetrieveOutputModelInvoicingInstanceReport getInvoicingInstanceReport() {
    return invoicingInstanceReport;
  }

  public void setInvoicingInstanceReport(BQInvoicingRetrieveOutputModelInvoicingInstanceReport invoicingInstanceReport) {
    this.invoicingInstanceReport = invoicingInstanceReport;
  }


  /**
   * Get invoicingInstanceAnalysis
   * @return invoicingInstanceAnalysis
  **/

  public BQInvoicingRetrieveOutputModelInvoicingInstanceAnalysis getInvoicingInstanceAnalysis() {
    return invoicingInstanceAnalysis;
  }

  public void setInvoicingInstanceAnalysis(BQInvoicingRetrieveOutputModelInvoicingInstanceAnalysis invoicingInstanceAnalysis) {
    this.invoicingInstanceAnalysis = invoicingInstanceAnalysis;
  }


}

