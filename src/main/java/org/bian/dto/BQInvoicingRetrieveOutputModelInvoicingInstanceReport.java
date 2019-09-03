package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInvoicingRetrieveOutputModelInvoicingInstanceReport
 */
public class BQInvoicingRetrieveOutputModelInvoicingInstanceReport   {
  private Object invoicingInstanceReportRecord = null;

  private String invoicingInstanceReportType = null;

  private String invoicingInstanceReportParameters = null;

  private Object invoicingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return invoicingInstanceReportRecord
  **/

  public Object getInvoicingInstanceReportRecord() {
    return invoicingInstanceReportRecord;
  }

  public void setInvoicingInstanceReportRecord(Object invoicingInstanceReportRecord) {
    this.invoicingInstanceReportRecord = invoicingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return invoicingInstanceReportType
  **/

  public String getInvoicingInstanceReportType() {
    return invoicingInstanceReportType;
  }

  public void setInvoicingInstanceReportType(String invoicingInstanceReportType) {
    this.invoicingInstanceReportType = invoicingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return invoicingInstanceReportParameters
  **/

  public String getInvoicingInstanceReportParameters() {
    return invoicingInstanceReportParameters;
  }

  public void setInvoicingInstanceReportParameters(String invoicingInstanceReportParameters) {
    this.invoicingInstanceReportParameters = invoicingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return invoicingInstanceReport
  **/

  public Object getInvoicingInstanceReport() {
    return invoicingInstanceReport;
  }

  public void setInvoicingInstanceReport(Object invoicingInstanceReport) {
    this.invoicingInstanceReport = invoicingInstanceReport;
  }


}

