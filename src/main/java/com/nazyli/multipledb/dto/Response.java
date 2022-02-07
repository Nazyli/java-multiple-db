package com.nazyli.multipledb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<data> {
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    private String status;
    private data data;
    private String message;

    public Response(data results) {
        this.status = Response.SUCCESS;
        this.data = results;
    }

    public void setError(String message) {
        this.status = Response.ERROR;
        this.message = message;
    }

    public void setSuccess(data object) {
        this.status = Response.SUCCESS;
        this.data = object;
    }
}