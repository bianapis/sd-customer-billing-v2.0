package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord;
import org.bian.dto.BQTrackingandRemindersRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord;
import org.bian.dto.BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecord;
import org.bian.dto.BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceAnalysis;
import org.bian.dto.BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersRetrieveOutputModel
 */
public class BQTrackingandRemindersRetrieveOutputModel   {
  private BQTrackingandRemindersRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord = null;

  private BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecord invoicingInstanceRecord = null;

  private BQTrackingandRemindersInitiateInputModelTrackingandRemindersInstanceRecord trackingandRemindersInstanceRecord = null;

  private String trackingandRemindersRetrieveActionTaskReference = null;

  private Object trackingandRemindersRetrieveActionTaskRecord = null;

  private String trackingandRemindersRetrieveActionResponse = null;

  private BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceReport trackingandRemindersInstanceReport = null;

  private BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceAnalysis trackingandRemindersInstanceAnalysis = null;


  /**
   * Get cRCustomerBillingProcedureInstanceRecord
   * @return cRCustomerBillingProcedureInstanceRecord
  **/

  public BQTrackingandRemindersRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord getCRCustomerBillingProcedureInstanceRecord() {
    return cRCustomerBillingProcedureInstanceRecord;
  }

  public void setCRCustomerBillingProcedureInstanceRecord(BQTrackingandRemindersRetrieveOutputModelCRCustomerBillingProcedureInstanceRecord cRCustomerBillingProcedureInstanceRecord) {
    this.cRCustomerBillingProcedureInstanceRecord = cRCustomerBillingProcedureInstanceRecord;
  }


  /**
   * Get invoicingInstanceRecord
   * @return invoicingInstanceRecord
  **/

  public BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecord getInvoicingInstanceRecord() {
    return invoicingInstanceRecord;
  }

  public void setInvoicingInstanceRecord(BQTrackingandRemindersRetrieveOutputModelInvoicingInstanceRecord invoicingInstanceRecord) {
    this.invoicingInstanceRecord = invoicingInstanceRecord;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tracking and Reminders instance retrieve service call 
   * @return trackingandRemindersRetrieveActionTaskReference
  **/

  public String getTrackingandRemindersRetrieveActionTaskReference() {
    return trackingandRemindersRetrieveActionTaskReference;
  }

  public void setTrackingandRemindersRetrieveActionTaskReference(String trackingandRemindersRetrieveActionTaskReference) {
    this.trackingandRemindersRetrieveActionTaskReference = trackingandRemindersRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return trackingandRemindersRetrieveActionTaskRecord
  **/

  public Object getTrackingandRemindersRetrieveActionTaskRecord() {
    return trackingandRemindersRetrieveActionTaskRecord;
  }

  public void setTrackingandRemindersRetrieveActionTaskRecord(Object trackingandRemindersRetrieveActionTaskRecord) {
    this.trackingandRemindersRetrieveActionTaskRecord = trackingandRemindersRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return trackingandRemindersRetrieveActionResponse
  **/

  public String getTrackingandRemindersRetrieveActionResponse() {
    return trackingandRemindersRetrieveActionResponse;
  }

  public void setTrackingandRemindersRetrieveActionResponse(String trackingandRemindersRetrieveActionResponse) {
    this.trackingandRemindersRetrieveActionResponse = trackingandRemindersRetrieveActionResponse;
  }


  /**
   * Get trackingandRemindersInstanceReport
   * @return trackingandRemindersInstanceReport
  **/

  public BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceReport getTrackingandRemindersInstanceReport() {
    return trackingandRemindersInstanceReport;
  }

  public void setTrackingandRemindersInstanceReport(BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceReport trackingandRemindersInstanceReport) {
    this.trackingandRemindersInstanceReport = trackingandRemindersInstanceReport;
  }


  /**
   * Get trackingandRemindersInstanceAnalysis
   * @return trackingandRemindersInstanceAnalysis
  **/

  public BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceAnalysis getTrackingandRemindersInstanceAnalysis() {
    return trackingandRemindersInstanceAnalysis;
  }

  public void setTrackingandRemindersInstanceAnalysis(BQTrackingandRemindersRetrieveOutputModelTrackingandRemindersInstanceAnalysis trackingandRemindersInstanceAnalysis) {
    this.trackingandRemindersInstanceAnalysis = trackingandRemindersInstanceAnalysis;
  }


}

