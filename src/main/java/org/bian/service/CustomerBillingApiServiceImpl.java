/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerBillingApiServiceImpl implements CustomerBillingApiService {

	public SDCustomerBillingActivateOutputModel activate(SDCustomerBillingActivateInputModel request){
		return JsonReader.read("activate-SDCustomerBillingActivateOutputModel.json",new TypeReference<SDCustomerBillingActivateOutputModel>(){});
	}
	
	public SDCustomerBillingConfigureOutputModel configure(String sdReferenceId, SDCustomerBillingConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerBillingConfigureOutputModel.json",new TypeReference<SDCustomerBillingConfigureOutputModel>(){});
	}
	
	public CRCustomerBillingProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureControlInputModel request){
		return JsonReader.read("control-CRCustomerBillingProcedureControlOutputModel.json",new TypeReference<CRCustomerBillingProcedureControlOutputModel>(){});
	}
	
	public BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentsExchangeOutputModel.json",new TypeReference<BQPaymentsExchangeOutputModel>(){});
	}
	
	public BQTrackingandRemindersExchangeOutputModel exchangeTrackingandreminders(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTrackingandRemindersExchangeInputModel request){
		return JsonReader.read("exchange-BQTrackingandRemindersExchangeOutputModel.json",new TypeReference<BQTrackingandRemindersExchangeOutputModel>(){});
	}
	
	public CRCustomerBillingProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerBillingProcedureExecuteOutputModel.json",new TypeReference<CRCustomerBillingProcedureExecuteOutputModel>(){});
	}
	
	public SDCustomerBillingFeedbackOutputModel feedback(String sdReferenceId, SDCustomerBillingFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerBillingFeedbackOutputModel.json",new TypeReference<SDCustomerBillingFeedbackOutputModel>(){});
	}
	
	public CRCustomerBillingProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerBillingProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerBillingProcedureInitiateOutputModel.json",new TypeReference<CRCustomerBillingProcedureInitiateOutputModel>(){});
	}
	
	public BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentsInitiateOutputModel.json",new TypeReference<BQPaymentsInitiateOutputModel>(){});
	}
	
	public BQTrackingandRemindersInitiateOutputModel initiateTrackingandreminders(String sdReferenceId, String crReferenceId, BQTrackingandRemindersInitiateInputModel request){
		return JsonReader.read("initiate-BQTrackingandRemindersInitiateOutputModel.json",new TypeReference<BQTrackingandRemindersInitiateOutputModel>(){});
	}
	
	public CRCustomerBillingProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureRequestInputModel request){
		return JsonReader.read("request-CRCustomerBillingProcedureRequestOutputModel.json",new TypeReference<CRCustomerBillingProcedureRequestOutputModel>(){});
	}
	
	public CRCustomerBillingProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerBillingProcedureRetrieveOutputModel.json",new TypeReference<CRCustomerBillingProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQInvoicingRetrieveOutputModel retrieveInvoicing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInvoicingRetrieveOutputModel.json",new TypeReference<BQInvoicingRetrieveOutputModel>(){});
	}
	
	public BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentsRetrieveOutputModel.json",new TypeReference<BQPaymentsRetrieveOutputModel>(){});
	}
	
	public BQTrackingandRemindersRetrieveOutputModel retrieveTrackingandreminders(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTrackingandRemindersRetrieveOutputModel.json",new TypeReference<BQTrackingandRemindersRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerBillingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerBillingRetrieveOutputModel.json",new TypeReference<SDCustomerBillingRetrieveOutputModel>(){});
	}
	
	public CRCustomerBillingProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerBillingProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCustomerBillingProcedureUpdateOutputModel.json",new TypeReference<CRCustomerBillingProcedureUpdateOutputModel>(){});
	}
	
	public BQInvoicingUpdateOutputModel updateInvoicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInvoicingUpdateInputModel request){
		return JsonReader.read("update-BQInvoicingUpdateOutputModel.json",new TypeReference<BQInvoicingUpdateOutputModel>(){});
	}
	
	public BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQPaymentsUpdateOutputModel.json",new TypeReference<BQPaymentsUpdateOutputModel>(){});
	}
	
}
