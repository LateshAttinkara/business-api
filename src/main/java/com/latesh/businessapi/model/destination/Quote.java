package com.latesh.businessapi.model.destination;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@lombok.Value
@Builder
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @JsonProperty("quote_type")
    private String type;

    @JsonProperty("quote_value")
    private Value value;
}