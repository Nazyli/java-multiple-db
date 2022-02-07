package com.nazyli.multipledb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MasterStudentsDto {
    private Integer id;
    private String name;
    private String nim;
    private String prodi;
    private String address;
}
