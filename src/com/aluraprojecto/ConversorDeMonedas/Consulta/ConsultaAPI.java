package com.aluraprojecto.ConversorDeMonedas.Consulta;

import com.aluraprojecto.ConversorDeMonedas.Divisa.ValorDivisa;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public double ObtenerValorDeDivisas(String valorBase, String valorCambio, double numeroBase) {
        String apiKey = "fb478f1c74e9190de3a6c5cc";
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + valorBase + "/" + valorCambio;
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(response.body());

            ValorDivisa nuevaDivisa = gson.fromJson(json, ValorDivisa.class);
            double tasaCambio = nuevaDivisa.conversion_rate();

            return numeroBase * tasaCambio;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

