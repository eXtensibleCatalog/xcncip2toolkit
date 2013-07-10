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

public class MandatedAction {

    /**
     * Date Event Occurred
     */
    protected GregorianCalendar dateEventOccurred;

    public GregorianCalendar getDateEventOccurred() {
        return dateEventOccurred;
    }

    public void setDateEventOccurred(GregorianCalendar dateEventOccurred) {
        this.dateEventOccurred = dateEventOccurred;
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
