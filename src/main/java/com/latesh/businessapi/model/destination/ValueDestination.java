package com.latesh.businessapi.model.source;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class ValueFromSource {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("quote")
    private String quote;

    @JsonGetter("id")
    public Integer getId() {
        return id;
    }

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("quote")
    public String getQuote() {
        return quote;
    }

    @JsonSetter("quote")
    public void setQuote(String quote) {
        this.quote = quote;
    }
}
