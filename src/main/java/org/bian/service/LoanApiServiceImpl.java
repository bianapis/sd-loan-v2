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
public class LoanApiServiceImpl implements LoanApiService {

	public SDLoanActivateOutputModel activate(SDLoanActivateInputModel request){
		return JsonReader.read("activate-SDLoanActivateOutputModel.json",new TypeReference<SDLoanActivateOutputModel>(){});
	}
	
	public SDLoanConfigureOutputModel configure(String sdReferenceId, SDLoanConfigureInputModel request){
		return JsonReader.read("configure-SDLoanConfigureOutputModel.json",new TypeReference<SDLoanConfigureOutputModel>(){});
	}
	
	public CRLoanFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRLoanFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRLoanFulfillmentArrangementControlOutputModel.json",new TypeReference<CRLoanFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQRestructuringExchangeOutputModel exchangeRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringExchangeInputModel request){
		return JsonReader.read("exchange-BQRestructuringExchangeOutputModel.json",new TypeReference<BQRestructuringExchangeOutputModel>(){});
	}
	
	public BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request){
		return JsonReader.read("execute-BQRepaymentExecuteOutputModel.json",new TypeReference<BQRepaymentExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public BQWithdrawalExecuteOutputModel executeWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalExecuteInputModel request){
		return JsonReader.read("execute-BQWithdrawalExecuteOutputModel.json",new TypeReference<BQWithdrawalExecuteOutputModel>(){});
	}
	
	public SDLoanFeedbackOutputModel feedback(String sdReferenceId, SDLoanFeedbackInputModel request){
		return JsonReader.read("feedback-SDLoanFeedbackOutputModel.json",new TypeReference<SDLoanFeedbackOutputModel>(){});
	}
	
	public CRLoanFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRLoanFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRLoanFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRLoanFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQRestructuringInitiateOutputModel initiateRestructuring(String sdReferenceId, String crReferenceId, BQRestructuringInitiateInputModel request){
		return JsonReader.read("initiate-BQRestructuringInitiateOutputModel.json",new TypeReference<BQRestructuringInitiateOutputModel>(){});
	}
	
	public BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceRequestOutputModel.json",new TypeReference<BQMaintenanceRequestOutputModel>(){});
	}
	
	public BQRepaymentRequestOutputModel requestRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentRequestInputModel request){
		return JsonReader.read("request-BQRepaymentRequestOutputModel.json",new TypeReference<BQRepaymentRequestOutputModel>(){});
	}
	
	public BQRestructuringRequestOutputModel requestRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringRequestInputModel request){
		return JsonReader.read("request-BQRestructuringRequestOutputModel.json",new TypeReference<BQRestructuringRequestOutputModel>(){});
	}
	
	public BQWithdrawalRequestOutputModel requestWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalRequestInputModel request){
		return JsonReader.read("request-BQWithdrawalRequestOutputModel.json",new TypeReference<BQWithdrawalRequestOutputModel>(){});
	}
	
	public CRLoanFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRLoanFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRLoanFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQDisbursementRetrieveOutputModel retrieveDisbursement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDisbursementRetrieveOutputModel.json",new TypeReference<BQDisbursementRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceRetrieveOutputModel.json",new TypeReference<BQMaintenanceRetrieveOutputModel>(){});
	}
	
	public BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRepaymentRetrieveOutputModel.json",new TypeReference<BQRepaymentRetrieveOutputModel>(){});
	}
	
	public BQRestructuringRetrieveOutputModel retrieveRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRestructuringRetrieveOutputModel.json",new TypeReference<BQRestructuringRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public BQWithdrawalRetrieveOutputModel retrieveWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQWithdrawalRetrieveOutputModel.json",new TypeReference<BQWithdrawalRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDLoanRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDLoanRetrieveOutputModel.json",new TypeReference<SDLoanRetrieveOutputModel>(){});
	}
	
	public CRLoanFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLoanFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRLoanFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRLoanFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request){
		return JsonReader.read("update-BQRepaymentUpdateOutputModel.json",new TypeReference<BQRepaymentUpdateOutputModel>(){});
	}
	
	public BQRestructuringUpdateOutputModel updateRestructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRestructuringUpdateInputModel request){
		return JsonReader.read("update-BQRestructuringUpdateOutputModel.json",new TypeReference<BQRestructuringUpdateOutputModel>(){});
	}
	
	public BQWithdrawalUpdateOutputModel updateWithdrawal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalUpdateInputModel request){
		return JsonReader.read("update-BQWithdrawalUpdateOutputModel.json",new TypeReference<BQWithdrawalUpdateOutputModel>(){});
	}
	
}
