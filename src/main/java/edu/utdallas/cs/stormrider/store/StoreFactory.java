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

import edu.utdallas.cs.stormrider.store.impl.JenaHBaseStoreImpl;
import edu.utdallas.cs.stormrider.store.impl.JenaMemStoreImpl;

public class StoreFactory 
{
	public static Store getJenaMemStore()   					
	{ return new JenaMemStoreImpl() ; }
	
	public static Store getJenaMemStore( boolean isReified )	
	{ return new JenaMemStoreImpl( isReified ) ; }
	
	public static Store getJenaHBaseStore( String configFile )	
	{ return new JenaHBaseStoreImpl( configFile ) ; }
	
	public static Store getJenaHBaseStore( String configFile, boolean isReified )
	{ return new JenaHBaseStoreImpl( configFile, isReified ) ; }
	
	public static Store getJenaHBaseStore( String configFile, String iri, boolean isReified )
	{ return new JenaHBaseStoreImpl( configFile, iri, isReified ) ; }
	
	public static Store getJenaHBaseStore( String configFile, String iri, boolean isReified, boolean formatStore )
	{ return new JenaHBaseStoreImpl( configFile, iri, isReified, formatStore ) ; }
}
