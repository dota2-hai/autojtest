package demo;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @author 陈刚
 * @ClassName Test1
 * @Description //TODO
 * @create 2019-08-19 21:06
 */
public class Test1 {

    @Test
    public void test1() throws IOException {
        String result;
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(httpGet);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }
}
