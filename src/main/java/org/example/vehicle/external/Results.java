package org.example.vehicle.external;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Results {
    String name;
    String model;
    String manufacturer;
//    String cost_in_credits;
//    String length;
//    String max_atmosphering_speed;
//    String crew;
//    String passengers;
//    String cargo_capacity;
//    String consumables;
//    String hyperdrive_rating;
//
//    String mglt;
//    String starship_class;
//    List<String> pilots;
//    List<String> films;
//    String created;
//    String edited;
//    String url;
}
