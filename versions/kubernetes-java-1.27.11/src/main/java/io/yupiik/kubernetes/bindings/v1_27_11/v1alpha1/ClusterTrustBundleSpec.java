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
package io.yupiik.kubernetes.bindings.v1_27_11.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_27_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_11.Validable;
import io.yupiik.kubernetes.bindings.v1_27_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClusterTrustBundleSpec implements Validable<ClusterTrustBundleSpec>, Exportable {
    private String signerName;
    private String trustBundle;

    public ClusterTrustBundleSpec() {
        // no-op
    }

    public ClusterTrustBundleSpec(final String signerName,
                                  final String trustBundle) {
        this.signerName = signerName;
        this.trustBundle = trustBundle;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(final String signerName) {
        this.signerName = signerName;
    }

    public String getTrustBundle() {
        return trustBundle;
    }

    public void setTrustBundle(final String trustBundle) {
        this.trustBundle = trustBundle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                signerName,
                trustBundle);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterTrustBundleSpec)) {
            return false;
        }
        final ClusterTrustBundleSpec __otherCasted = (ClusterTrustBundleSpec) __other;
        return Objects.equals(signerName, __otherCasted.signerName) &&
            Objects.equals(trustBundle, __otherCasted.trustBundle);
    }

    public ClusterTrustBundleSpec signerName(final String signerName) {
        this.signerName = signerName;
        return this;
    }

    public ClusterTrustBundleSpec trustBundle(final String trustBundle) {
        this.trustBundle = trustBundle;
        return this;
    }

    @Override
    public ClusterTrustBundleSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (trustBundle == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "trustBundle", "trustBundle",
                "Missing 'trustBundle' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (signerName != null ? "\"signerName\":\"" +  JsonStrings.escapeJson(signerName) + "\"" : ""),
                    (trustBundle != null ? "\"trustBundle\":\"" +  JsonStrings.escapeJson(trustBundle) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
