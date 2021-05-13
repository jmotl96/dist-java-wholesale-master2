package edu.wctc.wholesale.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class OrderDTO {
    private String customerName;
    private LocalDate date;
    private String terms;
    private String productName;
    private String poNumber;
    private LocalDate shipped;
    private double total;
}
