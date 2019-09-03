package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecordCustomerInvoiceRecord;

import javax.validation.Valid;
  
/**
 * BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecord
 */
public class BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecord   {
  private BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecordCustomerInvoiceRecord customerInvoiceRecord = null;


  /**
   * Get customerInvoiceRecord
   * @return customerInvoiceRecord
  **/

  public BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecordCustomerInvoiceRecord getCustomerInvoiceRecord() {
    return customerInvoiceRecord;
  }

  public void setCustomerInvoiceRecord(BQTrackingandRemindersInitiateInputModelInvoicingInstanceRecordCustomerInvoiceRecord customerInvoiceRecord) {
    this.customerInvoiceRecord = customerInvoiceRecord;
  }


}

