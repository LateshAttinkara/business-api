package com.latesh.businessapi.model.source;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteFromSource {

    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private ValueFromSource value;

    @JsonGetter("type")
    public String getType() {
        return type;
    }

    @JsonGetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("value")
    public ValueFromSource getValue() {
        return value;
    }

    @JsonSetter("value")
    public void setValue(ValueFromSource value) {
        this.value = value;
    }
}
