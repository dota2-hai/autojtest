package client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.junit.Test;

import javax.xml.namespace.QName;
/**
 * @author 陈刚
 * @ClassName CxfClient
 * @Description //TODO
 * @create 2019-08-30 15:50
 */
public class CxfClient {



    @Test
    public void demo() throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        String wsUrl = "http://www.webxml.com.cn/WebServices/RandomFontsWebService.asmx?wsdl";
        Client client = dcf.createClient(wsUrl);
        //设置客户端超时时间
        HTTPConduit conduit = (HTTPConduit)client.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(360000);
        policy.setReceiveTimeout(360000);
        conduit.setClient(policy);
        //参数一：服务端namespace（wsdl:import那行），参数二：方法名，参数三：方法入参
//        Object[] res = client.invoke(new QName("",""),"");
        //返回值用Object数组接收，如果传入的参数中有输出参数，值会被按照wsdl文档中返回参数的顺序存放到Object[]中

        Object[] objects=client.invoke("getChineseFonts",1);
        System.out.println("*******"+objects[0].toString());
    }


    @Test
    public void demo2() throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        String wsUrl = "http://www.webxml.com.cn/WebServices/RandomFontsWebService.asmx?wsdl";
        Client client = dcf.createClient(wsUrl);
        //设置客户端超时时间
        HTTPConduit conduit = (HTTPConduit)client.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(360000);
        policy.setReceiveTimeout(360000);
        conduit.setClient(policy);
        //参数一：服务端namespace（wsdl:import那行），参数二：方法名，参数三：方法入参
        Object[] res = client.invoke(new QName("http://WebXml.com.cn/","getChineseFonts"),"1");
        //返回值用Object数组接收，如果传入的参数中有输出参数，值会被按照wsdl文档中返回参数的顺序存放到Object[]中
        System.out.println("res = " + res);
    }
}
