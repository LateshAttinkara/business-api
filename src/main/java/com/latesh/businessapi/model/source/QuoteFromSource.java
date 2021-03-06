package com.latesh.businessapi.model.destination;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@lombok.Value
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @JsonProperty("quote_type")
    private String type;

    @JsonProperty("quote_value")
    private Value value;

    @JsonGetter("quote_type")
    public String getType() {
        return type;
    }

    @JsonSetter("quote_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("quote_value")
    public Value getValue() {
        return value;
    }

    @JsonSetter("quote_value")
    public void setValue(Value value) {
        this.value = value;
    }
}