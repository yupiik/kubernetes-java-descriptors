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
package io.yupiik.kubernetes.bindings.v1_23_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_8.Validable;
import io.yupiik.kubernetes.bindings.v1_23_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PersistentVolumeClaimTemplate implements Validable<PersistentVolumeClaimTemplate>, Exportable {
    private ObjectMeta metadata;
    private PersistentVolumeClaimSpec spec;

    public PersistentVolumeClaimTemplate() {
        // no-op
    }

    public PersistentVolumeClaimTemplate(final ObjectMeta metadata,
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
        if (!(__other instanceof PersistentVolumeClaimTemplate)) {
            return false;
        }
        final PersistentVolumeClaimTemplate __otherCasted = (PersistentVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public PersistentVolumeClaimTemplate metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolumeClaimTemplate spec(final PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public PersistentVolumeClaimTemplate validate() {
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
