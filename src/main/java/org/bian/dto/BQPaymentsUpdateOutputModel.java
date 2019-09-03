package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsUpdateInputModelPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsUpdateOutputModel
 */
public class BQPaymentsUpdateOutputModel   {
  private BQPaymentsUpdateInputModelPaymentsInstanceRecord paymentsInstanceRecord = null;

  private String paymentsUpdateActionTaskReference = null;

  private Object paymentsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsUpdateInputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsUpdateInputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return paymentsUpdateActionTaskReference
  **/

  public String getPaymentsUpdateActionTaskReference() {
    return paymentsUpdateActionTaskReference;
  }

  public void setPaymentsUpdateActionTaskReference(String paymentsUpdateActionTaskReference) {
    this.paymentsUpdateActionTaskReference = paymentsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentsUpdateActionTaskRecord
  **/

  public Object getPaymentsUpdateActionTaskRecord() {
    return paymentsUpdateActionTaskRecord;
  }

  public void setPaymentsUpdateActionTaskRecord(Object paymentsUpdateActionTaskRecord) {
    this.paymentsUpdateActionTaskRecord = paymentsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

