package com.restjava.restjava.request;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="zip_info")
@Data
public class CheckZipReq{
    private String postcode;
    private String country;
    private String countryabbreviation;

//    @Type(type = "json")
//    @Column(columnDefinition = "jsonb")
    private String places;

    @Id
    @GeneratedValue
    private Long id;
}