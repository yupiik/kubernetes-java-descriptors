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
package io.yupiik.kubernetes.bindings.v1_31_4.v1;

import io.yupiik.kubernetes.bindings.v1_31_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_4.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ImageVolumeSource implements Validable<ImageVolumeSource>, Exportable {
    private String pullPolicy;
    private String reference;

    public ImageVolumeSource() {
        // no-op
    }

    public ImageVolumeSource(final String pullPolicy,
                             final String reference) {
        this.pullPolicy = pullPolicy;
        this.reference = reference;
    }

    public String getPullPolicy() {
        return pullPolicy;
    }

    public void setPullPolicy(final String pullPolicy) {
        this.pullPolicy = pullPolicy;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(final String reference) {
        this.reference = reference;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pullPolicy,
                reference);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ImageVolumeSource)) {
            return false;
        }
        final ImageVolumeSource __otherCasted = (ImageVolumeSource) __other;
        return Objects.equals(pullPolicy, __otherCasted.pullPolicy) &&
            Objects.equals(reference, __otherCasted.reference);
    }

    public ImageVolumeSource pullPolicy(final String pullPolicy) {
        this.pullPolicy = pullPolicy;
        return this;
    }

    public ImageVolumeSource reference(final String reference) {
        this.reference = reference;
        return this;
    }

    @Override
    public ImageVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (pullPolicy != null ? "\"pullPolicy\":\"" +  JsonStrings.escapeJson(pullPolicy) + "\"" : ""),
                    (reference != null ? "\"reference\":\"" +  JsonStrings.escapeJson(reference) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
