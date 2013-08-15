package org.apache.airavata.gsi.ssh.api;/*
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

/**
 * User: AmilaJ (amilaj@apache.org)
 * Date: 8/14/13
 * Time: 3:33 PM
 */

import com.jcraft.jsch.Channel;

import java.io.OutputStream;

/**
 * Output of a certain command. TODO rethink
 */
public interface CommandOutput {

    /**
     * Gets the output of the command as an stream.
     * @param  channel Command output as a stream.
     */
    void onOutput(Channel channel);

    /**
     * Gets standard error as a output stream.
     * @return Command error as a stream.
     */
    OutputStream getStandardError();

    /**
     * The command exit code.
     * @param code The program exit code
     */
    void exitCode(int code);
}
