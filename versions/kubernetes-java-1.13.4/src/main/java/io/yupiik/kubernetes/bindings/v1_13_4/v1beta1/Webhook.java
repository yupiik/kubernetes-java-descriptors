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
package io.yupiik.kubernetes.bindings.v1_13_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_13_4.Validable;
import io.yupiik.kubernetes.bindings.v1_13_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Webhook implements Validable<Webhook>, Exportable {
    private WebhookClientConfig clientConfig;
    private String failurePolicy;
    private String name;
    private LabelSelector namespaceSelector;
    private List<RuleWithOperations> rules;
    private String sideEffects;

    public Webhook() {
        // no-op
    }

    public Webhook(final WebhookClientConfig clientConfig,
                   final String failurePolicy,
                   final String name,
                   final LabelSelector namespaceSelector,
                   final List<RuleWithOperations> rules,
                   final String sideEffects) {
        this.clientConfig = clientConfig;
        this.failurePolicy = failurePolicy;
        this.name = name;
        this.namespaceSelector = namespaceSelector;
        this.rules = rules;
        this.sideEffects = sideEffects;
    }

    public WebhookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public String getFailurePolicy() {
        return failurePolicy;
    }

    public void setFailurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public List<RuleWithOperations> getRules() {
        return rules;
    }

    public void setRules(final List<RuleWithOperations> rules) {
        this.rules = rules;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(final String sideEffects) {
        this.sideEffects = sideEffects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientConfig,
                failurePolicy,
                name,
                namespaceSelector,
                rules,
                sideEffects);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Webhook)) {
            return false;
        }
        final Webhook __otherCasted = (Webhook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(sideEffects, __otherCasted.sideEffects);
    }

    public Webhook clientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }

    public Webhook failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    public Webhook name(final String name) {
        this.name = name;
        return this;
    }

    public Webhook namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public Webhook rules(final List<RuleWithOperations> rules) {
        this.rules = rules;
        return this;
    }

    public Webhook sideEffects(final String sideEffects) {
        this.sideEffects = sideEffects;
        return this;
    }

    @Override
    public Webhook validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (clientConfig == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "clientConfig", "clientConfig",
                "Missing 'clientConfig' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
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
                    (failurePolicy != null ? "\"failurePolicy\":\"" +  JsonStrings.escapeJson(failurePolicy) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (sideEffects != null ? "\"sideEffects\":\"" +  JsonStrings.escapeJson(sideEffects) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
