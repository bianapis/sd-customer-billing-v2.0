package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord
 */
public class CRCustomerBillingProcedureInitiateOutputModelCRCustomerBillingProcedureInstanceRecord   {
  private String customerBillingPaymentSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual billing activities and dates 
   * @return customerBillingPaymentSchedule
  **/

  public String getCustomerBillingPaymentSchedule() {
    return customerBillingPaymentSchedule;
  }

  public void setCustomerBillingPaymentSchedule(String customerBillingPaymentSchedule) {
    this.customerBillingPaymentSchedule = customerBillingPaymentSchedule;
  }


}

