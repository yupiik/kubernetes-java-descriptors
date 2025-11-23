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
package io.yupiik.kubernetes.bindings.v1_31_8.v1;

import io.yupiik.kubernetes.bindings.v1_31_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeRuntimeHandlerFeatures implements Validable<NodeRuntimeHandlerFeatures>, Exportable {
    private Boolean recursiveReadOnlyMounts;
    private Boolean userNamespaces;

    public NodeRuntimeHandlerFeatures() {
        // no-op
    }

    public NodeRuntimeHandlerFeatures(final Boolean recursiveReadOnlyMounts,
                                      final Boolean userNamespaces) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
        this.userNamespaces = userNamespaces;
    }

    public Boolean getRecursiveReadOnlyMounts() {
        return recursiveReadOnlyMounts;
    }

    public void setRecursiveReadOnlyMounts(final Boolean recursiveReadOnlyMounts) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    }

    public Boolean getUserNamespaces() {
        return userNamespaces;
    }

    public void setUserNamespaces(final Boolean userNamespaces) {
        this.userNamespaces = userNamespaces;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                recursiveReadOnlyMounts,
                userNamespaces);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeRuntimeHandlerFeatures)) {
            return false;
        }
        final NodeRuntimeHandlerFeatures __otherCasted = (NodeRuntimeHandlerFeatures) __other;
        return Objects.equals(recursiveReadOnlyMounts, __otherCasted.recursiveReadOnlyMounts) &&
            Objects.equals(userNamespaces, __otherCasted.userNamespaces);
    }

    public NodeRuntimeHandlerFeatures recursiveReadOnlyMounts(final Boolean recursiveReadOnlyMounts) {
        this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
        return this;
    }

    public NodeRuntimeHandlerFeatures userNamespaces(final Boolean userNamespaces) {
        this.userNamespaces = userNamespaces;
        return this;
    }

    @Override
    public NodeRuntimeHandlerFeatures validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (recursiveReadOnlyMounts != null ? "\"recursiveReadOnlyMounts\":" + recursiveReadOnlyMounts : ""),
                    (userNamespaces != null ? "\"userNamespaces\":" + userNamespaces : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
