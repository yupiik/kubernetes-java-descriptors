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
package io.yupiik.kubernetes.bindings.v1_28_4.v1;

import io.yupiik.kubernetes.bindings.v1_28_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_4.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClaimSource implements Validable<ClaimSource>, Exportable {
    private String resourceClaimName;
    private String resourceClaimTemplateName;

    public ClaimSource() {
        // no-op
    }

    public ClaimSource(final String resourceClaimName,
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
        if (!(__other instanceof ClaimSource)) {
            return false;
        }
        final ClaimSource __otherCasted = (ClaimSource) __other;
        return Objects.equals(resourceClaimName, __otherCasted.resourceClaimName) &&
            Objects.equals(resourceClaimTemplateName, __otherCasted.resourceClaimTemplateName);
    }

    public ClaimSource resourceClaimName(final String resourceClaimName) {
        this.resourceClaimName = resourceClaimName;
        return this;
    }

    public ClaimSource resourceClaimTemplateName(final String resourceClaimTemplateName) {
        this.resourceClaimTemplateName = resourceClaimTemplateName;
        return this;
    }

    @Override
    public ClaimSource validate() {
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
