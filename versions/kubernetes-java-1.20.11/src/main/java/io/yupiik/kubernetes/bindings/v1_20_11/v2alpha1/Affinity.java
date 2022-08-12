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
package io.yupiik.kubernetes.bindings.v1_20_11.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_20_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_11.Validable;
import io.yupiik.kubernetes.bindings.v1_20_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Affinity implements Validable<Affinity>, Exportable {
    private NodeAffinity nodeAffinity;
    private PodAffinity podAffinity;
    private PodAntiAffinity podAntiAffinity;

    public Affinity() {
        // no-op
    }

    public Affinity(final NodeAffinity nodeAffinity,
                    final PodAffinity podAffinity,
                    final PodAntiAffinity podAntiAffinity) {
        // no-op
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
        if (!(__other instanceof Affinity)) {
            return false;
        }
        final Affinity __otherCasted = (Affinity) __other;
        return Objects.equals(nodeAffinity, __otherCasted.nodeAffinity) &&
            Objects.equals(podAffinity, __otherCasted.podAffinity) &&
            Objects.equals(podAntiAffinity, __otherCasted.podAntiAffinity);
    }

    public Affinity nodeAffinity(final NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public Affinity podAffinity(final PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }

    public Affinity podAntiAffinity(final PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }

    @Override
    public Affinity validate() {
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
