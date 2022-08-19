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
package io.yupiik.kubernetes.bindings.v1_11_3.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_11_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodPresetSpec implements Validable<PodPresetSpec>, Exportable {
    private List<EnvVar> env;
    private List<EnvFromSource> envFrom;
    private LabelSelector selector;
    private List<VolumeMount> volumeMounts;
    private List<Volume> volumes;

    public PodPresetSpec() {
        // no-op
    }

    public PodPresetSpec(final List<EnvVar> env,
                         final List<EnvFromSource> envFrom,
                         final LabelSelector selector,
                         final List<VolumeMount> volumeMounts,
                         final List<Volume> volumes) {
        this.env = env;
        this.envFrom = envFrom;
        this.selector = selector;
        this.volumeMounts = volumeMounts;
        this.volumes = volumes;
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

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<Volume> volumes) {
        this.volumes = volumes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                env,
                envFrom,
                selector,
                volumeMounts,
                volumes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetSpec)) {
            return false;
        }
        final PodPresetSpec __otherCasted = (PodPresetSpec) __other;
        return Objects.equals(env, __otherCasted.env) &&
            Objects.equals(envFrom, __otherCasted.envFrom) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }

    public PodPresetSpec env(final List<EnvVar> env) {
        this.env = env;
        return this;
    }

    public PodPresetSpec envFrom(final List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    public PodPresetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public PodPresetSpec volumeMounts(final List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public PodPresetSpec volumes(final List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public PodPresetSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (env != null ? "\"env\":" + env.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (envFrom != null ? "\"envFrom\":" + envFrom.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (volumeMounts != null ? "\"volumeMounts\":" + volumeMounts.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (volumes != null ? "\"volumes\":" + volumes.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
