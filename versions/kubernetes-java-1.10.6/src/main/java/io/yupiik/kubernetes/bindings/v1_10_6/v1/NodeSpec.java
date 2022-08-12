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
package io.yupiik.kubernetes.bindings.v1_10_6.v1;

import io.yupiik.kubernetes.bindings.v1_10_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_6.Validable;
import io.yupiik.kubernetes.bindings.v1_10_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeSpec implements Validable<NodeSpec>, Exportable {
    private NodeConfigSource configSource;
    private String externalID;
    private String podCIDR;
    private String providerID;
    private List<Taint> taints;
    private Boolean unschedulable;

    public NodeSpec() {
        // no-op
    }

    public NodeSpec(final NodeConfigSource configSource,
                    final String externalID,
                    final String podCIDR,
                    final String providerID,
                    final List<Taint> taints,
                    final Boolean unschedulable) {
        // no-op
    }

    public NodeConfigSource getConfigSource() {
        return configSource;
    }

    public void setConfigSource(final NodeConfigSource configSource) {
        this.configSource = configSource;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(final String externalID) {
        this.externalID = externalID;
    }

    public String getPodCIDR() {
        return podCIDR;
    }

    public void setPodCIDR(final String podCIDR) {
        this.podCIDR = podCIDR;
    }

    public String getProviderID() {
        return providerID;
    }

    public void setProviderID(final String providerID) {
        this.providerID = providerID;
    }

    public List<Taint> getTaints() {
        return taints;
    }

    public void setTaints(final List<Taint> taints) {
        this.taints = taints;
    }

    public Boolean getUnschedulable() {
        return unschedulable;
    }

    public void setUnschedulable(final Boolean unschedulable) {
        this.unschedulable = unschedulable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configSource,
                externalID,
                podCIDR,
                providerID,
                taints,
                unschedulable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSpec)) {
            return false;
        }
        final NodeSpec __otherCasted = (NodeSpec) __other;
        return Objects.equals(configSource, __otherCasted.configSource) &&
            Objects.equals(externalID, __otherCasted.externalID) &&
            Objects.equals(podCIDR, __otherCasted.podCIDR) &&
            Objects.equals(providerID, __otherCasted.providerID) &&
            Objects.equals(taints, __otherCasted.taints) &&
            Objects.equals(unschedulable, __otherCasted.unschedulable);
    }

    public NodeSpec configSource(final NodeConfigSource configSource) {
        this.configSource = configSource;
        return this;
    }

    public NodeSpec externalID(final String externalID) {
        this.externalID = externalID;
        return this;
    }

    public NodeSpec podCIDR(final String podCIDR) {
        this.podCIDR = podCIDR;
        return this;
    }

    public NodeSpec providerID(final String providerID) {
        this.providerID = providerID;
        return this;
    }

    public NodeSpec taints(final List<Taint> taints) {
        this.taints = taints;
        return this;
    }

    public NodeSpec unschedulable(final Boolean unschedulable) {
        this.unschedulable = unschedulable;
        return this;
    }

    @Override
    public NodeSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (configSource != null ? "\"configSource\":" + configSource.asJson() : ""),
                    (externalID != null ? "\"externalID\":\"" +  JsonStrings.escapeJson(externalID) + "\"" : ""),
                    (podCIDR != null ? "\"podCIDR\":\"" +  JsonStrings.escapeJson(podCIDR) + "\"" : ""),
                    (providerID != null ? "\"providerID\":\"" +  JsonStrings.escapeJson(providerID) + "\"" : ""),
                    (taints != null ? "\"taints\":" + taints.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (unschedulable != null ? "\"unschedulable\":" + unschedulable : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
