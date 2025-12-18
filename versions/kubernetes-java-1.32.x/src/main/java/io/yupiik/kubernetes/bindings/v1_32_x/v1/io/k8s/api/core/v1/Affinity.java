/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.Affinity implements Validable<io.k8s.api.core.v1.Affinity>, Exportable {
    private NodeAffinity nodeAffinity;
    private PodAffinity podAffinity;
    private PodAntiAffinity podAntiAffinity;

    public io.k8s.api.core.v1.Affinity() {
        // no-op
    }

    public io.k8s.api.core.v1.Affinity(final NodeAffinity nodeAffinity,
                                       final PodAffinity podAffinity,
                                       final PodAntiAffinity podAntiAffinity) {
        this.nodeAffinity = nodeAffinity;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
    }

    public NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(final NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(final PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    public PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(final PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeAffinity,
                podAffinity,
                podAntiAffinity);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.Affinity)) {
            return false;
        }
        final io.k8s.api.core.v1.Affinity __otherCasted = (io.k8s.api.core.v1.Affinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }

    public io.k8s.api.core.v1.Affinity nodeAffinity(final NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public io.k8s.api.core.v1.Affinity podAffinity(final PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }

    public io.k8s.api.core.v1.Affinity podAntiAffinity(final PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.Affinity validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nodeAffinity != null ? "\"nodeAffinity\":" + nodeAffinity.asJson() : ""),
                    (podAffinity != null ? "\"podAffinity\":" + podAffinity.asJson() : ""),
                    (podAntiAffinity != null ? "\"podAntiAffinity\":" + podAntiAffinity.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
