package com.microsoft.azure.cassandra.coupon.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@PrimaryKeyClass

public class CouponKey implements Serializable {


    @PrimaryKeyColumn(name = "id", type = PARTITIONED)
    private UUID id;


    @PrimaryKeyColumn(name = "name", type = PARTITIONED)
    private String name;

    @PrimaryKeyColumn(name = "user")
    private String user;


}
