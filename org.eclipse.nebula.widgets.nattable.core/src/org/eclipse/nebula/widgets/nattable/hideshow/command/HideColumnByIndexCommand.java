/*******************************************************************************
 * Copyright (c) 2020 Original authors and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.hideshow.command;

import org.eclipse.nebula.widgets.nattable.command.AbstractContextFreeCommand;

/**
 * Hide a column by index instead of position. Intended to be used to
 * programmatically hide columns in complex compositions.
 *
 * @since 2.0
 */
public class HideColumnByIndexCommand extends AbstractContextFreeCommand {

    private int[] columnIndexes;

    /**
     *
     * @param columnIndexes
     *            The column indexes that should be hidden.
     */
    public HideColumnByIndexCommand(int... columnIndexes) {
        this.columnIndexes = columnIndexes;
    }

    /**
     * Clone constructor.
     *
     * @param command
     *            The command to clone.
     */
    protected HideColumnByIndexCommand(HideColumnByIndexCommand command) {
        this.columnIndexes = command.columnIndexes;
    }

    @Override
    public HideColumnByIndexCommand cloneCommand() {
        return new HideColumnByIndexCommand(this);
    }

    /**
     *
     * @return The column indexes that should be hidden.
     */
    public int[] getColumnIndexes() {
        return this.columnIndexes;
    }
}