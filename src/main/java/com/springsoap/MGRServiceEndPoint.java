package com.springsoap;

import com.springsoap.cpsinterface.request.Request;
import com.springsoap.cpsinterface.response.Response;
import com.springsoap.cpsinterface.result.Result;
import org.springframework.stereotype.Service;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;

@Endpoint
@Service
public class MGRServiceEndPoint {

    private static final String NAMESPACE_URI = "http://cps.huawei.com/cpsinterface/api_requestmgr";



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Request")
    @ResponsePayload
    public Response requestMgrService(@RequestPayload Request request) {
        System.out.println("Endpoint method getCountry invoked!");
        Response response = new Response();
        Response.Header header = new Response.Header();
        header.setConversationID("1234");
        header.setVersion("1");
        header.setOriginatorConversationID(request.getHeader().getOriginatorConversationID());
        Response.Body body = new Response.Body();
        body.setResponseCode("0");
        body.setServiceStatus(new BigInteger("0"));
        body.setResponseDesc("Success");
        response.setHeader(header);
        response.setBody(body);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AnotherRequest")
    @ResponsePayload
    public Result SYNCAPIRequestMgrService(@RequestPayload Request request) {
        System.out.println("Endpoint method SYNCAPIRequestMgrService invoked!");
        Result response = new Result();
        Result.Header header = new Result.Header();
        header.setConversationID(request.getHeader().getOriginatorConversationID());
        header.setVersion("1");
        header.setOriginatorConversationID(request.getHeader().getOriginatorConversationID());
        Result.Body body = new Result.Body();
        body.setResultCode("0");
        body.setResultType("0");
        body.setResultDesc("Success");


        Result.Body.QueryTransactionStatusResult transactionStatusResult = new Result.Body.QueryTransactionStatusResult();
        transactionStatusResult.setTransactionStatus("Completed");
        transactionStatusResult.setReceiptNumber("000018179674");
        transactionStatusResult.setBOCompletedTime("20191209154323");
        body.setQueryTransactionStatusResult(transactionStatusResult);
        response.setHeader(header);
        response.setBody(body);
        return response;
    }
}
