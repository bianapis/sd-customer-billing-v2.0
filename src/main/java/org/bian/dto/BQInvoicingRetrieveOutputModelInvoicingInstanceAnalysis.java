package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInvoicingRetrieveOutputModelInvoicingInstanceAnalysis
 */
public class BQInvoicingRetrieveOutputModelInvoicingInstanceAnalysis   {
  private Object invoicingInstanceAnalysisRecord = null;

  private String invoicingInstanceAnalysisReportType = null;

  private String invoicingInstanceAnalysisParameters = null;

  private Object invoicingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return invoicingInstanceAnalysisRecord
  **/

  public Object getInvoicingInstanceAnalysisRecord() {
    return invoicingInstanceAnalysisRecord;
  }

  public void setInvoicingInstanceAnalysisRecord(Object invoicingInstanceAnalysisRecord) {
    this.invoicingInstanceAnalysisRecord = invoicingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return invoicingInstanceAnalysisReportType
  **/

  public String getInvoicingInstanceAnalysisReportType() {
    return invoicingInstanceAnalysisReportType;
  }

  public void setInvoicingInstanceAnalysisReportType(String invoicingInstanceAnalysisReportType) {
    this.invoicingInstanceAnalysisReportType = invoicingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return invoicingInstanceAnalysisParameters
  **/

  public String getInvoicingInstanceAnalysisParameters() {
    return invoicingInstanceAnalysisParameters;
  }

  public void setInvoicingInstanceAnalysisParameters(String invoicingInstanceAnalysisParameters) {
    this.invoicingInstanceAnalysisParameters = invoicingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return invoicingInstanceAnalysisReport
  **/

  public Object getInvoicingInstanceAnalysisReport() {
    return invoicingInstanceAnalysisReport;
  }

  public void setInvoicingInstanceAnalysisReport(Object invoicingInstanceAnalysisReport) {
    this.invoicingInstanceAnalysisReport = invoicingInstanceAnalysisReport;
  }


}

