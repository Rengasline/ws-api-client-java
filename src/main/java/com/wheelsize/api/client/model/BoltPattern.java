/*
 * Wheel Fitment API
 * The Wheel Fitment API allows for programmatic access to the database of www.wheel-size.com and its services. Use this API to retrieve information about vehicle fitment database for rims and tires, including OE and option fitments, and plus/minus sizing fitment information. A variety of country and language specific options are available. The coverage of fitment data for vehicles manufactured since 2000 is nearly 100%.  The information about fitment data is updated on a daily basis.
 *
 * OpenAPI spec version: v1
 * Contact: info@wheel-size.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wheelsize.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * BoltPattern
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-17T19:57:08.897+06:00")
public class BoltPattern {
  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("stud")
  private Integer stud = null;

  @SerializedName("pcd")
  private BigDecimal pcd = null;

  @SerializedName("count")
  private Integer count = null;

  public BoltPattern pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Formatted bolt pattern (e.g. &#x60;5x105&#x60;)
   * @return pattern
  **/
  @ApiModelProperty(value = "Formatted bolt pattern (e.g. `5x105`)")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public BoltPattern stud(Integer stud) {
    this.stud = stud;
    return this;
  }

   /**
   * Stud holes number (e.g. &#x60;5&#x60;)
   * @return stud
  **/
  @ApiModelProperty(required = true, value = "Stud holes number (e.g. `5`)")
  public Integer getStud() {
    return stud;
  }

  public void setStud(Integer stud) {
    this.stud = stud;
  }

  public BoltPattern pcd(BigDecimal pcd) {
    this.pcd = pcd;
    return this;
  }

   /**
   * Pitch circle diameter, mm (e.g. &#x60;105&#x60;)
   * @return pcd
  **/
  @ApiModelProperty(required = true, value = "Pitch circle diameter, mm (e.g. `105`)")
  public BigDecimal getPcd() {
    return pcd;
  }

  public void setPcd(BigDecimal pcd) {
    this.pcd = pcd;
  }

  public BoltPattern count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of vehicles matching bolt pattern
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Number of vehicles matching bolt pattern")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoltPattern boltPattern = (BoltPattern) o;
    return Objects.equals(this.pattern, boltPattern.pattern) &&
        Objects.equals(this.stud, boltPattern.stud) &&
        Objects.equals(this.pcd, boltPattern.pcd) &&
        Objects.equals(this.count, boltPattern.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, stud, pcd, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoltPattern {\n");
    
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    stud: ").append(toIndentedString(stud)).append("\n");
    sb.append("    pcd: ").append(toIndentedString(pcd)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
