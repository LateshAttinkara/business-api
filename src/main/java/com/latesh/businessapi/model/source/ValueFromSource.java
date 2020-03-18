package com.latesh.businessapi.model.source;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class ValueFromSource {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("quote")
    private String quote;
}
