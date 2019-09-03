package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvoicingRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord;

import javax.validation.Valid;
  
/**
 * BQInvoicingRetrieveOutputModelInvoicingInstanceRecord
 */
public class BQInvoicingRetrieveOutputModelInvoicingInstanceRecord   {
  private BQInvoicingRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord customerInvoiceRecord = null;

  private String invoicingWorkProduct = null;


  /**
   * Get customerInvoiceRecord
   * @return customerInvoiceRecord
  **/

  public BQInvoicingRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord getCustomerInvoiceRecord() {
    return customerInvoiceRecord;
  }

  public void setCustomerInvoiceRecord(BQInvoicingRetrieveOutputModelInvoicingInstanceRecordCustomerInvoiceRecord customerInvoiceRecord) {
    this.customerInvoiceRecord = customerInvoiceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis (for future reference) 
   * @return invoicingWorkProduct
  **/

  public String getInvoicingWorkProduct() {
    return invoicingWorkProduct;
  }

  public void setInvoicingWorkProduct(String invoicingWorkProduct) {
    this.invoicingWorkProduct = invoicingWorkProduct;
  }


}

