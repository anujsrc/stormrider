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

package edu.utdallas.cs.stormrider.util;

/**
 * A class that holds constants for Twitter attributes
 */
public class TwitterConstants
{
	/** The consumer key for OAuth support **/
	public static final String CONSUMER_KEY = "=== consumer key ===" ;
	
	/** The consumer secret for OAuth support **/
	public static final String CONSUMER_SECRET = "=== consumer secret ===" ;
	
	/** The access token for OAuth support **/
	public static final String ACCESS_TOKEN = "=== access token ===" ;
		
	/** The access token secret for OAuth support **/
	public static final String ACCESS_TOKEN_SECRET = "=== access token secret ===" ;
	
	/** The URI for Twitter users **/
	public static final String TWITTER_USER_URI = "http://www.example.org/people#u-" ;
	
	/** The URI for Twitter tweets **/
	public static final String TWITTER_TWEET_URI = "http://www.example.org/messages#t-" ;
	
	/** The number of ms to wait in between requests to the Twitter API **/
	public static final long TIME_DELAY_BETWEEN_REQUESTS = 5000L ;
	
	/** The number of status messageds to retrieve per page **/
	public static final int STATUSES_PER_PAGE = 100 ;	
	
	/** The location of the HBase configuration file **/
	public static final String HBASE_MODEL_CONFIG_FILE = "conf/twitter-model-sample.ttl" ;

	/** The location of the HBase configuration file **/
	public static final String HBASE_VIEW_CONFIG_FILE = "conf/twitter-view-sample.ttl" ;

	public static final String STORAGE_TOPOLOGY_NAME = "storage-topology" ;

	public static final int NUM_OF_WORKERS = 1 ;	
	
	public static final int NUM_OF_TASKS = NUM_OF_WORKERS * 1 ;
	
	public static final int PARALLELISM_HINT = 1 ;
	
	public static final int MAX_TASK_PARALLELISM = 1 ;
	
	public static final int WORKER_SHARED_THREAD_POOL_SIZE = 1 ;
	
	public static final boolean IS_LOCAL_MODE = true ;
	
	public static final long MAX_REPORTS = 1000 ;
	
	public static final long INTERVAL = 300000 ;
	
	public static final String HBASE_CONFIG_FILE = "=== path to hbase-site.xml ===" ;
	
	public static final String IRI = "http://cs.utdallas.edu/semanticweb/StormRider/Named#Twitter-Test" ; 
}