package com.latesh.businessapi.model.source;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteFromSource {

    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private ValueFromSource value;
}
