package com.soap.webservices.soapcoursemanagement;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.webservices.CourseDetails;
import com.soap.webservices.GetCourseDetailsRequest;
import com.soap.webservices.GetCourseDetailsResponse;

@Endpoint
public class SoapDetailsEndpoint {
	//method
	//input - request  SoapDetailsRequest
	//output - response SoapDetailsResponse

	@PayloadRoot(namespace = "http://soap.com/webservices", 
			localPart = "GetCourseDetailsResponse")
	@ResponsePayload
	public GetCourseDetailsResponse processSoapDetailsRequest 
		(@RequestPayload GetCourseDetailsResponse request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(1);
		courseDetails.setName("Microservices Course");
		courseDetails.setDescription("That would be a wonderful course");
		response.setCourseDetails(courseDetails);
		return response;
	}
}
