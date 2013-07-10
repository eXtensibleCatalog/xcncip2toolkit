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
 * Carries data elements describing the AddUserFields.
 */
public class AddUserFields {

    /**
     * AuthenticationInputs
     */
    protected List<org.extensiblecatalog.ncip.v2.service.AuthenticationInput> authenticationInputs;

    /**
     * Set AuthenticationInputs.
     */
    public void setAuthenticationInputs(
        List<org.extensiblecatalog.ncip.v2.service.AuthenticationInput> authenticationInputs) {

        this.authenticationInputs = authenticationInputs;

    }

    /**
     * Get AuthenticationInputs.
     */
    public List<org.extensiblecatalog.ncip.v2.service.AuthenticationInput> getAuthenticationInputs() {

        return authenticationInputs;

    }

    /**
     * NameInformation
     */
    protected org.extensiblecatalog.ncip.v2.service.NameInformation nameInformation;

    /**
     * Set NameInformation.
     */
    public void setNameInformation(org.extensiblecatalog.ncip.v2.service.NameInformation nameInformation) {

        this.nameInformation = nameInformation;

    }

    /**
     * Get NameInformation.
     */
    public org.extensiblecatalog.ncip.v2.service.NameInformation getNameInformation() {

        return nameInformation;

    }

    /**
     * UserAddressInformations
     */
    protected List<org.extensiblecatalog.ncip.v2.service.UserAddressInformation> userAddressInformations;

    /**
     * Set UserAddressInformations.
     */
    public void setUserAddressInformations(
        List<org.extensiblecatalog.ncip.v2.service.UserAddressInformation> userAddressInformations) {

        this.userAddressInformations = userAddressInformations;

    }

    /**
     * Get UserAddressInformations.
     */
    public List<org.extensiblecatalog.ncip.v2.service.UserAddressInformation> getUserAddressInformations() {

        return userAddressInformations;

    }

    /**
     * DateOfBirth
     */
    protected GregorianCalendar dateOfBirth;

    /**
     * Set DateOfBirth.
     */
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {

        this.dateOfBirth = dateOfBirth;

    }

    /**
     * Get DateOfBirth.
     */
    public GregorianCalendar getDateOfBirth() {

        return dateOfBirth;

    }

    /**
     * UserLanguages
     */
    protected List<org.extensiblecatalog.ncip.v2.service.UserLanguage> userLanguages;

    /**
     * Set UserLanguages.
     */
    public void setUserLanguages(List<org.extensiblecatalog.ncip.v2.service.UserLanguage> userLanguages) {

        this.userLanguages = userLanguages;

    }

    /**
     * Get UserLanguages.
     */
    public List<org.extensiblecatalog.ncip.v2.service.UserLanguage> getUserLanguages() {

        return userLanguages;

    }

    /**
     * UserPrivileges
     */
    protected List<org.extensiblecatalog.ncip.v2.service.UserPrivilege> userPrivileges;

    /**
     * Set UserPrivileges.
     */
    public void setUserPrivileges(List<org.extensiblecatalog.ncip.v2.service.UserPrivilege> userPrivileges) {

        this.userPrivileges = userPrivileges;

    }

    /**
     * Get UserPrivileges.
     */
    public List<org.extensiblecatalog.ncip.v2.service.UserPrivilege> getUserPrivileges() {

        return userPrivileges;

    }

    /**
     * BlockOrTraps
     */
    protected List<org.extensiblecatalog.ncip.v2.service.BlockOrTrap> blockOrTraps;

    /**
     * Set BlockOrTraps.
     */
    public void setBlockOrTraps(List<org.extensiblecatalog.ncip.v2.service.BlockOrTrap> blockOrTraps) {

        this.blockOrTraps = blockOrTraps;

    }

    /**
     * Get BlockOrTraps.
     */
    public List<org.extensiblecatalog.ncip.v2.service.BlockOrTrap> getBlockOrTraps() {

        return blockOrTraps;

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

