package com.mia.order.tApi.Untils;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;

import com.mia.order.tApi.TOrderApiService;
import com.mia.order.tApi.TParamsPing;
import com.mia.order.tApi.TResultPing;

public class Ping extends AbstractJavaSamplerClient {

	private TSocket socket;
	private TFramedTransport transport;
	private TProtocol protocol;
	private TMultiplexedProtocol tMultiplexedProtocol;
	private TOrderApiService.Client client;
	/*
	 * 客户端参数信息：接口IP 接口Port 接口服务名称
	 */
	// 定义服务IP地址
	private String SERVER_IP;
	private static String IP = "SERVER_IP";
	private static String SERVER_IP_DEFAULT = "";
	// 定义端口号
	private int SERVER_PORT;
	private static String Port = "SERVER_PORT";
	private static int SERVER_PORT_DEFAULT = 22;
	// 定义服务名称
	private String Service;
	private static String Service_Name = "Service_Name";
	private static String Service_Name_DEFAULT = "";
	/*
	 * 定义服务公共参数，测试过程中只需确定api版本即可，其他参数业务封装并反显
	 */

	private void setupValues(JavaSamplerContext context) {

		SERVER_IP = context.getParameter(IP, SERVER_IP_DEFAULT);
		SERVER_PORT = context.getIntParameter(Port, SERVER_PORT_DEFAULT);
		Service = context.getParameter(Service_Name, Service_Name_DEFAULT);
	}

	/*
	 * 设置传入的参数，可以设置多个，已设置的参数会显示到Jmeter的参数列表中
	 */
	@Override
	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		//// 定义一个参数，显示到Jmeter的参数列表中，第一个参数为参数默认的显示名称，第二个参数为默认值
		params.addArgument(IP, SERVER_IP_DEFAULT);
		// Integer.toString(b)(b)
		params.addArgument(Port, Integer.toString(SERVER_PORT_DEFAULT));
		params.addArgument(Service_Name, Service_Name_DEFAULT);

		return params;
	}

	/*
	 * //初始化方法，实际运行时每个线程仅执行一次，在测试方法运行前执行，类似于LoadRunner中的init方法 （非 Javadoc）
	 * 
	 * @see org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient#
	 * setupTest(org.apache.jmeter.protocol.java.sampler.JavaSamplerContext)
	 */

	public void setupTest(JavaSamplerContext arg0) {

		SERVER_IP = arg0.getParameter("SERVER_IP");
		SERVER_PORT = arg0.getIntParameter("SERVER_PORT");
		Service = arg0.getParameter("Service_Name");
		// Socket层
		socket = new TSocket(SERVER_IP, SERVER_PORT);
		// 传输层
		transport = new TFramedTransport(socket);

		try {
			transport.open();
			
		} catch (TTransportException e) {
			transport.close();
			throw new RuntimeException(e);
		}
		// 传输协议
		protocol = new TCompactProtocol(transport);
		// 定义调用的服务
		tMultiplexedProtocol = new TMultiplexedProtocol(protocol, Service);
		// 客户端
		client = new TOrderApiService.Client(tMultiplexedProtocol);

	}


	@SuppressWarnings("deprecation")
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult results = new SampleResult();
		setupValues(context);
		TParamsPing params = _TParamsPing.params();
		// 定义一个事务，表示这是事务的起始点
		results.sampleStart();
		TResultPing result = null;
		try {

			result = client.ping(params);
		} catch (TException e) {

			e.printStackTrace();
		}
		// 定义事务，标志事务结束
		results.sampleEnd();
		results.setDataEncoding("UTF-8");
		results.setDataType(SampleResult.TEXT);
		results.setSamplerData(params.toString());
		results.setSampleLabel("ping");

		// 判断
		if (result == null) {

			results.setResponseCode("null");
			results.setResponseData("Response Body:null");
			// results.setResponseMessage(result.toString());
			results.setSuccessful(false);
		} else {

			results.setResponseCode("Response Code" + result.toString());
			results.setResponseData("Response Body" + result.toString());
			//results.setResponseMessage(result.toString());

			results.setSuccessful(true);
		}
		return results;

	}

	public void teardownTest(JavaSamplerContext context) {
		super.teardownTest(context);
		transport.close();
	}

}
