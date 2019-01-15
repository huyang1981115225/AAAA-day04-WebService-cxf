package cn.tedu.server;

import javax.xml.ws.Endpoint;

import cn.tedu.ws.HelloWSImpl;

/**
 * 发布WebService之后，客户端才能使用
 * 导入cxf的jar包
 * 用的是jetty服务
 * 
 * Endpoint.publish(address, new HelloWSImpl());
 * 
 * @author HY
 *
 */
public class ServerTest {
	public static void main(String[] args) {
		String address="http://localhost:8888/AAAA-day04-WebService-cxf/hellows";
		
		Endpoint.publish(address, new HelloWSImpl());
		
		System.out.println("CXF ------WebService已经发布成功!");
	}
}
