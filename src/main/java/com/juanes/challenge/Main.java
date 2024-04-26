package com.juanes.challenge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.juanes.challenge.modelos.Conversion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        int opcion;
        while(true){
            System.out.println("***************************************");
            System.out.println("Sea bienvenido/a a el Conversor de Moneda =]");
            System.out.println("""
                                    
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Dolar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir  
                                    
                    Elija una opcion valida
                                    
                    **********************************************
                    """);


            opcion = scanner.nextInt();
            double valor;
            String moneda1;
            String moneda2;
            if (opcion == 1 ) {
                System.out.println("Ingrese el valor que desea convertir: ");
                valor = scanner.nextDouble();
                moneda1 = "USD";
                moneda2 = "COP";
                String direccion = "https://v6.exchangerate-api.com/v6/da1d0519d56327f4fe61ee50/pair/"+moneda1+"/"+moneda2+"/"+valor;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                try {
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    // System.out.println(json);
                    Conversion conversion = gson.fromJson(json, Conversion.class);
                    String resultado = conversion.conversion_result();
                    System.out.println("El valor "+valor+"["+moneda1+"] corresponde al valor final de =>>> "+resultado+"["+moneda2+"]");
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (opcion == 2 ) {
                System.out.println("Ingrese el valor que desea convertir: ");
                valor = scanner.nextDouble();
                moneda1 = "ARS";
                moneda2 = "USD";
                String direccion = "https://v6.exchangerate-api.com/v6/da1d0519d56327f4fe61ee50/pair/"+moneda1+"/"+moneda2+"/"+valor;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                try {
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    // System.out.println(json);
                    Conversion conversion = gson.fromJson(json, Conversion.class);
                    String resultado = conversion.conversion_result();
                    System.out.println("El valor "+valor+"["+moneda1+"] corresponde al valor final de =>>> "+resultado+"["+moneda2+"]");
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (opcion == 3 ) {
                System.out.println("Ingrese el valor que desea convertir: ");
                valor = scanner.nextDouble();
                moneda1 = "USD";
                moneda2 = "BRL";
                String direccion = "https://v6.exchangerate-api.com/v6/da1d0519d56327f4fe61ee50/pair/"+moneda1+"/"+moneda2+"/"+valor;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                try {
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    // System.out.println(json);
                    Conversion conversion = gson.fromJson(json, Conversion.class);
                    String resultado = conversion.conversion_result();
                    System.out.println("El valor "+valor+"["+moneda1+"] corresponde al valor final de =>>> "+resultado+"["+moneda2+"]");
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (opcion == 4 ) {
                System.out.println("Ingrese el valor que desea convertir: ");
                valor = scanner2.nextDouble();
                moneda1 = "USD";
                moneda2 = "COP";
                String direccion = "https://v6.exchangerate-api.com/v6/da1d0519d56327f4fe61ee50/pair/"+moneda1+"/"+moneda2+"/"+valor;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                try {
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    // System.out.println(json);
                    Conversion conversion = gson.fromJson(json, Conversion.class);
                    String resultado = conversion.conversion_result();
                    System.out.println("El valor "+valor+"["+moneda1+"] corresponde al valor final de =>>> "+resultado+"["+moneda2+"]");
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            if (opcion == 5 ) {
                System.out.println("Ingrese el valor que desea convertir: ");
                valor = scanner.nextDouble();
                moneda1 = "USD";
                moneda2 = "COP";
                String direccion = "https://v6.exchangerate-api.com/v6/da1d0519d56327f4fe61ee50/pair/"+moneda1+"/"+moneda2+"/"+valor;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                try {
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    // System.out.println(json);
                    Conversion conversion = gson.fromJson(json, Conversion.class);
                    String resultado = conversion.conversion_result();
                    System.out.println("El valor "+valor+"["+moneda1+"] corresponde al valor final de =>>> "+resultado+"["+moneda2+"]");
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (opcion == 6 ) {
                System.out.println("Ingrese el valor que desea convertir: ");
                valor = scanner.nextDouble();
                moneda1 = "COP";
                moneda2 = "USD";
                String direccion = "https://v6.exchangerate-api.com/v6/da1d0519d56327f4fe61ee50/pair/"+moneda1+"/"+moneda2+"/"+valor;
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                try {
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();
                    // System.out.println(json);
                    Conversion conversion = gson.fromJson(json, Conversion.class);
                    String resultado = conversion.conversion_result();
                    System.out.println("El valor "+valor+"["+moneda1+"] corresponde al valor final de =>>> "+resultado+"["+moneda2+"]");
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (opcion == 7) {
                System.out.println("Gracias por usar el conversor!");
                break;
            }




        }

    }
}
/**
 * // Setting URL
 * String url_str = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";
 *
 * // Making Request
 * URL url = new URL(url_str);
 * HttpURLConnection request = (HttpURLConnection) url.openConnection();
 * request.connect();
 *
 * // Convert to JSON
 * JsonParser jp = new JsonParser();
 * JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
 * JsonObject jsonobj = root.getAsJsonObject();
 *
 * // Accessing object
 * String req_result = jsonobj.get("result").getAsString();
 *
 *
 *
 *
 *
 *
 * "base_code": "EUR",
 * 	"target_code": "GBP",
 * 	"conversion_rate": 0.8412,
 * 	"conversion_result": 5.8884
 */