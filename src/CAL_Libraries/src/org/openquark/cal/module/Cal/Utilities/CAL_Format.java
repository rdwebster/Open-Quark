/*
 * <!--
 *  
 * **************************************************************
 * This Java source has been automatically generated.
 * MODIFICATIONS TO THIS SOURCE MAY BE OVERWRITTEN - DO NOT MODIFY THIS FILE
 * **************************************************************
 *  
 *  
 * This file (CAL_Format.java)
 * was generated from CAL module: Cal.Utilities.Format.
 * The constants and methods provided are intended to facilitate accessing the
 * Cal.Utilities.Format module from Java code.
 *  
 * Creation date: Fri Sep 21 16:00:42 PDT 2012
 * --!>
 *  
 */

package org.openquark.cal.module.Cal.Utilities;

import org.openquark.cal.compiler.ModuleName;
import org.openquark.cal.compiler.QualifiedName;
import org.openquark.cal.compiler.SourceModel;

/**
 * Defines some useful functions for formatting collections of Strings for pleasant viewing.
 * @author Richard Webster (original Prelude function), Bo Ilic
 */
public final class CAL_Format {
	public static final ModuleName MODULE_NAME = 
		ModuleName.make("Cal.Utilities.Format");

	/**
	 * This inner class (Functions) contains constants
	 * and methods related to binding to CAL functions in the Cal.Utilities.Format module.
	 */
	public static final class Functions {
		/**
		 * Returns a string which can be used to display the specified values in columns.
		 * @param nColumns (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the number of columns.
		 * @param columnGap (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the gap between columns.
		 * @param values (CAL type: <code>[Cal.Core.Prelude.String]</code>)
		 *          the values to be formatted.
		 * @return (CAL type: <code>Cal.Core.Prelude.String</code>) 
		 *          a string representing the specified values formatted in columns.
		 */
		public static final SourceModel.Expr formatInColumns(SourceModel.Expr nColumns, SourceModel.Expr columnGap, SourceModel.Expr values) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatInColumns), nColumns, columnGap, values});
		}

		/**
		 * @see #formatInColumns(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param nColumns
		 * @param columnGap
		 * @param values
		 * @return the SourceModel.Expr representing an application of formatInColumns
		 */
		public static final SourceModel.Expr formatInColumns(int nColumns, int columnGap, SourceModel.Expr values) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatInColumns), SourceModel.Expr.makeIntValue(nColumns), SourceModel.Expr.makeIntValue(columnGap), values});
		}

		/**
		 * Name binding for function: formatInColumns.
		 * @see #formatInColumns(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName formatInColumns = 
			QualifiedName.make(CAL_Format.MODULE_NAME, "formatInColumns");

		/**
		 * Displays the contents of a list of records in a table.
		 * The record field names are used to build headings.
		 * Otherwise, this works like <code>Cal.Utilities.Format.formatTableWithLines</code>.
		 * @param maxNRows (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the maximum number of rows to be displayed in the table;  0 for unlimited
		 * @param rows (CAL type: <code>Cal.Core.Debug.Show r => [{r}]</code>)
		 *          a list records for the cells of the table;  each record forms one table row.
		 * @return (CAL type: <code>Cal.Core.Prelude.String</code>) 
		 *          a string representing the specified cells formatted in a table.
		 */
		public static final SourceModel.Expr formatRecordsAsTable(SourceModel.Expr maxNRows, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatRecordsAsTable), maxNRows, rows});
		}

		/**
		 * @see #formatRecordsAsTable(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param maxNRows
		 * @param rows
		 * @return the SourceModel.Expr representing an application of formatRecordsAsTable
		 */
		public static final SourceModel.Expr formatRecordsAsTable(int maxNRows, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatRecordsAsTable), SourceModel.Expr.makeIntValue(maxNRows), rows});
		}

		/**
		 * Name binding for function: formatRecordsAsTable.
		 * @see #formatRecordsAsTable(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName formatRecordsAsTable = 
			QualifiedName.make(CAL_Format.MODULE_NAME, "formatRecordsAsTable");

		/**
		 * Returns a string which can be used to display the specified rows of values in a nice table.
		 * It is assumed that each row has the same number of values.
		 * @param columnGap (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the gap between columns.
		 * @param rows (CAL type: <code>[[Cal.Core.Prelude.String]]</code>)
		 *          a list of the rows of cells to form the table.
		 * @return (CAL type: <code>Cal.Core.Prelude.String</code>) 
		 *          a string representing the specified cells formatted in a table.
		 */
		public static final SourceModel.Expr formatTable(SourceModel.Expr columnGap, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatTable), columnGap, rows});
		}

		/**
		 * @see #formatTable(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param columnGap
		 * @param rows
		 * @return the SourceModel.Expr representing an application of formatTable
		 */
		public static final SourceModel.Expr formatTable(int columnGap, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatTable), SourceModel.Expr.makeIntValue(columnGap), rows});
		}

		/**
		 * Name binding for function: formatTable.
		 * @see #formatTable(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName formatTable = 
			QualifiedName.make(CAL_Format.MODULE_NAME, "formatTable");

		/**
		 * Returns a string which can be used to display the specified rows of values in a nice table.
		 * The table will be generated with "lines" around the table and headings and between the columns.
		 * The headings will be displayed at the top of the table.
		 * It is assumed that the heading row and each data row has the same number of values.
		 * The table will be truncated to the specified number of data rows.
		 * If the results need to be truncated then a '...' will be included at the end of each column.
		 * If maxNRows is less than one, then the full table will be formatted.
		 * @param maxNRows (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the maximum number of rows to be displayed in the table;  0 for unlimited
		 * @param headings (CAL type: <code>[Cal.Core.Prelude.String]</code>)
		 *          the column headings for the table
		 * @param rows (CAL type: <code>[[Cal.Core.Prelude.String]]</code>)
		 *          a list of the rows of cells to form the table.
		 * @return (CAL type: <code>Cal.Core.Prelude.String</code>) 
		 *          a string representing the specified cells formatted in a table.
		 */
		public static final SourceModel.Expr formatTableWithLines(SourceModel.Expr maxNRows, SourceModel.Expr headings, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatTableWithLines), maxNRows, headings, rows});
		}

		/**
		 * @see #formatTableWithLines(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param maxNRows
		 * @param headings
		 * @param rows
		 * @return the SourceModel.Expr representing an application of formatTableWithLines
		 */
		public static final SourceModel.Expr formatTableWithLines(int maxNRows, SourceModel.Expr headings, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatTableWithLines), SourceModel.Expr.makeIntValue(maxNRows), headings, rows});
		}

		/**
		 * Name binding for function: formatTableWithLines.
		 * @see #formatTableWithLines(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName formatTableWithLines = 
			QualifiedName.make(CAL_Format.MODULE_NAME, "formatTableWithLines");

		/**
		 * Returns a string which can be used to display the specified rows of values in a nice table.
		 * It is assumed that each row has the same number of values.
		 * The table will be truncated to the specified number of rows.
		 * If the results need to be truncated then a '...' will be included at the end of each column.
		 * If maxNRows is less than one, then the full table will be formatted.
		 * Keep in mind that the number of rows includes the heading rows, if any.
		 * @param maxNRows (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the maximum number of rows to be displayed in the table
		 * @param columnGap (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the gap between columns.
		 * @param rows (CAL type: <code>[[Cal.Core.Prelude.String]]</code>)
		 *          a list of the rows of cells to form the table.
		 * @return (CAL type: <code>Cal.Core.Prelude.String</code>) 
		 *          a string representing the specified cells formatted in a table.
		 */
		public static final SourceModel.Expr formatTruncatedTable(SourceModel.Expr maxNRows, SourceModel.Expr columnGap, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatTruncatedTable), maxNRows, columnGap, rows});
		}

		/**
		 * @see #formatTruncatedTable(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param maxNRows
		 * @param columnGap
		 * @param rows
		 * @return the SourceModel.Expr representing an application of formatTruncatedTable
		 */
		public static final SourceModel.Expr formatTruncatedTable(int maxNRows, int columnGap, SourceModel.Expr rows) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.formatTruncatedTable), SourceModel.Expr.makeIntValue(maxNRows), SourceModel.Expr.makeIntValue(columnGap), rows});
		}

		/**
		 * Name binding for function: formatTruncatedTable.
		 * @see #formatTruncatedTable(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName formatTruncatedTable = 
			QualifiedName.make(CAL_Format.MODULE_NAME, "formatTruncatedTable");

	}
	/**
	 * A hash of the concatenated JavaDoc for this class (including inner classes).
	 * This value is used when checking for changes to generated binding classes.
	 */
	public static final int javaDocHash = -1165005947;

}
