package com.sample.restfulservices;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.xebialabs.restito.semantics.Call;
import com.xebialabs.restito.server.StubServer;
import static com.xebialabs.restito.builder.stub.StubHttp.whenHttp;
import static com.xebialabs.restito.semantics.Condition.get;
import static com.xebialabs.restito.semantics.Condition.post;

import java.util.List;

import static com.xebialabs.restito.semantics.Action.status;

public class RestfulUtils {
	
	public static void restartResititoServerForGETRequests(StubServer server, int port, HttpStatus status) {
		
		//kill server if already running
		if(server!=null) {
			server.stop();
		}
		
		//start server for GET
		server = new StubServer(port);
		whenHttp(server).match(get("/getevents")).then(status(status));
		
	}
	
	public static void restartResititoServerForPOSTRequests(StubServer server, int port, HttpStatus status) {
		//kill server if already running
				if(server!=null) {
					server.stop();
				}
				
				//start server for GET
				server = new StubServer(port);
				whenHttp(server).match(post("/postevents")).then(status(status));
	}
	
	public static List<Call> waitAndGETCallLists(StubServer server, int waittimeInSeconds) throws InterruptedException {
		int timeOutCount = 0;
		 List<Call> serverCalls = server.getCalls();
		while(serverCalls.isEmpty()) {
			Thread.sleep(1000);
			timeOutCount++;
			if(timeOutCount>=waittimeInSeconds) {
				break;
			}
			
			serverCalls = server.getCalls();
			
		}
		Thread.sleep(2000);
		return serverCalls;
		
	}

}
