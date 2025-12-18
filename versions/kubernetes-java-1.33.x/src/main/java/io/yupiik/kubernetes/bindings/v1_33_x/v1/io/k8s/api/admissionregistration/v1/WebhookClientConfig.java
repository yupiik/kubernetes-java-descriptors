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
package io.yupiik.kubernetes.bindings.v1_33_x.v1;

import io.yupiik.kubernetes.bindings.v1_33_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.admissionregistration.v1.WebhookClientConfig implements Validable<io.k8s.api.admissionregistration.v1.WebhookClientConfig>, Exportable {
    private String caBundle;
    private ServiceReference service;
    private String url;

    public io.k8s.api.admissionregistration.v1.WebhookClientConfig() {
        // no-op
    }

    public io.k8s.api.admissionregistration.v1.WebhookClientConfig(final String caBundle,
                                                                   final ServiceReference service,
                                                                   final String url) {
        this.caBundle = caBundle;
        this.service = service;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                caBundle,
                service,
                url);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.admissionregistration.v1.WebhookClientConfig)) {
            return false;
        }
        final io.k8s.api.admissionregistration.v1.WebhookClientConfig __otherCasted = (io.k8s.api.admissionregistration.v1.WebhookClientConfig) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(url, __otherCasted.url);
    }

    public io.k8s.api.admissionregistration.v1.WebhookClientConfig caBundle(final String caBundle) {
        this.caBundle = caBundle;
        return this;
    }

    public io.k8s.api.admissionregistration.v1.WebhookClientConfig service(final ServiceReference service) {
        this.service = service;
        return this;
    }

    public io.k8s.api.admissionregistration.v1.WebhookClientConfig url(final String url) {
        this.url = url;
        return this;
    }

    @Override
    public io.k8s.api.admissionregistration.v1.WebhookClientConfig validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (caBundle != null ? "\"caBundle\":\"" +  JsonStrings.escapeJson(caBundle) + "\"" : ""),
                    (service != null ? "\"service\":" + service.asJson() : ""),
                    (url != null ? "\"url\":\"" +  JsonStrings.escapeJson(url) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
