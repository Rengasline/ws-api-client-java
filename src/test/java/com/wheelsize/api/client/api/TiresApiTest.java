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


package com.wheelsize.api.client.api;

import com.wheelsize.api.client.ApiException;
import java.math.BigDecimal;
import com.wheelsize.api.client.model.MakeWithModels;
import com.wheelsize.api.client.model.Tire;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TiresApi
 */
@Ignore
public class TiresApiTest {

    private final TiresApi api = new TiresApi();

    
    /**
     * Returns a list of tires
     *
     * Get a list of tires with a number of matching model modifications
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiresListTest() throws ApiException {
        BigDecimal width = new BigDecimal(195);
        BigDecimal widthMin = null;
        BigDecimal widthMax = null;
        BigDecimal aspectRatio = null;
        BigDecimal aspectRatioMin = null;
        BigDecimal aspectRatioMax = null;
        BigDecimal rimDiameter = null;
        BigDecimal rimDiameterMin = null;
        BigDecimal rimDiameterMax = null;
        String brands = null;
        String brandsExclude = null;
        String countries = null;
        String countriesExclude = null;
        List<Tire> response = api.tiresList(null, widthMin, widthMax, aspectRatio, aspectRatioMin, aspectRatioMax, rimDiameter, rimDiameterMin, rimDiameterMax, brands, brandsExclude, countries, countriesExclude);
        List<Tire> response2 = api.tiresList(width, widthMin, widthMax, aspectRatio, aspectRatioMin, aspectRatioMax, rimDiameter, rimDiameterMin, rimDiameterMax, brands, brandsExclude, countries, countriesExclude);

        // TODO: test validations
        assertTrue("Response list should not be empty", response.size() > 0);
        assertTrue("Filtered response list should not be empty", response2.size() > 0);
        assertTrue(response2.size() < response.size());
    }
    
    /**
     * Model modifications matching given tire
     *
     * Get a list of model modifications by tire
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiresReadTest() throws ApiException {
        String tire = "195/50R15";
        BigDecimal width = null;
        BigDecimal widthMin = null;
        BigDecimal widthMax = null;
        BigDecimal aspectRatio = null;
        BigDecimal aspectRatioMin = null;
        BigDecimal aspectRatioMax = null;
        BigDecimal rimDiameter = null;
        BigDecimal rimDiameterMin = null;
        BigDecimal rimDiameterMax = null;
        String lang = null;
        String brands = null;
        String brandsExclude = null;
        String countries = null;
        String countriesExclude = null;
        List<MakeWithModels> response = api.tiresRead(tire, width, widthMin, widthMax, aspectRatio, aspectRatioMin, aspectRatioMax, rimDiameter, rimDiameterMin, rimDiameterMax, lang, brands, brandsExclude, countries, countriesExclude);

        // TODO: test validations
        assertTrue("Response list should not be empty", response.size() > 0);
    }
    
}
