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

package edu.utdallas.cs.stormrider.views.materialized;

import edu.utdallas.cs.stormrider.connection.StormRiderConnection;

public abstract class LandmarksViewBase implements LandmarksView
{
	/** A given link name for which the view is being built **/
	protected String linkName = null;

	protected StormRiderConnection conn = null ;

	public LandmarksViewBase( String lName, StormRiderConnection conn )
	{
		this.linkName = lName ;
		this.conn = conn ;
	}
	
	public String getLinkName() { return linkName ; }
	
	public StormRiderConnection getConnection() { return conn ; }

}
