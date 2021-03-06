package org.softwareag.hackthon.uberboobjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by rvignesh on 6/17/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FareEstimateBO {

    @JsonProperty("prices")
    private List<Price> prices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prices")
    public List<Price> getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "FareEstimateBO{" +
                "prices=" + prices +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
