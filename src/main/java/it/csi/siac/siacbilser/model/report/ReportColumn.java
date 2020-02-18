/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.report;

/**
 * The Interface ReportColumn.
 */
public interface ReportColumn {

	/**
	 * Gets the column name.
	 * @param params the parameters to substitute for the placeholder
	 * @return the column name
	 */
	String getColumnName(Object... params);
	
	/**
	 * Gets the field name.
	 *
	 * @return the field name
	 */
	String getFieldName();
	
	/**
	 * Gets the column type.
	 *
	 * @return the column type
	 */
	Class<?> getColumnType();
	
	/**
	 * The column-wrapper name.
	 * @return the column wrapper name
	 */
	String name();
	
}
