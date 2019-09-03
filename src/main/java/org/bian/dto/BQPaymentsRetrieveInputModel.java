package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis;
import org.bian.dto.BQPaymentsRetrieveInputModelPaymentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPaymentsRetrieveInputModel
 */
public class BQPaymentsRetrieveInputModel   {
  private Object paymentsRetrieveActionTaskRecord = null;

  private String paymentsRetrieveActionRequest = null;

  private BQPaymentsRetrieveInputModelPaymentsInstanceReport paymentsInstanceReport = null;

  private BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis paymentsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentsRetrieveActionTaskRecord
  **/

  public Object getPaymentsRetrieveActionTaskRecord() {
    return paymentsRetrieveActionTaskRecord;
  }

  public void setPaymentsRetrieveActionTaskRecord(Object paymentsRetrieveActionTaskRecord) {
    this.paymentsRetrieveActionTaskRecord = paymentsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentsRetrieveActionRequest
  **/

  public String getPaymentsRetrieveActionRequest() {
    return paymentsRetrieveActionRequest;
  }

  public void setPaymentsRetrieveActionRequest(String paymentsRetrieveActionRequest) {
    this.paymentsRetrieveActionRequest = paymentsRetrieveActionRequest;
  }


  /**
   * Get paymentsInstanceReport
   * @return paymentsInstanceReport
  **/

  public BQPaymentsRetrieveInputModelPaymentsInstanceReport getPaymentsInstanceReport() {
    return paymentsInstanceReport;
  }

  public void setPaymentsInstanceReport(BQPaymentsRetrieveInputModelPaymentsInstanceReport paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
  }


  /**
   * Get paymentsInstanceAnalysis
   * @return paymentsInstanceAnalysis
  **/

  public BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis getPaymentsInstanceAnalysis() {
    return paymentsInstanceAnalysis;
  }

  public void setPaymentsInstanceAnalysis(BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis paymentsInstanceAnalysis) {
    this.paymentsInstanceAnalysis = paymentsInstanceAnalysis;
  }


}

