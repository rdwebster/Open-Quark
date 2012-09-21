/*
 * <!--
 *  
 * **************************************************************
 * This Java source has been automatically generated.
 * MODIFICATIONS TO THIS SOURCE MAY BE OVERWRITTEN - DO NOT MODIFY THIS FILE
 * **************************************************************
 *  
 *  
 * This file (CAL_Map.java)
 * was generated from CAL module: Cal.Collections.Map.
 * The constants and methods provided are intended to facilitate accessing the
 * Cal.Collections.Map module from Java code.
 *  
 * Creation date: Fri Sep 21 16:17:09 PDT 2012
 * --!>
 *  
 */

package org.openquark.cal.module.Cal.Collections;

import org.openquark.cal.compiler.ModuleName;
import org.openquark.cal.compiler.QualifiedName;
import org.openquark.cal.compiler.SourceModel;

/**
 * An efficient implementation of maps from keys to values.
 * <p>
 * The implementation of Map is based on <em>size balanced</em> binary trees (or trees of <em>bounded balance</em>) as described by:
 * <ul>
 *  <li>
 *   Stephen Adams, "Efficient sets: a balancing act", Journal of Functional
 *   Programming 3(4):553-562, October 1993, <a href='http://www.swiss.ai.mit.edu/~adams/BB'>http://www.swiss.ai.mit.edu/~adams/BB</a>.
 *  </li>
 *  <li>
 *   J. Nievergelt and E.M. Reingold, "Binary search trees of bounded balance",
 *   SIAM journal of computing 2(1), March 1973.
 *   
 *  </li>
 * </ul>
 * <p>
 * This module is an adaptation of functionality from Daan Leijen's DData collections library for Haskell.
 * The library was obtained from <a href='http://www.cs.uu.nl/~daan/ddata.html'>http://www.cs.uu.nl/~daan/ddata.html</a>.
 * See the file <code>ThirdPartyComponents/ThirdPartyComponents.txt</code> for the DData license.
 * 
 * 
 * <dl><dt><b>See Also:</b>
 * <dd><b>Modules:</b> Cal.Collections.IntMap, Cal.Collections.LongMap
 * </dl>
 * 
 * @author Bo Ilic
 */
public final class CAL_Map {
	public static final ModuleName MODULE_NAME = 
		ModuleName.make("Cal.Collections.Map");

	/**
	 * This inner class (TypeConstructors) contains constants
	 * and methods related to binding to CAL TypeConstructors in the Cal.Collections.Map module.
	 */
	public static final class TypeConstructors {
		/**
		 * A map from keys (of type <code>k</code>) to values (of type <code>a</code>).
		 */
		public static final QualifiedName Map = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "Map");

	}
	/**
	 * This inner class (Functions) contains constants
	 * and methods related to binding to CAL functions in the Cal.Collections.Map module.
	 */
	public static final class Functions {
		/**
		 * Adjusts a value at a specific key. When the key is not a member of the map,
		 * the original map is returned.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>a -> a</code>)
		 *          the function used to map the old value associated with the key to the new value.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map, with the value at the specified key adjusted if present.
		 */
		public static final SourceModel.Expr adjust(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.adjust), f, key, map});
		}

		/**
		 * Name binding for function: adjust.
		 * @see #adjust(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName adjust = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "adjust");

		/**
		 * Adjusts a value at a specific key. When the key is not a member of the map,
		 * the original map is returned.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> a</code>)
		 *          the function which, when given the old key-value pair, returns the new value to be associated with the key.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map, with the value at the specified key adjusted if present.
		 */
		public static final SourceModel.Expr adjustWithKey(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.adjustWithKey), f, key, map});
		}

		/**
		 * Name binding for function: adjustWithKey.
		 * @see #adjustWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName adjustWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "adjustWithKey");

		/**
		 * Returns an association list of all key-value pairs in the map.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>[(k, a)]</code>) 
		 *          an association list of all key-value pairs in the map.
		 */
		public static final SourceModel.Expr assocs(SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.assocs), m});
		}

		/**
		 * Name binding for function: assocs.
		 * @see #assocs(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName assocs = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "assocs");

		/**
		 * Returns the map association with the lowest key greater than or equal to the specified key value, if any.
		 * @param k (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Core.Prelude.Maybe (k, a)</code>) 
		 */
		public static final SourceModel.Expr ceilingAssoc(SourceModel.Expr k, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.ceilingAssoc), k, map});
		}

		/**
		 * Name binding for function: ceilingAssoc.
		 * @see #ceilingAssoc(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName ceilingAssoc = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "ceilingAssoc");

		/**
		 * Deletes a key and its value from the map. When the key is not a member of the
		 * map, the original map is returned.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map, with the specified key and its corresponding value deleted if present.
		 */
		public static final SourceModel.Expr delete(SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.delete), key, map});
		}

		/**
		 * Name binding for function: delete.
		 * @see #delete(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName delete = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "delete");

		/**
		 * Deletes the element at index.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param index (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the index.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with the value at the specified index deleted.
		 */
		public static final SourceModel.Expr deleteAt(SourceModel.Expr index, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.deleteAt), index, map});
		}

		/**
		 * @see #deleteAt(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param index
		 * @param map
		 * @return the SourceModel.Expr representing an application of deleteAt
		 */
		public static final SourceModel.Expr deleteAt(int index, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.deleteAt), SourceModel.Expr.makeIntValue(index), map});
		}

		/**
		 * Name binding for function: deleteAt.
		 * @see #deleteAt(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName deleteAt = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "deleteAt");

		/**
		 * Helper binding method for function: deleteFindMax. 
		 * @param t
		 * @return the SourceModule.expr representing an application of deleteFindMax
		 */
		public static final SourceModel.Expr deleteFindMax(SourceModel.Expr t) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.deleteFindMax), t});
		}

		/**
		 * Name binding for function: deleteFindMax.
		 * @see #deleteFindMax(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName deleteFindMax = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "deleteFindMax");

		/**
		 * Deletes and finds the minimal element.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param t (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>((k, a), Cal.Collections.Map.Map k a)</code>) 
		 *          a pair containing the minimal element and the map with the minimal element removed.
		 */
		public static final SourceModel.Expr deleteFindMin(SourceModel.Expr t) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.deleteFindMin), t});
		}

		/**
		 * Name binding for function: deleteFindMin.
		 * @see #deleteFindMin(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName deleteFindMin = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "deleteFindMin");

		/**
		 * Deletes the maximal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with its maximal key deleted.
		 */
		public static final SourceModel.Expr deleteMax(SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.deleteMax), map});
		}

		/**
		 * Name binding for function: deleteMax.
		 * @see #deleteMax(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName deleteMax = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "deleteMax");

		/**
		 * Deletes the minimal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with its minimal key deleted.
		 */
		public static final SourceModel.Expr deleteMin(SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.deleteMin), map});
		}

		/**
		 * Name binding for function: deleteMin.
		 * @see #deleteMin(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName deleteMin = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "deleteMin");

		/**
		 * Returns the difference of two maps.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the difference of the two maps.
		 */
		public static final SourceModel.Expr difference(SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.difference), map1, map2});
		}

		/**
		 * Name binding for function: difference.
		 * @see #difference(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName difference = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "difference");

		/**
		 * Returns the difference of two maps, with a combining function.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>a -> b -> Cal.Core.Prelude.Maybe a</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the difference of the two maps.
		 */
		public static final SourceModel.Expr differenceWith(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.differenceWith), f, map1, map2});
		}

		/**
		 * Name binding for function: differenceWith.
		 * @see #differenceWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName differenceWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "differenceWith");

		/**
		 * Returns the difference of two maps, with a combining function. When two equal keys are
		 * encountered, the combining function is applied to the key and both values.
		 * If it returns <code>Cal.Core.Prelude.Nothing</code>, the element is discarded (proper set difference). If
		 * it returns <code>Cal.Core.Prelude.Just y</code>, the element is updated with a new value <code>y</code>. 
		 * The implementation uses an efficient hedge algorithm comparable with <em>hedge-union</em>.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> b -> Cal.Core.Prelude.Maybe a</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the difference of the two maps.
		 */
		public static final SourceModel.Expr differenceWithKey(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.differenceWithKey), f, map1, map2});
		}

		/**
		 * Name binding for function: differenceWithKey.
		 * @see #differenceWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName differenceWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "differenceWithKey");

		/**
		 * Retrieves an element by index. Calls <code>Cal.Core.Prelude.error</code> when an invalid index is used.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param index (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the index.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>(k, a)</code>) 
		 *          the key-value pair at the specified index.
		 */
		public static final SourceModel.Expr elemAt(SourceModel.Expr index, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.elemAt), index, map});
		}

		/**
		 * @see #elemAt(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param index
		 * @param map
		 * @return the SourceModel.Expr representing an application of elemAt
		 */
		public static final SourceModel.Expr elemAt(int index, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.elemAt), SourceModel.Expr.makeIntValue(index), map});
		}

		/**
		 * Name binding for function: elemAt.
		 * @see #elemAt(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName elemAt = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "elemAt");

		/**
		 * Returns all elements of the map.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>[a]</code>) 
		 *          a list of all elements of the map.
		 */
		public static final SourceModel.Expr elems(SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.elems), m});
		}

		/**
		 * Name binding for function: elems.
		 * @see #elems(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName elems = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "elems");

		/**
		 * The empty map.
		 * <p>
		 * Complexity: O(1)
		 * 
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          an empty map.
		 */
		public static final SourceModel.Expr empty() {
			return SourceModel.Expr.Var.make(Functions.empty);
		}

		/**
		 * Name binding for function: empty.
		 * @see #empty()
		 */
		public static final QualifiedName empty = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "empty");

		/**
		 * Filters all values that satisfy the predicate.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param predicate (CAL type: <code>a -> Cal.Core.Prelude.Boolean</code>)
		 *          the predicate for testing the values.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map containing only those key-value pairs whose values satisfy the predicate.
		 */
		public static final SourceModel.Expr filter(SourceModel.Expr predicate, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.filter), predicate, map});
		}

		/**
		 * Name binding for function: filter.
		 * @see #filter(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName filter = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "filter");

		/**
		 * Filters all keys/values that satisfy the predicate.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param p (CAL type: <code>k -> a -> Cal.Core.Prelude.Boolean</code>)
		 *          the predicate for testing the keys and values.
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map containing only those key-value pairs that satisfy the predicate.
		 */
		public static final SourceModel.Expr filterWithKey(SourceModel.Expr p, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.filterWithKey), p, m});
		}

		/**
		 * Name binding for function: filterWithKey.
		 * @see #filterWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName filterWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "filterWithKey");

		/**
		 * Finds the value of a key. Calls <code>Cal.Core.Prelude.error</code> when the element cannot be found.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.lookup, Cal.Collections.Map.lookupWithDefault
		 * </dl>
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>a</code>) 
		 *          the value of the key in the map, or a call to <code>Cal.Core.Prelude.error</code> if it cannot be found.
		 */
		public static final SourceModel.Expr find(SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.find), key, map});
		}

		/**
		 * Name binding for function: find.
		 * @see #find(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName find = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "find");

		/**
		 * Returns the index of a key. The index is a number from 0 up to, but not
		 * including, the size of the map. Calls <code>Cal.Core.Prelude.error</code> when the key is not a member of
		 * the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Int</code>) 
		 *          the index of the key, or a call to <code>Cal.Core.Prelude.error</code> if the key is not a
		 * member of the map.
		 */
		public static final SourceModel.Expr findIndex(SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.findIndex), key, map});
		}

		/**
		 * Name binding for function: findIndex.
		 * @see #findIndex(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName findIndex = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "findIndex");

		/**
		 * Finds the maximal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>(k, a)</code>) 
		 *          the key-value pair of the maximal key of the map.
		 */
		public static final SourceModel.Expr findMax(SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.findMax), map});
		}

		/**
		 * Name binding for function: findMax.
		 * @see #findMax(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName findMax = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "findMax");

		/**
		 * Finds the minimal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>(k, a)</code>) 
		 *          the key-value pair of the minimal key of the map.
		 */
		public static final SourceModel.Expr findMin(SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.findMin), map});
		}

		/**
		 * Name binding for function: findMin.
		 * @see #findMin(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName findMin = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "findMin");

		/**
		 * Returns the map association with the highest key less than or equal to the specified key value, if any.
		 * @param k (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Core.Prelude.Maybe (k, a)</code>) 
		 */
		public static final SourceModel.Expr floorAssoc(SourceModel.Expr k, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.floorAssoc), k, map});
		}

		/**
		 * Name binding for function: floorAssoc.
		 * @see #floorAssoc(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName floorAssoc = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "floorAssoc");

		/**
		 * Folds over the values in the map in an unspecified order. (= descending post-order)
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>a -> b -> b</code>)
		 *          the function to be folded over the values in the map.
		 * @param z (CAL type: <code>b</code>)
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>b</code>) 
		 *          the summary value obtained from the fold.
		 */
		public static final SourceModel.Expr fold(SourceModel.Expr f, SourceModel.Expr z, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fold), f, z, m});
		}

		/**
		 * Name binding for function: fold.
		 * @see #fold(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fold = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fold");

		/**
		 * Folds over the keys and values in the map in an unspecified order. (= descending post-order)
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>k -> a -> b -> b</code>)
		 *          the function to be folded over the keys and values in the map.
		 * @param z (CAL type: <code>b</code>)
		 * @param t (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>b</code>) 
		 *          the summary value obtained from the fold.
		 */
		public static final SourceModel.Expr foldWithKey(SourceModel.Expr f, SourceModel.Expr z, SourceModel.Expr t) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.foldWithKey), f, z, t});
		}

		/**
		 * Name binding for function: foldWithKey.
		 * @see #foldWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName foldWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "foldWithKey");

		/**
		 * Builds a map from an ascending list in linear time. The precondition (input
		 * list is ascending) is not checked.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param xs (CAL type: <code>Cal.Core.Prelude.Eq k => [(k, a)]</code>)
		 *          an ascending list of key-value pairs.
		 * @return (CAL type: <code>Cal.Core.Prelude.Eq k => Cal.Collections.Map.Map k a</code>) 
		 *          a map containing the key-value entries.
		 */
		public static final SourceModel.Expr fromAscList(SourceModel.Expr xs) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fromAscList), xs});
		}

		/**
		 * Name binding for function: fromAscList.
		 * @see #fromAscList(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fromAscList = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fromAscList");

		/**
		 * Builds a map from an ascending list in linear time with a combining function
		 * for equal keys. The precondition (input list is ascending) is not checked.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>a -> a -> a</code>)
		 *          the combining function.
		 * @param xs (CAL type: <code>Cal.Core.Prelude.Eq k => [(k, a)]</code>)
		 *          an ascending list of key-value pairs.
		 * @return (CAL type: <code>Cal.Core.Prelude.Eq k => Cal.Collections.Map.Map k a</code>) 
		 *          a map containing the key-value entries.
		 */
		public static final SourceModel.Expr fromAscListWith(SourceModel.Expr f, SourceModel.Expr xs) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fromAscListWith), f, xs});
		}

		/**
		 * Name binding for function: fromAscListWith.
		 * @see #fromAscListWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fromAscListWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fromAscListWith");

		/**
		 * Builds a map from an ascending list in linear time with a combining function
		 * for equal keys. The precondition (input list is ascending) is not checked.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Eq k => k -> a -> a -> a</code>)
		 *          the combining function.
		 * @param xs (CAL type: <code>Cal.Core.Prelude.Eq k => [(k, a)]</code>)
		 *          an ascending list of key-value pairs.
		 * @return (CAL type: <code>Cal.Core.Prelude.Eq k => Cal.Collections.Map.Map k a</code>) 
		 *          a map containing the key-value entries.
		 */
		public static final SourceModel.Expr fromAscListWithKey(SourceModel.Expr f, SourceModel.Expr xs) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fromAscListWithKey), f, xs});
		}

		/**
		 * Name binding for function: fromAscListWithKey.
		 * @see #fromAscListWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fromAscListWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fromAscListWithKey");

		/**
		 * Builds a map from an ascending list of distinct elements in linear time.
		 * The precondition is not checked.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param xs (CAL type: <code>[(k, a)]</code>)
		 *          an ascending list of distinct key-value pairs.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          a map containing the key-value entries.
		 */
		public static final SourceModel.Expr fromDistinctAscList(SourceModel.Expr xs) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fromDistinctAscList), xs});
		}

		/**
		 * Name binding for function: fromDistinctAscList.
		 * @see #fromDistinctAscList(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fromDistinctAscList = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fromDistinctAscList");

		/**
		 * Builds a map from a list of key-value pairs.
		 * <p>
		 * Complexity: O(n*log n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.fromAscList
		 * </dl>
		 * 
		 * @param xs (CAL type: <code>Cal.Core.Prelude.Ord k => [(k, a)]</code>)
		 *          the list of key-value pairs.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          a map containing the key-value entries.
		 */
		public static final SourceModel.Expr fromList(SourceModel.Expr xs) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fromList), xs});
		}

		/**
		 * Name binding for function: fromList.
		 * @see #fromList(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fromList = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fromList");

		/**
		 * Builds a map from a list of key-value pairs with a combining function.
		 * <p>
		 * Complexity: O(n*log n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.fromAscListWith
		 * </dl>
		 * 
		 * @param f (CAL type: <code>a -> a -> a</code>)
		 *          the combining function.
		 * @param xs (CAL type: <code>Cal.Core.Prelude.Ord k => [(k, a)]</code>)
		 *          the list of key-value pairs.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          a map containing the key-value entries.
		 */
		public static final SourceModel.Expr fromListWith(SourceModel.Expr f, SourceModel.Expr xs) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fromListWith), f, xs});
		}

		/**
		 * Name binding for function: fromListWith.
		 * @see #fromListWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fromListWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fromListWith");

		/**
		 * Builds a map from a list of key-value pairs with a combining function.
		 * <p>
		 * Complexity: O(n*log n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.fromAscListWithKey
		 * </dl>
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> a -> a</code>)
		 *          the combining function.
		 * @param xs (CAL type: <code>Cal.Core.Prelude.Ord k => [(k, a)]</code>)
		 *          the list of key-value pairs.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          a map containing the key-value entries.
		 */
		public static final SourceModel.Expr fromListWithKey(SourceModel.Expr f, SourceModel.Expr xs) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.fromListWithKey), f, xs});
		}

		/**
		 * Name binding for function: fromListWithKey.
		 * @see #fromListWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName fromListWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "fromListWithKey");

		/**
		 * Returns the map association with the lowest key strictly greater than the specified key value, if any.
		 * @param k (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Core.Prelude.Maybe (k, a)</code>) 
		 */
		public static final SourceModel.Expr higherAssoc(SourceModel.Expr k, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.higherAssoc), k, map});
		}

		/**
		 * Name binding for function: higherAssoc.
		 * @see #higherAssoc(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName higherAssoc = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "higherAssoc");

		/**
		 * Inserts a new key and value in the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param value (CAL type: <code>a</code>)
		 *          the value.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map into which the key-value pair is to be inserted.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map with the key-value pair inserted.
		 */
		public static final SourceModel.Expr insert(SourceModel.Expr key, SourceModel.Expr value, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.insert), key, value, map});
		}

		/**
		 * Name binding for function: insert.
		 * @see #insert(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName insert = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "insert");

		/**
		 * <code>insertLookupWithKey f key value map</code> is a pair where the first element is equal to
		 * <code>Cal.Collections.Map.lookup key map</code> and the second element equal to <code>Cal.Collections.Map.insertWithKey f key value map</code>.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> a -> a</code>)
		 *          the combining function.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param value (CAL type: <code>a</code>)
		 *          the value.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map into which the key-value pair is to be inserted.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => (Cal.Core.Prelude.Maybe a, Cal.Collections.Map.Map k a)</code>) 
		 *          the map with the key-value pair inserted.
		 */
		public static final SourceModel.Expr insertLookupWithKey(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr value, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.insertLookupWithKey), f, key, value, map});
		}

		/**
		 * Name binding for function: insertLookupWithKey.
		 * @see #insertLookupWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName insertLookupWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "insertLookupWithKey");

		/**
		 * A strict version of <code>Cal.Collections.Map.insert</code> which will reduce the new value to WHNF (weak head normal form) 
		 * before inserting it into the map.  This should be used carefully, but can help to control space usage
		 * in some situations.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param value (CAL type: <code>a</code>)
		 *          the value.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map into which the key-value pair is to be inserted.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map with the key-value pair inserted.
		 */
		public static final SourceModel.Expr insertStrict(SourceModel.Expr key, SourceModel.Expr value, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.insertStrict), key, value, map});
		}

		/**
		 * Name binding for function: insertStrict.
		 * @see #insertStrict(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName insertStrict = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "insertStrict");

		/**
		 * Inserts a new key and value in the map with a combining function.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>a -> a -> a</code>)
		 *          the combining function.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param value (CAL type: <code>a</code>)
		 *          the value.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map into which the key-value pair is to be inserted.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map with the key-value pair inserted.
		 */
		public static final SourceModel.Expr insertWith(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr value, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.insertWith), f, key, value, map});
		}

		/**
		 * Name binding for function: insertWith.
		 * @see #insertWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName insertWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "insertWith");

		/**
		 * Inserts a new key and value in the map with a combining function.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> a -> a</code>)
		 *          the combining function.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param value (CAL type: <code>a</code>)
		 *          the value.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map into which the key-value pair is to be inserted.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map with the key-value pair inserted.
		 */
		public static final SourceModel.Expr insertWithKey(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr value, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.insertWithKey), f, key, value, map});
		}

		/**
		 * Name binding for function: insertWithKey.
		 * @see #insertWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName insertWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "insertWithKey");

		/**
		 * Returns the intersection of two maps. The values in the first map are returned.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the intersection of the two maps.
		 */
		public static final SourceModel.Expr intersection(SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.intersection), map1, map2});
		}

		/**
		 * Name binding for function: intersection.
		 * @see #intersection(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName intersection = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "intersection");

		/**
		 * Returns the intersection of two maps, with a combining function.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>a -> b -> c</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k c</code>) 
		 *          the intersection of the two maps.
		 */
		public static final SourceModel.Expr intersectionWith(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.intersectionWith), f, map1, map2});
		}

		/**
		 * Name binding for function: intersectionWith.
		 * @see #intersectionWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName intersectionWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "intersectionWith");

		/**
		 * Returns the intersection of two maps, with a combining function.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> b -> c</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k c</code>) 
		 *          the intersection of the two maps.
		 */
		public static final SourceModel.Expr intersectionWithKey(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.intersectionWithKey), f, map1, map2});
		}

		/**
		 * Name binding for function: intersectionWithKey.
		 * @see #intersectionWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName intersectionWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "intersectionWithKey");

		/**
		 * Returns whether the map is empty.
		 * <p>
		 * Complexity: O(1).
		 * 
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Boolean</code>) 
		 *          <code>Cal.Core.Prelude.True</code> if the map is empty; <code>Cal.Core.Prelude.False</code> otherwise.
		 */
		public static final SourceModel.Expr isEmpty(SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.isEmpty), map});
		}

		/**
		 * Name binding for function: isEmpty.
		 * @see #isEmpty(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName isEmpty = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "isEmpty");

		/**
		 * Returns whether the first map is a proper submap of the second map (ie. a submap but not equal).
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.isProperSubmapBy
		 * </dl>
		 * 
		 * @param map1 (CAL type: <code>(Cal.Core.Prelude.Ord k, Cal.Core.Prelude.Eq a) => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>(Cal.Core.Prelude.Ord k, Cal.Core.Prelude.Eq a) => Cal.Collections.Map.Map k a</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Boolean</code>) 
		 *          <code>Cal.Core.Prelude.True</code> if the first map is a proper submap of the second map; <code>Cal.Core.Prelude.False</code> otherwise.
		 */
		public static final SourceModel.Expr isProperSubmap(SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.isProperSubmap), map1, map2});
		}

		/**
		 * Name binding for function: isProperSubmap.
		 * @see #isProperSubmap(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName isProperSubmap = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "isProperSubmap");

		/**
		 * Returns whether the first map is a proper submap of the second map (ie. a submap but not equal).
		 * <p>
		 * Complexity: O(n+m)
		 * <p>
		 * The expression <code>isProperSubmapBy f m1 m2</code> returns <code>Cal.Core.Prelude.True</code> when <code>m1</code> and <code>m2</code>
		 * are not equal, all keys in <code>m1</code> are in <code>m2</code>, and when <code>f</code> returns <code>Cal.Core.Prelude.True</code> when applied
		 * to their respective values.
		 * <p>
		 * For example, the following expressions are all <code>Cal.Core.Prelude.True</code>:
		 * 
		 * <pre> isProperSubmapBy Cal.Core.Prelude.equals         (Cal.Collections.Map.fromList [(1,1)]) (Cal.Collections.Map.fromList [(1,1),(2,2)])
		 *  isProperSubmapBy Cal.Core.Prelude.lessThanEquals (Cal.Collections.Map.fromList [(1,1)]) (Cal.Collections.Map.fromList [(1,1),(2,2)])</pre>
		 * 
		 * <p>
		 * But the following are all <code>Cal.Core.Prelude.False</code>:
		 * 
		 * <pre> isProperSubmapBy Cal.Core.Prelude.equals   (Cal.Collections.Map.fromList [(1,1),(2,2)]) (Cal.Collections.Map.fromList [(1,1),(2,2)])
		 *  isProperSubmapBy Cal.Core.Prelude.equals   (Cal.Collections.Map.fromList [(1,1),(2,2)]) (Cal.Collections.Map.fromList [(1,1)])
		 *  isProperSubmapBy Cal.Core.Prelude.lessThan (Cal.Collections.Map.fromList [(1,1)])       (Cal.Collections.Map.fromList [(1,1),(2,2)])</pre>
		 * 
		 * 
		 * @param f (CAL type: <code>a -> b -> Cal.Core.Prelude.Boolean</code>)
		 *          a predicate for testing the equality of map values.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Boolean</code>) 
		 *          <code>Cal.Core.Prelude.True</code> if the first map is a submap of the second map; <code>Cal.Core.Prelude.False</code> otherwise.
		 */
		public static final SourceModel.Expr isProperSubmapBy(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.isProperSubmapBy), f, map1, map2});
		}

		/**
		 * Name binding for function: isProperSubmapBy.
		 * @see #isProperSubmapBy(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName isProperSubmapBy = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "isProperSubmapBy");

		/**
		 * Returns whether the first map is a submap of the second map.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.isSubmapBy
		 * </dl>
		 * 
		 * @param map1 (CAL type: <code>(Cal.Core.Prelude.Ord k, Cal.Core.Prelude.Eq a) => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>(Cal.Core.Prelude.Ord k, Cal.Core.Prelude.Eq a) => Cal.Collections.Map.Map k a</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Boolean</code>) 
		 *          <code>Cal.Core.Prelude.True</code> if the first map is a submap of the second map; <code>Cal.Core.Prelude.False</code> otherwise.
		 */
		public static final SourceModel.Expr isSubmap(SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.isSubmap), map1, map2});
		}

		/**
		 * Name binding for function: isSubmap.
		 * @see #isSubmap(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName isSubmap = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "isSubmap");

		/**
		 * Returns whether the first map is a submap of the second map.
		 * <p>
		 * Complexity: O(n+m)
		 * <p>
		 * The expression <code>isSubmapBy f t1 t2</code> returns <code>Cal.Core.Prelude.True</code> if all keys in <code>t1</code> are in
		 * tree <code>t2</code>, and when <code>f</code> returns <code>Cal.Core.Prelude.True</code> when applied to their respective values.
		 * <p>
		 * For example, the following expressions are all <code>Cal.Core.Prelude.True</code>:
		 * 
		 * <pre> isSubmapBy Cal.Core.Prelude.equals         (Cal.Collections.Map.fromList [('a',1)]) (Cal.Collections.Map.fromList [('a',1),('b',2)])
		 *  isSubmapBy Cal.Core.Prelude.lessThanEquals (Cal.Collections.Map.fromList [('a',1)]) (Cal.Collections.Map.fromList [('a',1),('b',2)])
		 *  isSubmapBy Cal.Core.Prelude.equals         (Cal.Collections.Map.fromList [('a',1),('b',2)]) (Cal.Collections.Map.fromList [('a',1),('b',2)])</pre>
		 * 
		 * <p>
		 * But the following are all <code>Cal.Core.Prelude.False</code>:
		 * 
		 * <pre> isSubmapBy Cal.Core.Prelude.equals   (Cal.Collections.Map.fromList [('a',2)]) (Cal.Collections.Map.fromList [('a',1),('b',2)])
		 *  isSubmapBy Cal.Core.Prelude.lessThan (Cal.Collections.Map.fromList [('a',1)]) (Cal.Collections.Map.fromList [('a',1),('b',2)])
		 *  isSubmapBy Cal.Core.Prelude.equals   (Cal.Collections.Map.fromList [('a',1),('b',2)]) (Cal.Collections.Map.fromList [('a',1)])</pre>
		 * 
		 * 
		 * @param f (CAL type: <code>a -> b -> Cal.Core.Prelude.Boolean</code>)
		 *          a predicate for testing the equality of map values.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k b</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Boolean</code>) 
		 *          <code>Cal.Core.Prelude.True</code> if the first map is a submap of the second map; <code>Cal.Core.Prelude.False</code> otherwise.
		 */
		public static final SourceModel.Expr isSubmapBy(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.isSubmapBy), f, map1, map2});
		}

		/**
		 * Name binding for function: isSubmapBy.
		 * @see #isSubmapBy(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName isSubmapBy = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "isSubmapBy");

		/**
		 * Returns a set of all keys of the map.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Type Constructors:</b> Cal.Collections.Set.Set
		 * </dl>
		 * 
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Set.Set k</code>) 
		 *          a <code>Set</code> of all keys of the map.
		 */
		public static final SourceModel.Expr keySet(SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.keySet), m});
		}

		/**
		 * Name binding for function: keySet.
		 * @see #keySet(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName keySet = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "keySet");

		/**
		 * Returns all keys of the map.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>[k]</code>) 
		 *          a list of all keys of the map.
		 */
		public static final SourceModel.Expr keys(SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.keys), m});
		}

		/**
		 * Name binding for function: keys.
		 * @see #keys(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName keys = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "keys");

		/**
		 * Looks up the value at a key in the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Maybe a</code>) 
		 *          <code>Cal.Core.Prelude.Just value</code> if the key is found in the map and associated with the
		 * value, or <code>Cal.Core.Prelude.Nothing</code> if the key is not found.
		 */
		public static final SourceModel.Expr lookup(SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.lookup), key, map});
		}

		/**
		 * Name binding for function: lookup.
		 * @see #lookup(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName lookup = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "lookup");

		/**
		 * Looks up the index of a key. The index is a number from 0 up to, but not
		 * including, the size of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Maybe Cal.Core.Prelude.Int</code>) 
		 *          <code>Cal.Core.Prelude.Just indexValue</code> where <code>indexValue</code> is the index of the key, or <code>Cal.Core.Prelude.Nothing</code>
		 * if the key is not a member of the map.
		 */
		public static final SourceModel.Expr lookupIndex(SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.lookupIndex), key, map});
		}

		/**
		 * Name binding for function: lookupIndex.
		 * @see #lookupIndex(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName lookupIndex = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "lookupIndex");

		/**
		 * Looks up the value at a key in the map or inserts the default value if not found.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param value (CAL type: <code>a</code>)
		 *          the default value to be used if a
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => (a, Cal.Collections.Map.Map k a, Cal.Core.Prelude.Boolean)</code>) 
		 *          A tuple with (1) the value found (or default if not found)
		 * (2) the potentially modified Map
		 * (3) whether the map was modified
		 */
		public static final SourceModel.Expr lookupInsert(SourceModel.Expr key, SourceModel.Expr value, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.lookupInsert), key, value, map});
		}

		/**
		 * Name binding for function: lookupInsert.
		 * @see #lookupInsert(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName lookupInsert = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "lookupInsert");

		/**
		 * <code>lookupWithDefault key map defaultValue</code> returns the value at the given key or <code>defaultValue</code>
		 * when the key is not in the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @param defaultValue (CAL type: <code>a</code>)
		 *          the default value to be returned if the key is not in the map.
		 * @return (CAL type: <code>a</code>) 
		 *          the value at the given key or <code>defaultValue</code> when the key is not in the map.
		 */
		public static final SourceModel.Expr lookupWithDefault(SourceModel.Expr key, SourceModel.Expr map, SourceModel.Expr defaultValue) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.lookupWithDefault), key, map, defaultValue});
		}

		/**
		 * Name binding for function: lookupWithDefault.
		 * @see #lookupWithDefault(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName lookupWithDefault = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "lookupWithDefault");

		/**
		 * Returns the map association with the highest key strictly less than the specified key value, if any.
		 * @param k (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Core.Prelude.Maybe (k, a)</code>) 
		 */
		public static final SourceModel.Expr lowerAssoc(SourceModel.Expr k, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.lowerAssoc), k, map});
		}

		/**
		 * Name binding for function: lowerAssoc.
		 * @see #lowerAssoc(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName lowerAssoc = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "lowerAssoc");

		/**
		 * Maps a function over all values in the map.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>a -> b</code>)
		 *          the function to be mapped over the values in the map.
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k b</code>) 
		 *          the map containing the mapped values.
		 */
		public static final SourceModel.Expr map(SourceModel.Expr f, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.map), f, m});
		}

		/**
		 * Name binding for function: map.
		 * @see #map(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName map = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "map");

		/**
		 * Threads an accumulating argument through the map in an unspecified order. (= ascending pre-order)
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>a -> b -> (a, c)</code>)
		 *          the function to be mapped over the values in the map.
		 * @param a (CAL type: <code>a</code>)
		 *          the accumulator to be thread through the map.
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k b</code>)
		 *          the map.
		 * @return (CAL type: <code>(a, Cal.Collections.Map.Map k c)</code>) 
		 *          the map containing the mapped values.
		 */
		public static final SourceModel.Expr mapAccum(SourceModel.Expr f, SourceModel.Expr a, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.mapAccum), f, a, m});
		}

		/**
		 * Name binding for function: mapAccum.
		 * @see #mapAccum(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName mapAccum = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "mapAccum");

		/**
		 * Threads an accumulating argument through the map in an unspecified order. (= ascending pre-order)
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>a -> k -> b -> (a, c)</code>)
		 *          the function to be mapped over the keys and values in the map.
		 * @param a (CAL type: <code>a</code>)
		 *          the accumulator to be thread through the map.
		 * @param t (CAL type: <code>Cal.Collections.Map.Map k b</code>)
		 *          the map.
		 * @return (CAL type: <code>(a, Cal.Collections.Map.Map k c)</code>) 
		 *          the map containing the mapped values.
		 */
		public static final SourceModel.Expr mapAccumWithKey(SourceModel.Expr f, SourceModel.Expr a, SourceModel.Expr t) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.mapAccumWithKey), f, a, t});
		}

		/**
		 * Name binding for function: mapAccumWithKey.
		 * @see #mapAccumWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName mapAccumWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "mapAccumWithKey");

		/**
		 * <code>mapKeys f map</code> is the map obtained by applying <code>f</code> to each key of <code>map</code>.
		 * <p>
		 * Complexity: O(n*log n)
		 * <p>
		 * The size of the result may be smaller if <code>f</code> maps two or more distinct keys to
		 * the same new key. In this case the value at the smallest of these keys is
		 * retained.
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k2 => k1 -> k2</code>)
		 *          the function to be mapped over the keys in the map.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k1 a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k2 => Cal.Collections.Map.Map k2 a</code>) 
		 *          the map containing the mapped keys.
		 */
		public static final SourceModel.Expr mapKeys(SourceModel.Expr f, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.mapKeys), f, map});
		}

		/**
		 * Name binding for function: mapKeys.
		 * @see #mapKeys(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName mapKeys = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "mapKeys");

		/**
		 * <code>mapKeysWith c f s</code> is the map obtained by applying <code>f</code> to each key of <code>s</code>.
		 * <p>
		 * Complexity: O(n*log n)
		 * <p>
		 * The size of the result may be smaller if <code>f</code> maps two or more distinct keys to
		 * the same new key. In this case the associated values will be combined using
		 * <code>c</code>.
		 * 
		 * @param c (CAL type: <code>a -> a -> a</code>)
		 *          the combining function.
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k2 => k1 -> k2</code>)
		 *          the function to be mapped over the keys in the map.
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k1 a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k2 => Cal.Collections.Map.Map k2 a</code>) 
		 *          the map containing the mapped keys.
		 */
		public static final SourceModel.Expr mapKeysWith(SourceModel.Expr c, SourceModel.Expr f, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.mapKeysWith), c, f, m});
		}

		/**
		 * Name binding for function: mapKeysWith.
		 * @see #mapKeysWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName mapKeysWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "mapKeysWith");

		/**
		 * Maps a function over all values in the map.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param f (CAL type: <code>k -> a -> b</code>)
		 *          the function to be mapped over the keys and values in the map.
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k b</code>) 
		 *          the map containing the mapped values.
		 */
		public static final SourceModel.Expr mapWithKey(SourceModel.Expr f, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.mapWithKey), f, m});
		}

		/**
		 * Name binding for function: mapWithKey.
		 * @see #mapWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName mapWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "mapWithKey");

		/**
		 * Returns whether the key is a member of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Boolean</code>) 
		 *          <code>Cal.Core.Prelude.True</code> if the key is a member of the map; <code>Cal.Core.Prelude.False</code> otherwise.
		 */
		public static final SourceModel.Expr member(SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.member), key, map});
		}

		/**
		 * Name binding for function: member.
		 * @see #member(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName member = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "member");

		/**
		 * Partitions the map according to a predicate. The first map contains all
		 * elements that satisfy the predicate, the second all elements that fail the
		 * predicate.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.split
		 * </dl>
		 * 
		 * @param p (CAL type: <code>a -> Cal.Core.Prelude.Boolean</code>)
		 *          the predicate for testing the values.
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>(Cal.Collections.Map.Map k a, Cal.Collections.Map.Map k a)</code>) 
		 *          a pair of maps. The first map contains all elements that satisfy the
		 * predicate, the second all elements that fail the predicate.
		 */
		public static final SourceModel.Expr partition(SourceModel.Expr p, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.partition), p, m});
		}

		/**
		 * Name binding for function: partition.
		 * @see #partition(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName partition = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "partition");

		/**
		 * Partitions the map according to a predicate. The first map contains all
		 * elements that satisfy the predicate, the second all elements that fail the
		 * predicate.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.split
		 * </dl>
		 * 
		 * @param p (CAL type: <code>k -> a -> Cal.Core.Prelude.Boolean</code>)
		 *          the predicate for testing the keys and values.
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>(Cal.Collections.Map.Map k a, Cal.Collections.Map.Map k a)</code>) 
		 *          a pair of maps. The first map contains all elements that satisfy the
		 * predicate, the second all elements that fail the predicate.
		 */
		public static final SourceModel.Expr partitionWithKey(SourceModel.Expr p, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.partitionWithKey), p, m});
		}

		/**
		 * Name binding for function: partitionWithKey.
		 * @see #partitionWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName partitionWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "partitionWithKey");

		/**
		 * Creates a map with a single element.
		 * <p>
		 * Complexity: O(1)
		 * 
		 * @param key (CAL type: <code>k</code>)
		 *          the key.
		 * @param value (CAL type: <code>a</code>)
		 *          the value.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          a map with the specified key-value pair as its single element.
		 */
		public static final SourceModel.Expr single(SourceModel.Expr key, SourceModel.Expr value) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.single), key, value});
		}

		/**
		 * Name binding for function: single.
		 * @see #single(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName single = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "single");

		/**
		 * Returns the number of elements in the map.
		 * <p>
		 * Complexity: O(1).
		 * 
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Int</code>) 
		 *          the number of elements in the map.
		 */
		public static final SourceModel.Expr size(SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.size), map});
		}

		/**
		 * Name binding for function: size.
		 * @see #size(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName size = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "size");

		/**
		 * <code>split k map</code> returns a pair <code>(map1,map2)</code> where the keys in <code>map1</code> are smaller
		 * than <code>k</code> and the keys in <code>map2</code> larger than <code>k</code>. Any key equal to <code>k</code> is found in
		 * neither <code>map1</code> nor <code>map2</code>.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param k (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param m (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => (Cal.Collections.Map.Map k a, Cal.Collections.Map.Map k a)</code>) 
		 *          a pair <code>(map1,map2)</code> where the keys in <code>map1</code> are smaller than <code>k</code> and the
		 * keys in <code>map2</code> larger than <code>k</code>.
		 */
		public static final SourceModel.Expr split(SourceModel.Expr k, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.split), k, m});
		}

		/**
		 * Name binding for function: split.
		 * @see #split(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName split = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "split");

		/**
		 * <code>splitLookup k map</code> splits a map just like <code>Cal.Collections.Map.split</code> but also returns <code>Cal.Collections.Map.lookup k map</code>.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * 
		 * <dl><dt><b>See Also:</b>
		 * <dd><b>Functions and Class Methods:</b> Cal.Collections.Map.split, Cal.Collections.Map.lookup
		 * </dl>
		 * 
		 * @param k (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param m (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => (Cal.Core.Prelude.Maybe a, Cal.Collections.Map.Map k a, Cal.Collections.Map.Map k a)</code>) 
		 *          a triple <code>(lookupResult,map1,map2)</code> where the keys in <code>map1</code> are smaller than <code>k</code> and the
		 * keys in <code>map2</code> larger than <code>k</code>, and where <code>lookupResult</code> is the result of looking
		 * up the key in the map.
		 */
		public static final SourceModel.Expr splitLookup(SourceModel.Expr k, SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.splitLookup), k, m});
		}

		/**
		 * Name binding for function: splitLookup.
		 * @see #splitLookup(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName splitLookup = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "splitLookup");

		/**
		 * Converts to a list of key-value pairs with the keys in ascending order.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param t (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>[(k, a)]</code>) 
		 *          a list of key-value pairs with the keys in ascending order.
		 */
		public static final SourceModel.Expr toAscList(SourceModel.Expr t) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.toAscList), t});
		}

		/**
		 * Name binding for function: toAscList.
		 * @see #toAscList(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName toAscList = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "toAscList");

		/**
		 * Converts to a list of key-value pairs with the keys in descending order.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>[(k, a)]</code>) 
		 *          a list of key-value pairs with the keys in descending order.
		 */
		public static final SourceModel.Expr toDescList(SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.toDescList), m});
		}

		/**
		 * Name binding for function: toDescList.
		 * @see #toDescList(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName toDescList = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "toDescList");

		/**
		 * Converts to a list of key-value pairs with the keys in ascending order.
		 * <p>
		 * Complexity: O(n)
		 * 
		 * @param m (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>[(k, a)]</code>) 
		 *          a list of key-value pairs with the keys in ascending order.
		 */
		public static final SourceModel.Expr toList(SourceModel.Expr m) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.toList), m});
		}

		/**
		 * Name binding for function: toList.
		 * @see #toList(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName toList = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "toList");

		/**
		 * <code>union map1 map2</code> takes the left-biased union of <code>map1</code> and <code>map2</code>. It prefers <code>map1</code> when
		 * duplicate keys are encountered, i.e. <code>(union == Cal.Collections.Map.unionWith Cal.Core.Prelude.const)</code>. The
		 * implementation uses the efficient <em>hedge-union</em> algorithm.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the left-biased union of map1 and map2.
		 */
		public static final SourceModel.Expr union(SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.union), map1, map2});
		}

		/**
		 * Name binding for function: union.
		 * @see #union(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName union = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "union");

		/**
		 * Returns the left-biased union of two maps, with a combining function. The
		 * implementation uses the efficient <em>hedge-union</em> algorithm.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>a -> a -> a</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the left-biased union of two maps.
		 */
		public static final SourceModel.Expr unionWith(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.unionWith), f, map1, map2});
		}

		/**
		 * Name binding for function: unionWith.
		 * @see #unionWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName unionWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "unionWith");

		/**
		 * Returns the left-biased union of two maps, with a combining function. The
		 * implementation uses the efficient <em>hedge-union</em> algorithm.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> a -> a</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the left-biased union of two maps.
		 */
		public static final SourceModel.Expr unionWithKey(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.unionWithKey), f, map1, map2});
		}

		/**
		 * Name binding for function: unionWithKey.
		 * @see #unionWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName unionWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "unionWithKey");

		/**
		 * Returns the left-biased union of two maps, with a combining function. The
		 * implementation uses the efficient <em>hedge-union</em> algorithm. If the combining
		 * function returns Nothing, that item is omitted from the resulting map.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the left-biased union of two maps.
		 */
		public static final SourceModel.Expr unionWithKeyMaybe(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.unionWithKeyMaybe), f, map1, map2});
		}

		/**
		 * Name binding for function: unionWithKeyMaybe.
		 * @see #unionWithKeyMaybe(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName unionWithKeyMaybe = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "unionWithKeyMaybe");

		/**
		 * Returns the left-biased union of two maps, with a combining function. The
		 * implementation uses the efficient <em>hedge-union</em> algorithm. If the combining
		 * function returns Nothing, that item is omitted from the resulting map.
		 * <p>
		 * Complexity: O(n+m)
		 * 
		 * @param f (CAL type: <code>a -> a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the combining function.
		 * @param map1 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the first map.
		 * @param map2 (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the second map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the left-biased union of two maps.
		 */
		public static final SourceModel.Expr unionWithMaybe(SourceModel.Expr f, SourceModel.Expr map1, SourceModel.Expr map2) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.unionWithMaybe), f, map1, map2});
		}

		/**
		 * Name binding for function: unionWithMaybe.
		 * @see #unionWithMaybe(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName unionWithMaybe = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "unionWithMaybe");

		/**
		 * Returns the union of a list of maps.
		 * @param maps (CAL type: <code>Cal.Core.Prelude.Ord k => [Cal.Collections.Map.Map k a]</code>)
		 *          a list of maps.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the union of the maps in the list.
		 */
		public static final SourceModel.Expr unions(SourceModel.Expr maps) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.unions), maps});
		}

		/**
		 * Name binding for function: unions.
		 * @see #unions(org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName unions = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "unions");

		/**
		 * Returns the union of a list of maps, with a combining operation.
		 * @param f (CAL type: <code>a -> a -> a</code>)
		 *          the combining function.
		 * @param maps (CAL type: <code>Cal.Core.Prelude.Ord k => [Cal.Collections.Map.Map k a]</code>)
		 *          a list of maps.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the union of the maps in the list.
		 */
		public static final SourceModel.Expr unionsWith(SourceModel.Expr f, SourceModel.Expr maps) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.unionsWith), f, maps});
		}

		/**
		 * Name binding for function: unionsWith.
		 * @see #unionsWith(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName unionsWith = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "unionsWith");

		/**
		 * Returns the union of a list of maps, with a combining operation.
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> a -> a</code>)
		 *          the combining function.
		 * @param maps (CAL type: <code>Cal.Core.Prelude.Ord k => [Cal.Collections.Map.Map k a]</code>)
		 *          a list of maps.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the union of the maps in the list.
		 */
		public static final SourceModel.Expr unionsWithKey(SourceModel.Expr f, SourceModel.Expr maps) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.unionsWithKey), f, maps});
		}

		/**
		 * Name binding for function: unionsWithKey.
		 * @see #unionsWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName unionsWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "unionsWithKey");

		/**
		 * <code>update f key map</code> updates the value <code>x</code> at <code>key</code> (if it is in the map). If <code>f x</code> is
		 * <code>Cal.Core.Prelude.Nothing</code>, the element is deleted. If it is <code>Cal.Core.Prelude.Just y</code>, the key <code>key</code> is bound to the
		 * new value <code>y</code>.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function used to map the old value associated with the key to the new value.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map, with the value at the specified key adjusted if present.
		 */
		public static final SourceModel.Expr update(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.update), f, key, map});
		}

		/**
		 * Name binding for function: update.
		 * @see #update(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName update = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "update");

		/**
		 * Updates the element at index. Calls <code>Cal.Core.Prelude.error</code> when an invalid index is used.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>k -> a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function used to map the old value associated with the key to the new value.
		 * @param index (CAL type: <code>Cal.Core.Prelude.Int</code>)
		 *          the index.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with the value at the specified index adjusted.
		 */
		public static final SourceModel.Expr updateAt(SourceModel.Expr f, SourceModel.Expr index, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateAt), f, index, map});
		}

		/**
		 * @see #updateAt(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 * @param f
		 * @param index
		 * @param map
		 * @return the SourceModel.Expr representing an application of updateAt
		 */
		public static final SourceModel.Expr updateAt(SourceModel.Expr f, int index, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateAt), f, SourceModel.Expr.makeIntValue(index), map});
		}

		/**
		 * Name binding for function: updateAt.
		 * @see #updateAt(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName updateAt = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "updateAt");

		/**
		 * Simultaneously looks up and updates the map at a specific key.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function which, when given the old key-value pair, returns the new
		 * value to be associated with the key.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => (Cal.Core.Prelude.Maybe a, Cal.Collections.Map.Map k a)</code>) 
		 *          a pair. The first element contains either <code>Cal.Core.Prelude.Just value</code> if the key was
		 * originally associated with value, or <code>Cal.Core.Prelude.Nothing</code> otherwise. The second
		 * element contains the map, with the value at the specified key
		 * adjusted if present.
		 */
		public static final SourceModel.Expr updateLookupWithKey(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateLookupWithKey), f, key, map});
		}

		/**
		 * Name binding for function: updateLookupWithKey.
		 * @see #updateLookupWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName updateLookupWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "updateLookupWithKey");

		/**
		 * Updates the maximal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function used to map the old value associated with the key to the new value.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with its maximal key updated.
		 */
		public static final SourceModel.Expr updateMax(SourceModel.Expr f, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateMax), f, map});
		}

		/**
		 * Name binding for function: updateMax.
		 * @see #updateMax(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName updateMax = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "updateMax");

		/**
		 * Updates the maximal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>k -> a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function which, when given the old key-value pair, returns the new value to be associated with the key.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with its maximal key updated.
		 */
		public static final SourceModel.Expr updateMaxWithKey(SourceModel.Expr f, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateMaxWithKey), f, map});
		}

		/**
		 * Name binding for function: updateMaxWithKey.
		 * @see #updateMaxWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName updateMaxWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "updateMaxWithKey");

		/**
		 * Updates the minimal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function used to map the old value associated with the key to the new value.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with its minimal key updated.
		 */
		public static final SourceModel.Expr updateMin(SourceModel.Expr f, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateMin), f, map});
		}

		/**
		 * Name binding for function: updateMin.
		 * @see #updateMin(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName updateMin = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "updateMin");

		/**
		 * Updates the minimal key of the map.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>k -> a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function which, when given the old key-value pair, returns the new value to be associated with the key.
		 * @param map (CAL type: <code>Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Collections.Map.Map k a</code>) 
		 *          the map, with its minimal key updated.
		 */
		public static final SourceModel.Expr updateMinWithKey(SourceModel.Expr f, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateMinWithKey), f, map});
		}

		/**
		 * Name binding for function: updateMinWithKey.
		 * @see #updateMinWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName updateMinWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "updateMinWithKey");

		/**
		 * <code>updateWithKey f key map</code> updates the value <code>x</code> at <code>key</code> (if it is in the map). If
		 * <code>f key x</code> is <code>Cal.Core.Prelude.Nothing</code>, the element is deleted. If it is <code>Cal.Core.Prelude.Just y</code>, the key <code>key</code> is
		 * bound to the new value <code>y</code>.
		 * <p>
		 * Complexity: O(log n)
		 * 
		 * @param f (CAL type: <code>Cal.Core.Prelude.Ord k => k -> a -> Cal.Core.Prelude.Maybe a</code>)
		 *          the function which, when given the old key-value pair, returns the new value to be associated with the key.
		 * @param key (CAL type: <code>Cal.Core.Prelude.Ord k => k</code>)
		 *          the key.
		 * @param map (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>)
		 *          the map.
		 * @return (CAL type: <code>Cal.Core.Prelude.Ord k => Cal.Collections.Map.Map k a</code>) 
		 *          the map, with the value at the specified key adjusted if present.
		 */
		public static final SourceModel.Expr updateWithKey(SourceModel.Expr f, SourceModel.Expr key, SourceModel.Expr map) {
			return 
				SourceModel.Expr.Application.make(
					new SourceModel.Expr[] {SourceModel.Expr.Var.make(Functions.updateWithKey), f, key, map});
		}

		/**
		 * Name binding for function: updateWithKey.
		 * @see #updateWithKey(org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr, org.openquark.cal.compiler.SourceModel.Expr)
		 */
		public static final QualifiedName updateWithKey = 
			QualifiedName.make(CAL_Map.MODULE_NAME, "updateWithKey");

	}
	/**
	 * A hash of the concatenated JavaDoc for this class (including inner classes).
	 * This value is used when checking for changes to generated binding classes.
	 */
	public static final int javaDocHash = -685329562;

}
