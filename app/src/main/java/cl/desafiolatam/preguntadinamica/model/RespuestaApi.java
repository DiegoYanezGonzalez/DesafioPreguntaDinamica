package cl.desafiolatam.preguntadinamica.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RespuestaApi {

    @SerializedName("response_code")
    private int responseCode;
    private List<Result> results;
    public RespuestaApi() {
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public List<Result> getResults() {
        return results;
    }
//    private List<String>results;


}
