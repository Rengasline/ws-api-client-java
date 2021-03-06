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
import com.wheelsize.api.client.model.TrimWithMarketAndYears;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ModelWithTrims
 */

public class ModelWithTrims {
  @SerializedName("slug")
  private String slug = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("start_year")
  private String startYear = null;

  @SerializedName("end_year")
  private String endYear = null;

  @SerializedName("vehicles")
  private List<TrimWithMarketAndYears> vehicles = null;

  public ModelWithTrims slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Model name (e.g. &#x60;Outlander&#x60;)
   * @return slug
  **/
  @ApiModelProperty(value = "Model name (e.g. `Outlander`)")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public ModelWithTrims name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Model slug name (e.g. &#x60;outlander&#x60;)
   * @return name
  **/
  @ApiModelProperty(value = "Model slug name (e.g. `outlander`)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelWithTrims startYear(String startYear) {
    this.startYear = startYear;
    return this;
  }

   /**
   * Model production start year. It should be &#39;integer&#39; but it is used as &#39;string&#39; by historical reasons.
   * @return startYear
  **/
  @ApiModelProperty(value = "Model production start year. It should be 'integer' but it is used as 'string' by historical reasons.")
  public String getStartYear() {
    return startYear;
  }

  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }

  public ModelWithTrims endYear(String endYear) {
    this.endYear = endYear;
    return this;
  }

   /**
   * Model production end year. It should be &#39;integer&#39; but it is used as &#39;string&#39; by  historical reasons.  It equals to the __*&#x60;current year + 1&#x60;*__ if it is still in production.
   * @return endYear
  **/
  @ApiModelProperty(value = "Model production end year. It should be 'integer' but it is used as 'string' by  historical reasons.  It equals to the __*`current year + 1`*__ if it is still in production.")
  public String getEndYear() {
    return endYear;
  }

  public void setEndYear(String endYear) {
    this.endYear = endYear;
  }

  public ModelWithTrims vehicles(List<TrimWithMarketAndYears> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public ModelWithTrims addVehiclesItem(TrimWithMarketAndYears vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<TrimWithMarketAndYears>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * Get vehicles
   * @return vehicles
  **/
  @ApiModelProperty(value = "")
  public List<TrimWithMarketAndYears> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TrimWithMarketAndYears> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelWithTrims modelWithTrims = (ModelWithTrims) o;
    return Objects.equals(this.slug, modelWithTrims.slug) &&
        Objects.equals(this.name, modelWithTrims.name) &&
        Objects.equals(this.startYear, modelWithTrims.startYear) &&
        Objects.equals(this.endYear, modelWithTrims.endYear) &&
        Objects.equals(this.vehicles, modelWithTrims.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slug, name, startYear, endYear, vehicles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelWithTrims {\n");
    
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    endYear: ").append(toIndentedString(endYear)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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

