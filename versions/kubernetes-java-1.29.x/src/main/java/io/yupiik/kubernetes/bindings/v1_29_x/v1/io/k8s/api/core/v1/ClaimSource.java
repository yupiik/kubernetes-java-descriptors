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
package io.yupiik.kubernetes.bindings.v1_29_x.v1;

import io.yupiik.kubernetes.bindings.v1_29_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ClaimSource implements Validable<io.k8s.api.core.v1.ClaimSource>, Exportable {
    private String resourceClaimName;
    private String resourceClaimTemplateName;

    public io.k8s.api.core.v1.ClaimSource() {
        // no-op
    }

    public io.k8s.api.core.v1.ClaimSource(final String resourceClaimName,
                                          final String resourceClaimTemplateName) {
        this.resourceClaimName = resourceClaimName;
        this.resourceClaimTemplateName = resourceClaimTemplateName;
    }

    public String getResourceClaimName() {
        return resourceClaimName;
    }

    public void setResourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
    }

    public String getResourceClaimTemplateName() {
        return resourceClaimTemplateName;
    }

    public void setResourceClaimTemplateName(final String resourceClaimTemplateName) {
        this.resourceClaimTemplateName = resourceClaimTemplateName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceClaimName,
                resourceClaimTemplateName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ClaimSource)) {
            return false;
        }
        final io.k8s.api.core.v1.ClaimSource __otherCasted = (io.k8s.api.core.v1.ClaimSource) __other;
        return Objects.equals(resourceClaimName, __otherCasted.resourceClaimName) &&
            Objects.equals(resourceClaimTemplateName, __otherCasted.resourceClaimTemplateName);
    }

    public io.k8s.api.core.v1.ClaimSource resourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
        return this;
    }

    public io.k8s.api.core.v1.ClaimSource resourceClaimTemplateName(final String resourceClaimTemplateName) {
        this.resourceClaimTemplateName = resourceClaimTemplateName;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ClaimSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (resourceClaimName != null ? "\"resourceClaimName\":\"" +  JsonStrings.escapeJson(resourceClaimName) + "\"" : ""),
                    (resourceClaimTemplateName != null ? "\"resourceClaimTemplateName\":\"" +  JsonStrings.escapeJson(resourceClaimTemplateName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
