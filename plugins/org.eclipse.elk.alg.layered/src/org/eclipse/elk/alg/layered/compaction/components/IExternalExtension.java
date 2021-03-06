/*******************************************************************************
 * Copyright (c) 2016 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.layered.compaction.components;

import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.core.util.nodespacing.Rectangle;

/**
 * Container class for edges that represent external edges, i.e. edges that connect to ports that
 * span hierarchy boundaries.
 * 
 * @param <E>
 *            the type of the element that is being represented by this extension.
 */
public interface IExternalExtension<E> {

    /**
     * @return for instance the underlying edge this extension represents.
     */
    E getRepresentative();

    /**
     * @return the rectangle that represents the external extension.
     */
    Rectangle getRepresentor();
    
    /**
     * @return an optional placeholder along the original diagram's boundary.
     */
    default Rectangle getPlaceholder() {
        return null;
    }
    
    /**
     * @return the rectangle to which this extension (conceptually) connects.
     */
    Rectangle getParent();

    /**
     * @return the direction into which this extension points.
     */
    Direction getDirection();

}
