/**
 * Copyright (c) 2010 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php. 
 */

package org.extensiblecatalog.ncip.v2.service;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import java.util.GregorianCalendar;
import java.util.List;
import java.math.BigDecimal;

/**
 * Carries data elements describing the CreateUserFiscalTransactionResponse.
 */
public class CreateUserFiscalTransactionResponseData implements NCIPResponseData {

    /**
     * ResponseHeader
     */
    protected org.extensiblecatalog.ncip.v2.service.ResponseHeader responseHeader;

    /**
     * Set ResponseHeader.
     */
    public void setResponseHeader(org.extensiblecatalog.ncip.v2.service.ResponseHeader responseHeader) {

        this.responseHeader = responseHeader;

    }

    /**
     * Get ResponseHeader.
     */
    public org.extensiblecatalog.ncip.v2.service.ResponseHeader getResponseHeader() {

        return responseHeader;

    }

    /**
     * Problems
     */
    protected List<org.extensiblecatalog.ncip.v2.service.Problem> problems;

    /**
     * Set Problems.
     */
    public void setProblems(List<org.extensiblecatalog.ncip.v2.service.Problem> problems) {

        this.problems = problems;

    }

    /**
     * Get Problems.
     */
    public List<org.extensiblecatalog.ncip.v2.service.Problem> getProblems() {

        return problems;

    }

    /**
     * UserId
     */
    protected org.extensiblecatalog.ncip.v2.service.UserId userId;

    /**
     * Set UserId.
     */
    public void setUserId(org.extensiblecatalog.ncip.v2.service.UserId userId) {

        this.userId = userId;

    }

    /**
     * Get UserId.
     */
    public org.extensiblecatalog.ncip.v2.service.UserId getUserId() {

        return userId;

    }

    /**
     * FiscalTransactionReferenceId
     */
    protected org.extensiblecatalog.ncip.v2.service.FiscalTransactionReferenceId fiscalTransactionReferenceId;

    /**
     * Set FiscalTransactionReferenceId.
     */
    public void setFiscalTransactionReferenceId(
        org.extensiblecatalog.ncip.v2.service.FiscalTransactionReferenceId fiscalTransactionReferenceId) {

        this.fiscalTransactionReferenceId = fiscalTransactionReferenceId;

    }

    /**
     * Get FiscalTransactionReferenceId.
     */
    public org.extensiblecatalog.ncip.v2.service.FiscalTransactionReferenceId getFiscalTransactionReferenceId() {

        return fiscalTransactionReferenceId;

    }

    /**
     * Generic toString() implementation.
     *
     * @return String
     */
    @Override
    public String toString() {

        return ReflectionToStringBuilder.reflectionToString(this);

    }

}

