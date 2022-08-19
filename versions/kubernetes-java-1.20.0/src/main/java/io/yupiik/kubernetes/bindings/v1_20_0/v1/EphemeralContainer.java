/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import io.yupiik.kubernetes.bindings.v1_20_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_0.Validable;
import io.yupiik.kubernetes.bindings.v1_20_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EphemeralContainer implements Validable<EphemeralContainer>, Exportable {
    private List<String> args;
    private List<String> command;
    private List<EnvVar> env;
    private List<EnvFromSource> envFrom;
    private String image;
    private String imagePullPolicy;
    private Lifecycle lifecycle;
    private Probe livenessProbe;
    private String name;
    private List<ContainerPort> ports;
    private Probe readinessProbe;
    private ResourceRequirements resources;
    private SecurityContext securityContext;
    private Probe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<VolumeDevice> volumeDevices;
    private List<VolumeMount> volumeMounts;
    private String workingDir;

    public EphemeralContainer() {
        // no-op
    }

    public EphemeralContainer(final List<String> args,
                              final List<String> command,
                              final List<EnvVar> env,
                              final List<EnvFromSource> envFrom,
                              final String image,
                              final String imagePullPolicy,
                              final Lifecycle lifecycle,
                              final Probe livenessProbe,
                              final String name,
                              final List<ContainerPort> ports,
                              final Probe readinessProbe,
                              final ResourceRequirements resources,
                              final SecurityContext securityContext,
                              final Probe startupProbe,
                              final Boolean stdin,
                              final Boolean stdinOnce,
                              final String targetContainerName,
                              final String terminationMessagePath,
                              final String terminationMessagePolicy,
                              final Boolean tty,
                              final List<VolumeDevice> volumeDevices,
                              final List<VolumeMount> volumeMounts,
                              final String workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.lifecycle = lifecycle;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.stdin = stdin;
        this.stdinOnce = stdinOnce;
        this.targetContainerName = targetContainerName;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.tty = tty;
        this.volumeDevices = volumeDevices;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(final List<String> args) {
        this.args = args;
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(final List<String> command) {
        this.command = command;
    }

    public List<EnvVar> getEnv() {
        return env;
    }

    public void setEnv(final List<EnvVar> env) {
        this.env = env;
    }

    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(final String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ContainerPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<ContainerPort> ports) {
        this.ports = ports;
    }

    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ResourceRequirements getResources() {
        return resources;
    }

    public void setResources(final ResourceRequirements resources) {
        this.resources = resources;
    }

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public Probe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final Probe startupProbe) {
        this.startupProbe = startupProbe;
    }

    public Boolean getStdin() {
        return stdin;
    }

    public void setStdin(final Boolean stdin) {
        this.stdin = stdin;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(final Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public String getTargetContainerName() {
        return targetContainerName;
    }

    public void setTargetContainerName(final String targetContainerName) {
        this.targetContainerName = targetContainerName;
    }

    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    public void setTerminationMessagePath(final String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(final String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(final Boolean tty) {
        this.tty = tty;
    }

    public List<VolumeDevice> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(final String workingDir) {
        this.workingDir = workingDir;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                args,
                command,
                env,
                envFrom,
                image,
                imagePullPolicy,
                lifecycle,
                livenessProbe,
                name,
                ports,
                readinessProbe,
                resources,
                securityContext,
                startupProbe,
                stdin,
                stdinOnce,
                targetContainerName,
                terminationMessagePath,
                terminationMessagePolicy,
                tty,
                volumeDevices,
                volumeMounts,
                workingDir);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EphemeralContainer)) {
            return false;
        }
        final EphemeralContainer __otherCasted = (EphemeralContainer) __other;
        return Objects.equals(args, __otherCasted.args) &&
            Objects.equals(command, __otherCasted.command) &&
            Objects.equals(env, __otherCasted.env) &&
            Objects.equals(envFrom, __otherCasted.envFrom) &&
            Objects.equals(image, __otherCasted.image) &&
            Objects.equals(imagePullPolicy, __otherCasted.imagePullPolicy) &&
            Objects.equals(lifecycle, __otherCasted.lifecycle) &&
            Objects.equals(livenessProbe, __otherCasted.livenessProbe) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(readinessProbe, __otherCasted.readinessProbe) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(securityContext, __otherCasted.securityContext) &&
            Objects.equals(startupProbe, __otherCasted.startupProbe) &&
            Objects.equals(stdin, __otherCasted.stdin) &&
            Objects.equals(stdinOnce, __otherCasted.stdinOnce) &&
            Objects.equals(targetContainerName, __otherCasted.targetContainerName) &&
            Objects.equals(terminationMessagePath, __otherCasted.terminationMessagePath) &&
            Objects.equals(terminationMessagePolicy, __otherCasted.terminationMessagePolicy) &&
            Objects.equals(tty, __otherCasted.tty) &&
            Objects.equals(volumeDevices, __otherCasted.volumeDevices) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(workingDir, __otherCasted.workingDir);
    }

    public EphemeralContainer args(final List<String> args) {
        this.args = args;
        return this;
    }

    public EphemeralContainer command(final List<String> command) {
        this.command = command;
        return this;
    }

    public EphemeralContainer env(final List<EnvVar> env) {
        this.env = env;
        return this;
    }

    public EphemeralContainer envFrom(final List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    public EphemeralContainer image(final String image) {
        this.image = image;
        return this;
    }

    public EphemeralContainer imagePullPolicy(final String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    public EphemeralContainer lifecycle(final Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public EphemeralContainer livenessProbe(final Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public EphemeralContainer name(final String name) {
        this.name = name;
        return this;
    }

    public EphemeralContainer ports(final List<ContainerPort> ports) {
        this.ports = ports;
        return this;
    }

    public EphemeralContainer readinessProbe(final Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public EphemeralContainer resources(final ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public EphemeralContainer securityContext(final SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public EphemeralContainer startupProbe(final Probe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    public EphemeralContainer stdin(final Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    public EphemeralContainer stdinOnce(final Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    public EphemeralContainer targetContainerName(final String targetContainerName) {
        this.targetContainerName = targetContainerName;
        return this;
    }

    public EphemeralContainer terminationMessagePath(final String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    public EphemeralContainer terminationMessagePolicy(final String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    public EphemeralContainer tty(final Boolean tty) {
        this.tty = tty;
        return this;
    }

    public EphemeralContainer volumeDevices(final List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }

    public EphemeralContainer volumeMounts(final List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public EphemeralContainer workingDir(final String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    @Override
    public EphemeralContainer validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (args != null ? "\"args\":" + args.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (command != null ? "\"command\":" + command.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (env != null ? "\"env\":" + env.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (envFrom != null ? "\"envFrom\":" + envFrom.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (image != null ? "\"image\":\"" +  JsonStrings.escapeJson(image) + "\"" : ""),
                    (imagePullPolicy != null ? "\"imagePullPolicy\":\"" +  JsonStrings.escapeJson(imagePullPolicy) + "\"" : ""),
                    (lifecycle != null ? "\"lifecycle\":" + lifecycle.asJson() : ""),
                    (livenessProbe != null ? "\"livenessProbe\":" + livenessProbe.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (ports != null ? "\"ports\":" + ports.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (readinessProbe != null ? "\"readinessProbe\":" + readinessProbe.asJson() : ""),
                    (resources != null ? "\"resources\":" + resources.asJson() : ""),
                    (securityContext != null ? "\"securityContext\":" + securityContext.asJson() : ""),
                    (startupProbe != null ? "\"startupProbe\":" + startupProbe.asJson() : ""),
                    (stdin != null ? "\"stdin\":" + stdin : ""),
                    (stdinOnce != null ? "\"stdinOnce\":" + stdinOnce : ""),
                    (targetContainerName != null ? "\"targetContainerName\":\"" +  JsonStrings.escapeJson(targetContainerName) + "\"" : ""),
                    (terminationMessagePath != null ? "\"terminationMessagePath\":\"" +  JsonStrings.escapeJson(terminationMessagePath) + "\"" : ""),
                    (terminationMessagePolicy != null ? "\"terminationMessagePolicy\":\"" +  JsonStrings.escapeJson(terminationMessagePolicy) + "\"" : ""),
                    (tty != null ? "\"tty\":" + tty : ""),
                    (volumeDevices != null ? "\"volumeDevices\":" + volumeDevices.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (volumeMounts != null ? "\"volumeMounts\":" + volumeMounts.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (workingDir != null ? "\"workingDir\":\"" +  JsonStrings.escapeJson(workingDir) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
