package com.latesh.businessapi.model.destination;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.googlecode.jmapper.annotations.JMap;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Value {

    @JsonProperty("quote_id")
    private Integer id;

    @JsonProperty("quote_description")
    private String quote;

    @JsonGetter("quote_id")
    public Integer getId() {
        return id;
    }

    @JsonSetter("quote_id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("quote_description")
    public String getQuote() {
        return quote;
    }

    @JsonSetter("quote_description")
    public void setQuote(String quote) {
        this.quote = quote;
    }
}
