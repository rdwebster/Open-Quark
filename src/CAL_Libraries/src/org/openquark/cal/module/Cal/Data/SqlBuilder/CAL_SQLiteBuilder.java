/*
 * <!--
 *  
 * **************************************************************
 * This Java source has been automatically generated.
 * MODIFICATIONS TO THIS SOURCE MAY BE OVERWRITTEN - DO NOT MODIFY THIS FILE
 * **************************************************************
 *  
 *  
 * This file (CAL_SQLiteBuilder.java)
 * was generated from CAL module: Cal.Data.SqlBuilder.SQLiteBuilder.
 * The constants and methods provided are intended to facilitate accessing the
 * Cal.Data.SqlBuilder.SQLiteBuilder module from Java code.
 *  
 * Creation date: Fri Sep 21 16:02:34 PDT 2012
 * --!>
 *  
 */

package org.openquark.cal.module.Cal.Data.SqlBuilder;

import org.openquark.cal.compiler.ModuleName;
import org.openquark.cal.compiler.QualifiedName;
import org.openquark.cal.compiler.SourceModel;

/**
 * A SqlBuilder implementation for SQLite.
 */
public final class CAL_SQLiteBuilder {
	public static final ModuleName MODULE_NAME = 
		ModuleName.make("Cal.Data.SqlBuilder.SQLiteBuilder");

	/**
	 * This inner class (Functions) contains constants
	 * and methods related to binding to CAL functions in the Cal.Data.SqlBuilder.SQLiteBuilder module.
	 */
	public static final class Functions {
		/**
		 * A SqlBuilder implementation for SQLite.
		 * <p>
		 * The SQL builder for SQLite differs from the default SQL builder in that:
		 * 1. Identifiers are quoted using double-quotes.
		 * 2. DateTime literals are of the form datetime('1999-12-31 23:59:59.000').
		 * 3. 1 and 0 are used for Boolean literals.
		 * 4. SQLite uses || for the concatenation operator and % for the modulus operator.
		 * 5. There are a number of functions not suuported by SQLite.
		 * 6. Different function names are used for a variety of functions (random, lower, upper, substr).
		 * 7. Type conversion is done using:  CAST (&lt;expr&gt; AS &lt;typename&gt;) in SQLite.
		 * 8. Date part extraction is done using the strftime function in SQLite.
		 * 9. Data type names are customized, though SQLite doesn't enforce column data types for the most part.
		 * 
		 * @return (CAL type: <code>Cal.Data.Sql.SqlBuilder</code>) 
		 */
		public static final SourceModel.Expr sqliteBuilder() {
			return SourceModel.Expr.Var.make(Functions.sqliteBuilder);
		}

		/**
		 * Name binding for function: sqliteBuilder.
		 * @see #sqliteBuilder()
		 */
		public static final QualifiedName sqliteBuilder = 
			QualifiedName.make(CAL_SQLiteBuilder.MODULE_NAME, "sqliteBuilder");

		/**
		 * The SqlBuilder functions for SQLite.
		 * @return (CAL type: <code>{addParens :: Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document, booleanToSql :: Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildAlterTableAddIndexStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.TableReference -> Cal.Core.Prelude.Boolean -> Cal.Core.Prelude.Maybe Cal.Core.Prelude.String -> [Cal.Core.Prelude.String] -> Cal.Utilities.PrettyPrinter.Document, buildCommitStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Utilities.PrettyPrinter.Document, buildCompoundStatement :: [Cal.Utilities.PrettyPrinter.Document] -> Cal.Utilities.PrettyPrinter.Document, buildCreateDatabaseStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.DatabaseReference -> Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildCreateTableStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.TableDescription -> Cal.Core.Prelude.Boolean -> Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildCreateViewStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.TableReference -> Cal.Data.Sql.Query -> Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildDeleteRowsStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> Cal.Data.DatabaseMetadata.TableReference -> Cal.Data.Sql.TypedExpr Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildDropDatabaseStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.DatabaseReference -> Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildDropTableStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.TableReference -> Cal.Core.Prelude.Boolean -> Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildDropViewStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.TableReference -> Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildFieldDescription :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.FieldDescription -> Cal.Utilities.PrettyPrinter.Document, buildFieldType :: Cal.Data.SqlType.SqlType -> Cal.Utilities.PrettyPrinter.Document, buildFromClause :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> [Cal.Data.Sql.JoinNode] -> Cal.Utilities.PrettyPrinter.Document, buildGroupByClause :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> [Cal.Data.Sql.Expr] -> [(Cal.Data.Sql.Expr, Cal.Core.Prelude.String)] -> Cal.Utilities.PrettyPrinter.Document, buildHavingClause :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> Cal.Core.Prelude.Maybe Cal.Data.Sql.Expr -> Cal.Utilities.PrettyPrinter.Document, buildInsertQueryValuesStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.TableReference -> Cal.Core.Prelude.Maybe [Cal.Core.Prelude.String] -> Cal.Data.Sql.Query -> Cal.Utilities.PrettyPrinter.Document, buildInsertValuesStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.DatabaseMetadata.TableReference -> Cal.Core.Prelude.Maybe [Cal.Core.Prelude.String] -> [[Cal.Data.Sql.Expr]] -> Cal.Utilities.PrettyPrinter.Document, buildOrderByClause :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> [(Cal.Data.Sql.Expr, Cal.Core.Prelude.Boolean)] -> [(Cal.Data.Sql.Expr, Cal.Core.Prelude.String)] -> Cal.Utilities.PrettyPrinter.Document, buildSelectClause :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> [Cal.Data.Sql.QueryOption] -> [(Cal.Data.Sql.Expr, Cal.Core.Prelude.String)] -> Cal.Utilities.PrettyPrinter.Document, buildTableAndAliasText :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> Cal.Data.Sql.QueryTable -> Cal.Utilities.PrettyPrinter.Document, buildUpdateValuesStatement :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> Cal.Data.DatabaseMetadata.TableReference -> [Cal.Core.Prelude.String] -> [Cal.Data.Sql.Expr] -> Cal.Data.Sql.TypedExpr Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, buildWhereClause :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> Cal.Core.Prelude.Maybe Cal.Data.Sql.Expr -> [Cal.Data.Sql.JoinNode] -> Cal.Utilities.PrettyPrinter.Document, constructQuery :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> [Cal.Data.Sql.QueryOption] -> Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document, constructUnionQuery :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> Cal.Utilities.PrettyPrinter.Document -> Cal.Utilities.PrettyPrinter.Document -> Cal.Core.Prelude.Boolean -> Cal.Utilities.PrettyPrinter.Document, doubleToSql :: Cal.Core.Prelude.Double -> Cal.Utilities.PrettyPrinter.Document, functionName :: Cal.Data.Sql.DbFunction -> Cal.Core.Prelude.String, functionToSql :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> Cal.Data.Sql.DbFunction -> [Cal.Data.Sql.Expr] -> Cal.Utilities.PrettyPrinter.Document, intToSql :: Cal.Core.Prelude.Int -> Cal.Utilities.PrettyPrinter.Document, listToSql :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.SqlBuilderState -> [Cal.Data.Sql.Expr] -> Cal.Utilities.PrettyPrinter.Document, makeSafeName :: Cal.Core.Prelude.String -> Cal.Core.Prelude.String, nullToSql :: Cal.Utilities.PrettyPrinter.Document, operatorText :: Cal.Data.Sql.DbFunction -> Cal.Core.Prelude.String, parameterToSql :: Cal.Data.Sql.SqlBuilder -> Cal.Data.Sql.Parameter -> Cal.Utilities.PrettyPrinter.Document, prepareQuery :: Cal.Data.Sql.SqlBuilderState -> Cal.Data.Sql.Query -> Cal.Data.Sql.Query, quoteIdentifier :: Cal.Core.Prelude.String -> Cal.Utilities.PrettyPrinter.Document, stringToSql :: Cal.Core.Prelude.String -> Cal.Utilities.PrettyPrinter.Document, timeIntervalToSql :: Cal.Data.Sql.TimeInterval -> Cal.Utilities.PrettyPrinter.Document, timeToSql :: Cal.Utilities.Time.Time -> Cal.Utilities.TimeZone.TimeZone -> Cal.Utilities.PrettyPrinter.Document}</code>) 
		 */
		public static final SourceModel.Expr sqliteBuilderFunctions() {
			return SourceModel.Expr.Var.make(Functions.sqliteBuilderFunctions);
		}

		/**
		 * Name binding for function: sqliteBuilderFunctions.
		 * @see #sqliteBuilderFunctions()
		 */
		public static final QualifiedName sqliteBuilderFunctions = 
			QualifiedName.make(
				CAL_SQLiteBuilder.MODULE_NAME, 
				"sqliteBuilderFunctions");

	}
	/**
	 * A hash of the concatenated JavaDoc for this class (including inner classes).
	 * This value is used when checking for changes to generated binding classes.
	 */
	public static final int javaDocHash = -95688253;

}
