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
package io.yupiik.kubernetes.bindings.v1_31_2.v1;

import io.yupiik.kubernetes.bindings.v1_31_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerUser implements Validable<ContainerUser>, Exportable {
    private LinuxContainerUser linux;

    public ContainerUser() {
        // no-op
    }

    public ContainerUser(final LinuxContainerUser linux) {
        this.linux = linux;
    }

    public LinuxContainerUser getLinux() {
        return linux;
    }

    public void setLinux(final LinuxContainerUser linux) {
        this.linux = linux;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                linux);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerUser)) {
            return false;
        }
        final ContainerUser __otherCasted = (ContainerUser) __other;
        return Objects.equals(linux, __otherCasted.linux);
    }

    public ContainerUser linux(final LinuxContainerUser linux) {
        this.linux = linux;
        return this;
    }

    @Override
    public ContainerUser validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (linux != null ? "\"linux\":" + linux.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
