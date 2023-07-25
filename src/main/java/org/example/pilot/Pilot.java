package org.example.pilot;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.vehicle.Vehicle;

@ToString
@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pilot {
    String name;
    Vehicle vehicle;
}
