package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerBillingProcedureInitiateInputModelCRCustomerBillingProcedureInstanceRecord
 */
public class CRCustomerBillingProcedureInitiateInputModelCRCustomerBillingProcedureInstanceRecord   {
  private String customerBillingTransactionType = null;

  private String customerBillingTransactionDescription = null;

  private String customerReference = null;

  private String productInstanceReference = null;

  private String customerAgreementReference = null;

  private String customerBillingProductServiceActionDescription = null;

  private String customerBillingParty = null;

  private String customerBillingAddress = null;

  private String customerBillingPeriod = null;

  private String customerBillingStatement = null;

  private String customerBillingAmount = null;

  private String customerBillingPaymentDueDate = null;

  private String customerBillingPaymentDetails = null;

  private String customerBillingPaymentSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of customer billing (e.g. product fees, penalties) 
   * @return customerBillingTransactionType
  **/

  public String getCustomerBillingTransactionType() {
    return customerBillingTransactionType;
  }

  public void setCustomerBillingTransactionType(String customerBillingTransactionType) {
    this.customerBillingTransactionType = customerBillingTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description that annotates the bill as appropriate 
   * @return customerBillingTransactionDescription
  **/

  public String getCustomerBillingTransactionDescription() {
    return customerBillingTransactionDescription;
  }

  public void setCustomerBillingTransactionDescription(String customerBillingTransactionDescription) {
    this.customerBillingTransactionDescription = customerBillingTransactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer for the billing 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The product instance associated with the charge 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The agreement covering the product arrangement (referenced for any specific billing terms and conditions) 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Breakdown and description of the billed service or activities 
   * @return customerBillingProductServiceActionDescription
  **/

  public String getCustomerBillingProductServiceActionDescription() {
    return customerBillingProductServiceActionDescription;
  }

  public void setCustomerBillingProductServiceActionDescription(String customerBillingProductServiceActionDescription) {
    this.customerBillingProductServiceActionDescription = customerBillingProductServiceActionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The legal entity being charged (will usually be the customer) 
   * @return customerBillingParty
  **/

  public String getCustomerBillingParty() {
    return customerBillingParty;
  }

  public void setCustomerBillingParty(String customerBillingParty) {
    this.customerBillingParty = customerBillingParty;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The billing address (can be an electronic location 
   * @return customerBillingAddress
  **/

  public String getCustomerBillingAddress() {
    return customerBillingAddress;
  }

  public void setCustomerBillingAddress(String customerBillingAddress) {
    this.customerBillingAddress = customerBillingAddress;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The billing period is appropriate (e.g. for an on-going service) 
   * @return customerBillingPeriod
  **/

  public String getCustomerBillingPeriod() {
    return customerBillingPeriod;
  }

  public void setCustomerBillingPeriod(String customerBillingPeriod) {
    this.customerBillingPeriod = customerBillingPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The itemized breakdown of the charges with references 
   * @return customerBillingStatement
  **/

  public String getCustomerBillingStatement() {
    return customerBillingStatement;
  }

  public void setCustomerBillingStatement(String customerBillingStatement) {
    this.customerBillingStatement = customerBillingStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The total amount due 
   * @return customerBillingAmount
  **/

  public String getCustomerBillingAmount() {
    return customerBillingAmount;
  }

  public void setCustomerBillingAmount(String customerBillingAmount) {
    this.customerBillingAmount = customerBillingAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The due date for payment 
   * @return customerBillingPaymentDueDate
  **/

  public String getCustomerBillingPaymentDueDate() {
    return customerBillingPaymentDueDate;
  }

  public void setCustomerBillingPaymentDueDate(String customerBillingPaymentDueDate) {
    this.customerBillingPaymentDueDate = customerBillingPaymentDueDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The payment details (e.g. payment account) 
   * @return customerBillingPaymentDetails
  **/

  public String getCustomerBillingPaymentDetails() {
    return customerBillingPaymentDetails;
  }

  public void setCustomerBillingPaymentDetails(String customerBillingPaymentDetails) {
    this.customerBillingPaymentDetails = customerBillingPaymentDetails;
  }


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

