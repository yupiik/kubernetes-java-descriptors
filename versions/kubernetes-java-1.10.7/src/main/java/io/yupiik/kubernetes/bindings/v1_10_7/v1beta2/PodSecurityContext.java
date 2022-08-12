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
package io.yupiik.kubernetes.bindings.v1_10_7.v1beta2;

import io.yupiik.kubernetes.bindings.v1_10_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_7.Validable;
import io.yupiik.kubernetes.bindings.v1_10_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodSecurityContext implements Validable<PodSecurityContext>, Exportable {
    private Integer fsGroup;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private SELinuxOptions seLinuxOptions;
    private List<Integer> supplementalGroups;

    public PodSecurityContext() {
        // no-op
    }

    public PodSecurityContext(final Integer fsGroup,
                              final Integer runAsGroup,
                              final Boolean runAsNonRoot,
                              final Integer runAsUser,
                              final SELinuxOptions seLinuxOptions,
                              final List<Integer> supplementalGroups) {
        // no-op
    }

    public Integer getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(final Integer fsGroup) {
        this.fsGroup = fsGroup;
    }

    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(final Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    public void setRunAsNonRoot(final Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    public Integer getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fsGroup,
                runAsGroup,
                runAsNonRoot,
                runAsUser,
                seLinuxOptions,
                supplementalGroups);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityContext)) {
            return false;
        }
        final PodSecurityContext __otherCasted = (PodSecurityContext) __other;
        return Objects.equals(fsGroup, __otherCasted.fsGroup) &&
            Objects.equals(runAsGroup, __otherCasted.runAsGroup) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups);
    }

    public PodSecurityContext fsGroup(final Integer fsGroup) {
        this.fsGroup = fsGroup;
        return this;
    }

    public PodSecurityContext runAsGroup(final Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    public PodSecurityContext runAsNonRoot(final Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    public PodSecurityContext runAsUser(final Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public PodSecurityContext seLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    public PodSecurityContext supplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
        return this;
    }

    @Override
    public PodSecurityContext validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fsGroup != null ? "\"fsGroup\":" + fsGroup : ""),
                    (runAsGroup != null ? "\"runAsGroup\":" + runAsGroup : ""),
                    (runAsNonRoot != null ? "\"runAsNonRoot\":" + runAsNonRoot : ""),
                    (runAsUser != null ? "\"runAsUser\":" + runAsUser : ""),
                    (seLinuxOptions != null ? "\"seLinuxOptions\":" + seLinuxOptions.asJson() : ""),
                    (supplementalGroups != null ? "\"supplementalGroups\":" + supplementalGroups.stream().map(__it -> __it == null ? "null" : String.valueOf(__it)).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
