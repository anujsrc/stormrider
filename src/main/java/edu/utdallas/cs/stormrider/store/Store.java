/*
 * Copyright © 2012-2013 The University of Texas at Dallas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.utdallas.cs.stormrider.store;

import java.io.Serializable;
import java.util.Iterator;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.ResultSet;

import edu.utdallas.cs.stormrider.store.iterator.impl.NodeAndNeighbor;

public interface Store extends Serializable
{
	public void addTriple( String subject, String predicate, String object ) ;
	
	public ResultSet executeSelectQuery( Query query ) ;
	
	public ResultSet getNodesForAnalysis( String linkNameAsURI ) ;
	
	public String getAdjacencyList( String nodeAsURI, String linkNameAsURI ) ;
	
	public Iterator<NodeAndNeighbor> getAllNodesWithNeighbors( String linkNameAsURI ) ;
}
