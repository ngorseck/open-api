package com.sopra.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ClientDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-04T02:13:04.009845800+01:00[Europe/Madrid]")
public class ClientDTO {

  private String identifiant;

  private String firstName;

  private String lastName;

  public ClientDTO identifiant(String identifiant) {
    this.identifiant = identifiant;
    return this;
  }

  /**
   * Fonctionnel id of the customer
   * @return identifiant
  */
  
  @Schema(name = "identifiant", description = "Fonctionnel id of the customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identifiant")
  public String getIdentifiant() {
    return identifiant;
  }

  public void setIdentifiant(String identifiant) {
    this.identifiant = identifiant;
  }

  public ClientDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First Name
   * @return firstName
  */
  
  @Schema(name = "firstName", description = "First Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClientDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last Name
   * @return lastName
  */
  
  @Schema(name = "lastName", description = "Last Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDTO clientDTO = (ClientDTO) o;
    return Objects.equals(this.identifiant, clientDTO.identifiant) &&
        Objects.equals(this.firstName, clientDTO.firstName) &&
        Objects.equals(this.lastName, clientDTO.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiant, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDTO {\n");
    sb.append("    identifiant: ").append(toIndentedString(identifiant)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

