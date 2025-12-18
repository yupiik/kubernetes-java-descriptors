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
package io.yupiik.kubernetes.bindings.v1_33_x.v1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.LinuxContainerUser implements Validable<io.k8s.api.core.v1.LinuxContainerUser>, Exportable {
    private int gid;
    private List<Integer> supplementalGroups;
    private int uid;

    public io.k8s.api.core.v1.LinuxContainerUser() {
        // no-op
    }

    public io.k8s.api.core.v1.LinuxContainerUser(final int gid,
                                                 final List<Integer> supplementalGroups,
                                                 final int uid) {
        this.gid = gid;
        this.supplementalGroups = supplementalGroups;
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(final int gid) {
        this.gid = gid;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(final int uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                gid,
                supplementalGroups,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.LinuxContainerUser)) {
            return false;
        }
        final io.k8s.api.core.v1.LinuxContainerUser __otherCasted = (io.k8s.api.core.v1.LinuxContainerUser) __other;
        return Objects.equals(gid, __otherCasted.gid) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public io.k8s.api.core.v1.LinuxContainerUser gid(final int gid) {
        this.gid = gid;
        return this;
    }

    public io.k8s.api.core.v1.LinuxContainerUser supplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
        return this;
    }

    public io.k8s.api.core.v1.LinuxContainerUser uid(final int uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.LinuxContainerUser validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"gid\":" + gid,
                    (supplementalGroups != null ? "\"supplementalGroups\":" + supplementalGroups.stream().map(__it -> __it == null ? "null" : String.valueOf(__it)).collect(joining(",", "[", "]")) : ""),
                    "\"uid\":" + uid)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
