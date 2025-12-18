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
package io.yupiik.kubernetes.bindings.v1_31_x.v1;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1.NetworkPolicyPeer implements Validable<io.k8s.api.networking.v1.NetworkPolicyPeer>, Exportable {
    private IPBlock ipBlock;
    private LabelSelector namespaceSelector;
    private LabelSelector podSelector;

    public io.k8s.api.networking.v1.NetworkPolicyPeer() {
        // no-op
    }

    public io.k8s.api.networking.v1.NetworkPolicyPeer(final IPBlock ipBlock,
                                                      final LabelSelector namespaceSelector,
                                                      final LabelSelector podSelector) {
        this.ipBlock = ipBlock;
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    public IPBlock getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(final IPBlock ipBlock) {
        this.ipBlock = ipBlock;
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
                ipBlock,
                namespaceSelector,
                podSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.NetworkPolicyPeer)) {
            return false;
        }
        final io.k8s.api.networking.v1.NetworkPolicyPeer __otherCasted = (io.k8s.api.networking.v1.NetworkPolicyPeer) __other;
        return Objects.equals(ipBlock, __otherCasted.ipBlock) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }

    public io.k8s.api.networking.v1.NetworkPolicyPeer ipBlock(final IPBlock ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }

    public io.k8s.api.networking.v1.NetworkPolicyPeer namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public io.k8s.api.networking.v1.NetworkPolicyPeer podSelector(final LabelSelector podSelector) {
        this.podSelector = podSelector;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.NetworkPolicyPeer validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ipBlock != null ? "\"ipBlock\":" + ipBlock.asJson() : ""),
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (podSelector != null ? "\"podSelector\":" + podSelector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
