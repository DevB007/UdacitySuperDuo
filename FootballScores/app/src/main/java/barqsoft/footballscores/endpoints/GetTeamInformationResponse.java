package barqsoft.footballscores.endpoints;

import com.google.gson.Gson;

public class GetTeamInformationResponse {

    public String name;
    public String code;
    public String shortName;
    public String squadMarketValue;
    public String crestUrl;

    public String toJson() {
        return new Gson().toJson(this);
    }

}
