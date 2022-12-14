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
package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import io.yupiik.kubernetes.bindings.v1_22_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_4.Validable;
import io.yupiik.kubernetes.bindings.v1_22_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatefulSetSpec implements Validable<StatefulSetSpec>, Exportable {
    private Integer minReadySeconds;
    private String podManagementPolicy;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private LabelSelector selector;
    private String serviceName;
    private PodTemplateSpec template;
    private StatefulSetUpdateStrategy updateStrategy;
    private List<PersistentVolumeClaim> volumeClaimTemplates;

    public StatefulSetSpec() {
        // no-op
    }

    public StatefulSetSpec(final Integer minReadySeconds,
                           final String podManagementPolicy,
                           final Integer replicas,
                           final Integer revisionHistoryLimit,
                           final LabelSelector selector,
                           final String serviceName,
                           final PodTemplateSpec template,
                           final StatefulSetUpdateStrategy updateStrategy,
                           final List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.minReadySeconds = minReadySeconds;
        this.podManagementPolicy = podManagementPolicy;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.serviceName = serviceName;
        this.template = template;
        this.updateStrategy = updateStrategy;
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public String getPodManagementPolicy() {
        return podManagementPolicy;
    }

    public void setPodManagementPolicy(final String podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
        this.template = template;
    }

    public StatefulSetUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final StatefulSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    public List<PersistentVolumeClaim> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(final List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                podManagementPolicy,
                replicas,
                revisionHistoryLimit,
                selector,
                serviceName,
                template,
                updateStrategy,
                volumeClaimTemplates);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpec)) {
            return false;
        }
        final StatefulSetSpec __otherCasted = (StatefulSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(podManagementPolicy, __otherCasted.podManagementPolicy) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy) &&
            Objects.equals(volumeClaimTemplates, __otherCasted.volumeClaimTemplates);
    }

    public StatefulSetSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public StatefulSetSpec podManagementPolicy(final String podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
        return this;
    }

    public StatefulSetSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public StatefulSetSpec revisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public StatefulSetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public StatefulSetSpec serviceName(final String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public StatefulSetSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public StatefulSetSpec updateStrategy(final StatefulSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    public StatefulSetSpec volumeClaimTemplates(final List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
        return this;
    }

    @Override
    public StatefulSetSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (serviceName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "serviceName", "serviceName",
                "Missing 'serviceName' attribute.", true));
        }
        if (template == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "template", "template",
                "Missing 'template' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (minReadySeconds != null ? "\"minReadySeconds\":" + minReadySeconds : ""),
                    (podManagementPolicy != null ? "\"podManagementPolicy\":\"" +  JsonStrings.escapeJson(podManagementPolicy) + "\"" : ""),
                    (replicas != null ? "\"replicas\":" + replicas : ""),
                    (revisionHistoryLimit != null ? "\"revisionHistoryLimit\":" + revisionHistoryLimit : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (serviceName != null ? "\"serviceName\":\"" +  JsonStrings.escapeJson(serviceName) + "\"" : ""),
                    (template != null ? "\"template\":" + template.asJson() : ""),
                    (updateStrategy != null ? "\"updateStrategy\":" + updateStrategy.asJson() : ""),
                    (volumeClaimTemplates != null ? "\"volumeClaimTemplates\":" + volumeClaimTemplates.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
