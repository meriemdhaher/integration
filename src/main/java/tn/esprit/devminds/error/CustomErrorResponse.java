package tn.esprit.devminds.error;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomErrorResponse {
    private Integer status;
    private String message;
}
