/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.elk.graph.text.conversion

import org.eclipse.elk.core.data.LayoutMetaDataService
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractValueConverter
import org.eclipse.xtext.nodemodel.INode

class PropertyKeyValueConverter extends AbstractValueConverter<IProperty<?>> {
    
    override toString(IProperty<?> value) throws ValueConverterException {
        if (value === null)
            throw new ValueConverterException("IProperty value may not be null.", null, null)
        return value.id
    }
    
    override toValue(String string, INode node) throws ValueConverterException {
        if (string.nullOrEmpty)
            throw new ValueConverterException("Cannot convert empty string to a property idenfifier.", node, null)
        val optionData = LayoutMetaDataService.instance.getOptionDataBySuffix(string)
        if (optionData === null)
            throw new ValueConverterException("No layout option with identifier '" + string + "' can be found.", node, null)
        return optionData
    }
    
}