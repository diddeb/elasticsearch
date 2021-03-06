/*
 * Licensed to ElasticSearch and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.indices.cache.filter.terms;

import org.elasticsearch.index.cache.filter.support.CacheKeyFilter;
import org.elasticsearch.index.mapper.FieldMapper;

/**
 */
public class TermsLookup {

    private final FieldMapper fieldMapper;

    private final String index;
    private final String type;
    private final String id;
    private final String path;

    public TermsLookup(FieldMapper fieldMapper, String index, String type, String id, String path) {
        // TODO: do we want to intern index, type and path?
        this.fieldMapper = fieldMapper;
        this.index = index;
        this.type = type;
        this.id = id;
        this.path = path;
    }

    public FieldMapper getFieldMapper() {
        return fieldMapper;
    }

    public String getIndex() {
        return index;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String toString() {
        return fieldMapper.names().fullName() + ":" + index + "/" + type + "/" + id + "/" + path;
    }
}
