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
package io.yupiik.kubernetes.bindings.v1_19_3.v1;

import io.yupiik.kubernetes.bindings.v1_19_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_3.Validable;
import io.yupiik.kubernetes.bindings.v1_19_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CSIDriverSpec implements Validable<CSIDriverSpec>, Exportable {
    private Boolean attachRequired;
    private String fsGroupPolicy;
    private Boolean podInfoOnMount;
    private Boolean storageCapacity;
    private List<String> volumeLifecycleModes;

    public CSIDriverSpec() {
        // no-op
    }

    public CSIDriverSpec(final Boolean attachRequired,
                         final String fsGroupPolicy,
                         final Boolean podInfoOnMount,
                         final Boolean storageCapacity,
                         final List<String> volumeLifecycleModes) {
        // no-op
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

    public Boolean getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(final Boolean storageCapacity) {
        this.storageCapacity = storageCapacity;
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
                storageCapacity,
                volumeLifecycleModes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriverSpec)) {
            return false;
        }
        final CSIDriverSpec __otherCasted = (CSIDriverSpec) __other;
        return Objects.equals(attachRequired, __otherCasted.attachRequired) &&
            Objects.equals(fsGroupPolicy, __otherCasted.fsGroupPolicy) &&
            Objects.equals(podInfoOnMount, __otherCasted.podInfoOnMount) &&
            Objects.equals(storageCapacity, __otherCasted.storageCapacity) &&
            Objects.equals(volumeLifecycleModes, __otherCasted.volumeLifecycleModes);
    }

    public CSIDriverSpec attachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
        return this;
    }

    public CSIDriverSpec fsGroupPolicy(final String fsGroupPolicy) {
        this.fsGroupPolicy = fsGroupPolicy;
        return this;
    }

    public CSIDriverSpec podInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
        return this;
    }

    public CSIDriverSpec storageCapacity(final Boolean storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    public CSIDriverSpec volumeLifecycleModes(final List<String> volumeLifecycleModes) {
        this.volumeLifecycleModes = volumeLifecycleModes;
        return this;
    }

    @Override
    public CSIDriverSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (attachRequired != null ? "\"attachRequired\":" + attachRequired : ""),
                    (fsGroupPolicy != null ? "\"fsGroupPolicy\":\"" +  JsonStrings.escapeJson(fsGroupPolicy) + "\"" : ""),
                    (podInfoOnMount != null ? "\"podInfoOnMount\":" + podInfoOnMount : ""),
                    (storageCapacity != null ? "\"storageCapacity\":" + storageCapacity : ""),
                    (volumeLifecycleModes != null ? "\"volumeLifecycleModes\":" + volumeLifecycleModes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
