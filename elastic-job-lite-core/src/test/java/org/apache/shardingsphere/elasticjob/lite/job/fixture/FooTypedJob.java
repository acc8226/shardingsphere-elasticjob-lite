/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.elasticjob.lite.job.fixture;

import lombok.Getter;
import org.apache.shardingsphere.elasticjob.lite.api.job.ShardingContext;
import org.apache.shardingsphere.elasticjob.lite.api.job.type.SimpleJob;
import org.apache.shardingsphere.elasticjob.lite.job.TypedJob;

import java.util.Properties;

@Getter
public final class FooTypedJob implements SimpleJob, TypedJob {
    
    private volatile String foo; 
    
    @Override
    public void init(final Properties props) {
        foo = props.getProperty("foo");
    }
    
    @Override
    public void execute(final ShardingContext shardingContext) {
    }
    
    @Override
    public String getType() {
        return "FOO";
    }
}