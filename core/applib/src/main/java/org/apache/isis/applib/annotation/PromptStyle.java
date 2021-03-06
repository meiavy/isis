/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.isis.applib.annotation;

import javax.xml.bind.annotation.XmlType;

/**
 * How prompting for new values (property edit) should be performed
 */
@XmlType(
        namespace = "http://isis.apache.org/applib/layout/component"
)
public enum PromptStyle {
    /**
     * Edit the property according to the default edit style policy configured in <tt>isis.properties</tt>.
     *
     * <p>
     *      If no editing style is configured, then {@link #DIALOG} is assumed.
     * </p>
     */
    AS_CONFIGURED,
    /**
     * Use a dialog for the prompt
     */
    DIALOG,
    /**
     * Show the form inline, replacing the rendering of the property.
     */
    INLINE
}
