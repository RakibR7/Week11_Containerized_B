package atu.ie.week11_containerized_b;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
    private String name;
    private String email;
}