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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import io.yupiik.kubernetes.bindings.v1_34_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.PersistentVolumeClaimTemplate implements Validable<io.k8s.api.core.v1.PersistentVolumeClaimTemplate>, Exportable {
    private ObjectMeta metadata;
    private PersistentVolumeClaimSpec spec;

    public io.k8s.api.core.v1.PersistentVolumeClaimTemplate() {
        // no-op
    }

    public io.k8s.api.core.v1.PersistentVolumeClaimTemplate(final ObjectMeta metadata,
                                                            final PersistentVolumeClaimSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(final PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.PersistentVolumeClaimTemplate)) {
            return false;
        }
        final io.k8s.api.core.v1.PersistentVolumeClaimTemplate __otherCasted = (io.k8s.api.core.v1.PersistentVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public io.k8s.api.core.v1.PersistentVolumeClaimTemplate metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public io.k8s.api.core.v1.PersistentVolumeClaimTemplate spec(final PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.PersistentVolumeClaimTemplate validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
