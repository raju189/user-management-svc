/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.espn.api;

import com.espn.dto.Player;
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
@Tag(name = "player", description = "Everything about the Players")
public interface PlayerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /player/updatePlayer : Update an existing player
     * Update an existing player by Id
     *
     * @param player Update an existent Player in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Player not found (status code 404)
     *         or Validation exception (status code 422)
     */
    @Operation(
        operationId = "add",
        summary = "Update an existing player",
        description = "Update an existing player by Id",
        tags = { "player" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Player.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Player not found"),
            @ApiResponse(responseCode = "422", description = "Validation exception")
        },
        security = {
            @SecurityRequirement(name = "Playerstore_auth", scopes={ "write:Players", "read:Players" })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/player/updatePlayer",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Player> add(
        @Parameter(name = "Player", description = "Update an existent Player in the store", required = true) @Valid @RequestBody Player player
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /player/addPlayer : Add a new Player to the store
     * Add a new Player to the store
     *
     * @param player Create a new Player in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Validation exception (status code 422)
     */
    @Operation(
        operationId = "addPlayer",
        summary = "Add a new Player to the store",
        description = "Add a new Player to the store",
        tags = { "player" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Player.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "422", description = "Validation exception")
        },
        security = {
            @SecurityRequirement(name = "Playerstore_auth", scopes={ "write:Players", "read:Players" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/player/addPlayer",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Player> addPlayer(
        @Parameter(name = "Player", description = "Create a new Player in the store", required = true) @Valid @RequestBody Player player
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /player/{playerId} : Deletes a Player
     * delete a Player
     *
     * @param playerId Player id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid Player value (status code 400)
     */
    @Operation(
        operationId = "deletePlayer",
        summary = "Deletes a Player",
        description = "delete a Player",
        tags = { "player" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid Player value")
        },
        security = {
            @SecurityRequirement(name = "Playerstore_auth", scopes={ "write:Players", "read:Players" })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/player/{playerId}"
    )
    default ResponseEntity<Void> deletePlayer(
        @Parameter(name = "playerId", description = "Player id to delete", required = true, in = ParameterIn.PATH) @PathVariable("playerId") Long playerId,
        @Parameter(name = "api_key", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /player/{playerId} : Find Player by ID
     * Returns a single Player
     *
     * @param playerId ID of Player to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Player not found (status code 404)
     */
    @Operation(
        operationId = "getPlayerById",
        summary = "Find Player by ID",
        description = "Returns a single Player",
        tags = { "player" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Player.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Player not found")
        },
        security = {
            @SecurityRequirement(name = "Playerstore_auth", scopes={ "write:Players", "read:Players" }),
            @SecurityRequirement(name = "api_key")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/player/{playerId}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Player> getPlayerById(
        @Parameter(name = "playerId", description = "ID of Player to return", required = true, in = ParameterIn.PATH) @PathVariable("playerId") Long playerId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
