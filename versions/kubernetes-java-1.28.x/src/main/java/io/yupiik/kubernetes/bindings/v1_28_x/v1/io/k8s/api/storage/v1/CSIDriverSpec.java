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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.storage.v1.CSIDriverSpec implements Validable<io.k8s.api.storage.v1.CSIDriverSpec>, Exportable {
    private Boolean attachRequired;
    private String fsGroupPolicy;
    private Boolean podInfoOnMount;
    private Boolean requiresRepublish;
    private Boolean seLinuxMount;
    private Boolean storageCapacity;
    private List<TokenRequest> tokenRequests;
    private List<String> volumeLifecycleModes;

    public io.k8s.api.storage.v1.CSIDriverSpec() {
        // no-op
    }

    public io.k8s.api.storage.v1.CSIDriverSpec(final Boolean attachRequired,
                                               final String fsGroupPolicy,
                                               final Boolean podInfoOnMount,
                                               final Boolean requiresRepublish,
                                               final Boolean seLinuxMount,
                                               final Boolean storageCapacity,
                                               final List<TokenRequest> tokenRequests,
                                               final List<String> volumeLifecycleModes) {
        this.attachRequired = attachRequired;
        this.fsGroupPolicy = fsGroupPolicy;
        this.podInfoOnMount = podInfoOnMount;
        this.requiresRepublish = requiresRepublish;
        this.seLinuxMount = seLinuxMount;
        this.storageCapacity = storageCapacity;
        this.tokenRequests = tokenRequests;
        this.volumeLifecycleModes = volumeLifecycleModes;
    }

    public Boolean getAttachRequired() {
        return attachRequired;
    }

    public void setAttachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
    }

    public String getFsGroupPolicy() {
        return fsGroupPolicy;
    }

    public void setFsGroupPolicy(final String fsGroupPolicy) {
        this.fsGroupPolicy = fsGroupPolicy;
    }

    public Boolean getPodInfoOnMount() {
        return podInfoOnMount;
    }

    public void setPodInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
    }

    public Boolean getRequiresRepublish() {
        return requiresRepublish;
    }

    public void setRequiresRepublish(final Boolean requiresRepublish) {
        this.requiresRepublish = requiresRepublish;
    }

    public Boolean getSeLinuxMount() {
        return seLinuxMount;
    }

    public void setSeLinuxMount(final Boolean seLinuxMount) {
        this.seLinuxMount = seLinuxMount;
    }

    public Boolean getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(final Boolean storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public List<TokenRequest> getTokenRequests() {
        return tokenRequests;
    }

    public void setTokenRequests(final List<TokenRequest> tokenRequests) {
        this.tokenRequests = tokenRequests;
    }

    public List<String> getVolumeLifecycleModes() {
        return volumeLifecycleModes;
    }

    public void setVolumeLifecycleModes(final List<String> volumeLifecycleModes) {
        this.volumeLifecycleModes = volumeLifecycleModes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attachRequired,
                fsGroupPolicy,
                podInfoOnMount,
                requiresRepublish,
                seLinuxMount,
                storageCapacity,
                tokenRequests,
                volumeLifecycleModes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.storage.v1.CSIDriverSpec)) {
            return false;
        }
        final io.k8s.api.storage.v1.CSIDriverSpec __otherCasted = (io.k8s.api.storage.v1.CSIDriverSpec) __other;
        return Objects.equals(attachRequired, __otherCasted.attachRequired) &&
            Objects.equals(fsGroupPolicy, __otherCasted.fsGroupPolicy) &&
            Objects.equals(podInfoOnMount, __otherCasted.podInfoOnMount) &&
            Objects.equals(requiresRepublish, __otherCasted.requiresRepublish) &&
            Objects.equals(seLinuxMount, __otherCasted.seLinuxMount) &&
            Objects.equals(storageCapacity, __otherCasted.storageCapacity) &&
            Objects.equals(tokenRequests, __otherCasted.tokenRequests) &&
            Objects.equals(volumeLifecycleModes, __otherCasted.volumeLifecycleModes);
    }

    public io.k8s.api.storage.v1.CSIDriverSpec attachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
        return this;
    }

    public io.k8s.api.storage.v1.CSIDriverSpec fsGroupPolicy(final String fsGroupPolicy) {
        this.fsGroupPolicy = fsGroupPolicy;
        return this;
    }

    public io.k8s.api.storage.v1.CSIDriverSpec podInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
        return this;
    }

    public io.k8s.api.storage.v1.CSIDriverSpec requiresRepublish(final Boolean requiresRepublish) {
        this.requiresRepublish = requiresRepublish;
        return this;
    }

    public io.k8s.api.storage.v1.CSIDriverSpec seLinuxMount(final Boolean seLinuxMount) {
        this.seLinuxMount = seLinuxMount;
        return this;
    }

    public io.k8s.api.storage.v1.CSIDriverSpec storageCapacity(final Boolean storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    public io.k8s.api.storage.v1.CSIDriverSpec tokenRequests(final List<TokenRequest> tokenRequests) {
        this.tokenRequests = tokenRequests;
        return this;
    }

    public io.k8s.api.storage.v1.CSIDriverSpec volumeLifecycleModes(final List<String> volumeLifecycleModes) {
        this.volumeLifecycleModes = volumeLifecycleModes;
        return this;
    }

    @Override
    public io.k8s.api.storage.v1.CSIDriverSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (attachRequired != null ? "\"attachRequired\":" + attachRequired : ""),
                    (fsGroupPolicy != null ? "\"fsGroupPolicy\":\"" +  JsonStrings.escapeJson(fsGroupPolicy) + "\"" : ""),
                    (podInfoOnMount != null ? "\"podInfoOnMount\":" + podInfoOnMount : ""),
                    (requiresRepublish != null ? "\"requiresRepublish\":" + requiresRepublish : ""),
                    (seLinuxMount != null ? "\"seLinuxMount\":" + seLinuxMount : ""),
                    (storageCapacity != null ? "\"storageCapacity\":" + storageCapacity : ""),
                    (tokenRequests != null ? "\"tokenRequests\":" + tokenRequests.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (volumeLifecycleModes != null ? "\"volumeLifecycleModes\":" + volumeLifecycleModes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
