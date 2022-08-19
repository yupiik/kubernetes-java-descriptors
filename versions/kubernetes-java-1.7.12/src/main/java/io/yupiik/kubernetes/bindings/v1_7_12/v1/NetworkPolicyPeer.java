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
package io.yupiik.kubernetes.bindings.v1_7_12.v1;

import io.yupiik.kubernetes.bindings.v1_7_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_12.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicyPeer implements Validable<NetworkPolicyPeer>, Exportable {
    private LabelSelector namespaceSelector;
    private LabelSelector podSelector;

    public NetworkPolicyPeer() {
        // no-op
    }

    public NetworkPolicyPeer(final LabelSelector namespaceSelector,
                             final LabelSelector podSelector) {
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public LabelSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final LabelSelector podSelector) {
        this.podSelector = podSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namespaceSelector,
                podSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyPeer)) {
            return false;
        }
        final NetworkPolicyPeer __otherCasted = (NetworkPolicyPeer) __other;
        return Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }

    public NetworkPolicyPeer namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public NetworkPolicyPeer podSelector(final LabelSelector podSelector) {
        this.podSelector = podSelector;
        return this;
    }

    @Override
    public NetworkPolicyPeer validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (podSelector != null ? "\"podSelector\":" + podSelector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
