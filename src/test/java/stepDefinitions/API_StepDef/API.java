package stepDefinitions.API_StepDef;

import enums.Enum_Fy;


public class API  {

    public Client_API clientsApi;

    public API(Enum_Fy enum_fy) {

    }


    public Client_API getClientsApi() {
        if (clientsApi == null) {
            clientsApi = new Client_API();
        }
        return clientsApi;
    }



}






