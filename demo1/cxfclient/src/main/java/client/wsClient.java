package client;

import org.junit.Test;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.encoding.XMLType;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import java.rmi.RemoteException;

/**
 * @author 陈刚
 * @ClassName wsClient
 * @Description //TODO
 * @create 2019-08-30 15:53
 */
public class wsClient {


    @Test
    public void demo2() throws ServiceException, RemoteException {
        Service service = new Service();
        Call call = (Call)service.createCall();
        call.setTargetEndpointAddress("http://localhost:8080/service/user?wsdl");
        //参数一：服务端namespace（wsdl:import那行,没有就targetNamespace），参数二：方法名
        call.setOperationName(new QName("http://service.demo1.ws.chengang.com/","getUserName"));
        //wsdl文档中的参数名
        call.addParameter("arg0",XMLType.XSD_STRING,ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        Object object = call.invoke(new Object[]{"411001"});
        System.out.println("object = " + object);
        //invoke返回值就是定义的返回值，如果有其他输出参数，用call.getOutputParams()获取,如果没有返回值，只有inout参数，返回的会被放在invoke方法执行后的返回值上
    }
}
