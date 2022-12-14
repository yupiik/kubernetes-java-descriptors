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
package io.yupiik.kubernetes.bindings.v1_23_11.v1;

import io.yupiik.kubernetes.bindings.v1_23_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_11.Validable;
import io.yupiik.kubernetes.bindings.v1_23_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WebhookConversion implements Validable<WebhookConversion>, Exportable {
    private WebhookClientConfig clientConfig;
    private List<String> conversionReviewVersions;

    public WebhookConversion() {
        // no-op
    }

    public WebhookConversion(final WebhookClientConfig clientConfig,
                             final List<String> conversionReviewVersions) {
        this.clientConfig = clientConfig;
        this.conversionReviewVersions = conversionReviewVersions;
    }

    public WebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public List<String> getConversionReviewVersions() {
        return conversionReviewVersions;
    }

    public void setConversionReviewVersions(final List<String> conversionReviewVersions) {
        this.conversionReviewVersions = conversionReviewVersions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientConfig,
                conversionReviewVersions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WebhookConversion)) {
            return false;
        }
        final WebhookConversion __otherCasted = (WebhookConversion) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(conversionReviewVersions, __otherCasted.conversionReviewVersions);
    }

    public WebhookConversion clientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }

    public WebhookConversion conversionReviewVersions(final List<String> conversionReviewVersions) {
        this.conversionReviewVersions = conversionReviewVersions;
        return this;
    }

    @Override
    public WebhookConversion validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (conversionReviewVersions == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "conversionReviewVersions", "conversionReviewVersions",
                "Missing 'conversionReviewVersions' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (clientConfig != null ? "\"clientConfig\":" + clientConfig.asJson() : ""),
                    (conversionReviewVersions != null ? "\"conversionReviewVersions\":" + conversionReviewVersions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
