package com.kpelykh.docker.client.test;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kpelykh.docker.client.DockerClient;
import com.kpelykh.docker.client.DockerException;
import com.kpelykh.docker.client.model.ContainerInspectResponse;
import com.sun.jersey.json.impl.JSONHelper;


public class DockerClientAVTest extends Assert {
  
	public static final Logger LOG = LoggerFactory
			.getLogger(DockerClientAVTest.class);

	private DockerClient dockerClient;
	
	@BeforeTest
	public void beforeTest() throws DockerException {
		LOG.info("======================= BEFORETEST =======================");
		LOG.info("Connecting to Docker server at http://54.235.65.32:4243");
		dockerClient = new DockerClient("http://54.235.65.32:4243");

		assertNotNull(dockerClient);
		LOG.info("======================= END OF BEFORETEST =======================\n\n");
	}

	@AfterTest
	public void afterTest() {
		LOG.info("======================= END OF AFTERTEST =======================");
	}

	@BeforeMethod
	public void beforeMethod(Method method) {
		LOG.info(String
				.format("################################## STARTING %s ##################################",
						method.getName()));
	}
	

	@Test
	public void testInspectContainer() throws DockerException {
		
		ContainerInspectResponse cntResp = dockerClient.inspectContainer("913bfa3c4bde");
		System.out.println("container response ====> " + cntResp.toString());
		System.out.println("NetworkSettings Ports info: " + cntResp.getNetworkSettings().ports.toString());
		System.out.println("HostConfig Ports info: " + cntResp.getHostConfig().getPortBindings().toString());
		
	}

}
