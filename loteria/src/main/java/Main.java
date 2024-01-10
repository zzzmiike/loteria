import com.google.gson.Gson;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        try{
//            URL url = new URL("https://loteriascaixa-api.herokuapp.com/api/megasena/latest");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");

            InputStream input = new URL("https://loteriascaixa-api.herokuapp.com/api/megasena/latest").openStream();
            Reader reader = new InputStreamReader(input, "UTF-8");
            Scanner s = new Scanner(reader);
            String json = s.nextLine();

            System.out.println(json);

//            Exception in thread "main" java.lang.IllegalStateException: Not a JSON Array: {"loteria":"megasena","concurso":2673,"data":"09/01/2024","local":"ESPAÇO DA SORTE em SÃO PAULO, SP","dezenasOrdemSorteio":["35","45","52","04","27","56"],"dezenas":["04","27","35","45","52","56"],"trevos":[],"timeCoracao":"","mesSorte":"","premiacoes":[{"descricao":"6 acertos","faixa":1,"ganhadores":0,"valorPremio":0.0},{"descricao":"5 acertos","faixa":2,"ganhadores":19,"valorPremio":67909.4},{"descricao":"4 acertos","faixa":3,"ganhadores":1547,"valorPremio":1191.5}],"estadosPremiados":[],"observacao":"","acumulou":true,"proximoConcurso":2674,"dataProximoConcurso":"11/01/2024","localGanhadores":[],"valorArrecadado":2.2379105E7,"valorAcumuladoConcurso_0_5":5567235.62,"valorAcumuladoConcursoEspecial":1265280.85,"valorAcumuladoProximoConcurso":2376828.79,"valorEstimadoProximoConcurso":5500000.0}
//            at com.google.gson.JsonElement.getAsJsonArray(JsonElement.java:117)
//            at Main.main(Main.java:28)

            JsonParser parser =  new JsonParser();
            JsonObject jsobj = parser.parse(json).getAsJsonObject();
            JsonArray posts = jsobj.getAsJsonObject().getAsJsonArray();
            for (JsonElement post : posts) {
                String title = post.getAsJsonObject().getAsJsonObject("").get("").getAsString();
                System.out.println(title);
            }

//
//            int responseCode = connection.getResponseCode();
//            if (responseCode == HttpURLConnection.HTTP_OK){
//                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                String inputLine;
//                StringBuilder content = new StringBuilder();
//
//                while ((inputLine = in.readLine()) != null){
//                    content.append(inputLine);
//                }
//                in.close();
//
//                ArrayList<String> jsonData = new ArrayList<String>();
//                jsonData.add(String.valueOf(content));
//                System.out.println("Dados da Mega-Sena: " + jsonData.get(0));
//            } else {
//                System.out.println("Falha na requisicao: " + responseCode);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}