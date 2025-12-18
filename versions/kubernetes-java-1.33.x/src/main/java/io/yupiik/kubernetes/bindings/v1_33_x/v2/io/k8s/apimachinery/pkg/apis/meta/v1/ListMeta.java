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
package io.yupiik.kubernetes.bindings.v1_33_x.v2;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta implements Validable<io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta>, Exportable {
    @JsonbProperty("continue")
    private String continueValue;
    private Integer remainingItemCount;
    private String resourceVersion;
    private String selfLink;

    public io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta() {
        // no-op
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta(final String continueValue,
                                                         final Integer remainingItemCount,
                                                         final String resourceVersion,
                                                         final String selfLink) {
        this.continueValue = continueValue;
        this.remainingItemCount = remainingItemCount;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
    }

    public String getContinueValue() {
        return continueValue;
    }

    public void setContinueValue(final String continueValue) {
        this.continueValue = continueValue;
    }

    public Integer getRemainingItemCount() {
        return remainingItemCount;
    }

    public void setRemainingItemCount(final Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(final String selfLink) {
        this.selfLink = selfLink;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                continueValue,
                remainingItemCount,
                resourceVersion,
                selfLink);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta)) {
            return false;
        }
        final io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta __otherCasted = (io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta) __other;
        return Objects.equals(continueValue, __otherCasted.continueValue) &&
            Objects.equals(remainingItemCount, __otherCasted.remainingItemCount) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink);
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta continueValue(final String continueValue) {
        this.continueValue = continueValue;
        return this;
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta remainingItemCount(final Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
        return this;
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta selfLink(final String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    @Override
    public io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (continueValue != null ? "\"continue\":\"" +  JsonStrings.escapeJson(continueValue) + "\"" : ""),
                    (remainingItemCount != null ? "\"remainingItemCount\":" + remainingItemCount : ""),
                    (resourceVersion != null ? "\"resourceVersion\":\"" +  JsonStrings.escapeJson(resourceVersion) + "\"" : ""),
                    (selfLink != null ? "\"selfLink\":\"" +  JsonStrings.escapeJson(selfLink) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
