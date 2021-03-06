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
import com.wheelsize.api.client.model.BoltPattern;
import com.wheelsize.api.client.model.MakeWithModels;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BoltPatternsApi
 */
@Ignore
public class BoltPatternsApiTest {

    private final BoltPatternsApi api = new BoltPatternsApi();

    
    /**
     * Get list of bolt patterns
     *
     * A list of possible bolt patterns with the number of matching model modifications
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boltPatternsListTest() throws ApiException {
        BigDecimal stud = new BigDecimal(5);
        BigDecimal studMin = null;
        BigDecimal studMax = null;
        BigDecimal pcd = null;
        BigDecimal pcdMin = null;
        BigDecimal pcdMax = null;
        String brands = null;
        String brandsExclude = null;
        String countries = null;
        String countriesExclude = null;
        List<BoltPattern> response = api.boltPatternsList(null, studMin, studMax, pcd, pcdMin, pcdMax, brands, brandsExclude, countries, countriesExclude);
        List<BoltPattern> response2 = api.boltPatternsList(stud, studMin, studMax, pcd, pcdMin, pcdMax, brands, brandsExclude, countries, countriesExclude);

        // TODO: test validations
        assertTrue("Response list should not be empty", response.size() > 0);
        assertTrue("Filtered response list should not be empty", response2.size() > 0);
        assertTrue(response2.size() < response.size());
    }
    
    /**
     * Model modifications by bolt pattern
     *
     * Get a list of model modifications matching to the given bolt pattern
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boltPatternsReadTest() throws ApiException {
        String boltPattern = "5x105";
        BigDecimal rimDiameter = null;
        BigDecimal rimWidth = null;
        BigDecimal offset = null;
        BigDecimal offsetMin = null;
        BigDecimal offsetMax = null;
        BigDecimal cb = null;
        BigDecimal cbMin = null;
        BigDecimal cbMax = null;
        String lang = null;
        String brands = null;
        String brandsExclude = null;
        String countries = null;
        String countriesExclude = null;
        List<MakeWithModels> response = api.boltPatternsRead(
            boltPattern, rimDiameter, rimWidth, 
            offset, offsetMin, offsetMax, cb, cbMin, cbMax, 
            lang, brands, brandsExclude, countries, countriesExclude);
        List<MakeWithModels> response2 = api.boltPatternsRead(
            boltPattern, rimDiameter, rimWidth, 
            offset, offsetMin, offsetMax, cb, cbMin, cbMax, 
            lang, "chevrolet", brandsExclude, countries, countriesExclude);

        // TODO: test validations
        assertTrue("Response list should not be empty", response.size() > 0);
        assertTrue("Filtered response list should not be empty", response2.size() > 0);
        assertTrue(response2.size() < response.size());
    }
    
}
