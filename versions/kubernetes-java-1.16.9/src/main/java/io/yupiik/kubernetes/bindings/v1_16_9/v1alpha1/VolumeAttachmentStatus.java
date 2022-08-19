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
package io.yupiik.kubernetes.bindings.v1_16_9.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_9.Validable;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeAttachmentStatus implements Validable<VolumeAttachmentStatus>, Exportable {
    private VolumeError attachError;
    private boolean attached;
    private Map<String, String> attachmentMetadata;
    private VolumeError detachError;

    public VolumeAttachmentStatus() {
        // no-op
    }

    public VolumeAttachmentStatus(final VolumeError attachError,
                                  final boolean attached,
                                  final Map<String, String> attachmentMetadata,
                                  final VolumeError detachError) {
        this.attachError = attachError;
        this.attached = attached;
        this.attachmentMetadata = attachmentMetadata;
        this.detachError = detachError;
    }

    public VolumeError getAttachError() {
        return attachError;
    }

    public void setAttachError(final VolumeError attachError) {
        this.attachError = attachError;
    }

    public boolean getAttached() {
        return attached;
    }

    public void setAttached(final boolean attached) {
        this.attached = attached;
    }

    public Map<String, String> getAttachmentMetadata() {
        return attachmentMetadata;
    }

    public void setAttachmentMetadata(final Map<String, String> attachmentMetadata) {
        this.attachmentMetadata = attachmentMetadata;
    }

    public VolumeError getDetachError() {
        return detachError;
    }

    public void setDetachError(final VolumeError detachError) {
        this.detachError = detachError;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attachError,
                attached,
                attachmentMetadata,
                detachError);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentStatus)) {
            return false;
        }
        final VolumeAttachmentStatus __otherCasted = (VolumeAttachmentStatus) __other;
        return Objects.equals(attachError, __otherCasted.attachError) &&
            Objects.equals(attached, __otherCasted.attached) &&
            Objects.equals(attachmentMetadata, __otherCasted.attachmentMetadata) &&
            Objects.equals(detachError, __otherCasted.detachError);
    }

    public VolumeAttachmentStatus attachError(final VolumeError attachError) {
        this.attachError = attachError;
        return this;
    }

    public VolumeAttachmentStatus attached(final boolean attached) {
        this.attached = attached;
        return this;
    }

    public VolumeAttachmentStatus attachmentMetadata(final Map<String, String> attachmentMetadata) {
        this.attachmentMetadata = attachmentMetadata;
        return this;
    }

    public VolumeAttachmentStatus detachError(final VolumeError detachError) {
        this.detachError = detachError;
        return this;
    }

    @Override
    public VolumeAttachmentStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (attachError != null ? "\"attachError\":" + attachError.asJson() : ""),
                    "\"attached\":" + attached,
                    (attachmentMetadata != null ? "\"attachmentMetadata\":" + attachmentMetadata.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (detachError != null ? "\"detachError\":" + detachError.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
