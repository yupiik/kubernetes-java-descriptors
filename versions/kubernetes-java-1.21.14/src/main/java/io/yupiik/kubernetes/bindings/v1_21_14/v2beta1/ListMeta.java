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
package io.yupiik.kubernetes.bindings.v1_21_14.v2beta1;

import io.yupiik.kubernetes.bindings.v1_21_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_14.Validable;
import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ListMeta implements Validable<ListMeta>, Exportable {
    @JsonbProperty("continue")
    private String continueValue;
    private Integer remainingItemCount;
    private String resourceVersion;
    private String selfLink;

    public ListMeta() {
        // no-op
    }

    public ListMeta(final String continueValue,
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
        if (!(__other instanceof ListMeta)) {
            return false;
        }
        final ListMeta __otherCasted = (ListMeta) __other;
        return Objects.equals(continueValue, __otherCasted.continueValue) &&
            Objects.equals(remainingItemCount, __otherCasted.remainingItemCount) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink);
    }

    public ListMeta continueValue(final String continueValue) {
        this.continueValue = continueValue;
        return this;
    }

    public ListMeta remainingItemCount(final Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
        return this;
    }

    public ListMeta resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ListMeta selfLink(final String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    @Override
    public ListMeta validate() {
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
