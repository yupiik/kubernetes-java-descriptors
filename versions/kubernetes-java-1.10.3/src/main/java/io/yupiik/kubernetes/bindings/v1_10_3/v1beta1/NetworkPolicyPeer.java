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
package io.yupiik.kubernetes.bindings.v1_10_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_3.Validable;
import io.yupiik.kubernetes.bindings.v1_10_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicyPeer implements Validable<NetworkPolicyPeer>, Exportable {
    private IPBlock ipBlock;
    private LabelSelector namespaceSelector;
    private LabelSelector podSelector;

    public NetworkPolicyPeer() {
        // no-op
    }

    public NetworkPolicyPeer(final IPBlock ipBlock,
                             final LabelSelector namespaceSelector,
                             final LabelSelector podSelector) {
        // no-op
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
        if (!(__other instanceof NetworkPolicyPeer)) {
            return false;
        }
        final NetworkPolicyPeer __otherCasted = (NetworkPolicyPeer) __other;
        return Objects.equals(ipBlock, __otherCasted.ipBlock) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }

    public NetworkPolicyPeer ipBlock(final IPBlock ipBlock) {
        this.ipBlock = ipBlock;
        return this;
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
                    (ipBlock != null ? "\"ipBlock\":" + ipBlock.asJson() : ""),
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (podSelector != null ? "\"podSelector\":" + podSelector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
