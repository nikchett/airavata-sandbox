/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.services.registry.rest.resourcemappings;

import org.apache.airavata.registry.api.ProjectsRegistry;
import org.apache.airavata.registry.api.WorkspaceProject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WorkspaceProjectMapping {
    private String projectName;
    private Experiment[] experimentsList;

//    private ProjectsRegistry projectsRegistry;

    public WorkspaceProjectMapping() {
    }

    public WorkspaceProjectMapping(String projectName) {
        this.projectName = projectName;
//        this.projectsRegistry = projectsRegistry;
    }

    public String getProjectName() {
        return projectName;
    }

//    public ProjectsRegistry getProjectsRegistry() {
//        return projectsRegistry;
//    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Experiment[] getExperimentsList() {
        return experimentsList;
    }

    public void setExperimentsList(Experiment[] experimentsList) {
        this.experimentsList = experimentsList;
    }

    //    public void setProjectsRegistry(ProjectsRegistry projectsRegistry) {
//        this.projectsRegistry = projectsRegistry;
//    }
}