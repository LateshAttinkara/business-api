package com.latesh.businessapi;

import com.latesh.businessapi.model.destination.Quote;
import com.latesh.businessapi.model.destination.Value;
import com.latesh.businessapi.model.source.QuoteFromSource;
import com.latesh.businessapi.model.source.ValueFromSource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface SourceDestinationMapper {

    @Mappings({
            @Mapping(target = "quote_type", source= "quoteFromSource.type")
    })
    Quote sourceToDestination(QuoteFromSource quoteFromSource);

    @Mappings({
            @Mapping(target = "type", source = "quote.quote_type")
    })
    QuoteFromSource destinationToSource(Quote quote);

    Value sourceValueToDestinationValue(ValueFromSource valueFromSource);

    ValueFromSource sourceValueToDestinationValue(Value value);
}
