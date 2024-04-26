//GabrielMarcio

package br.com.GabrielMarcioService;

import java.io.IOException;
import java.net.http.HttpClient;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.GabrielMarcioModel.*;


public class GabrielMarcioViaCepService {

	
	public ProfessorEndereco getProfessorEndereco(String cep) throws ClientProtocolException, IOException {
		
		ProfessorEndereco professorEndereco = null;
		
		HttpGet request = new HttpClient("https://viacep.com.br/ws/"+cep+"/json/");
		
		try(HttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				
				CloseableHttpResponse response = httpClient.execute(request)) {
			
			HttpEntity entity = response.getEntity();
			
			if(entity != null) {
				
				String result = EntityUtils.toString(entity);
				
				Gson gson = new Gson();
				
				professorEndereco = gson.fromJson(result, ProfessorEndereco.class);
			}
		}
		
		return professorEndereco;
	}
	
}
