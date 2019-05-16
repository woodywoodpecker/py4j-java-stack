package es;

import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        final RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );

        GetRequest request = new GetRequest("elastic_search_edge_batch");

        GetResponse response = client.get(request);

        System.out.println(response.getSource());

        client.close();
    }

}
