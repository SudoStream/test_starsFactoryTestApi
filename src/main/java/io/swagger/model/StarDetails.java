package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StarDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-16T16:50:29.819Z")

public class StarDetails   {
  @JsonProperty("starName")
  private String starName = null;

  public StarDetails starName(String starName) {
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
    StarDetails starDetails = (StarDetails) o;
    return Objects.equals(this.starName, starDetails.starName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDetails {\n");
    
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

