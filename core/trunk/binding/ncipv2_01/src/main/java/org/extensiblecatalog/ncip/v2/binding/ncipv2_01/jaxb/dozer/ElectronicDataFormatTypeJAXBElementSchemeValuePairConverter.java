/**
 * Copyright (c) 2010 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php.
 */

package org.extensiblecatalog.ncip.v2.binding.ncipv2_01.jaxb.dozer;

import org.extensiblecatalog.ncip.v2.binding.jaxb.dozer.BaseJAXBElementSchemeValuePairConverter;
import org.extensiblecatalog.ncip.v2.binding.ncipv2_01.jaxb.elements.SchemeValuePair;
import org.extensiblecatalog.ncip.v2.service.ElectronicDataFormatType;

public class ElectronicDataFormatTypeJAXBElementSchemeValuePairConverter
    extends BaseJAXBElementSchemeValuePairConverter<SchemeValuePair,
            ElectronicDataFormatType> {

    public ElectronicDataFormatTypeJAXBElementSchemeValuePairConverter() {
        super(org.extensiblecatalog.ncip.v2.binding.ncipv2_01.jaxb.elements.SchemeValuePair.class,
            ElectronicDataFormatType.class);
    }

}
