package enums;

import lombok.Getter;

@Getter
public enum EndPointPaths {

    ADD_LOCATION("api/settings/location/add");

    private final String path;

    EndPointPaths(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }


}


