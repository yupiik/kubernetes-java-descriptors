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
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.FCVolumeSource implements Validable<io.k8s.api.core.v1.FCVolumeSource>, Exportable {
    private String fsType;
    private Integer lun;
    private Boolean readOnly;
    private List<String> targetWWNs;
    private List<String> wwids;

    public io.k8s.api.core.v1.FCVolumeSource() {
        // no-op
    }

    public io.k8s.api.core.v1.FCVolumeSource(final String fsType,
                                             final Integer lun,
                                             final Boolean readOnly,
                                             final List<String> targetWWNs,
                                             final List<String> wwids) {
        this.fsType = fsType;
        this.lun = lun;
        this.readOnly = readOnly;
        this.targetWWNs = targetWWNs;
        this.wwids = wwids;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Integer getLun() {
        return lun;
    }

    public void setLun(final Integer lun) {
        this.lun = lun;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public List<String> getTargetWWNs() {
        return targetWWNs;
    }

    public void setTargetWWNs(final List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
    }

    public List<String> getWwids() {
        return wwids;
    }

    public void setWwids(final List<String> wwids) {
        this.wwids = wwids;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsType,
                lun,
                readOnly,
                targetWWNs,
                wwids);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.FCVolumeSource)) {
            return false;
        }
        final io.k8s.api.core.v1.FCVolumeSource __otherCasted = (io.k8s.api.core.v1.FCVolumeSource) __other;
        return Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(lun, __otherCasted.lun) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(targetWWNs, __otherCasted.targetWWNs) &&
            Objects.equals(wwids, __otherCasted.wwids);
    }

    public io.k8s.api.core.v1.FCVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public io.k8s.api.core.v1.FCVolumeSource lun(final Integer lun) {
        this.lun = lun;
        return this;
    }

    public io.k8s.api.core.v1.FCVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public io.k8s.api.core.v1.FCVolumeSource targetWWNs(final List<String> targetWWNs) {
        this.targetWWNs = targetWWNs;
        return this;
    }

    public io.k8s.api.core.v1.FCVolumeSource wwids(final List<String> wwids) {
        this.wwids = wwids;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.FCVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (lun != null ? "\"lun\":" + lun : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (targetWWNs != null ? "\"targetWWNs\":" + targetWWNs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (wwids != null ? "\"wwids\":" + wwids.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
