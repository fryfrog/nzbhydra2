
package org.nzbhydra.mapping.newznab.json.caps;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "available"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CapsJsonIdAttributes {

    @JsonProperty("available")
    private String available;

    @JsonProperty("@supported-params")
    private String supportedParams;

}
