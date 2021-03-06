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

package edu.utdallas.cs.stormrider.examples.twitter;

import edu.utdallas.cs.stormrider.examples.twitter.add.TwitterLoaderTopology;
import edu.utdallas.cs.stormrider.topology.Topology;
import edu.utdallas.cs.stormrider.topology.TopologyFactory;
import edu.utdallas.cs.stormrider.util.TwitterConstants;

public class TwitterAddOnlyTopology 
{
	public static void main( String[] args )
	{
		//Create a topology object
		Topology topology = TopologyFactory.getStormTopology() ;
		
		//Create and Submit Add Topology
		topology.submitAddTopology( TwitterConstants.STORAGE_TOPOLOGY_NAME, true, TwitterConstants.NUM_OF_WORKERS, TwitterLoaderTopology.constructAddTopology() ) ;		
	}
}