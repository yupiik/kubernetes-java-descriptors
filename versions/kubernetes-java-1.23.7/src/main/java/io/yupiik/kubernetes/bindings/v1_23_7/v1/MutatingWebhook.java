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
package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import io.yupiik.kubernetes.bindings.v1_23_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_7.Validable;
import io.yupiik.kubernetes.bindings.v1_23_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class MutatingWebhook implements Validable<MutatingWebhook>, Exportable {
    private List<String> admissionReviewVersions;
    private WebhookClientConfig clientConfig;
    private String failurePolicy;
    private String matchPolicy;
    private String name;
    private LabelSelector namespaceSelector;
    private LabelSelector objectSelector;
    private String reinvocationPolicy;
    private List<RuleWithOperations> rules;
    private String sideEffects;
    private Integer timeoutSeconds;

    public MutatingWebhook() {
        // no-op
    }

    public MutatingWebhook(final List<String> admissionReviewVersions,
                           final WebhookClientConfig clientConfig,
                           final String failurePolicy,
                           final String matchPolicy,
                           final String name,
                           final LabelSelector namespaceSelector,
                           final LabelSelector objectSelector,
                           final String reinvocationPolicy,
                           final List<RuleWithOperations> rules,
                           final String sideEffects,
                           final Integer timeoutSeconds) {
        this.admissionReviewVersions = admissionReviewVersions;
        this.clientConfig = clientConfig;
        this.failurePolicy = failurePolicy;
        this.matchPolicy = matchPolicy;
        this.name = name;
        this.namespaceSelector = namespaceSelector;
        this.objectSelector = objectSelector;
        this.reinvocationPolicy = reinvocationPolicy;
        this.rules = rules;
        this.sideEffects = sideEffects;
        this.timeoutSeconds = timeoutSeconds;
    }

    public List<String> getAdmissionReviewVersions() {
        return admissionReviewVersions;
    }

    public void setAdmissionReviewVersions(final List<String> admissionReviewVersions) {
        this.admissionReviewVersions = admissionReviewVersions;
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

    public String getMatchPolicy() {
        return matchPolicy;
    }

    public void setMatchPolicy(final String matchPolicy) {
        this.matchPolicy = matchPolicy;
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

    public LabelSelector getObjectSelector() {
        return objectSelector;
    }

    public void setObjectSelector(final LabelSelector objectSelector) {
        this.objectSelector = objectSelector;
    }

    public String getReinvocationPolicy() {
        return reinvocationPolicy;
    }

    public void setReinvocationPolicy(final String reinvocationPolicy) {
        this.reinvocationPolicy = reinvocationPolicy;
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

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                admissionReviewVersions,
                clientConfig,
                failurePolicy,
                matchPolicy,
                name,
                namespaceSelector,
                objectSelector,
                reinvocationPolicy,
                rules,
                sideEffects,
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MutatingWebhook)) {
            return false;
        }
        final MutatingWebhook __otherCasted = (MutatingWebhook) __other;
        return Objects.equals(admissionReviewVersions, __otherCasted.admissionReviewVersions) &&
            Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(matchPolicy, __otherCasted.matchPolicy) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(objectSelector, __otherCasted.objectSelector) &&
            Objects.equals(reinvocationPolicy, __otherCasted.reinvocationPolicy) &&
            Objects.equals(rules, __otherCasted.rules) &&
            Objects.equals(sideEffects, __otherCasted.sideEffects) &&
            Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }

    public MutatingWebhook admissionReviewVersions(final List<String> admissionReviewVersions) {
        this.admissionReviewVersions = admissionReviewVersions;
        return this;
    }

    public MutatingWebhook clientConfig(final WebhookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }

    public MutatingWebhook failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    public MutatingWebhook matchPolicy(final String matchPolicy) {
        this.matchPolicy = matchPolicy;
        return this;
    }

    public MutatingWebhook name(final String name) {
        this.name = name;
        return this;
    }

    public MutatingWebhook namespaceSelector(final LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public MutatingWebhook objectSelector(final LabelSelector objectSelector) {
        this.objectSelector = objectSelector;
        return this;
    }

    public MutatingWebhook reinvocationPolicy(final String reinvocationPolicy) {
        this.reinvocationPolicy = reinvocationPolicy;
        return this;
    }

    public MutatingWebhook rules(final List<RuleWithOperations> rules) {
        this.rules = rules;
        return this;
    }

    public MutatingWebhook sideEffects(final String sideEffects) {
        this.sideEffects = sideEffects;
        return this;
    }

    public MutatingWebhook timeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    @Override
    public MutatingWebhook validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (admissionReviewVersions == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "admissionReviewVersions", "admissionReviewVersions",
                "Missing 'admissionReviewVersions' attribute.", true));
        }
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
        if (sideEffects == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "sideEffects", "sideEffects",
                "Missing 'sideEffects' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (admissionReviewVersions != null ? "\"admissionReviewVersions\":" + admissionReviewVersions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (clientConfig != null ? "\"clientConfig\":" + clientConfig.asJson() : ""),
                    (failurePolicy != null ? "\"failurePolicy\":\"" +  JsonStrings.escapeJson(failurePolicy) + "\"" : ""),
                    (matchPolicy != null ? "\"matchPolicy\":\"" +  JsonStrings.escapeJson(matchPolicy) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespaceSelector != null ? "\"namespaceSelector\":" + namespaceSelector.asJson() : ""),
                    (objectSelector != null ? "\"objectSelector\":" + objectSelector.asJson() : ""),
                    (reinvocationPolicy != null ? "\"reinvocationPolicy\":\"" +  JsonStrings.escapeJson(reinvocationPolicy) + "\"" : ""),
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (sideEffects != null ? "\"sideEffects\":\"" +  JsonStrings.escapeJson(sideEffects) + "\"" : ""),
                    (timeoutSeconds != null ? "\"timeoutSeconds\":" + timeoutSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
