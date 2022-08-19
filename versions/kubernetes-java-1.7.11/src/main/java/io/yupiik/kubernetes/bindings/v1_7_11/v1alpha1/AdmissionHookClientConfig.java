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
package io.yupiik.kubernetes.bindings.v1_7_11.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_7_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_11.Validable;
import io.yupiik.kubernetes.bindings.v1_7_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AdmissionHookClientConfig implements Validable<AdmissionHookClientConfig>, Exportable {
    private String caBundle;
    private ServiceReference service;

    public AdmissionHookClientConfig() {
        // no-op
    }

    public AdmissionHookClientConfig(final String caBundle,
                                     final ServiceReference service) {
        this.caBundle = caBundle;
        this.service = service;
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public ServiceReference getService() {
        return service;
    }

    public void setService(final ServiceReference service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                caBundle,
                service);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AdmissionHookClientConfig)) {
            return false;
        }
        final AdmissionHookClientConfig __otherCasted = (AdmissionHookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service);
    }

    public AdmissionHookClientConfig caBundle(final String caBundle) {
        this.caBundle = caBundle;
        return this;
    }

    public AdmissionHookClientConfig service(final ServiceReference service) {
        this.service = service;
        return this;
    }

    @Override
    public AdmissionHookClientConfig validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (caBundle == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "caBundle", "caBundle",
                "Missing 'caBundle' attribute.", true));
        }
        if (service == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "service", "service",
                "Missing 'service' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (caBundle != null ? "\"caBundle\":\"" +  JsonStrings.escapeJson(caBundle) + "\"" : ""),
                    (service != null ? "\"service\":" + service.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
