package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-16T16:50:29.819Z")

public class InlineResponse200   {
  @JsonProperty("starId")
  private String starId = null;

  @JsonProperty("starName")
  private String starName = null;

  public InlineResponse200 starId(String starId) {
    this.starId = starId;
    return this;
  }

   /**
   * Get starId
   * @return starId
  **/
  @ApiModelProperty(value = "")
  public String getStarId() {
    return starId;
  }

  public void setStarId(String starId) {
    this.starId = starId;
  }

  public InlineResponse200 starName(String starName) {
    this.starName = starName;
    return this;
  }

   /**
   * Get starName
   * @return starName
  **/
  @ApiModelProperty(value = "")
  public String getStarName() {
    return starName;
  }

  public void setStarName(String starName) {
    this.starName = starName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.starId, inlineResponse200.starId) &&
        Objects.equals(this.starName, inlineResponse200.starName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starId, starName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
    sb.append("    starName: ").append(toIndentedString(starName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

