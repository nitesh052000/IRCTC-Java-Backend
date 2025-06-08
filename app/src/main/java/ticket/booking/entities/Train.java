package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.sql.Time;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

public class Train {

    @JsonProperty("train_id")
    private String trainId;
    @JsonProperty("train_no")
    private String trainNo;

    private List<List<Integer>> seats;
    @JsonProperty("station_times")
    private Map<String, String> stationTimes;

    private List<String> stations;

    public Train(){}

    public Train(String trainId,String trainNo,List<List<Integer>>seats , Map<String,String>stationTimes,List<String>stations){
         this.trainId = trainId;
         this.trainNo = trainNo;
         this.seats = seats;
         this.stationTimes = stationTimes;
         this.stations = stations;
    }

    public List<String> getStations(){
        return stations;
    }

    public Map<String,String> getStationTimes(){
        return stationTimes;
    }

    public List<List<Integer>> getSeats(){
        return seats;
    }

    public String getTrainId(){
        return trainId;
    }

    public String getTrainNo(){
        return trainNo;
    }

    public void setSeats(List<List<Integer>> seats){
        this.seats = seats;
    }

    public void setTrainId(String trainId){
        this.trainId = trainId;
    }
    public  void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }
    public void setStationTimes(Map<String,String>stationTimes){
        this.stationTimes = stationTimes;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
}
