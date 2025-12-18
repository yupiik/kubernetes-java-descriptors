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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import io.yupiik.kubernetes.bindings.v1_28_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion implements Validable<io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion>, Exportable {
    private String strategy;
    private WebhookConversion webhook;

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion() {
        // no-op
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion(final String strategy,
                                                                                             final WebhookConversion webhook) {
        this.strategy = strategy;
        this.webhook = webhook;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    public WebhookConversion getWebhook() {
        return webhook;
    }

    public void setWebhook(final WebhookConversion webhook) {
        this.webhook = webhook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                strategy,
                webhook);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion)) {
            return false;
        }
        final io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion __otherCasted = (io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion) __other;
        return Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(webhook, __otherCasted.webhook);
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion strategy(final String strategy) {
        this.strategy = strategy;
        return this;
    }

    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion webhook(final WebhookConversion webhook) {
        this.webhook = webhook;
        return this;
    }

    @Override
    public io.k8s.apiextensions-apiserver.pkg.apis.apiextensions.v1.CustomResourceConversion validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (strategy == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "strategy", "strategy",
                "Missing 'strategy' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (strategy != null ? "\"strategy\":\"" +  JsonStrings.escapeJson(strategy) + "\"" : ""),
                    (webhook != null ? "\"webhook\":" + webhook.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
