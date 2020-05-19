/*
 * Account Management
 * This is Swagger UI environment generated for the TMF Account Management specification
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BillingAccount;
import io.swagger.client.model.BillingAccountCreate;
import io.swagger.client.model.BillingAccountUpdate;
import io.swagger.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingAccountApi
 */
@Ignore
public class BillingAccountApiTest {

    private final BillingAccountApi api = new BillingAccountApi();

    
    /**
     * Creates a BillingAccount
     *
     * This operation creates a BillingAccount entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBillingAccountTest() throws ApiException {
        BillingAccountCreate billingAccount = null;
        BillingAccount response = api.createBillingAccount(billingAccount);

        // TODO: test validations
    }
    
    /**
     * Deletes a BillingAccount
     *
     * This operation deletes a BillingAccount entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBillingAccountTest() throws ApiException {
        String id = null;
        api.deleteBillingAccount(id);

        // TODO: test validations
    }
    
    /**
     * List or find BillingAccount objects
     *
     * This operation list or find BillingAccount entities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBillingAccountTest() throws ApiException {
        String fields = null;
        Integer offset = null;
        Integer limit = null;
        List<BillingAccount> response = api.listBillingAccount(fields, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Updates partially a BillingAccount
     *
     * This operation updates partially a BillingAccount entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchBillingAccountTest() throws ApiException {
        String id = null;
        BillingAccountUpdate billingAccount = null;
        BillingAccount response = api.patchBillingAccount(id, billingAccount);

        // TODO: test validations
    }
    
    /**
     * Retrieves a BillingAccount by ID
     *
     * This operation retrieves a BillingAccount entity. Attribute selection is enabled for all first level attributes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveBillingAccountTest() throws ApiException {
        String id = null;
        String fields = null;
        BillingAccount response = api.retrieveBillingAccount(id, fields);

        // TODO: test validations
    }
    
}
