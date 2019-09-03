package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvoicingRetrieveInputModelInvoicingInstanceAnalysis;
import org.bian.dto.BQInvoicingRetrieveInputModelInvoicingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInvoicingRetrieveInputModel
 */
public class BQInvoicingRetrieveInputModel   {
  private Object invoicingRetrieveActionTaskRecord = null;

  private String invoicingRetrieveActionRequest = null;

  private BQInvoicingRetrieveInputModelInvoicingInstanceReport invoicingInstanceReport = null;

  private BQInvoicingRetrieveInputModelInvoicingInstanceAnalysis invoicingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return invoicingRetrieveActionRequest
  **/

  public String getInvoicingRetrieveActionRequest() {
    return invoicingRetrieveActionRequest;
  }

  public void setInvoicingRetrieveActionRequest(String invoicingRetrieveActionRequest) {
    this.invoicingRetrieveActionRequest = invoicingRetrieveActionRequest;
  }


  /**
   * Get invoicingInstanceReport
   * @return invoicingInstanceReport
  **/

  public BQInvoicingRetrieveInputModelInvoicingInstanceReport getInvoicingInstanceReport() {
    return invoicingInstanceReport;
  }

  public void setInvoicingInstanceReport(BQInvoicingRetrieveInputModelInvoicingInstanceReport invoicingInstanceReport) {
    this.invoicingInstanceReport = invoicingInstanceReport;
  }


  /**
   * Get invoicingInstanceAnalysis
   * @return invoicingInstanceAnalysis
  **/

  public BQInvoicingRetrieveInputModelInvoicingInstanceAnalysis getInvoicingInstanceAnalysis() {
    return invoicingInstanceAnalysis;
  }

  public void setInvoicingInstanceAnalysis(BQInvoicingRetrieveInputModelInvoicingInstanceAnalysis invoicingInstanceAnalysis) {
    this.invoicingInstanceAnalysis = invoicingInstanceAnalysis;
  }


}

