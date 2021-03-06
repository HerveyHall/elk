/*******************************************************************************
 * Copyright (c) 2011, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.layered.properties;

/**
 * Enumeration of layer constraint types. May be set on nodes to constrain in which layer
 * they may appear.
 *
 * @see org.eclipse.elk.alg.layered.intermediate.EdgeAndLayerConstraintEdgeReverser
 *        EdgeAndLayerConstraintEdgeReverser
 * @see org.eclipse.elk.alg.layered.intermediate.LayerConstraintProcessor
 *        LayerConstraintProcessor
 * @author msp
 * @kieler.design proposed by msp
 * @kieler.rating proposed yellow by msp
 */
public enum LayerConstraint {
    
    /** no constraint on the layering. */
    NONE,
    /** put into the first layer. */
    FIRST,
    /** put into a separate first layer; used internally. */
    FIRST_SEPARATE,
    /** put into the last layer. */
    LAST,
    /** put into a separate last layer; used internally. */
    LAST_SEPARATE;
    
}