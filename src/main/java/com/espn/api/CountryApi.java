
package com.espn.api;

import com.espn.dto.Country;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-09T11:57:08.317158100+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "country", description = "Everything about the country")
public interface CountryApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /country/addCountry : Add a new country to the store
     * Add a new country to the store
     *
     * @param country Create a new Country in the store (required)
     * @return Successful operation (status code 200)
     * or Invalid input (status code 400)
     * or Validation exception (status code 422)
     */
    @Operation(
        operationId = "addCountry",
        summary = "Add a new country to the store",
        description = "Add a new country to the store",
        tags = { "country" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Country.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Country.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "422", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/country/addCountry",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default Country addCountry(
        @Parameter(name = "Country", description = "Create a new Country in the store", required = true) @Valid @RequestBody Country country
    ) {
        return null;

    }


    /**
     * DELETE /country/{countryId} : Deletes a Country
     * delete a Country
     *
     * @param countryId country id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid Player value (status code 400)
     */
    @Operation(
        operationId = "deleteCountry",
        summary = "Deletes a Country",
        description = "delete a Country",
        tags = { "country" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid Player value")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/country/{countryId}"
    )
    default ResponseEntity<Void> deleteCountry(
        @Parameter(name = "countryId", description = "country id to delete", required = true, in = ParameterIn.PATH) @PathVariable("countryId") Long countryId,
        @Parameter(name = "api_key", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /country/{countryId} : Find Player by ID
     * Returns a single Player
     *
     * @param countryId ID of Country to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Country not found (status code 404)
     */
    @Operation(
        operationId = "getCountryById",
        summary = "Find Player by ID",
        description = "Returns a single Player",
        tags = { "country" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Country.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Country.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Country not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/country/{countryId}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Country> getCountryById(
        @Parameter(name = "countryId", description = "ID of Country to return", required = true, in = ParameterIn.PATH) @PathVariable("countryId") Long countryId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /country/updateCountry : Update an existing country
     * Update an existing country by Id
     *
     * @param country Update an existent country in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Country not found (status code 404)
     *         or Validation exception (status code 422)
     */
    @Operation(
        operationId = "updateCountry",
        summary = "Update an existing country",
        description = "Update an existing country by Id",
        tags = { "country" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Country.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Country.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Country not found"),
            @ApiResponse(responseCode = "422", description = "Validation exception")
        },
        security = {
            @SecurityRequirement(name = "Playerstore_auth", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/country/updateCountry",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Country> updateCountry(
        @Parameter(name = "Country", description = "Update an existent country in the store", required = true) @Valid @RequestBody Country country
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
