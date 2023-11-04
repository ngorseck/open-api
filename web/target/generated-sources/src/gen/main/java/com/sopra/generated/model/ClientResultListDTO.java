package com.sopra.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sopra.generated.model.ClientResultDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ClientResultListDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-04T02:13:04.009845800+01:00[Europe/Madrid]")
public class ClientResultListDTO {

  @Valid
  private List<@Valid ClientResultDTO> resultUserList;

  public ClientResultListDTO resultUserList(List<@Valid ClientResultDTO> resultUserList) {
    this.resultUserList = resultUserList;
    return this;
  }

  public ClientResultListDTO addResultUserListItem(ClientResultDTO resultUserListItem) {
    if (this.resultUserList == null) {
      this.resultUserList = new ArrayList<>();
    }
    this.resultUserList.add(resultUserListItem);
    return this;
  }

  /**
   * The List of the ClientResultDTO
   * @return resultUserList
  */
  @Valid 
  @Schema(name = "resultUserList", description = "The List of the ClientResultDTO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultUserList")
  public List<@Valid ClientResultDTO> getResultUserList() {
    return resultUserList;
  }

  public void setResultUserList(List<@Valid ClientResultDTO> resultUserList) {
    this.resultUserList = resultUserList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientResultListDTO clientResultListDTO = (ClientResultListDTO) o;
    return Objects.equals(this.resultUserList, clientResultListDTO.resultUserList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultUserList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResultListDTO {\n");
    sb.append("    resultUserList: ").append(toIndentedString(resultUserList)).append("\n");
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

