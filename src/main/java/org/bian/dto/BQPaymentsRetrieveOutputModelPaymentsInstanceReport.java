package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsRetrieveOutputModelPaymentsInstanceReport
 */
public class BQPaymentsRetrieveOutputModelPaymentsInstanceReport   {
  private Object paymentsInstanceReportRecord = null;

  private String paymentsInstanceReportType = null;

  private String paymentsInstanceReportParameters = null;

  private Object paymentsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentsInstanceReportRecord
  **/

  public Object getPaymentsInstanceReportRecord() {
    return paymentsInstanceReportRecord;
  }

  public void setPaymentsInstanceReportRecord(Object paymentsInstanceReportRecord) {
    this.paymentsInstanceReportRecord = paymentsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentsInstanceReportType
  **/

  public String getPaymentsInstanceReportType() {
    return paymentsInstanceReportType;
  }

  public void setPaymentsInstanceReportType(String paymentsInstanceReportType) {
    this.paymentsInstanceReportType = paymentsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentsInstanceReportParameters
  **/

  public String getPaymentsInstanceReportParameters() {
    return paymentsInstanceReportParameters;
  }

  public void setPaymentsInstanceReportParameters(String paymentsInstanceReportParameters) {
    this.paymentsInstanceReportParameters = paymentsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentsInstanceReport
  **/

  public Object getPaymentsInstanceReport() {
    return paymentsInstanceReport;
  }

  public void setPaymentsInstanceReport(Object paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
  }


}

