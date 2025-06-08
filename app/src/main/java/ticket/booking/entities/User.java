package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)

public class User {

     private String name;
     private String password;

     private String hashPassword;

     private List<Ticket> ticketBooked;

     private String userId;


     public User(String name,String password,String hashPassword,List<Ticket>ticketBooked,String userId){
          this.name = name;
          this.password=password;
          this.hashPassword=hashPassword;
          this.ticketBooked = ticketBooked;
          this.userId = userId;
     }

     public User(){}

     public String getName(){
          return this.name;
     }

     public String getPassword(){
          return this.password;
     }

     public String getHashedPassword() {
          return hashPassword;
     }

     public List<Ticket> getTicketsBooked() {
          return ticketBooked;
     }

     public void printTickets(){
          for(int i=0;i< ticketBooked.size();i++){
               System.out.println(ticketBooked.get(i).getTicketInfo());
          }
     }

     public String getUserId() {
          return userId;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setHashPassword(String hashPassword) {
          this.hashPassword = hashPassword;
     }

     public void setTicketBooked(List<Ticket>ticketBooked){
          this.ticketBooked = ticketBooked;
     }

     public void setUserId(String userId){
          this.userId  = userId;
     }
}
