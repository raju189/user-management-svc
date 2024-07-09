package com.espn.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Player
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-09T12:33:31.854978200+05:30[Asia/Calcutta]")
public class Player implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private String fullName;

  /**
   * Player status in the store
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Country country;

  /**
   * Default constructor
   * @deprecated Use {@link Player#Player(String)}
   */
  @Deprecated
  public Player() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Player(String fullName) {
    this.fullName = fullName;
  }

  public Player id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Player fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  @NotNull 
  @Schema(name = "fullName", example = "doggie")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Player status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Player status in the store
   * @return status
  */
  
  @Schema(name = "status", description = "Player status in the store")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Player country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @Valid 
  @Schema(name = "country")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return Objects.equals(this.id, player.id) &&
        Objects.equals(this.fullName, player.fullName) &&
        Objects.equals(this.status, player.status) &&
        Objects.equals(this.country, player.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, status, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Player {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

